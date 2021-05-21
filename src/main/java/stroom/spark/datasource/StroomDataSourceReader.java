/*
 * Copyright 2019 Crown Copyright
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package stroom.spark.datasource;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.api.DataSourcesApi;
import org.openapitools.client.auth.ApiKeyAuth;
import org.apache.spark.sql.catalyst.InternalRow;
import org.apache.spark.sql.sources.Filter;
import org.apache.spark.sql.sources.v2.reader.DataSourceReader;
import org.apache.spark.sql.sources.v2.reader.InputPartition;
import org.apache.spark.sql.sources.v2.reader.SupportsPushDownFilters;
import org.apache.spark.sql.types.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import stroom.datasource.api.v2.AbstractField;
import stroom.docref.DocRef;
import stroom.query.api.v2.ExpressionTerm;


import java.util.ArrayList;
import java.util.List;


import static stroom.spark.datasource.StroomDataSource.*;

public class StroomDataSourceReader implements DataSourceReader, SupportsPushDownFilters {

    private final String eventTimeFieldName;
    private final String jsonFieldName;
    private final String host;
    private final String url;
    private final String token;
    private final String protocol;
    private final String destroyUrl;
    private final String datasourceUrl;
    private final String indexUUID;
    private final String extractionPipelineUUID;
    private StroomQuery stroomQuery=null;
    private StroomSearcher searcher;
    private StructType schema;
    private final int numPartitions;
    private final int pageSize;
    private final int maxResults;

    private final int traceLevel;

    private static final Logger LOGGER = LoggerFactory.getLogger(StroomDataSourceReader.class);

    StroomDataSourceReader(final StructType initialSchema, final String protocol, final String host,
                           final String baseURI, final String searchPath, final String destroyPath, final String datasourcePath,
                           final String token, final String indexUUID, final String extractionPipelineUUID,
                           final String eventTimeFieldName, final String jsonFieldName,
                           final int numPartitions, final int pageSize, final int maxResults,
                           final int traceLevel){
        this.host = host;
        this.url = baseURI + "/" + searchPath;
        this.destroyUrl = baseURI + "/" + destroyPath;
        this.datasourceUrl = baseURI + "/" + datasourcePath;

        this.token = token;
        this.protocol = protocol;

        this.indexUUID = indexUUID;
        this.extractionPipelineUUID = extractionPipelineUUID;
        this.eventTimeFieldName = eventTimeFieldName;
        this.jsonFieldName = jsonFieldName;
        this.schema = readSchema(initialSchema);
        this.traceLevel = traceLevel;
        this.numPartitions = numPartitions;
        this.pageSize = pageSize;
        this.maxResults = maxResults;
    }

    public StructType readSchema(){
        return schema;
    }

    public StructType readSchema(final StructType initialSchema) {
        if (schema == null) {
            ArrayList<StructField> fieldList = new ArrayList<>();

            if (initialSchema != null) {
                for (StructField field : initialSchema.fields()) {
                    fieldList.add(field);
                }
            }

            //The Json field that can be used to extract all items using Spark
            fieldList.add(new StructField("json", DataTypes.StringType, true,
                            new MetadataBuilder().putString(FIELD_CONTENT_METADATA_KEY,jsonFieldName).build()));

            for (AbstractField field : interrogateDatasource()){
                if (field.getQueryable()) {
                    MetadataBuilder fieldMetadataBuilder = new MetadataBuilder().putString(INDEXED_FIELD_METADATA_KEY,
                            field.getName());

                        for (ExpressionTerm.Condition condition : field.getConditions()) {
                            LOGGER.debug ("Field " + field.getName() + " supports " + condition.name());
                            fieldMetadataBuilder.putString(condition.name(), "supported");
                        }


                    fieldList.add(new StructField("idx" + field.getName(), DataTypes.StringType, false,
                            fieldMetadataBuilder.build()));
                }
            }

            schema = new StructType(fieldList.toArray(new StructField[fieldList.size()]));

        }

        LOGGER.debug("Schema provided as " + schema);
        return schema;
    }

    private List<AbstractField> interrogateDatasource (){

        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath(protocol + "://" + host + "/api");
        defaultClient.setDebugging(true);

        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey(token);
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DataSourcesApi dataSourcesApi = new DataSourcesApi();

        DocRef indexDocRef = new DocRef();
        indexDocRef.setType(INDEX_DOCREF_TYPE_ID);
        indexDocRef.setUuid(indexUUID);
        indexDocRef.setName(INDEX_NAME);

        try {
            return dataSourcesApi.fetchDataSourceFields(indexDocRef);
        } catch (ApiException e) {
            throw new IllegalStateException("Unable to interrogate datasource via API", e);
        }
    }

    public List<InputPartition<InternalRow>> planInputPartitions() {
        searcher = new StroomSearcher(schema,protocol,host,url,destroyUrl,token);
        searcher.setTraceLevel(traceLevel);

        searcher.performSearch(stroomQuery.createInitialSearchRequest());

        List<InputPartition<InternalRow>> partitions = new ArrayList<InputPartition<InternalRow>>();

        for (int i = 0; i < numPartitions; i++){
            partitions.add(new StroomInputPartition(schema, protocol, host, url, destroyUrl, token,
                    stroomQuery.getQueryRequestKey(), pageSize, i, numPartitions, indexUUID, extractionPipelineUUID,
                    eventTimeFieldName, maxResults, traceLevel));
        }


        return partitions;
    }

    @Override
    public Filter[] pushFilters(Filter[] filters) {

        stroomQuery = new StroomQuery(indexUUID, extractionPipelineUUID, schema, filters, eventTimeFieldName,maxResults);


        for (int i = 0; i < filters.length; i++)
            System.out.println("Filter: " + filters[i]);

        return stroomQuery.getUnpushedFilters();
    }

    @Override
    public Filter[] pushedFilters() {
        return stroomQuery.getPushedFilters();
    }
}

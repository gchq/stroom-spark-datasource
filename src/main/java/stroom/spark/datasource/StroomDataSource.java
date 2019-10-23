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


import org.apache.spark.sql.sources.v2.DataSourceOptions;
import org.apache.spark.sql.sources.v2.DataSourceV2;
import org.apache.spark.sql.sources.v2.ReadSupport;
import org.apache.spark.sql.sources.v2.reader.DataSourceReader;
import org.apache.spark.sql.types.*;


public class StroomDataSource implements DataSourceV2, ReadSupport {
    public static final String INDEX_DOCREF_TYPE_ID = "Index";
    public static final String EXTRACTION_PIPELINE_DOCREF_TYPEID = "Pipeline";
    public static final String EXTRACTION_PIPELINE_NAME = "Extraction Pipeline For Spark Datasource";
    public static final String INDEX_NAME = "Index for Spark Datasource";

    public static final String FIELD_CONTENT_METADATA_KEY = "get";
    public static final String INDEXED_FIELD_METADATA_KEY = "indexField";
    public static final String AUTH_TOKEN_KEY = "token";
    public static final String HOST_KEY = "host";
    public static final String URL_PATH_KEY = "uri";
    public static final String DESTROY_PATH_KEY = "destroy_path";
    public static final String DATASOURCE_PATH_KEY = "datasource_path";
    public static final String SEARCH_PATH_KEY = "search_path";
    public static final String PROTOCOL_KEY = "protocol";
    public static final String EXTRACTION_PIPELINE_UUID_KEY = "pipeline";
    public static final String INDEX_UUID_KEY = "index";
    public static final String EVENT_TIME_FIELD_NAME_KEY = "timestampField";
    public static final String JSON_FIELD_NAME_KEY = "jsonField";
    public static final String TRACE_LEVEL_KEY = "traceLevel";
    public static final String MAX_RESULTS_KEY = "maxResults";
    public static final String PAGE_SIZE_KEY = "pageSize";
    public static final String NUM_PARTITIONS_KEY = "numPartitions";

    private String url = "indexService/v2";
    private String searchPath = "search";
    private String destroyPath = "destroy";
    private String datasourcePath = "dataSource";
    private String host = "localhost";
    private String protocol = "https";
    private String token = null;
    private String extractionPipelineUUID = null;
    private String indexUUID = null;
    private String eventTimeFieldName = "EventTime";
    private String jsonFieldName = "Json";
    private int traceLevel = 0;
    private String traceLevelStr = "" + traceLevel;
    private int maxResults = 100000;
    private String maxResultsStr = "" + maxResults;
    private int pageSize = 10000;
    private String pageSizeStr = "" + pageSize;
    private int numPartitions = 3;
    private String numPartitionsStr = "" + numPartitions;

    public DataSourceReader createReader(DataSourceOptions dataSourceOptions)
    {
        return createReader(null, dataSourceOptions);
    }

    /**
     *
     * @param schema - User provided schema.  Every field should have metadata with a defined key of xpath
     * @param dataSourceOptions Configuration passed by Spark during construction, contains user defined key/val map
     * @return newly created Reader
     */
    public DataSourceReader createReader(StructType schema, DataSourceOptions dataSourceOptions){
        token = dataSourceOptions.get(AUTH_TOKEN_KEY).orElseThrow(() ->
                new IllegalArgumentException("Authentication token must be provided via DataSourceOptions using key='"+
                        AUTH_TOKEN_KEY + "'"));
        extractionPipelineUUID = dataSourceOptions.get(EXTRACTION_PIPELINE_UUID_KEY).orElseThrow(() ->
                new IllegalArgumentException("Extraction Pipeline UUID must be provided via DataSourceOptions using key='"+
                        EXTRACTION_PIPELINE_UUID_KEY + "'"));
        indexUUID = dataSourceOptions.get(INDEX_UUID_KEY).orElseThrow(() ->
                new IllegalArgumentException("Index UUID of index to search must be provided via DataSourceOptions using key='"+
                        INDEX_UUID_KEY + "'"));


        host = dataSourceOptions.get(HOST_KEY).orElse(host);
        url = dataSourceOptions.get(URL_PATH_KEY).orElse(url);
        destroyPath = dataSourceOptions.get(DESTROY_PATH_KEY).orElse(destroyPath);
        searchPath = dataSourceOptions.get(SEARCH_PATH_KEY).orElse(searchPath);
        datasourcePath = dataSourceOptions.get(DATASOURCE_PATH_KEY).orElse(datasourcePath);
        protocol = dataSourceOptions.get(PROTOCOL_KEY).orElse(protocol);
        eventTimeFieldName = dataSourceOptions.get(EVENT_TIME_FIELD_NAME_KEY).orElse(eventTimeFieldName);
        jsonFieldName = dataSourceOptions.get(JSON_FIELD_NAME_KEY).orElse(jsonFieldName);

        traceLevelStr = dataSourceOptions.get(TRACE_LEVEL_KEY).orElse(traceLevelStr);
        try{
            traceLevel = Integer.parseInt(traceLevelStr);
        }catch (NumberFormatException ex){
            System.err.println("ERROR: Parameter " + TRACE_LEVEL_KEY + " must be assigned to a number (expressed as a string); using default of " + traceLevel);
        }

        maxResultsStr = dataSourceOptions.get(MAX_RESULTS_KEY).orElse(maxResultsStr);
        try{
            maxResults = Integer.parseInt(maxResultsStr);
        }catch (NumberFormatException ex){
            System.err.println("ERROR: Parameter " + MAX_RESULTS_KEY + " must be assigned to a number (expressed as a string); using default of " + maxResults);
        }

        pageSizeStr = dataSourceOptions.get(PAGE_SIZE_KEY).orElse(pageSizeStr);
        try{
            pageSize = Integer.parseInt(pageSizeStr);
        }catch (NumberFormatException ex){
            System.err.println("ERROR: Parameter " + PAGE_SIZE_KEY + " must be assigned to a number (expressed as a string); using default of " + pageSize);
        }

        numPartitionsStr = dataSourceOptions.get(NUM_PARTITIONS_KEY).orElse(numPartitionsStr);
        try{
            numPartitions = Integer.parseInt(numPartitionsStr);
        }catch (NumberFormatException ex){
            System.err.println("ERROR: Parameter " + NUM_PARTITIONS_KEY + " must be assigned to a number (expressed as a string); using default of " + numPartitions);
        }

        return new StroomDataSourceReader(schema, protocol, host, url,
                searchPath, destroyPath, datasourcePath,
                token,
                indexUUID, extractionPipelineUUID,
                eventTimeFieldName,jsonFieldName,
                numPartitions, pageSize, maxResults,
                traceLevel);
    }
}

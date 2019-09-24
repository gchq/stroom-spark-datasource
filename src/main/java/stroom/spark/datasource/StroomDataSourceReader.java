package stroom.spark.datasource;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.apache.spark.sql.catalyst.InternalRow;
import org.apache.spark.sql.sources.Filter;
import org.apache.spark.sql.sources.v2.reader.DataSourceReader;
import org.apache.spark.sql.sources.v2.reader.InputPartition;
import org.apache.spark.sql.sources.v2.reader.SupportsPushDownFilters;
import org.apache.spark.sql.types.*;
import stroom.datasource.api.v2.AbstractField;
import stroom.datasource.api.v2.DataSource;
import stroom.docref.DocRef;
import stroom.query.api.v2.ExpressionTerm;
import stroom.query.api.v2.SearchResponse;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.locks.Condition;

import static stroom.spark.datasource.StroomDataSource.*;

//Could extend SupportsPushDownFilters and/or SupportsPushDownRequiredColumns
//and/or other subinterfaces of DataSourceReader
// https://spark.apache.org/docs/2.4.3/api/java/index.html?org/apache/spark/sql/sources/v2/DataSourceV2.html
public class StroomDataSourceReader implements DataSourceReader, SupportsPushDownFilters {

    private final String eventTimeFieldName;

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
    private StructType schema = null;
    private int numPartitions = 3;
    private int pageSize = 10000;

    StroomDataSourceReader(final StructType initialSchema, final String protocol, final String host,
                           final String baseURI, final String searchPath, final String destroyPath, final String datasourcePath,
                           final String token, final String indexUUID, final String extractionPipelineUUID,
                           final String eventTimeFieldName){
        this.host = host;
        this.url = baseURI + "/" + searchPath;
        this.destroyUrl = baseURI + "/" + destroyPath;
        this.datasourceUrl = baseURI + "/" + datasourcePath;

        this.token = token;
        this.protocol = protocol;

        this.indexUUID = indexUUID;
        this.extractionPipelineUUID = extractionPipelineUUID;
        this.eventTimeFieldName = eventTimeFieldName;

        this.schema = readSchema(initialSchema);
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
                            new MetadataBuilder().putString(XPATH_METADATA_KEY,".").build()));

            DataSource dataSource = interrogateDatasource();

            for (AbstractField field : dataSource.getFields()){
                if (field.getQueryable()) {
                    MetadataBuilder fieldMetadataBuilder = new MetadataBuilder().putString(INDEXED_FIELD_METADATA_KEY,
                            field.getName());

                    for (ExpressionTerm.Condition condition : field.getConditions()) {
                        System.out.println ("Field " + field.getName() + " supports " + condition.name());
                        fieldMetadataBuilder.putString(condition.name(), "supported");
                    }

                    fieldList.add(new StructField("idx" + field.getName(), DataTypes.StringType, false,
                            fieldMetadataBuilder.build()));
                }
            }

            schema = new StructType(fieldList.toArray(new StructField[fieldList.size()]));
            System.out.println ("Schema initialised.");
        }

        System.out.println ("Schema provided as " + schema);
        return schema;
    }

    private DataSource interrogateDatasource (){

        Client client = ClientBuilder.newClient();


        String fullUrl = protocol + "://"+ host + "/" + datasourceUrl;

        if (VERBOSE_DEBUG)
            System.out.println("Interrogate datasource - connecting to " + fullUrl);

        final ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(SerializationFeature.WRITE_NULL_MAP_VALUES, false);
        mapper.configure(SerializationFeature.INDENT_OUTPUT, false);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        // Enabling default typing adds type information where it would otherwise be ambiguous, i.e. for abstract classes
//        mapper.enableDefaultTyping();
        //   mapper.writeValue(outputStream, objectModel);

        DocRef indexDocRef = new DocRef(INDEX_DOCREF_TYPE_ID, indexUUID, INDEX_NAME);

        String json = null;

        try {
            json = mapper.writeValueAsString(indexDocRef);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new IllegalArgumentException("Unable to serialize the dataSource request");
        }

        Response response = client.target(fullUrl)

                .request()
                .header("Authorization", "Bearer " + token)
                .accept(MediaType.APPLICATION_JSON_TYPE)
                .post(Entity.json(json));

        if (response.getStatus() != 200) {
            System.err.println("Output...");
            System.err.println(response.readEntity(String.class));

            try{
                String responseBody = response.readEntity(String.class);
                if (responseBody.length() > 0) {
                    throw new IllegalArgumentException("Got non 200 response from Stroom dataSource API: "
                            + response.getStatus() + " " + responseBody);
                }
            }catch (Exception ex) {
                throw new IllegalArgumentException("Got non 200 response from Stroom dataSource API: "
                        + response.getStatus() + " " + response.getStatusInfo().getReasonPhrase());
            }
        }

        String responseBody = response.readEntity(String.class);

        if (VERBOSE_DEBUG) {
            System.out.println ("Response follows...");
            System.out.println (responseBody);
        }

        DataSource dataSource;

        try {
            dataSource = mapper.readValue(responseBody, DataSource.class);
        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalArgumentException("Unable to read dataSource response");

        }

        return dataSource;
    }

    public List<InputPartition<InternalRow>> planInputPartitions() {
        searcher = new StroomSearcher(schema,protocol,host,url,destroyUrl,token);

        searcher.performSearch(stroomQuery.createInitialSearchRequest());

        List<InputPartition<InternalRow>> partitions = new ArrayList();

        for (int i = 0; i < numPartitions; i++){
            partitions.add(new StroomInputPartition(schema, protocol, host, url, destroyUrl, token,
                    stroomQuery.getQueryRequestKey(), pageSize, i, numPartitions, indexUUID, extractionPipelineUUID,
                    eventTimeFieldName));
        }


        return partitions;
    }

    @Override
    public Filter[] pushFilters(Filter[] filters) {

        stroomQuery = new StroomQuery(indexUUID, extractionPipelineUUID, schema, filters, eventTimeFieldName);


        for (int i = 0; i < filters.length; i++)
            System.out.println("Filter: " + filters[i]);

        return stroomQuery.getUnpushedFilters();
    }

    @Override
    public Filter[] pushedFilters() {
        return stroomQuery.getPushedFilters();
    }
}

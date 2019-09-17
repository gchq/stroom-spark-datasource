package stroom.spark.datasource;


import org.apache.spark.sql.sources.v2.DataSourceOptions;
import org.apache.spark.sql.sources.v2.DataSourceV2;
import org.apache.spark.sql.sources.v2.ReadSupport;
import org.apache.spark.sql.sources.v2.reader.DataSourceReader;
import org.apache.spark.sql.types.*;

import java.net.URL;
import java.util.function.Supplier;

import static org.apache.spark.sql.sources.v2.DataSourceOptions.PATH_KEY;

public class StroomDataSource implements DataSourceV2, ReadSupport {
    public static final String XPATH_METADATA_KEY = "xpath";

    public static final StructType GenericSchema = new StructType(
            new StructField[]{
                    new StructField("xml", DataTypes.StringType, false, new MetadataBuilder().build())
            }
    );

    public static final StructType TestSchema = new StructType(
            new StructField[]{
                    new StructField("StreamId", DataTypes.StringType, true,
                            new MetadataBuilder().putString(XPATH_METADATA_KEY,"@StreamId").build()),
                    new StructField("EventId", DataTypes.StringType, true,
                            new MetadataBuilder().putString(XPATH_METADATA_KEY,"@EventId").build()),
                    new StructField("EventTime", DataTypes.StringType, true,
                            new MetadataBuilder().putString(XPATH_METADATA_KEY,"EventTime/TimeCreated").build()),
                    new StructField("Event", DataTypes.StringType, true,
                            new MetadataBuilder().putString(XPATH_METADATA_KEY,".").build())
            }
    );

    public static final String AUTH_TOKEN_KEY = "token";
    public static final String HOST_KEY = "host";
    public static final String URL_PATH_KEY = "search_url";
    public static final String DESTROY_URL_PATH_KEY = "destroy_url";
    public static final String PROTOCOL_KEY = "protocol";
    public static final String EXTRACTION_PIPELINE_UUID_KEY = "pipeline";
    public static final String INDEX_UUID_KEY = "index";
    public static final String EVENT_TIME_FIELD_NAME = "EventTime";

    private String url = "indexService/v2/search";
    private String destroyUrl = "indexService/v2/destroy";
    private String host = "localhost";
    private String protocol = "https";
    private String token = null;
    private String extractionPipelineUUID = null;
    private String indexUUID = null;
    private String eventTimeFieldName = "timestampField";

    public DataSourceReader createReader(DataSourceOptions dataSourceOptions)
    {
        return createReader(null, dataSourceOptions);
    }

    /**
     *
     * @param schema - User provided schema.  Every field should have metadata with a defined key of xpath
     * @param dataSourceOptions
     * @return
     */
    public DataSourceReader createReader(StructType schema, DataSourceOptions dataSourceOptions){
        if (schema == null){
            schema = TestSchema;
            //throw new IllegalArgumentException("Please provide a schema with the fields that you require and their XPaths");
        }

        System.out.println ("Got a schema " + schema);

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
        destroyUrl = dataSourceOptions.get(DESTROY_URL_PATH_KEY).orElse(destroyUrl);
        protocol = dataSourceOptions.get(PROTOCOL_KEY).orElse(url);
        eventTimeFieldName = dataSourceOptions.get(EVENT_TIME_FIELD_NAME).orElse(EVENT_TIME_FIELD_NAME);

        System.out.println ("Protocol: " + protocol);
        System.out.println ("Host: " + host);
        System.out.println ("URL: " + url);

        return new StroomDataSourceReader(schema, protocol, host, url, destroyUrl, token, indexUUID, extractionPipelineUUID, eventTimeFieldName);
    }
}

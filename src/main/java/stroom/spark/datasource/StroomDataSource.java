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
    public static boolean VERBOSE_DEBUG = false;

    public static final String INDEX_DOCREF_TYPE_ID = "Index";
    public static final String EXTRACTION_PIPELINE_DOCREF_TYPEID = "Pipeline";
    public static final String EXTRACTION_PIPELINE_NAME = "Extraction Pipeline For Spark Datasource";
    public static final String INDEX_NAME = "Index for Spark Datasource";

    public static final String XPATH_METADATA_KEY = "xpath";
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

        System.out.println ("Protocol: " + protocol);
        System.out.println ("Host: " + host);
        System.out.println ("Base URL: " + url);

        return new StroomDataSourceReader(schema, protocol, host, url,
                searchPath, destroyPath, datasourcePath,
                token,
                indexUUID, extractionPipelineUUID, eventTimeFieldName);
    }
}

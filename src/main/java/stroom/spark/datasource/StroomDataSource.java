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
    public static final StructType GenericSchema = new StructType(
            new StructField[]{
                    new StructField("xml", DataTypes.StringType, false, new MetadataBuilder().build())
            }
    );

    public static final StructType TestSchema = new StructType(
            new StructField[]{
                    new StructField("User", DataTypes.StringType, true, new MetadataBuilder().build()),
                    new StructField("Operation", DataTypes.StringType, true, new MetadataBuilder().build())
            }
    );

    public static final String AUTH_TOKEN_KEY = "token";
    public static final String HOST_KEY = "host";
    public static final String URL_PATH_KEY = "api_url";
    public static final String PROTOCOL_KEY = "protocol";

    private String url = "indexService/v2/search";
    private String host = "localhost";
    private String protocol = "https";
    private String token = null;

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
                new IllegalArgumentException("Auth token must be provided via DataSourceOptions using key='token'"));

        host = dataSourceOptions.get(HOST_KEY).orElse(host);
        url = dataSourceOptions.get(URL_PATH_KEY).orElse(url);
        protocol = dataSourceOptions.get(PROTOCOL_KEY).orElse(url);

        System.out.println ("Protocol: " + protocol);
        System.out.println ("Host: " + host);
        System.out.println ("URL: " + url);

        return new StroomDataSourceReader(schema, protocol, host, url, token);
    }
}

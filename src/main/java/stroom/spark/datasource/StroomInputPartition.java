package stroom.spark.datasource;

import org.apache.spark.sql.sources.v2.reader.InputPartition;
import org.apache.spark.sql.sources.v2.reader.InputPartitionReader;
import org.apache.spark.sql.types.StructType;

import java.io.Serializable;

public class StroomInputPartition implements InputPartition, Serializable {
    private StructType schema;
    private String host;
    private String url;
    private String token;
    private String protocol;

    public StroomInputPartition(StructType schema, String protocol, String host, String url, String token) {
        this.schema = schema;
        this.protocol = protocol;
        this.host = host;
        this.url = url;
        this.token = token;
    }

    public InputPartitionReader createPartitionReader() {
        return new StroomInputPartitionReader(schema, protocol, host, url, token);
    }
}

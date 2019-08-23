package stroom.spark.datasource;

import org.apache.spark.sql.sources.Filter;
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
    private String destroyUrl;
    private String queryRequestId;
    private int pageSize;
    private int partitionId;
    private int numberOfPartitions;


    public StroomInputPartition(StructType schema, String protocol, String host, String url, String destroyUrl, String token, String queryRequestId, int pageSize, int partitionId, int numberOfPartitions) {
        this.schema = schema;
        this.protocol = protocol;
        this.host = host;
        this.url = url;
        this.destroyUrl = destroyUrl;
        this.token = token;
        this.queryRequestId = queryRequestId;
        this.pageSize = pageSize;
        this.partitionId = partitionId;
        this.numberOfPartitions = numberOfPartitions;
    }

    public InputPartitionReader createPartitionReader() {
        StroomSearcher searcher = new StroomSearcher(schema,protocol,host,url,destroyUrl,token);
        StroomQuery query = new StroomQuery(queryRequestId);
        return new StroomInputPartitionReader(searcher, query, pageSize, partitionId, numberOfPartitions);
    }
}

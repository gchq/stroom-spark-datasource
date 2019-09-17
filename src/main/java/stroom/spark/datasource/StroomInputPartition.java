package stroom.spark.datasource;

import org.apache.spark.sql.sources.Filter;
import org.apache.spark.sql.sources.v2.reader.InputPartition;
import org.apache.spark.sql.sources.v2.reader.InputPartitionReader;
import org.apache.spark.sql.types.StructType;

import java.io.Serializable;

public class StroomInputPartition implements InputPartition, Serializable {
    private final StructType schema;
    private final String host;
    private final String url;
    private final String token;
    private final String protocol;
    private final String destroyUrl;
    private final String queryRequestId;
    private final int pageSize;
    private final int partitionId;
    private final int numberOfPartitions;
    private final String indexUUID;
    private final String extractionPipelineUUID;
    private final String eventTimeFieldName;

    public StroomInputPartition(final StructType schema, final String protocol, final String host, final String url, final String destroyUrl,
                                final String token, final String queryRequestId, final int pageSize,
                                final int partitionId, final int numberOfPartitions,
                                final String indexUUID, final String extractionPipelineUUID,
                                final String eventTimeFieldName) {
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
        this.indexUUID = indexUUID;
        this.extractionPipelineUUID = extractionPipelineUUID;
        this.eventTimeFieldName = eventTimeFieldName;
    }

    public InputPartitionReader createPartitionReader() {
        StroomSearcher searcher = new StroomSearcher(schema,protocol,host,url,destroyUrl,token);
        StroomQuery query = new StroomQuery(indexUUID, extractionPipelineUUID, schema, queryRequestId, eventTimeFieldName);
        return new StroomInputPartitionReader(searcher, query, pageSize, partitionId, numberOfPartitions);
    }
}

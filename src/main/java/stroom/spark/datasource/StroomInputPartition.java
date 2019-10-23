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

import org.apache.spark.sql.catalyst.InternalRow;
import org.apache.spark.sql.sources.Filter;
import org.apache.spark.sql.sources.v2.reader.InputPartition;
import org.apache.spark.sql.sources.v2.reader.InputPartitionReader;
import org.apache.spark.sql.types.StructType;

import java.io.Serializable;

public class StroomInputPartition implements InputPartition<InternalRow>, Serializable {
    private static final long serialVersionUID = 1670454378046665231L;
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
    private final int traceLevel;
    private final int maxResults;

    public StroomInputPartition(final StructType schema, final String protocol, final String host, final String url, final String destroyUrl,
                                final String token, final String queryRequestId, final int pageSize,
                                final int partitionId, final int numberOfPartitions,
                                final String indexUUID, final String extractionPipelineUUID,
                                final String eventTimeFieldName, int maxResults, int traceLevel) {
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
        this.maxResults = maxResults;
        this.traceLevel = traceLevel;
    }

    public InputPartitionReader <InternalRow> createPartitionReader() {
        StroomSearcher searcher = new StroomSearcher(schema,protocol,host,url,destroyUrl,token);
        searcher.setTraceLevel(traceLevel);
        StroomQuery query = new StroomQuery(indexUUID, extractionPipelineUUID, schema, queryRequestId, eventTimeFieldName,maxResults);
        return new StroomInputPartitionReader(searcher, query, pageSize, partitionId, numberOfPartitions);
    }
}

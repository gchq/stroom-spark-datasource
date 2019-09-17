package stroom.spark.datasource;

import org.apache.spark.sql.catalyst.InternalRow;
import org.apache.spark.sql.sources.Filter;
import org.apache.spark.sql.sources.v2.reader.DataSourceReader;
import org.apache.spark.sql.sources.v2.reader.InputPartition;
import org.apache.spark.sql.sources.v2.reader.SupportsPushDownFilters;
import org.apache.spark.sql.types.*;

import java.util.ArrayList;
import java.util.List;

//Could extend SupportsPushDownFilters and/or SupportsPushDownRequiredColumns
//and/or other subinterfaces of DataSourceReader
// https://spark.apache.org/docs/2.4.3/api/java/index.html?org/apache/spark/sql/sources/v2/DataSourceV2.html
public class StroomDataSourceReader implements DataSourceReader{//, SupportsPushDownFilters {

    private final String eventTimeFieldName;
    private Filter[] filters = new Filter[0];
    private final StructType schema;
    private final String host;
    private final String url;
    private final String token;
    private final String protocol;
    private final String destroyUrl;
    private final String indexUUID;
    private final String extractionPipelineUUID;
    private StroomQuery stroomQuery;
    private StroomSearcher searcher;
    private int numPartitions = 3;
    private int pageSize = 10000;

    StroomDataSourceReader(final StructType schema, final String protocol,
                           final String host, final String url, final String destroyUrl,
                           final String token, final String indexUUID, final String extractionPipelineUUID,
                           final String eventTimeFieldName){
        this.schema = schema;
        this.host = host;
        this.url = url;
        this.token = token;
        this.protocol = protocol;
        this.destroyUrl = destroyUrl;
        this.indexUUID = indexUUID;
        this.extractionPipelineUUID = extractionPipelineUUID;
        this.eventTimeFieldName = eventTimeFieldName;

        //todo remove this line following implementation of pushfilters
        stroomQuery = new StroomQuery(indexUUID, extractionPipelineUUID, schema, filters, eventTimeFieldName);
    }

    public StructType readSchema() {
        return schema;
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

    //@Override
    public Filter[] pushFilters(Filter[] filters) {
        this.filters = filters;
        stroomQuery = new StroomQuery(indexUUID, extractionPipelineUUID, schema, filters, eventTimeFieldName);

        for (int i = 0; i < filters.length; i++)
            System.out.println("Filter: " + filters[i]);

        return filters;

        //Presume that all the filters will be consumed
//        return new Filter[0];
    }

    //@Override
    public Filter[] pushedFilters() {
        return filters;
    }
}

package stroom.spark.datasource;

import org.apache.spark.sql.catalyst.InternalRow;
import org.apache.spark.sql.sources.Filter;
import org.apache.spark.sql.sources.v2.reader.DataSourceReader;
import org.apache.spark.sql.sources.v2.reader.InputPartition;
import org.apache.spark.sql.sources.v2.reader.SupportsPushDownFilters;
import org.apache.spark.sql.types.*;
import stroom.query.api.v2.Row;

import java.util.ArrayList;
import java.util.List;

//Could extend SupportsPushDownFilters and/or SupportsPushDownRequiredColumns
//and/or other subinterfaces of DataSourceReader
// https://spark.apache.org/docs/2.4.3/api/java/index.html?org/apache/spark/sql/sources/v2/DataSourceV2.html
public class StroomDataSourceReader implements DataSourceReader, SupportsPushDownFilters {

    private Filter[] filters = new Filter[0];
    private StructType schema;
    private String host;
    private String url;
    private String token;
    private String protocol;
    private String destroyUrl;
    private StroomQuery stroomQuery;
    private StroomSearcher searcher;
    private int numPartitions = 3;
    private int pageSize = 10000;

    StroomDataSourceReader(StructType schema, String protocol, String host, String url, String destroyUrl, String token){
        this.schema = schema;
        this.host = host;
        this.url = url;
        this.token = token;
        this.protocol = protocol;
        this.destroyUrl = destroyUrl;
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
                    stroomQuery.getQueryRequestKey(), pageSize, i, numPartitions));
        }


        return partitions;
    }

    @Override
    public Filter[] pushFilters(Filter[] filters) {
        this.filters = filters;
        stroomQuery = new StroomQuery(filters);

        for (int i = 0; i < filters.length; i++)
            System.out.println("Filter: " + filters[i]);

        //Presume that all the filters will be consumed
        return new Filter[0];
    }

    @Override
    public Filter[] pushedFilters() {
        return filters;
    }
}

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
public class StroomDataSourceReader implements DataSourceReader, SupportsPushDownFilters {

    private Filter[] filters = new Filter[0];
    private StructType schema;
    private String host;
    private String url;
    private String token;
    private String protocol;

    StroomDataSourceReader(StructType schema, String protocol, String host, String url, String token){
        this.schema = schema;
        this.host = host;
        this.url = url;
        this.token = token;
        this.protocol = protocol;
    }

    public StructType readSchema() {
        return schema;
    }

    public List<InputPartition<InternalRow>> planInputPartitions() {
        List<InputPartition<InternalRow>> partitions = new ArrayList();

        //Just one partition
        partitions.add(new StroomInputPartition(schema, protocol, host, url, token, filters));
        return partitions;
    }

    @Override
    public Filter[] pushFilters(Filter[] filters) {
        this.filters = filters;

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

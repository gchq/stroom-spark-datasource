package stroom.spark.datasource;

import org.apache.spark.sql.catalyst.InternalRow;
import org.apache.spark.sql.sources.v2.reader.DataSourceReader;
import org.apache.spark.sql.sources.v2.reader.InputPartition;
import org.apache.spark.sql.types.*;

import java.util.ArrayList;
import java.util.List;

//Could extend SupportsPushDownFilters and/or SupportsPushDownRequiredColumns
//and/or other subinterfaces of DataSourceReader
// https://spark.apache.org/docs/2.4.3/api/java/index.html?org/apache/spark/sql/sources/v2/DataSourceV2.html
public class StroomDataSourceReader implements DataSourceReader {

    public StructType readSchema() {
        return StroomDataSource.Schema;
    }

    public List<InputPartition<InternalRow>> planInputPartitions() {
        List<InputPartition<InternalRow>> partitions = new ArrayList();

        //Just one partition
        partitions.add(new StroomInputPartition());
        return partitions;
    }
}

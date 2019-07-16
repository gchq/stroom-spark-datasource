package stroom.spark.datasource;


import org.apache.spark.sql.sources.v2.DataSourceOptions;
import org.apache.spark.sql.sources.v2.reader.DataSourceReader;

public class StroomDataSource implements org.apache.spark.sql.sources.v2.DataSourceV2, org.apache.spark.sql.sources.v2.ReadSupport {
    public DataSourceReader createReader(DataSourceOptions dataSourceOptions) {
        return null;
    }
}

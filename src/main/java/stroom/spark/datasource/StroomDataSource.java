package stroom.spark.datasource;


import org.apache.spark.sql.sources.v2.DataSourceOptions;
import org.apache.spark.sql.sources.v2.DataSourceV2;
import org.apache.spark.sql.sources.v2.ReadSupport;
import org.apache.spark.sql.sources.v2.reader.DataSourceReader;
import org.apache.spark.sql.types.*;

public class StroomDataSource implements DataSourceV2, ReadSupport {
    public static final StructType Schema = new StructType(
            new StructField[]{
                    new StructField("name", DataTypes.createArrayType(DataTypes.ByteType,false), false, new MetadataBuilder().build()),
                    new StructField("age", DataTypes.IntegerType, false, new MetadataBuilder().build())
            }
    );

    public DataSourceReader createReader(DataSourceOptions dataSourceOptions) {
        return new StroomDataSourceReader();
    }
}

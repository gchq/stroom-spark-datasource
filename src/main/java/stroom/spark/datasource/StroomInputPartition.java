package stroom.spark.datasource;

import org.apache.spark.sql.sources.v2.reader.InputPartition;
import org.apache.spark.sql.sources.v2.reader.InputPartitionReader;

import java.io.Serializable;

public class StroomInputPartition implements InputPartition, Serializable {
    public InputPartitionReader createPartitionReader() {
        return null;
    }
}

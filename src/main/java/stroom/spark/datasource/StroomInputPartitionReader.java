package stroom.spark.datasource;

import org.apache.spark.sql.catalyst.expressions.SpecificInternalRow;
import org.apache.spark.sql.sources.v2.reader.InputPartitionReader;

import java.io.IOException;

public class StroomInputPartitionReader implements InputPartitionReader<SpecificInternalRow> {
    public boolean next() throws IOException {
        return false;
    }

    public SpecificInternalRow get() {
        return null;
    }

    public void close() throws IOException {

    }
}

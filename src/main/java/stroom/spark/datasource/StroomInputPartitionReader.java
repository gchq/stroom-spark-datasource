package stroom.spark.datasource;

import org.apache.spark.SparkContext;
import org.apache.spark.sql.*;
import org.apache.spark.sql.catalyst.InternalRow;
import org.apache.spark.sql.catalyst.encoders.ExpressionEncoder;
import org.apache.spark.sql.catalyst.expressions.GenericInternalRow;
import org.apache.spark.sql.catalyst.expressions.SpecificInternalRow;
import org.apache.spark.sql.catalyst.expressions.UnsafeRow;
import org.apache.spark.sql.catalyst.util.GenericArrayData;
import org.apache.spark.sql.sources.v2.reader.InputPartitionReader;
import scala.collection.immutable.Seq;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

//Could use the simpler GenericInternalRow, initially.
public class StroomInputPartitionReader implements InputPartitionReader<InternalRow> {
    private static class Person {
        private String name;
        private int age;
        public Person (String name, int age){
            this.name = name;
            this.age = age;
        }

        public String getName() {return name;}
        public int getAge() {return age;}
        public byte[] getNameBytes() {return name.getBytes(StandardCharsets.UTF_8);}
        public int getNameHashcode() {return name.hashCode();}
    }

    private static Person[] data = new Person[]{
            new Person ("Alfie", 24),
            new Person ("Bertie", 36),
            new Person ("Charlie", 48),
            new Person ("Debbie", 60),
            new Person ("Ernie", 72),
            new Person ("Frankie", 84),
            new Person ("Gettie", 96),
    };

    private int index = 0;

    public boolean next() throws IOException {
        return index < data.length;
    }

    public InternalRow get() {

        SQLImplicits implicits = new SQLImplicits() {
            @Override
            public SQLContext _sqlContext() {
                return null;
            }
        };


        GenericInternalRow genericInternalRow = new GenericInternalRow(new Object[]{new GenericArrayData(data[index].getNameBytes()), data[index].getAge()});

//        SpecificInternalRow row = new SpecificInternalRow(StroomDataSource.Schema);

//            row.update(0, data[index].getNameHashcode());
//            row.update(1, data[index].getAge());

        index++;

        return genericInternalRow;
    }

    public void close() throws IOException {

    }
}

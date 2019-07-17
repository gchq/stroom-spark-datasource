package stroom.spark.datasource;

import org.apache.spark.sql.catalyst.expressions.SpecificInternalRow;
import org.apache.spark.sql.sources.v2.reader.InputPartitionReader;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

//Could use the simpler GenericInternalRow, initially.
public class StroomInputPartitionReader implements InputPartitionReader<SpecificInternalRow> {
    private static class Person {
        private String name;
        private int age;
        public Person (String name, int age){
            this.name = name;
            this.age = age;
        }
        public byte[] getName() throws UnsupportedEncodingException {return name.getBytes("UTF-8");}
        public int getAge() {return age;}
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

    public SpecificInternalRow get() {

        SpecificInternalRow row = new SpecificInternalRow(StroomDataSource.Schema);

        try {
            row.update(0, data[index].getNameHashcode());
            row.update(1, data[index].getAge());
        }catch (Exception ex){
            //todo - work out how to log this in Spark's Log4J log file
        }

        index++;

        return row;
    }

    public void close() throws IOException {

    }
}

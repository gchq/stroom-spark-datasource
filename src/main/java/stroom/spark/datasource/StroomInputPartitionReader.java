package stroom.spark.datasource;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.apache.commons.httpclient.methods.StringRequestEntity;

import org.apache.spark.sql.SQLContext;
import org.apache.spark.sql.SQLImplicits;
import org.apache.spark.sql.catalyst.InternalRow;
import org.apache.spark.sql.catalyst.expressions.GenericInternalRow;
import org.apache.spark.sql.sources.*;
import org.apache.spark.sql.sources.Filter;
import org.apache.spark.sql.sources.v2.reader.InputPartitionReader;
import org.apache.spark.sql.types.StructType;
import org.apache.spark.unsafe.types.UTF8String;
import stroom.query.api.v2.*;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.Instant;
import java.util.*;


public class StroomInputPartitionReader implements InputPartitionReader<InternalRow> {

    private long pageForThisReader = -1;
    private StroomQuery stroomQuery;
    private StroomSearcher stroomSearcher;
    private int pageSize;
    private int partitionId;
    private int numberOfPartitions;

    private int indexWithinPage;

    private List<Row> rows;

    private boolean verboseDebug = false;

    public StroomInputPartitionReader(StroomSearcher searcher, StroomQuery query, int pageSize, int partitionId, int numberOfPartitions) {
        this.stroomSearcher = searcher;
        this.stroomQuery = query;
        this.pageSize = pageSize;
        this.partitionId = partitionId;
        this.numberOfPartitions = numberOfPartitions;
        this.indexWithinPage = pageSize - 1;
    }

    private void readNextPage(){
        pageForThisReader++;
        indexWithinPage = 0;

        if (verboseDebug)
            System.out.println("Page " + pageForThisReader + "(" + partitionId + ")");

        long startIndex = pageSize * (pageForThisReader * numberOfPartitions + partitionId);
        rows = stroomSearcher.searchAndReadResults(stroomQuery.createSearchRequest(startIndex, (long) pageSize));
    }


    public boolean next() {
        indexWithinPage ++;

        if (indexWithinPage >= pageSize)
            readNextPage();

        return (rows != null && indexWithinPage <= rows.size() - 1);
    }

    public InternalRow get() {

        Row currentRow = rows.get(indexWithinPage);

        GenericInternalRow genericInternalRow =
                new GenericInternalRow(convertVals(currentRow.getValues(), stroomQuery.getFieldIsIndexedVector()));

        return genericInternalRow;
    }


    private static Object[] convertVals (List <String> original, boolean[] fieldIsIndexedVector ){
        if (original == null)
            return new Object[0];
        Object [] output = new Object [original.size()];
        int i = 0;
        for (String val : original){
            if (fieldIsIndexedVector != null && i < fieldIsIndexedVector.length && fieldIsIndexedVector[i])
                val = null;

            if (val == null){
                output[i] = UTF8String.blankString(0);
            } else {
                output[i] = UTF8String.fromBytes(val.getBytes(StandardCharsets.UTF_8));
            }
            i++;
        }
        return output;
    }

    @Override
    public void close() throws IOException {
        //todo somehow work out when the query can be closed
    }
}

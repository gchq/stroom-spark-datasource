/*
 * Copyright 2019 Crown Copyright
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package stroom.spark.datasource;


import org.apache.spark.sql.catalyst.InternalRow;
import org.apache.spark.sql.catalyst.expressions.GenericInternalRow;
import org.apache.spark.sql.sources.v2.reader.InputPartitionReader;
import org.apache.spark.unsafe.types.UTF8String;
import stroom.query.api.v2.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
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

package stroom.spark.datasource;

import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.spark.sql.SQLContext;
import org.apache.spark.sql.SQLImplicits;
import org.apache.spark.sql.catalyst.InternalRow;
import org.apache.spark.sql.catalyst.expressions.GenericInternalRow;
import org.apache.spark.sql.sources.v2.reader.InputPartitionReader;
import org.apache.spark.sql.types.StructType;
import stroom.query.api.v2.*;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;


public class StroomInputPartitionReader implements InputPartitionReader<InternalRow> {

    private String jsonString = "{\n" +
            "  \"key\": {\n" +
            "    \"uuid\": \"API_CALL_myRunId2\"\n" +
            "  },\n" +
            "  \"query\": {\n" +
            "    \"dataSource\": {\n" +
            "      \"type\": \"index\",\n" +
            "      \"uuid\": \"0b97de83-2b38-4915-81f0-c13cc7bf8adc\",\n" +
            "      \"name\": \"Git Stored Fields\"\n" +
            "    },\n" +
            "    \"expression\": {\n" +
            "      \"type\": \"operator\",\n" +
            "      \"op\": \"AND\",\n" +
            "      \"children\": [\n" +
            "        {\n" +
            "          \"type\": \"term\",\n" +
            "          \"field\": \"EventTime\",\n" +
            "          \"condition\": \"BETWEEN\",\n" +
            "          \"value\": \"2016-01-01T00:00:00.000Z,2019-03-01T00:00:00.000Z\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"type\": \"term\",\n" +
            "          \"field\": \"User\",\n" +
            "          \"condition\": \"EQUALS\",\n" +
            "          \"value\": \"gcdev373\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"enabled\": true\n" +
            "    }\n" +
            "  },\n" +
            "  \"resultRequests\": [\n" +
            "    {\n" +
            "      \"componentId\": \"table1\",\n" +
            "      \"mappings\": [\n" +
            "        {\n" +
            "          \"queryId\": \"query1\",\n" +
            "          \"fields\": [\n" +
//            "            {\n" +
//            "              \"name\": \"JSON\",\n" +
//            "              \"expression\": \"${JSON}\",\n" +
//            "              \"format\": {\n" +
//            "                \"type\": \"DATE_TIME\"\n" +
//            "              }\n" +
//            "            },\n" +
            "            {\n" +
            "              \"name\": \"StreamId\",\n" +
            "              \"expression\": \"${StreamId}\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"name\": \"EventId\",\n" +
            "              \"expression\": \"${EventId}\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"extractValues\": true,\n" +
            "          \"extractionPipeline\": {\n" +
            "            \"type\": \"Pipeline\",\n" +
            "            \"uuid\": \"1a471960-e095-4d59-80f8-4352e0cf4938\",\n" +
            "            \"name\": \"wholeEventAsJSONSearchExtraction\"\n" +
            "          },\n" +
            "          \"maxResults\": [\n" +
            "            1000000\n" +
            "          ]\n" +
            "        }\n" +
            "      ],\n" +
            "      \"requestedRange\": {\n" +
            "        \"offset\": 0,\n" +
            "        \"length\": 1000\n" +
            "      },\n" +
            "      \"resultStyle\": \"TABLE\",\n" +
            "      \"fetch\": \"ALL\"\n" +
            "    }\n" +
            "  ],\n" +
            "  \"dateTimeLocale\": \"Europe/London\",\n" +
            "  \"incremental\": false\n" +
            "}";

    private String host;
    private String url;
    private String token;
    private String protocol;
    private SearchResponse searchResponse = null;

    private List<Row> rows = null;
    private int index = -1;

    public StroomInputPartitionReader(StructType schema, String protocol, String host, String url, String token) {
        this.host = host;
        this.url = url;
        this.token = token;
        this.protocol = protocol;

        searchResponse = performSearch(createSearchRequest());


    }

    private static final String INDEX_DOCREF_TYPE_ID = "index";
    private static final String SELECTED_INDEX_UUID = "0b97de83-2b38-4915-81f0-c13cc7bf8adc";
    private static final String SELECTED_INDEX_NAME = "Git Stored Fields";

//    private static final String EXTRACTION_DOCREF_TYPEID = "Pipeline";
//    private static final String SELECTED_EXTRACTION_UUID = "1a471960-e095-4d59-80f8-4352e0cf4938";
//    private static final String SELECTED_EXTRACTION_NAME = "wholeEventAsJSONSearchExtraction";

private static final String EXTRACTION_PIPELINE_DOCREF_TYPEID = "Pipeline";
private static final String SELECTED_EXTRACTION_UUID = "85fb6396-ea09-4310-a051-fa850efe88ce";
private static final String SELECTED_EXTRACTION_NAME = "Searching Git";

    private static final String EVENT_TIME_TAG = "EventTime";
    private static final String USER_TAG = "User";
    private static final String OPERATION_TAG = "Operation";
    private static final String REPO_TAG = "Repo";
    private static final String COMMENT_TAG = "Comment";
    private static final String PATH_TAG = "Path";

    private SearchRequest createSearchRequest() {

        ExpressionOperator expressionOperator = new ExpressionOperator.Builder().addTerms(

                new ExpressionTerm.Builder().field(USER_TAG).condition(
                        ExpressionTerm.Condition.EQUALS
                ).value("gcdev373").build(),
                new ExpressionTerm.Builder().field(EVENT_TIME_TAG).condition(
                        ExpressionTerm.Condition.BETWEEN
                ).value("2016-01-01T00:00:00.000Z,2019-03-01T00:00:00.000Z").build()
        ).build();

        TableSettings tableSettings = new TableSettings.Builder()
                .queryId("myQuery")
                .addFields(Arrays.asList(
                        new Field.Builder()
                                .name(USER_TAG)
                                .expression("${" + USER_TAG + "}")
                                .build(),
                        new Field.Builder()
                                .name(OPERATION_TAG)
                                .expression("${" + OPERATION_TAG + "}")
                                .build()))
                .extractionPipeline(EXTRACTION_PIPELINE_DOCREF_TYPEID,
                        SELECTED_EXTRACTION_UUID,
                        SELECTED_EXTRACTION_NAME)
                .addMaxResults(100)
                .extractValues(true)
                . build();


        ResultRequest resultRequest = new ResultRequest.Builder().componentId("mainResult")
                .resultStyle(ResultRequest.ResultStyle.TABLE)
                .requestedRange(new OffsetRange.Builder().offset(0l).length(10l).build())

                .addMappings(tableSettings).build();

        Query query = new Query.Builder()
            .dataSource(INDEX_DOCREF_TYPE_ID, SELECTED_INDEX_UUID, SELECTED_INDEX_NAME)
            .expression(expressionOperator).build();

        SearchRequest searchRequest = new SearchRequest.Builder()
                .query(query)
                .key(UUID.randomUUID().toString())
                .incremental(false)
                .dateTimeLocale("en-gb")
                .addResultRequests(resultRequest)
                .build();

        return searchRequest;

    }


    private SearchResponse performSearch(final SearchRequest searchRequest) {

        Client client = ClientBuilder.newClient();


        String fullUrl = protocol + "://"+ host + "/" + url;
        System.out.println("Connecting to " + fullUrl);
System.out.println (Entity.json(searchRequest));
            Response response = client.target(fullUrl)

                    .request()
                    .header("Authorization", "Bearer " + token)
                  //  .post(Entity.json(jsonString));
                    .post(Entity.json(searchRequest));
            if (response.getStatus() != 200) {
                System.err.println("Output...");
                System.err.println(response.readEntity(String.class));
                throw new IllegalArgumentException("Got non 200 response from stroom search API: "
                        + response.getStatus() + " " + response.getStatusInfo().getReasonPhrase());
            }

            searchResponse = response.readEntity(SearchResponse.class);
            //assume one Result object in the response
            TableResult tableResult = null;
            if (searchResponse != null && searchResponse.getResults() != null &&
                    searchResponse.getResults().size() > 0) {
                rows = ((TableResult) searchResponse.getResults().get(0)).getRows();
            }


        return searchResponse;
    }



    public boolean next() {
        index ++;
        return (searchResponse.complete() && index == searchResponse.getResults().size() - 1);
    }

    public InternalRow get() {

        Row currentRow = rows.get(index);

        GenericInternalRow genericInternalRow =
                new GenericInternalRow(currentRow.getValues().toArray());


        return genericInternalRow;
    }

    public void close() throws IOException {

    }
}

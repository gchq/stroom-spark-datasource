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



    private String host;
    private String url;
    private String destroyURL;
    private String token;
    private String protocol;
    private TableSettings tableSettings;
    private Query query;

    private List<Row> rows = null;
    private int indexWithinPage;
    private long pageIndex = -1;
    private int pageSize = 1000;
    private final String queryRequestKey;

    public StroomInputPartitionReader(StructType schema, String protocol, String host, String url, String destroyURL, String token, Filter[] filters) {
        this.host = host;
        this.url = url;
        this.token = token;
        this.protocol = protocol;
        this.destroyURL = destroyURL;

        initTableSettings();
        initQuery(filters);

        queryRequestKey = UUID.randomUUID().toString();

        //Force the first page to be read
        indexWithinPage = pageSize;

        //Get Stroom to start the query
        performSearch(createInitialSearchRequest());
    }

    private static final String INDEX_DOCREF_TYPE_ID = "Index";
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

    private ExpressionOperator createOperator (Filter[] filters){

        ExpressionItem expression = createExpression(filters);
        ExpressionOperator.Builder builder = new ExpressionOperator.Builder(ExpressionOperator.Op.AND);

        addExpressionTerm(builder, expression);
        builder.addTerm(new ExpressionTerm.Builder().field(EVENT_TIME_TAG).condition(
                ExpressionTerm.Condition.BETWEEN
        ).value("2016-01-01T00:00:00.000Z,2019-03-01T00:00:00.000Z").build());

        return builder.build();
    }

    private ExpressionItem createExpression (Filter[] filters){

        Vector<ExpressionTerm> terms = new Vector<>();
        Vector<ExpressionOperator> operators = new Vector<>();

        //todo increase support for more kinds of condition
        // Now supports: EqualTo, GreaterThan, GreaterThanOrEqual, LessThan, LessThanOrEqual
        // Doesn't yet support: And, EqualNullSafe, In, IsNotNull, IsNull, Not, Or, StringContains, StringEndsWith, StringStartsWith

        for (int i = 0; i < filters.length; i++){

            ExpressionTerm term = null;
            ExpressionOperator operator = null;
            if (filters[i] instanceof EqualTo){
                EqualTo filter = (EqualTo) filters[i];
                term = new ExpressionTerm.Builder().
                        field(filter.attribute()).
                        condition(ExpressionTerm.Condition.EQUALS).
                        value(filter.value().toString()).
                        build();

            } else if (filters[i] instanceof IsNotNull){
                //Need to use a later version of Query API for this.
                //todo use later Query API version
//                IsNotNull filter = (IsNotNull) filters[i];
//                ExpressionTerm term = new ExpressionTerm.Builder().
//                        field(filter.attribute()).
//                        condition(ExpressionTerm.Condition.IS_NOT_NULL).
//                        build();
            } else if (filters[i] instanceof GreaterThan){

                GreaterThan filter = (GreaterThan) filters[i];
                term = new ExpressionTerm.Builder().
                        field(filter.attribute()).
                        condition(ExpressionTerm.Condition.GREATER_THAN).
                        value(filter.value().toString()).
                        build();
            }else if (filters[i] instanceof GreaterThanOrEqual){

                GreaterThanOrEqual filter = (GreaterThanOrEqual) filters[i];
                term = new ExpressionTerm.Builder().
                        field(filter.attribute()).
                        condition(ExpressionTerm.Condition.GREATER_THAN_OR_EQUAL_TO).
                        value(filter.value().toString()).
                        build();
            } else if (filters[i] instanceof LessThan){

                LessThan filter = (LessThan) filters[i];
                term = new ExpressionTerm.Builder().
                        field(filter.attribute()).
                        condition(ExpressionTerm.Condition.LESS_THAN).
                        value(filter.value().toString()).
                        build();
            }else if (filters[i] instanceof LessThanOrEqual){

                LessThanOrEqual filter = (LessThanOrEqual) filters[i];
                term = new ExpressionTerm.Builder().
                        field(filter.attribute()).
                        condition(ExpressionTerm.Condition.LESS_THAN_OR_EQUAL_TO).
                        value(filter.value().toString()).
                        build();
            }else if (filters[i] instanceof Or) {
                Or filter = (Or) filters[i];

                ExpressionOperator.Builder builder = new ExpressionOperator.Builder(ExpressionOperator.Op.OR);

                addExpressionTerm (builder, createExpression(new Filter[]{filter.left()}));
                addExpressionTerm (builder, createExpression(new Filter[]{filter.right()}));

                operator = builder.build();
            } else if (filters[i] instanceof And) {
                And filter = (And) filters[i];

                ExpressionOperator.Builder builder = new ExpressionOperator.Builder(ExpressionOperator.Op.AND);

                addExpressionTerm (builder, createExpression(new Filter[]{filter.left()}));
                addExpressionTerm (builder, createExpression(new Filter[]{filter.right()}));

                operator = builder.build();
            }
            else
            {
                System.out.println ("Can't yet handle filter " + filters[i]);
            }

            if (term != null){
                terms.add(term);
            }
            if (operator != null){
                operators.add(operator);
            }

        }

        ExpressionItem result;

        if (terms.size() == 0 && operators.size() == 0){
            result = null;
        }
        else if (terms.size() == 1 && operators.size() == 0) {
            result = terms.get(0);
        } else if (operators.size() == 1 && terms.size() == 0) {
            result = operators.get(0);
        } else if (terms.size() > 1 && operators.size() == 0){
            //todo check that this is correct, should it actually be OR - the documentation for Spark interface spec
            // does not appear to define
            result = new ExpressionOperator.Builder(ExpressionOperator.Op.AND).
                    addTerms(terms).build();

        } else if (operators.size() > 1 && terms.size() == 0) {
            result = new ExpressionOperator.Builder(ExpressionOperator.Op.AND).
                    addOperators(operators).build();
        } else {
            result = new ExpressionOperator.Builder(ExpressionOperator.Op.AND).
                    addOperators(operators).
                    addOperator(new ExpressionOperator.Builder(ExpressionOperator.Op.AND).addTerms(terms).build()).build();
        }

        return result;
    }

    private static void addExpressionTerm(ExpressionOperator.Builder builder, ExpressionItem expressionItem) {
        if (expressionItem == null)
            return;
        else if (expressionItem instanceof ExpressionOperator)
            builder.addOperator((ExpressionOperator)expressionItem);
        else if (expressionItem instanceof ExpressionTerm)
            builder.addTerm((ExpressionTerm)expressionItem);
    }

    private void initTableSettings (){
        tableSettings = new TableSettings.Builder()
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
                .addMaxResults(1000000)
                .extractValues(true)
                .build();
    }

    private void initQuery (Filter[] filters) {
        ExpressionOperator expressionOperator = createOperator(filters);


        query = new Query.Builder()
                .dataSource(INDEX_DOCREF_TYPE_ID, SELECTED_INDEX_UUID, SELECTED_INDEX_NAME)
                .expression(expressionOperator).build();
    }

    private SearchRequest createInitialSearchRequest() {

        ResultRequest resultRequest = new ResultRequest.Builder().componentId("mainResult")
                .resultStyle(ResultRequest.ResultStyle.TABLE)
                .requestedRange(new OffsetRange.Builder().offset(0l).length(0l).build())
                .addMappings(tableSettings).build();

        SearchRequest searchRequest = new SearchRequest.Builder()
                .query(query)
                .key(queryRequestKey)
                .incremental(true)
                .dateTimeLocale("en-gb")
                .addResultRequests(resultRequest)

                .build();

        return searchRequest;

    }

    private SearchRequest createSearchRequest() {

        ResultRequest resultRequest = new ResultRequest.Builder().componentId("mainResult")
                .resultStyle(ResultRequest.ResultStyle.TABLE)
                .requestedRange(new OffsetRange.Builder().offset(pageIndex * pageSize).length((long) pageSize).build())
                .addMappings(tableSettings).build();

        SearchRequest searchRequest = new SearchRequest.Builder()
                .query(query)
                .key(queryRequestKey)
                .incremental(true)
                .dateTimeLocale("en-gb")
                .addResultRequests(resultRequest)

                .build();

        return searchRequest;

    }

    private void readResults (final SearchRequest searchRequest) {



        TableResult result;
        long sleepMs = 10;

        do{
            try {
                Thread.sleep(sleepMs);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            sleepMs = 5 * sleepMs;

        } while (performSearch(searchRequest));

    }


    private boolean verboseDebug = false;
    private boolean firstRequest = true;
    /**
     *
     * @param searchRequest
     * @return true if there are more results anticipated for this request
     */
    private boolean performSearch(final SearchRequest searchRequest) {
        boolean moreExpected = false;

        long maxIndex = searchRequest.getResultRequests().get(0).getRequestedRange().getOffset() +
                searchRequest.getResultRequests().get(0).getRequestedRange().getLength() - 1;

        Client client = ClientBuilder.newClient();


        String fullUrl = protocol + "://"+ host + "/" + url;

        if (verboseDebug)
            System.out.println("Connecting to " + fullUrl);

        final ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(SerializationFeature.WRITE_NULL_MAP_VALUES, false);
        mapper.configure(SerializationFeature.INDENT_OUTPUT, false);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        // Enabling default typing adds type information where it would otherwise be ambiguous, i.e. for abstract classes
//        mapper.enableDefaultTyping();
     //   mapper.writeValue(outputStream, objectModel);

        String json = null;

        try {
            json = mapper.writeValueAsString(searchRequest);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new IllegalArgumentException("Unable to serialize the search request");
        }
        if (firstRequest){
            System.out.println ("Request follows...");
            System.out.println (json);
            firstRequest = false;
        }


        Response response = client.target(fullUrl)

                    .request()
                    .header("Authorization", "Bearer " + token)
                    .accept(MediaType.APPLICATION_JSON_TYPE)
                    .post(Entity.json(json));
             //       .post(Entity.json(searchRequest));
             //   .post(Entity.json(json));
            if (response.getStatus() != 200) {
                System.err.println("Output...");
                System.err.println(response.readEntity(String.class));

                try{
                    String responseBody = response.readEntity(String.class);
                    if (responseBody.length() > 0) {
                        throw new IllegalArgumentException("Got non 200 response from Stroom search API: "
                                + response.getStatus() + " " + responseBody);
                    }
                }catch (Exception ex) {
                    throw new IllegalArgumentException("Got non 200 response from Stroom search API: "
                            + response.getStatus() + " " + response.getStatusInfo().getReasonPhrase());
                }
            }

            String responseBody = response.readEntity(String.class);
        if (verboseDebug) {
            System.out.println ("Response follows...");
            System.out.println (responseBody);
        }

        SearchResponse searchResponse;

        try {
            searchResponse = mapper.readValue(responseBody, SearchResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalArgumentException("Unable to read response");

        }
        //assume one Result object in the response

            TableResult tableResult = null;
            if (searchResponse != null && searchResponse.getResults() != null &&
                    searchResponse.getResults().size() > 0) {
                if (searchResponse.getResults().size() != 1){
                    throw new IllegalArgumentException("Only single result expected.  Got " +
                            searchResponse.getResults().size());
                }
                if (!(searchResponse.getResults().get(0) instanceof TableResult)) {
                    throw new IllegalArgumentException("TableResult expected but given " +
                            searchResponse.getResults().get(0));
                }

                tableResult = ((TableResult) searchResponse.getResults().get(0));
                rows = tableResult.getRows();
                moreExpected = tableResult.getTotalResults() < maxIndex && !searchResponse.complete();
            }
        return moreExpected;
    }

    private void readNextPage(){
        pageIndex++;
        indexWithinPage = 0;

        if (verboseDebug)
            System.out.println ("PageIndex, PageSize, IndexWithinPage" + pageIndex + " " + pageSize + " " + indexWithinPage);

        readResults(createSearchRequest());
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
                new GenericInternalRow(convertVals(currentRow.getValues()));

        return genericInternalRow;
    }



    public void close() throws IOException {

        //POST to URL
        //Payload is JSON. Example
//        {
//            "uuid": "7740bcd0-a49e-4c22-8540-044f85770716"
//        }
        Client client = ClientBuilder.newClient();


        String fullUrl = protocol + "://"+ host + "/" + destroyURL;

        if (true)
            System.out.println("Connecting to " + fullUrl);


        String json = "{ \"uuid\": \"" + queryRequestKey + "\" }";

        if (true){
            System.out.println ("Destruction request follows...");
            System.out.println (json);
        }

        Response response = client.target(fullUrl)
                .request()
                .header("Authorization", "Bearer " + token)
                .accept(MediaType.APPLICATION_JSON_TYPE)
                .post(Entity.json(json));

        if (response.getStatus() != 200) {
            System.err.println("Output...");
            System.err.println(response.readEntity(String.class));
            throw new IllegalArgumentException("Got non 200 response from Stroom destroy API: "
                    + response.getStatus() + " " + response.getStatusInfo().getReasonPhrase());
        }

        String responseBody = response.readEntity(String.class);
        if (responseBody.length() > 0) {
            System.out.println ("Response follows...");
            System.out.println (responseBody);
        }

    }

    private static Object[] convertVals (List <String> original){
        if (original == null)
            return new Object[0];
        Object [] output = new Object [original.size()];
        int i = 0;
        for (String val : original){

            if (val == null){
                output[i] = UTF8String.blankString(0);
            } else {
                output[i] = UTF8String.fromBytes(val.getBytes(StandardCharsets.UTF_8));
            }
            i++;
        }
        return output;
    }
}

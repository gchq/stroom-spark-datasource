package stroom.spark.datasource;

import org.apache.spark.sql.sources.*;
import org.apache.spark.sql.sources.Filter;
import stroom.query.api.v2.*;

import java.util.Arrays;
import java.util.UUID;
import java.util.Vector;

public class StroomQuery {

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

    private TableSettings tableSettings;
    private Query query;
    private final String queryRequestKey;


    public StroomQuery (Filter[] filters){
        initTableSettings();
        initQuery(filters);

        queryRequestKey = UUID.randomUUID().toString();
    }

    /**
     * @param queryRequestKey
     */
    public StroomQuery (String queryRequestKey){
        initTableSettings();
        this.queryRequestKey = queryRequestKey;
    }


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

    public String getQueryRequestKey(){
        return queryRequestKey;
    }

    public SearchRequest createInitialSearchRequest() {

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

    public SearchRequest createSearchRequest(long startIndex, long numRecords) {

        ResultRequest resultRequest = new ResultRequest.Builder().componentId("mainResult")
                .resultStyle(ResultRequest.ResultStyle.TABLE)
                .requestedRange(new OffsetRange.Builder().offset(startIndex).length(numRecords).build())
                .addMappings(tableSettings).build();

        SearchRequest searchRequest = new SearchRequest.Builder()
                .key(queryRequestKey)
                .incremental(true)
                .dateTimeLocale("en-gb")
                .addResultRequests(resultRequest)

                .build();

        return searchRequest;

    }

}

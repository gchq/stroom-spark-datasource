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

import org.apache.spark.sql.sources.*;
import org.apache.spark.sql.sources.Filter;
import org.apache.spark.sql.types.Metadata;
import org.apache.spark.sql.types.StructField;
import org.apache.spark.sql.types.StructType;
import stroom.docref.DocRef;
import stroom.query.api.v2.ExpressionItem;
import stroom.query.api.v2.ExpressionOperator;
import stroom.query.api.v2.ExpressionTerm;
import stroom.query.api.v2.Field;
import stroom.query.api.v2.OffsetRange;
import stroom.query.api.v2.Query;
import stroom.query.api.v2.ResultRequest;
import stroom.query.api.v2.SearchRequest;
import stroom.query.api.v2.TableSettings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import static stroom.spark.datasource.StroomDataSource.EXTRACTION_PIPELINE_DOCREF_TYPEID;
import static stroom.spark.datasource.StroomDataSource.EXTRACTION_PIPELINE_NAME;
import static stroom.spark.datasource.StroomDataSource.FIELD_CONTENT_METADATA_KEY;
import static stroom.spark.datasource.StroomDataSource.INDEXED_FIELD_METADATA_KEY;
import static stroom.spark.datasource.StroomDataSource.INDEX_DOCREF_TYPE_ID;
import static stroom.spark.datasource.StroomDataSource.INDEX_NAME;


public class StroomQuery {
    private static final String DUMMY_FIELD_NAME = "_";

    private final String indexUUID;
    private final String extractionPipelineUUID;
    private final String eventTimeFieldName;

    private TableSettings tableSettings;
    private Query query;
    private final String queryRequestKey;
    private final StructType schema;
    private final int maxResults;


    private ArrayList<Filter> pushedIndexedFilters = new ArrayList<Filter>();
    private ArrayList<Filter> unpushedIndexedFilters = new ArrayList<Filter>();


    public StroomQuery (final String indexUUID, final String extractionPipelineUUID, final StructType schema, Filter[] initialFilters, final String eventTimeFieldName, int maxResults){
        this.indexUUID = indexUUID;
        this.extractionPipelineUUID = extractionPipelineUUID;
        this.schema = schema;
        queryRequestKey = UUID.randomUUID().toString();
        this.eventTimeFieldName = eventTimeFieldName;
        this.maxResults = maxResults;

        initTableSettings(false);
        initQuery(initialFilters);

    }

    public StroomQuery (final String indexUUID, final String extractionPipelineUUID, final StructType schema, final String queryRequestKey, final String eventTimeFieldName, int maxResults){
        this.queryRequestKey = queryRequestKey;
        this.indexUUID = indexUUID;
        this.extractionPipelineUUID = extractionPipelineUUID;
        this.schema = schema;
        this.eventTimeFieldName = eventTimeFieldName;
        this.maxResults = maxResults;

        initTableSettings(true);
    }


    public Filter[] getUnpushedFilters (){return unpushedIndexedFilters.toArray(new Filter[unpushedIndexedFilters.size()]);}

    public Filter[] getPushedFilters (){return pushedIndexedFilters.toArray(new Filter[pushedIndexedFilters.size()]);}

    private ExpressionOperator createOperator (Filter[] filters){
        ArrayList<Filter> successfullyPushed = new ArrayList<>();
        ArrayList<Filter> unsuccessfullyPushed = new ArrayList<>();

        ExpressionItem expression = createExpression(filters, successfullyPushed, unsuccessfullyPushed);

        pushedIndexedFilters = successfullyPushed;
        unpushedIndexedFilters = unsuccessfullyPushed;


        ExpressionOperator.Builder builder = ExpressionOperator.builder().op(ExpressionOperator.Op.AND);


        addExpressionTerm(builder, expression);
        builder.addTerm(ExpressionTerm.builder().
                field(eventTimeFieldName).condition(ExpressionTerm.Condition.GREATER_THAN).value("2000-01-01T00:00:00.000Z").build());

        return builder.build();
    }

    private ExpressionItem createExpression (Filter[] filters, List<Filter> pushedFilters, List<Filter> unpushedFilters){

        HashMap<String, Metadata> indexedFieldMap = new HashMap<>();
        //Only attempt to push the filters that relate to indexed fields
        for (StructField field : schema.fields()) {
            if (field.metadata().contains(INDEXED_FIELD_METADATA_KEY)) {
                indexedFieldMap.put(field.name(), field.metadata());
            }
        }

        ArrayList<ExpressionTerm> terms = new ArrayList<>();
        ArrayList<ExpressionOperator> operators = new ArrayList<>();

        //todo increase support for more kinds of condition
        // Now supports: EqualTo, GreaterThan, GreaterThanOrEqual, LessThan, LessThanOrEqual
        // Doesn't yet support: And, EqualNullSafe, In, IsNotNull, IsNull, Not, Or, StringContains, StringEndsWith, StringStartsWith

        for (int i = 0; i < filters.length; i++){

            ExpressionTerm term = null;
            ExpressionOperator operator = null;
            if (filters[i] instanceof EqualTo){
                EqualTo filter = (EqualTo) filters[i];

                if (indexedFieldMap.containsKey(filter.attribute()) &&
                    indexedFieldMap.get(filter.attribute()).getString(ExpressionTerm.Condition.EQUALS.name()) != null){
                    term = ExpressionTerm.builder().
                            field(indexedFieldMap.get(filter.attribute()).getString(INDEXED_FIELD_METADATA_KEY)).
                            condition(ExpressionTerm.Condition.EQUALS).
                            value(filter.value().toString()).
                            build();
                    pushedFilters.add(filter);

                } else {
                    unpushedFilters.add(filter);
                }

            } else if (filters[i] instanceof IsNotNull){
                IsNotNull filter = (IsNotNull) filters[i];

                if (indexedFieldMap.containsKey(filter.attribute()) &&
                        indexedFieldMap.get(filter.attribute()).getString(ExpressionTerm.Condition.IS_NOT_NULL.name()) != null){
                    term = ExpressionTerm.builder().
                            field(indexedFieldMap.get(filter.attribute()).getString(INDEXED_FIELD_METADATA_KEY)).
                            condition(ExpressionTerm.Condition.IS_NOT_NULL).

                            build();
                    pushedFilters.add(filter);

                } else {
                    unpushedFilters.add(filter);
                }

            } else if (filters[i] instanceof GreaterThan){
                GreaterThan filter = (GreaterThan) filters[i];
                if (indexedFieldMap.containsKey(filter.attribute()) &&
                        indexedFieldMap.get(filter.attribute()).getString(ExpressionTerm.Condition.GREATER_THAN.name()) != null){
                    term = ExpressionTerm.builder().
                            field(indexedFieldMap.get(filter.attribute()).getString(INDEXED_FIELD_METADATA_KEY)).
                            condition(ExpressionTerm.Condition.GREATER_THAN).
                            value(filter.value().toString()).
                            build();
                    pushedFilters.add(filter);

                } else {
                    unpushedFilters.add(filter);
                }
            }else if (filters[i] instanceof GreaterThanOrEqual){

                GreaterThanOrEqual filter = (GreaterThanOrEqual) filters[i];

                if (indexedFieldMap.containsKey(filter.attribute()) &&
                        indexedFieldMap.get(filter.attribute()).getString(ExpressionTerm.Condition.GREATER_THAN_OR_EQUAL_TO.name()) != null){
                    term = ExpressionTerm.builder().
                            field(indexedFieldMap.get(filter.attribute()).getString(INDEXED_FIELD_METADATA_KEY)).
                            condition(ExpressionTerm.Condition.GREATER_THAN_OR_EQUAL_TO).
                            value(filter.value().toString()).
                            build();
                    pushedFilters.add(filter);

                } else {
                    unpushedFilters.add(filter);
                }

            } else if (filters[i] instanceof LessThan){

                LessThan filter = (LessThan) filters[i];
                if (indexedFieldMap.containsKey(filter.attribute()) &&
                        indexedFieldMap.get(filter.attribute()).getString(ExpressionTerm.Condition.LESS_THAN.name()) != null){
                    term = ExpressionTerm.builder().
                            field(indexedFieldMap.get(filter.attribute()).getString(INDEXED_FIELD_METADATA_KEY)).
                            condition(ExpressionTerm.Condition.LESS_THAN).
                            value(filter.value().toString()).
                            build();
                    pushedFilters.add(filter);

                } else {
                    unpushedFilters.add(filter);
                }

            }else if (filters[i] instanceof LessThanOrEqual){

                LessThanOrEqual filter = (LessThanOrEqual) filters[i];
                if (indexedFieldMap.containsKey(filter.attribute()) &&
                        indexedFieldMap.get(filter.attribute()).getString(ExpressionTerm.Condition.LESS_THAN_OR_EQUAL_TO.name()) != null){
                    term = ExpressionTerm.builder().
                            field(indexedFieldMap.get(filter.attribute()).getString(INDEXED_FIELD_METADATA_KEY)).
                            condition(ExpressionTerm.Condition.LESS_THAN_OR_EQUAL_TO).
                            value(filter.value().toString()).
                            build();
                    pushedFilters.add(filter);

                } else {
                    unpushedFilters.add(filter);
                }
            } else if (filters[i] instanceof Not){
                Not filter = (Not) filters[i];

                //Before adding, confirm that the negated filter can itself be pushed
                ArrayList<Filter> successfullyPushed = new ArrayList<>();
                ArrayList<Filter> unsuccessfullyPushed = new ArrayList<>();

                ExpressionItem childItem = createExpression(new Filter[]{filter.child()}, successfullyPushed, unsuccessfullyPushed);

                if (unsuccessfullyPushed.isEmpty()) {
                    ExpressionOperator.Builder builder = ExpressionOperator.builder().op(ExpressionOperator.Op.NOT);

                    addExpressionTerm(builder, childItem);
                    pushedFilters.add(filter);

                    //Don't think this is required
                    //pushedFilters.addAll(successfullyPushed);

                    operator = builder.build();
                }
                else
                {
                    System.out.println ("Not pushing NOT " + filter);
                    unpushedFilters.add(filter);
                }

            } else if (filters[i] instanceof Or) {
                Or filter = (Or) filters[i];

                //Before adding, confirm that both sides of filter can be pushed
                ArrayList<Filter> successfullyPushed = new ArrayList<>();
                ArrayList<Filter> unsuccessfullyPushed = new ArrayList<>();

                ExpressionItem leftItem = createExpression(new Filter[]{filter.left()}, successfullyPushed, unsuccessfullyPushed);
                ExpressionItem rightItem = createExpression(new Filter[]{filter.left()}, successfullyPushed, unsuccessfullyPushed);

                if (unsuccessfullyPushed.isEmpty()) {
                    ExpressionOperator.Builder builder = ExpressionOperator.builder().op(ExpressionOperator.Op.OR);

                    addExpressionTerm(builder, leftItem);
                    addExpressionTerm(builder, rightItem);
                    pushedFilters.add(filter);

                    //Don't think this is required
                    //pushedFilters.addAll(successfullyPushed);

                    operator = builder.build();
                }
                else
                {
                    unpushedFilters.add(filter);
                }


            } else if (filters[i] instanceof And) {
                And filter = (And) filters[i];


                //Before adding, confirm that both sides of filter can be pushed
                ArrayList<Filter> successfullyPushed = new ArrayList<>();
                ArrayList<Filter> unsuccessfullyPushed = new ArrayList<>();

                ExpressionItem leftItem = createExpression(new Filter[]{filter.left()}, successfullyPushed, unsuccessfullyPushed);
                ExpressionItem rightItem = createExpression(new Filter[]{filter.left()}, successfullyPushed, unsuccessfullyPushed);

                if (unsuccessfullyPushed.isEmpty()) {
                    ExpressionOperator.Builder builder = ExpressionOperator.builder().op(ExpressionOperator.Op.OR);

                    addExpressionTerm(builder, leftItem);
                    addExpressionTerm(builder, rightItem);
                    pushedFilters.add(filter);

                    //Don't think this is required
                    //pushedFilters.addAll(successfullyPushed);

                    operator = builder.build();
                }
                else
                {
                    unpushedFilters.add(filter);
                }
            }
            else
            {
                throw new UnsupportedOperationException ("Can't yet handle filter " + filters[i]);
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
            result = ExpressionOperator.builder().op(ExpressionOperator.Op.AND).
                    addTerms(terms).build();

        } else if (operators.size() > 1 && terms.size() == 0) {
            result = ExpressionOperator.builder().op(ExpressionOperator.Op.AND).
                    addOperators(operators).build();
        } else {
            result = ExpressionOperator.builder().op(ExpressionOperator.Op.AND).
                    addOperators(operators).
                    addOperator(ExpressionOperator.builder().op(ExpressionOperator.Op.AND).addTerms(terms).build()).build();
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

    private boolean [] fieldIsIndexedVector = null;
    public boolean [] getFieldIsIndexedVector (){
        return fieldIsIndexedVector;
    }

    private void initTableSettings (boolean dummy){


        TableSettings.Builder builder = TableSettings.builder()
                .queryId("myQuery")
                .extractionPipeline(EXTRACTION_PIPELINE_DOCREF_TYPEID,
                        extractionPipelineUUID,
                        EXTRACTION_PIPELINE_NAME)
                .addMaxResults(maxResults)
                .extractValues(true);

        if (dummy){
            for (int i = 0; i < schema.fields().length; i++) {
                builder.addFields(
                        Field.builder()
                                .name("F" + i)
                                .expression("${" + DUMMY_FIELD_NAME + "}")
                                .build());
            }
        } else {

            boolean[] fieldsAreIndex = new boolean[schema.fields().length];

            for (int i = 0; i < schema.fields().length; i++) {
                fieldsAreIndex[i] = false;
                StructField field = schema.fields()[i];

                if (field.metadata().contains(FIELD_CONTENT_METADATA_KEY)) {
                    builder.addFields(
                            Field.builder()
                                    .name (DUMMY_FIELD_NAME)  //(field.name())
                                    .expression("${" + field.metadata().getString(FIELD_CONTENT_METADATA_KEY) + "}")
                                    .build());
                } else if (field.metadata().contains(INDEXED_FIELD_METADATA_KEY)) {
                    fieldsAreIndex[i] = true;
                    builder.addFields(
                            Field.builder()
                                    .name(DUMMY_FIELD_NAME)  //(field.name())
                                    .expression("${" + DUMMY_FIELD_NAME + "}")
                                    //.expression("${" + field.metadata().getString(INDEXED_FIELD_METADATA_KEY) + "}")
                                    .build());
                }
            }

            fieldIsIndexedVector = fieldsAreIndex;
        }

        tableSettings = builder.build();
    }

    private void initQuery (Filter[] initialFilters) {
        ExpressionOperator expressionOperator = createOperator(initialFilters);


        query = Query.builder()
                .dataSource(new DocRef(INDEX_DOCREF_TYPE_ID, indexUUID, INDEX_NAME))
                .expression(expressionOperator).build();
    }

    public String getQueryRequestKey(){
        return queryRequestKey;
    }

    public SearchRequest createInitialSearchRequest() {

        ResultRequest resultRequest = ResultRequest.builder().componentId("mainResult")
                .resultStyle(ResultRequest.ResultStyle.TABLE)
                .requestedRange(OffsetRange.builder().offset(0l).length(0l).build())
                .addMappings(tableSettings).build();

        SearchRequest searchRequest = SearchRequest.builder()
                .query(query)
                .key(queryRequestKey)
                .incremental(true)
                .dateTimeLocale("en-gb")
                .addResultRequests(resultRequest)

                .build();

        return searchRequest;

    }

    public SearchRequest createSearchRequest(long startIndex, long numRecords) {

        ResultRequest resultRequest = ResultRequest.builder().componentId("mainResult")
                .resultStyle(ResultRequest.ResultStyle.TABLE)
                .requestedRange(OffsetRange.builder().offset(startIndex).length(numRecords).build())
                .addMappings(tableSettings).build();

        SearchRequest searchRequest = SearchRequest.builder()
                .key(queryRequestKey)
                .incremental(true)
                .dateTimeLocale("en-gb")
                .addResultRequests(resultRequest)

                .build();

        return searchRequest;

    }

}

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


import io.swagger.client.model.DocRef;
import io.swagger.client.model.ExpressionItem;
import io.swagger.client.model.ExpressionOperator;
import io.swagger.client.model.ExpressionTerm;
import io.swagger.client.model.Field;
import io.swagger.client.model.OffsetRange;
import io.swagger.client.model.Query;
import io.swagger.client.model.QueryKey;
import io.swagger.client.model.ResultRequest;
import io.swagger.client.model.SearchRequest;
import io.swagger.client.model.TableSettings;
import org.apache.spark.sql.sources.And;
import org.apache.spark.sql.sources.EqualTo;
import org.apache.spark.sql.sources.Filter;
import org.apache.spark.sql.sources.GreaterThan;
import org.apache.spark.sql.sources.GreaterThanOrEqual;
import org.apache.spark.sql.sources.IsNotNull;
import org.apache.spark.sql.sources.LessThan;
import org.apache.spark.sql.sources.LessThanOrEqual;
import org.apache.spark.sql.sources.Not;
import org.apache.spark.sql.sources.Or;
import org.apache.spark.sql.types.Metadata;
import org.apache.spark.sql.types.StructField;
import org.apache.spark.sql.types.StructType;

import java.util.*;

import static stroom.spark.datasource.StroomDataSource.*;


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


        ExpressionOperator operator = new ExpressionOperator();
        operator.setOp(ExpressionOperator.OpEnum.AND);
        operator.addChildrenItem(expression);

        ExpressionTerm term = new ExpressionTerm();
        term.setField(eventTimeFieldName);
        term.setCondition(ExpressionTerm.ConditionEnum.GREATER_THAN);
        term.setValue("2000-01-01T00:00:00.000Z");
        operator.addChildrenItem(term);

        return operator;
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
                    indexedFieldMap.get(filter.attribute()).getString(ExpressionTerm.ConditionEnum.EQUALS.name()) != null){
                    term = new ExpressionTerm();
                    term.setField(indexedFieldMap.get(filter.attribute()).getString(INDEXED_FIELD_METADATA_KEY));
                    term.setCondition(ExpressionTerm.ConditionEnum.EQUALS);
                    term.setValue(filter.value().toString());

                    pushedFilters.add(filter);

                } else {
                    unpushedFilters.add(filter);
                }

            } else if (filters[i] instanceof IsNotNull){
                IsNotNull filter = (IsNotNull) filters[i];

                if (indexedFieldMap.containsKey(filter.attribute()) &&
                        indexedFieldMap.get(filter.attribute()).getString(ExpressionTerm.ConditionEnum.IS_NOT_NULL.name()) != null){
                    term = new ExpressionTerm();
                    term.setField(indexedFieldMap.get(filter.attribute()).getString(INDEXED_FIELD_METADATA_KEY));
                    term.setCondition(ExpressionTerm.ConditionEnum.IS_NOT_NULL);

                    pushedFilters.add(filter);

                } else {
                    unpushedFilters.add(filter);
                }

            } else if (filters[i] instanceof GreaterThan){
                GreaterThan filter = (GreaterThan) filters[i];
                if (indexedFieldMap.containsKey(filter.attribute()) &&
                        indexedFieldMap.get(filter.attribute()).getString(ExpressionTerm.ConditionEnum.GREATER_THAN.name()) != null){
                    term = new ExpressionTerm();
                    term.setField(indexedFieldMap.get(filter.attribute()).getString(INDEXED_FIELD_METADATA_KEY));
                    term.setCondition(ExpressionTerm.ConditionEnum.GREATER_THAN);
                    term.setValue(filter.value().toString());

                    pushedFilters.add(filter);

                } else {
                    unpushedFilters.add(filter);
                }
            }else if (filters[i] instanceof GreaterThanOrEqual){

                GreaterThanOrEqual filter = (GreaterThanOrEqual) filters[i];

                if (indexedFieldMap.containsKey(filter.attribute()) &&
                        indexedFieldMap.get(filter.attribute()).getString(ExpressionTerm.ConditionEnum.GREATER_THAN_OR_EQUAL_TO.name()) != null){
                    term = new ExpressionTerm();
                    term.setField(indexedFieldMap.get(filter.attribute()).getString(INDEXED_FIELD_METADATA_KEY));
                    term.setCondition(ExpressionTerm.ConditionEnum.GREATER_THAN_OR_EQUAL_TO);
                    term.setValue(filter.value().toString());

                    pushedFilters.add(filter);

                } else {
                    unpushedFilters.add(filter);
                }

            } else if (filters[i] instanceof LessThan){

                LessThan filter = (LessThan) filters[i];
                if (indexedFieldMap.containsKey(filter.attribute()) &&
                        indexedFieldMap.get(filter.attribute()).getString(ExpressionTerm.ConditionEnum.LESS_THAN.name()) != null){
                    term = new ExpressionTerm();
                    term.setField(indexedFieldMap.get(filter.attribute()).getString(INDEXED_FIELD_METADATA_KEY));
                    term.setCondition(ExpressionTerm.ConditionEnum.LESS_THAN);
                    term.setValue(filter.value().toString());

                    pushedFilters.add(filter);

                } else {
                    unpushedFilters.add(filter);
                }

            }else if (filters[i] instanceof LessThanOrEqual){

                LessThanOrEqual filter = (LessThanOrEqual) filters[i];
                if (indexedFieldMap.containsKey(filter.attribute()) &&
                        indexedFieldMap.get(filter.attribute()).getString(ExpressionTerm.ConditionEnum.LESS_THAN_OR_EQUAL_TO.name()) != null){
                    term = new ExpressionTerm();
                    term.setField(indexedFieldMap.get(filter.attribute()).getString(INDEXED_FIELD_METADATA_KEY));
                    term.setCondition(ExpressionTerm.ConditionEnum.LESS_THAN_OR_EQUAL_TO);
                    term.setValue(filter.value().toString());

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
                    ExpressionOperator op = new ExpressionOperator();
                    op.setOp(ExpressionOperator.OpEnum.NOT);

                    op.addChildrenItem(childItem);

                    pushedFilters.add(filter);

                    //Don't think this is required
                    //pushedFilters.addAll(successfullyPushed);

                    operator = op;
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
                    ExpressionOperator op = new ExpressionOperator();
                    op.setOp(ExpressionOperator.OpEnum.OR);

                    op.addChildrenItem(leftItem);
                    op.addChildrenItem(rightItem);

                    pushedFilters.add(filter);

                    //Don't think this is required
                    //pushedFilters.addAll(successfullyPushed);

                    operator = op;
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
                    ExpressionOperator op = new ExpressionOperator();
                    op.setOp(ExpressionOperator.OpEnum.OR);

                    op.addChildrenItem(leftItem);
                    op.addChildrenItem(rightItem);
                    pushedFilters.add(filter);

                    //Don't think this is required
                    //pushedFilters.addAll(successfullyPushed);

                    operator = op;
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
            ExpressionOperator op = new ExpressionOperator();
            op.setOp(ExpressionOperator.OpEnum.AND);
            for (ExpressionTerm term : terms) {
                op.addChildrenItem(term);
            }
            result = op;

        } else if (operators.size() > 1 && terms.size() == 0) {
            ExpressionOperator op = new ExpressionOperator();
            op.setOp(ExpressionOperator.OpEnum.AND);
            result = op;
        } else {
            ExpressionOperator op = new ExpressionOperator();
            op.setOp(ExpressionOperator.OpEnum.AND);
            for (ExpressionOperator childOperator : operators) {
                op.addChildrenItem(childOperator);
            }
            ExpressionOperator op2 = new ExpressionOperator();
            op2.setOp(ExpressionOperator.OpEnum.AND);
            for (ExpressionTerm term : terms) {
                op2.addChildrenItem(term);
            }
            op.addChildrenItem(op2);

            result = op;
        }

        return result;
    }

//    private static void addExpressionTerm(ExpressionOperator operator, ExpressionItem expressionItem) {
//        if (expressionItem == null)
//            return;
//
//        operator.addChildrenItem(expressionItem);
//    }

    private boolean [] fieldIsIndexedVector = null;
    public boolean [] getFieldIsIndexedVector (){
        return fieldIsIndexedVector;
    }

    private void initTableSettings (boolean dummy){


        TableSettings tableSettings = new TableSettings();
        tableSettings.setQueryId("myQuery");
        DocRef pipeline = new DocRef();
        pipeline.setName(EXTRACTION_PIPELINE_NAME);
        pipeline.setUuid(extractionPipelineUUID);
        pipeline.setType(EXTRACTION_PIPELINE_DOCREF_TYPEID);
        tableSettings.setExtractionPipeline(pipeline);
        tableSettings.addMaxResultsItem(maxResults);
        tableSettings.setExtractValues(true);

        if (dummy){
            for (int i = 0; i < schema.fields().length; i++) {
                Field dummyField = new Field();
                dummyField.setName("F" + i);
                dummyField.setExpression("${" + DUMMY_FIELD_NAME + "}");
                tableSettings.addFieldsItem(dummyField);
            }
        } else {

            boolean[] fieldsAreIndex = new boolean[schema.fields().length];

            for (int i = 0; i < schema.fields().length; i++) {
                fieldsAreIndex[i] = false;
                StructField field = schema.fields()[i];

                if (field.metadata().contains(FIELD_CONTENT_METADATA_KEY)) {
                    Field dummyField = new Field();
                    dummyField.setName(DUMMY_FIELD_NAME);
                    dummyField.setExpression("${" + field.metadata().getString(FIELD_CONTENT_METADATA_KEY) + "}");
                    tableSettings.addFieldsItem(dummyField);

                } else if (field.metadata().contains(INDEXED_FIELD_METADATA_KEY)) {
                    fieldsAreIndex[i] = true;

                    Field dummyField = new Field();
                    dummyField.setName(DUMMY_FIELD_NAME);
                    dummyField.setExpression("${" + DUMMY_FIELD_NAME + "}");
                    tableSettings.addFieldsItem(dummyField);
                }
            }

            fieldIsIndexedVector = fieldsAreIndex;
        }

        this.tableSettings = tableSettings;
    }

    private void initQuery (Filter[] initialFilters) {
        ExpressionOperator expressionOperator = createOperator(initialFilters);

        Query query = new Query();
        DocRef index = new DocRef();
        index.setType(INDEX_DOCREF_TYPE_ID);
        index.setUuid(indexUUID);
        index.setName(INDEX_NAME);

        query.setDataSource(index);
        query.setExpression(expressionOperator);

        this.query = query;
    }

    public String getQueryRequestKey(){
        return queryRequestKey;
    }

    public SearchRequest createInitialSearchRequest() {

        ResultRequest resultRequest = new ResultRequest();
        resultRequest.setComponentId("mainResult");
        resultRequest.setResultStyle(ResultRequest.ResultStyleEnum.TABLE);

        OffsetRange range = new OffsetRange();
        range.setOffset(0l);
        range.setLength(0l);
        resultRequest.setRequestedRange(range);

        resultRequest.addMappingsItem(tableSettings);


        SearchRequest searchRequest = new SearchRequest();
        searchRequest.setQuery(query);

        QueryKey key = new QueryKey();
        key.setUuid(queryRequestKey);
        searchRequest.setKey(key);

        searchRequest.setIncremental(true);
        searchRequest.setDateTimeLocale("en-gb");
        searchRequest.addResultRequestsItem(resultRequest);

        return searchRequest;

    }

    public SearchRequest createSearchRequest(long startIndex, long numRecords) {

        ResultRequest resultRequest = new ResultRequest();
        resultRequest.setComponentId("mainResult");
        resultRequest.setResultStyle(ResultRequest.ResultStyleEnum.TABLE);

        OffsetRange range = new OffsetRange();
        range.setOffset(startIndex);
        range.setLength(numRecords);
        resultRequest.setRequestedRange(range);

        resultRequest.addMappingsItem(tableSettings);

        SearchRequest searchRequest = new SearchRequest();
        searchRequest.setQuery(query);

        QueryKey key = new QueryKey();
        key.setUuid(queryRequestKey);
        searchRequest.setKey(key);

        searchRequest.setIncremental(true);
        searchRequest.setDateTimeLocale("en-gb");
        searchRequest.addResultRequestsItem(resultRequest);

        return searchRequest;

    }

}

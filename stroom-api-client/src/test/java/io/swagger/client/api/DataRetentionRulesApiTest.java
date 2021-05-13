/*
 * Stroom API
 * Various APIs for interacting with Stroom and its data
 *
 * OpenAPI spec version: v1/v2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.DataRetentionDeleteSummaryRequest;
import io.swagger.client.model.DataRetentionDeleteSummaryResponse;
import io.swagger.client.model.DataRetentionRules;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DataRetentionRulesApi
 */
@Ignore
public class DataRetentionRulesApiTest {

    private final DataRetentionRulesApi api = new DataRetentionRulesApi();

    /**
     * Get data retention rules
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchDataRetentionRulesTest() throws ApiException {
        DataRetentionRules response = api.fetchDataRetentionRules();

        // TODO: test validations
    }
    /**
     * Get a summary of meta deletions with the passed data retention rules
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDataRetentionImpactSummaryTest() throws ApiException {
        DataRetentionDeleteSummaryRequest body = null;
        DataRetentionDeleteSummaryResponse response = api.getDataRetentionImpactSummary(body);

        // TODO: test validations
    }
    /**
     * Stop a running query
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void stopDataRetentionImpactSummaryTest() throws ApiException {
        String queryId = null;
        Boolean response = api.stopDataRetentionImpactSummary(queryId);

        // TODO: test validations
    }
    /**
     * Update data retention rules
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDataRetentionRulesTest() throws ApiException {
        DataRetentionRules body = null;
        DataRetentionRules response = api.updateDataRetentionRules(body);

        // TODO: test validations
    }
}
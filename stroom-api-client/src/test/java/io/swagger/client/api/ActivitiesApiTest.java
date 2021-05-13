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
import io.swagger.client.model.AcknowledgeSplashRequest;
import io.swagger.client.model.Activity;
import io.swagger.client.model.ActivityValidationResult;
import io.swagger.client.model.FilterFieldDefinition;
import io.swagger.client.model.ResultPageActivity;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ActivitiesApi
 */
@Ignore
public class ActivitiesApiTest {

    private final ActivitiesApi api = new ActivitiesApi();

    /**
     * Acknowledge the slash screen
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void acknowledgeSplashTest() throws ApiException {
        AcknowledgeSplashRequest body = null;
        Boolean response = api.acknowledgeSplash(body);

        // TODO: test validations
    }
    /**
     * Create an Activity
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createActivityTest() throws ApiException {
        Activity response = api.createActivity();

        // TODO: test validations
    }
    /**
     * Delete an activity
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteActivityTest() throws ApiException {
        Integer id = null;
        Boolean response = api.deleteActivity(id);

        // TODO: test validations
    }
    /**
     * Fetch an Activity
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchActivityTest() throws ApiException {
        Integer id = null;
        Activity response = api.fetchActivity(id);

        // TODO: test validations
    }
    /**
     * Gets the current activity
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCurrentActivityTest() throws ApiException {
        Activity response = api.getCurrentActivity();

        // TODO: test validations
    }
    /**
     * Lists activities
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listActivitiesTest() throws ApiException {
        String filter = null;
        ResultPageActivity response = api.listActivities(filter);

        // TODO: test validations
    }
    /**
     * Lists activity field definitions
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listActivityFieldDefinitionsTest() throws ApiException {
        List<FilterFieldDefinition> response = api.listActivityFieldDefinitions();

        // TODO: test validations
    }
    /**
     * Gets the current activity
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setCurrentActivityTest() throws ApiException {
        Activity body = null;
        Activity response = api.setCurrentActivity(body);

        // TODO: test validations
    }
    /**
     * Update an Activity
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateActivityTest() throws ApiException {
        Integer id = null;
        Activity body = null;
        Activity response = api.updateActivity(id, body);

        // TODO: test validations
    }
    /**
     * Create an Activity
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateActivityTest() throws ApiException {
        Activity body = null;
        ActivityValidationResult response = api.validateActivity(body);

        // TODO: test validations
    }
}
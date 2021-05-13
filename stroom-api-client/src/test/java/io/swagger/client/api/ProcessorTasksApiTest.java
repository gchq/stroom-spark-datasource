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
import io.swagger.client.model.AssignTasksRequest;
import io.swagger.client.model.ExpressionCriteria;
import io.swagger.client.model.ProcessorTaskList;
import io.swagger.client.model.ResultPageProcessorTask;
import io.swagger.client.model.ResultPageProcessorTaskSummary;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProcessorTasksApi
 */
@Ignore
public class ProcessorTasksApiTest {

    private final ProcessorTasksApi api = new ProcessorTasksApi();

    /**
     * Abandon some tasks
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void abandonProcessorTasksTest() throws ApiException {
        ProcessorTaskList body = null;
        String nodeName = null;
        Boolean response = api.abandonProcessorTasks(body, nodeName);

        // TODO: test validations
    }
    /**
     * Assign some tasks
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void assignProcessorTasksTest() throws ApiException {
        AssignTasksRequest body = null;
        String nodeName = null;
        ProcessorTaskList response = api.assignProcessorTasks(body, nodeName);

        // TODO: test validations
    }
    /**
     * Finds processor task summaries
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findProcessorTaskSummaryTest() throws ApiException {
        ExpressionCriteria body = null;
        ResultPageProcessorTaskSummary response = api.findProcessorTaskSummary(body);

        // TODO: test validations
    }
    /**
     * Finds processors tasks
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findProcessorTasksTest() throws ApiException {
        ExpressionCriteria body = null;
        ResultPageProcessorTask response = api.findProcessorTasks(body);

        // TODO: test validations
    }
}

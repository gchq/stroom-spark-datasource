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
import io.swagger.client.model.JobNodeInfo;
import io.swagger.client.model.ResultPageJobNode;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for JobsNodeApi
 */
@Ignore
public class JobsNodeApiTest {

    private final JobsNodeApi api = new JobsNodeApi();

    /**
     * Gets current info for a job node
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchJobNodeInfoTest() throws ApiException {
        String jobName = null;
        String nodeName = null;
        JobNodeInfo response = api.fetchJobNodeInfo(jobName, nodeName);

        // TODO: test validations
    }
    /**
     * Lists job nodes
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listJobsNodesTest() throws ApiException {
        String jobName = null;
        String nodeName = null;
        ResultPageJobNode response = api.listJobsNodes(jobName, nodeName);

        // TODO: test validations
    }
    /**
     * Sets the enabled status of the job node
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setJobNodeEnabledTest() throws ApiException {
        Boolean body = null;
        Integer id = null;
        api.setJobNodeEnabled(body, id);

        // TODO: test validations
    }
    /**
     * Sets the schedule job node
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setJobNodeScheduleTest() throws ApiException {
        String body = null;
        Integer id = null;
        api.setJobNodeSchedule(body, id);

        // TODO: test validations
    }
    /**
     * Sets the task limit for the job node
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setJobNodeTaskLimitTest() throws ApiException {
        Integer body = null;
        Integer id = null;
        api.setJobNodeTaskLimit(body, id);

        // TODO: test validations
    }
}

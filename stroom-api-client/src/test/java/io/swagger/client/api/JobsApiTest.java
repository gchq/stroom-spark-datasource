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
import io.swagger.client.model.ResultPageJob;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for JobsApi
 */
@Ignore
public class JobsApiTest {

    private final JobsApi api = new JobsApi();

    /**
     * Lists jobs
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listJobsTest() throws ApiException {
        ResultPageJob response = api.listJobs();

        // TODO: test validations
    }
    /**
     * Sets the enabled status of the job
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setJobEnabledTest() throws ApiException {
        Boolean body = null;
        Integer id = null;
        api.setJobEnabled(body, id);

        // TODO: test validations
    }
}

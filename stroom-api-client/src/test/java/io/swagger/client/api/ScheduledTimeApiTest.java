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
import io.swagger.client.model.GetScheduledTimesRequest;
import io.swagger.client.model.ScheduledTimes;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ScheduledTimeApi
 */
@Ignore
public class ScheduledTimeApiTest {

    private final ScheduledTimeApi api = new ScheduledTimeApi();

    /**
     * Gets scheduled time info
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getScheduledTimesTest() throws ApiException {
        GetScheduledTimesRequest body = null;
        ScheduledTimes response = api.getScheduledTimes(body);

        // TODO: test validations
    }
}

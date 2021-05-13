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
import io.swagger.client.model.SystemInfoResult;
import io.swagger.client.model.SystemInfoResultList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SystemInfoApi
 */
@Ignore
public class SystemInfoApiTest {

    private final SystemInfoApi api = new SystemInfoApi();

    /**
     * Get all system info results
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllSystemInfoTest() throws ApiException {
        SystemInfoResultList response = api.getAllSystemInfo();

        // TODO: test validations
    }
    /**
     * Get a system info result by name
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSystemInfoByNameTest() throws ApiException {
        String name = null;
        SystemInfoResult response = api.getSystemInfoByName(name);

        // TODO: test validations
    }
    /**
     * Get all system info result names
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSystemInfoNamesTest() throws ApiException {
        List<String> response = api.getSystemInfoNames();

        // TODO: test validations
    }
}

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
import io.swagger.client.model.ClusterLockKey;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ClusterLockApi
 */
@Ignore
public class ClusterLockApiTest {

    private final ClusterLockApi api = new ClusterLockApi();

    /**
     * Keep a lock alive
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void keepClusterLockAliveTest() throws ApiException {
        ClusterLockKey body = null;
        String nodeName = null;
        Boolean response = api.keepClusterLockAlive(body, nodeName);

        // TODO: test validations
    }
    /**
     * Release a lock
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void releaseClusterLockTest() throws ApiException {
        ClusterLockKey body = null;
        String nodeName = null;
        Boolean response = api.releaseClusterLock(body, nodeName);

        // TODO: test validations
    }
    /**
     * Try to lock
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tryClusterLockTest() throws ApiException {
        ClusterLockKey body = null;
        String nodeName = null;
        Boolean response = api.tryClusterLock(body, nodeName);

        // TODO: test validations
    }
}

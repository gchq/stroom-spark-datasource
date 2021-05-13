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
import io.swagger.client.model.FindDBTableCriteria;
import io.swagger.client.model.ResultPageDBTableStatus;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DatabaseStatusApi
 */
@Ignore
public class DatabaseStatusApiTest {

    private final DatabaseStatusApi api = new DatabaseStatusApi();

    /**
     * Find status of the DB
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findDbSystemTableStatusTest() throws ApiException {
        FindDBTableCriteria body = null;
        ResultPageDBTableStatus response = api.findDbSystemTableStatus(body);

        // TODO: test validations
    }
    /**
     * Find status of the DB
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDbSystemTableStatusTest() throws ApiException {
        ResultPageDBTableStatus response = api.getDbSystemTableStatus();

        // TODO: test validations
    }
}
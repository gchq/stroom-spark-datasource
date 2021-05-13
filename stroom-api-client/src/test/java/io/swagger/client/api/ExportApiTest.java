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
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExportApi
 */
@Ignore
public class ExportApiTest {

    private final ExportApi api = new ExportApi();

    /**
     * Exports all configuration to a file.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void exportAllContentTest() throws ApiException {
        api.exportAllContent();

        // TODO: test validations
    }
}
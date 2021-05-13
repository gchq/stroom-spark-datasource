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
import io.swagger.client.model.ExpressionCriteria;
import io.swagger.client.model.IndexVolume;
import io.swagger.client.model.ResultPageIndexVolume;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IndexVolumesApi
 */
@Ignore
public class IndexVolumesApiTest {

    private final IndexVolumesApi api = new IndexVolumesApi();

    /**
     * Creates an index volume
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createIndexVolumeTest() throws ApiException {
        IndexVolume body = null;
        IndexVolume response = api.createIndexVolume(body);

        // TODO: test validations
    }
    /**
     * Deletes an index volume
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteIndexVolumeTest() throws ApiException {
        Integer id = null;
        Boolean response = api.deleteIndexVolume(id);

        // TODO: test validations
    }
    /**
     * Fetch an index volume
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchIndexVolumeTest() throws ApiException {
        Integer id = null;
        IndexVolume response = api.fetchIndexVolume(id);

        // TODO: test validations
    }
    /**
     * Finds index volumes matching request
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findIndexVolumesTest() throws ApiException {
        ExpressionCriteria body = null;
        ResultPageIndexVolume response = api.findIndexVolumes(body);

        // TODO: test validations
    }
    /**
     * Rescans index volumes
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rescanIndexVolumesTest() throws ApiException {
        String nodeName = null;
        Boolean response = api.rescanIndexVolumes(nodeName);

        // TODO: test validations
    }
    /**
     * Updates an index volume
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateIndexVolumeTest() throws ApiException {
        IndexVolume body = null;
        Integer id = null;
        IndexVolume response = api.updateIndexVolume(body, id);

        // TODO: test validations
    }
}

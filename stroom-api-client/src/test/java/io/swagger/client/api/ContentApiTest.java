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
import io.swagger.client.model.DependencyCriteria;
import io.swagger.client.model.DocRefs;
import io.swagger.client.model.ImportConfigRequest;
import io.swagger.client.model.ImportState;
import io.swagger.client.model.ResourceGeneration;
import io.swagger.client.model.ResourceKey;
import io.swagger.client.model.ResultPageDependency;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContentApi
 */
@Ignore
public class ContentApiTest {

    private final ContentApi api = new ContentApi();

    /**
     * Get import confirmation state
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void confirmContentImportTest() throws ApiException {
        ResourceKey body = null;
        List<ImportState> response = api.confirmContentImport(body);

        // TODO: test validations
    }
    /**
     * Export content
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void exportContentTest() throws ApiException {
        DocRefs body = null;
        ResourceGeneration response = api.exportContent(body);

        // TODO: test validations
    }
    /**
     * Fetch content dependencies
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchContentDependenciesTest() throws ApiException {
        DependencyCriteria body = null;
        ResultPageDependency response = api.fetchContentDependencies(body);

        // TODO: test validations
    }
    /**
     * Import content
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void importContentTest() throws ApiException {
        ImportConfigRequest body = null;
        ResourceKey response = api.importContent(body);

        // TODO: test validations
    }
}

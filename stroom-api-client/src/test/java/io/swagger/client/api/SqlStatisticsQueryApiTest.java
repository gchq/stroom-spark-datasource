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
import io.swagger.client.model.DataSource;
import io.swagger.client.model.DocRef;
import io.swagger.client.model.QueryKey;
import io.swagger.client.model.SearchRequest;
import io.swagger.client.model.SearchResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SqlStatisticsQueryApi
 */
@Ignore
public class SqlStatisticsQueryApiTest {

    private final SqlStatisticsQueryApi api = new SqlStatisticsQueryApi();

    /**
     * Destroy a running query
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void destroySqlStatisticsSearchTest() throws ApiException {
        QueryKey body = null;
        Boolean response = api.destroySqlStatisticsSearch(body);

        // TODO: test validations
    }
    /**
     * Submit a request for a data source definition, supplying the DocRef for the data source
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSqlStatisticsDataSourceTest() throws ApiException {
        DocRef body = null;
        DataSource response = api.getSqlStatisticsDataSource(body);

        // TODO: test validations
    }
    /**
     * Submit a search request
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchSqlStatisticsTest() throws ApiException {
        SearchRequest body = null;
        SearchResponse response = api.searchSqlStatistics(body);

        // TODO: test validations
    }
}
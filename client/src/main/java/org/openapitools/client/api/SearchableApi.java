package org.openapitools.client.api;

import stroom.datasource.api.v2.*;
import stroom.docref.*;
import stroom.query.api.v2.*;

import org.openapitools.client.model.*;



import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import javax.ws.rs.core.GenericType;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-24T14:59:53.556+01:00[Europe/London]")
public class SearchableApi {
  private ApiClient apiClient;

  public SearchableApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SearchableApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API cilent
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API cilent
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Destroy a running query
   * 
   * @param queryKey QueryKey (required)
   * @return Boolean
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 0 </td><td> default response </td><td>  -  </td></tr>
     </table>
   */
  public Boolean destroySearchableQuery(QueryKey queryKey) throws ApiException {
    return destroySearchableQueryWithHttpInfo(queryKey).getData();
  }

  /**
   * Destroy a running query
   * 
   * @param queryKey QueryKey (required)
   * @return ApiResponse&lt;Boolean&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 0 </td><td> default response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Boolean> destroySearchableQueryWithHttpInfo(QueryKey queryKey) throws ApiException {
    Object localVarPostBody = queryKey;
    
    // verify the required parameter 'queryKey' is set
    if (queryKey == null) {
      throw new ApiException(400, "Missing the required parameter 'queryKey' when calling destroySearchableQuery");
    }
    
    // create path and map variables
    String localVarPath = "/searchable/v2/destroy";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

    GenericType<Boolean> localVarReturnType = new GenericType<Boolean>() {};

    return apiClient.invokeAPI("SearchableApi.destroySearchableQuery", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Submit a request for a data source definition, supplying the DocRef for the data source
   * 
   * @param docRef DocRef (required)
   * @return DataSource
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 0 </td><td> default response </td><td>  -  </td></tr>
     </table>
   */
  public DataSource getSearchableDataSource(DocRef docRef) throws ApiException {
    return getSearchableDataSourceWithHttpInfo(docRef).getData();
  }

  /**
   * Submit a request for a data source definition, supplying the DocRef for the data source
   * 
   * @param docRef DocRef (required)
   * @return ApiResponse&lt;DataSource&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 0 </td><td> default response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DataSource> getSearchableDataSourceWithHttpInfo(DocRef docRef) throws ApiException {
    Object localVarPostBody = docRef;
    
    // verify the required parameter 'docRef' is set
    if (docRef == null) {
      throw new ApiException(400, "Missing the required parameter 'docRef' when calling getSearchableDataSource");
    }
    
    // create path and map variables
    String localVarPath = "/searchable/v2/dataSource";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

    GenericType<DataSource> localVarReturnType = new GenericType<DataSource>() {};

    return apiClient.invokeAPI("SearchableApi.getSearchableDataSource", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Submit a search request
   * 
   * @param searchRequest SearchRequest (required)
   * @return SearchResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 0 </td><td> default response </td><td>  -  </td></tr>
     </table>
   */
  public SearchResponse startSearchableQuery(SearchRequest searchRequest) throws ApiException {
    return startSearchableQueryWithHttpInfo(searchRequest).getData();
  }

  /**
   * Submit a search request
   * 
   * @param searchRequest SearchRequest (required)
   * @return ApiResponse&lt;SearchResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 0 </td><td> default response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SearchResponse> startSearchableQueryWithHttpInfo(SearchRequest searchRequest) throws ApiException {
    Object localVarPostBody = searchRequest;
    
    // verify the required parameter 'searchRequest' is set
    if (searchRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'searchRequest' when calling startSearchableQuery");
    }
    
    // create path and map variables
    String localVarPath = "/searchable/v2/search";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

    GenericType<SearchResponse> localVarReturnType = new GenericType<SearchResponse>() {};

    return apiClient.invokeAPI("SearchableApi.startSearchableQuery", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}

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
public class DataSourcesApi {
  private ApiClient apiClient;

  public DataSourcesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DataSourcesApi(ApiClient apiClient) {
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
   * Fetch data source fields
   * 
   * @param docRef dataSourceRef (required)
   * @return List&lt;AbstractField&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 0 </td><td> default response </td><td>  -  </td></tr>
     </table>
   */
  public List<AbstractField> fetchDataSourceFields(DocRef docRef) throws ApiException {
    return fetchDataSourceFieldsWithHttpInfo(docRef).getData();
  }

  /**
   * Fetch data source fields
   * 
   * @param docRef dataSourceRef (required)
   * @return ApiResponse&lt;List&lt;AbstractField&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 0 </td><td> default response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<AbstractField>> fetchDataSourceFieldsWithHttpInfo(DocRef docRef) throws ApiException {
    Object localVarPostBody = docRef;
    
    // verify the required parameter 'docRef' is set
    if (docRef == null) {
      throw new ApiException(400, "Missing the required parameter 'docRef' when calling fetchDataSourceFields");
    }
    
    // create path and map variables
    String localVarPath = "/dataSource/v1/fetchFields";

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

    GenericType<List<AbstractField>> localVarReturnType = new GenericType<List<AbstractField>>() {};

    return apiClient.invokeAPI("DataSourcesApi.fetchDataSourceFields", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}

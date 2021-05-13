# JobsApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listJobs**](JobsApi.md#listJobs) | **GET** /job/v1 | Lists jobs
[**setJobEnabled**](JobsApi.md#setJobEnabled) | **PUT** /job/v1/{id}/enabled | Sets the enabled status of the job

<a name="listJobs"></a>
# **listJobs**
> ResultPageJob listJobs()

Lists jobs

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

JobsApi apiInstance = new JobsApi();
try {
    ResultPageJob result = apiInstance.listJobs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#listJobs");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResultPageJob**](ResultPageJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setJobEnabled"></a>
# **setJobEnabled**
> setJobEnabled(body, id)

Sets the enabled status of the job

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

JobsApi apiInstance = new JobsApi();
Boolean body = true; // Boolean | enabled
Integer id = 56; // Integer | 
try {
    apiInstance.setJobEnabled(body, id);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#setJobEnabled");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Boolean**](Boolean.md)| enabled |
 **id** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


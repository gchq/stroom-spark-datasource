# JobsNodeApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchJobNodeInfo**](JobsNodeApi.md#fetchJobNodeInfo) | **GET** /jobNode/v1/info | Gets current info for a job node
[**listJobsNodes**](JobsNodeApi.md#listJobsNodes) | **GET** /jobNode/v1 | Lists job nodes
[**setJobNodeEnabled**](JobsNodeApi.md#setJobNodeEnabled) | **PUT** /jobNode/v1/{id}/enabled | Sets the enabled status of the job node
[**setJobNodeSchedule**](JobsNodeApi.md#setJobNodeSchedule) | **PUT** /jobNode/v1/{id}/schedule | Sets the schedule job node
[**setJobNodeTaskLimit**](JobsNodeApi.md#setJobNodeTaskLimit) | **PUT** /jobNode/v1/{id}/taskLimit | Sets the task limit for the job node

<a name="fetchJobNodeInfo"></a>
# **fetchJobNodeInfo**
> JobNodeInfo fetchJobNodeInfo(jobName, nodeName)

Gets current info for a job node

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobsNodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

JobsNodeApi apiInstance = new JobsNodeApi();
String jobName = "jobName_example"; // String | 
String nodeName = "nodeName_example"; // String | 
try {
    JobNodeInfo result = apiInstance.fetchJobNodeInfo(jobName, nodeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsNodeApi#fetchJobNodeInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobName** | **String**|  | [optional]
 **nodeName** | **String**|  | [optional]

### Return type

[**JobNodeInfo**](JobNodeInfo.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listJobsNodes"></a>
# **listJobsNodes**
> ResultPageJobNode listJobsNodes(jobName, nodeName)

Lists job nodes

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobsNodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

JobsNodeApi apiInstance = new JobsNodeApi();
String jobName = "jobName_example"; // String | 
String nodeName = "nodeName_example"; // String | 
try {
    ResultPageJobNode result = apiInstance.listJobsNodes(jobName, nodeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsNodeApi#listJobsNodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobName** | **String**|  | [optional]
 **nodeName** | **String**|  | [optional]

### Return type

[**ResultPageJobNode**](ResultPageJobNode.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setJobNodeEnabled"></a>
# **setJobNodeEnabled**
> setJobNodeEnabled(body, id)

Sets the enabled status of the job node

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobsNodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

JobsNodeApi apiInstance = new JobsNodeApi();
Boolean body = true; // Boolean | enabled
Integer id = 56; // Integer | 
try {
    apiInstance.setJobNodeEnabled(body, id);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsNodeApi#setJobNodeEnabled");
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

<a name="setJobNodeSchedule"></a>
# **setJobNodeSchedule**
> setJobNodeSchedule(body, id)

Sets the schedule job node

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobsNodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

JobsNodeApi apiInstance = new JobsNodeApi();
String body = "body_example"; // String | schedule
Integer id = 56; // Integer | 
try {
    apiInstance.setJobNodeSchedule(body, id);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsNodeApi#setJobNodeSchedule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)| schedule |
 **id** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setJobNodeTaskLimit"></a>
# **setJobNodeTaskLimit**
> setJobNodeTaskLimit(body, id)

Sets the task limit for the job node

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobsNodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

JobsNodeApi apiInstance = new JobsNodeApi();
Integer body = 56; // Integer | taskLimit
Integer id = 56; // Integer | 
try {
    apiInstance.setJobNodeTaskLimit(body, id);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsNodeApi#setJobNodeTaskLimit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Integer**](Integer.md)| taskLimit |
 **id** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


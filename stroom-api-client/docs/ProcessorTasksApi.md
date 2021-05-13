# ProcessorTasksApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**abandonProcessorTasks**](ProcessorTasksApi.md#abandonProcessorTasks) | **POST** /processorTask/v1/abandon/{nodeName} | Abandon some tasks
[**assignProcessorTasks**](ProcessorTasksApi.md#assignProcessorTasks) | **POST** /processorTask/v1/assign/{nodeName} | Assign some tasks
[**findProcessorTaskSummary**](ProcessorTasksApi.md#findProcessorTaskSummary) | **POST** /processorTask/v1/summary | Finds processor task summaries
[**findProcessorTasks**](ProcessorTasksApi.md#findProcessorTasks) | **POST** /processorTask/v1/find | Finds processors tasks

<a name="abandonProcessorTasks"></a>
# **abandonProcessorTasks**
> Boolean abandonProcessorTasks(body, nodeName)

Abandon some tasks

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessorTasksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ProcessorTasksApi apiInstance = new ProcessorTasksApi();
ProcessorTaskList body = new ProcessorTaskList(); // ProcessorTaskList | request
String nodeName = "nodeName_example"; // String | 
try {
    Boolean result = apiInstance.abandonProcessorTasks(body, nodeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorTasksApi#abandonProcessorTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProcessorTaskList**](ProcessorTaskList.md)| request |
 **nodeName** | **String**|  |

### Return type

**Boolean**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="assignProcessorTasks"></a>
# **assignProcessorTasks**
> ProcessorTaskList assignProcessorTasks(body, nodeName)

Assign some tasks

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessorTasksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ProcessorTasksApi apiInstance = new ProcessorTasksApi();
AssignTasksRequest body = new AssignTasksRequest(); // AssignTasksRequest | request
String nodeName = "nodeName_example"; // String | 
try {
    ProcessorTaskList result = apiInstance.assignProcessorTasks(body, nodeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorTasksApi#assignProcessorTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AssignTasksRequest**](AssignTasksRequest.md)| request |
 **nodeName** | **String**|  |

### Return type

[**ProcessorTaskList**](ProcessorTaskList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findProcessorTaskSummary"></a>
# **findProcessorTaskSummary**
> ResultPageProcessorTaskSummary findProcessorTaskSummary(body)

Finds processor task summaries

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessorTasksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ProcessorTasksApi apiInstance = new ProcessorTasksApi();
ExpressionCriteria body = new ExpressionCriteria(); // ExpressionCriteria | expressionCriteria
try {
    ResultPageProcessorTaskSummary result = apiInstance.findProcessorTaskSummary(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorTasksApi#findProcessorTaskSummary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ExpressionCriteria**](ExpressionCriteria.md)| expressionCriteria |

### Return type

[**ResultPageProcessorTaskSummary**](ResultPageProcessorTaskSummary.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findProcessorTasks"></a>
# **findProcessorTasks**
> ResultPageProcessorTask findProcessorTasks(body)

Finds processors tasks

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessorTasksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ProcessorTasksApi apiInstance = new ProcessorTasksApi();
ExpressionCriteria body = new ExpressionCriteria(); // ExpressionCriteria | expressionCriteria
try {
    ResultPageProcessorTask result = apiInstance.findProcessorTasks(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorTasksApi#findProcessorTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ExpressionCriteria**](ExpressionCriteria.md)| expressionCriteria |

### Return type

[**ResultPageProcessorTask**](ResultPageProcessorTask.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


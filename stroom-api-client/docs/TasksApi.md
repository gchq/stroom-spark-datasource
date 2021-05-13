# TasksApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findTasks**](TasksApi.md#findTasks) | **POST** /task/v1/find/{nodeName} | Finds tasks for a node
[**listTasks**](TasksApi.md#listTasks) | **GET** /task/v1/list/{nodeName} | Lists tasks for a node
[**listUserTasks**](TasksApi.md#listUserTasks) | **GET** /task/v1/user/{nodeName} | Lists tasks for a node
[**terminateTasks**](TasksApi.md#terminateTasks) | **POST** /task/v1/terminate/{nodeName} | Terminates tasks for a node

<a name="findTasks"></a>
# **findTasks**
> TaskProgressResponse findTasks(body, nodeName)

Finds tasks for a node

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TasksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

TasksApi apiInstance = new TasksApi();
FindTaskProgressRequest body = new FindTaskProgressRequest(); // FindTaskProgressRequest | request
String nodeName = "nodeName_example"; // String | 
try {
    TaskProgressResponse result = apiInstance.findTasks(body, nodeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#findTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FindTaskProgressRequest**](FindTaskProgressRequest.md)| request |
 **nodeName** | **String**|  |

### Return type

[**TaskProgressResponse**](TaskProgressResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listTasks"></a>
# **listTasks**
> TaskProgressResponse listTasks(nodeName)

Lists tasks for a node

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TasksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

TasksApi apiInstance = new TasksApi();
String nodeName = "nodeName_example"; // String | 
try {
    TaskProgressResponse result = apiInstance.listTasks(nodeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#listTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeName** | **String**|  |

### Return type

[**TaskProgressResponse**](TaskProgressResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listUserTasks"></a>
# **listUserTasks**
> TaskProgressResponse listUserTasks(nodeName)

Lists tasks for a node

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TasksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

TasksApi apiInstance = new TasksApi();
String nodeName = "nodeName_example"; // String | 
try {
    TaskProgressResponse result = apiInstance.listUserTasks(nodeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#listUserTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeName** | **String**|  |

### Return type

[**TaskProgressResponse**](TaskProgressResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="terminateTasks"></a>
# **terminateTasks**
> Boolean terminateTasks(body, nodeName)

Terminates tasks for a node

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TasksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

TasksApi apiInstance = new TasksApi();
TerminateTaskProgressRequest body = new TerminateTaskProgressRequest(); // TerminateTaskProgressRequest | request
String nodeName = "nodeName_example"; // String | 
try {
    Boolean result = apiInstance.terminateTasks(body, nodeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#terminateTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TerminateTaskProgressRequest**](TerminateTaskProgressRequest.md)| request |
 **nodeName** | **String**|  |

### Return type

**Boolean**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# ClusterLockApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**keepClusterLockAlive**](ClusterLockApi.md#keepClusterLockAlive) | **PUT** /cluster/lock/v1/keepALive/{nodeName} | Keep a lock alive
[**releaseClusterLock**](ClusterLockApi.md#releaseClusterLock) | **PUT** /cluster/lock/v1/release/{nodeName} | Release a lock
[**tryClusterLock**](ClusterLockApi.md#tryClusterLock) | **PUT** /cluster/lock/v1/try/{nodeName} | Try to lock

<a name="keepClusterLockAlive"></a>
# **keepClusterLockAlive**
> Boolean keepClusterLockAlive(body, nodeName)

Keep a lock alive

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterLockApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ClusterLockApi apiInstance = new ClusterLockApi();
ClusterLockKey body = new ClusterLockKey(); // ClusterLockKey | key
String nodeName = "nodeName_example"; // String | 
try {
    Boolean result = apiInstance.keepClusterLockAlive(body, nodeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterLockApi#keepClusterLockAlive");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClusterLockKey**](ClusterLockKey.md)| key |
 **nodeName** | **String**|  |

### Return type

**Boolean**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="releaseClusterLock"></a>
# **releaseClusterLock**
> Boolean releaseClusterLock(body, nodeName)

Release a lock

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterLockApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ClusterLockApi apiInstance = new ClusterLockApi();
ClusterLockKey body = new ClusterLockKey(); // ClusterLockKey | key
String nodeName = "nodeName_example"; // String | 
try {
    Boolean result = apiInstance.releaseClusterLock(body, nodeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterLockApi#releaseClusterLock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClusterLockKey**](ClusterLockKey.md)| key |
 **nodeName** | **String**|  |

### Return type

**Boolean**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="tryClusterLock"></a>
# **tryClusterLock**
> Boolean tryClusterLock(body, nodeName)

Try to lock

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterLockApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ClusterLockApi apiInstance = new ClusterLockApi();
ClusterLockKey body = new ClusterLockKey(); // ClusterLockKey | key
String nodeName = "nodeName_example"; // String | 
try {
    Boolean result = apiInstance.tryClusterLock(body, nodeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterLockApi#tryClusterLock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClusterLockKey**](ClusterLockKey.md)| key |
 **nodeName** | **String**|  |

### Return type

**Boolean**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


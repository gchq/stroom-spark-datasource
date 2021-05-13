# CachesApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clearCache**](CachesApi.md#clearCache) | **DELETE** /cache/v1 | Clears a cache
[**getCacheInfo**](CachesApi.md#getCacheInfo) | **GET** /cache/v1/info | Gets cache info
[**listCaches**](CachesApi.md#listCaches) | **GET** /cache/v1 | Lists caches

<a name="clearCache"></a>
# **clearCache**
> Long clearCache(cacheName, nodeName)

Clears a cache

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CachesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

CachesApi apiInstance = new CachesApi();
String cacheName = "cacheName_example"; // String | 
String nodeName = "nodeName_example"; // String | 
try {
    Long result = apiInstance.clearCache(cacheName, nodeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CachesApi#clearCache");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cacheName** | **String**|  | [optional]
 **nodeName** | **String**|  | [optional]

### Return type

**Long**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCacheInfo"></a>
# **getCacheInfo**
> CacheInfoResponse getCacheInfo(cacheName, nodeName)

Gets cache info

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CachesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

CachesApi apiInstance = new CachesApi();
String cacheName = "cacheName_example"; // String | 
String nodeName = "nodeName_example"; // String | 
try {
    CacheInfoResponse result = apiInstance.getCacheInfo(cacheName, nodeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CachesApi#getCacheInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cacheName** | **String**|  | [optional]
 **nodeName** | **String**|  | [optional]

### Return type

[**CacheInfoResponse**](CacheInfoResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCaches"></a>
# **listCaches**
> List&lt;String&gt; listCaches()

Lists caches

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CachesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

CachesApi apiInstance = new CachesApi();
try {
    List<String> result = apiInstance.listCaches();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CachesApi#listCaches");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


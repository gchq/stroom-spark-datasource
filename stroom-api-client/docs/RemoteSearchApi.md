# RemoteSearchApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**destroyRemoteSearch**](RemoteSearchApi.md#destroyRemoteSearch) | **GET** /remoteSearch/v1/destroy | Destroy search results
[**pollRemoteSearch**](RemoteSearchApi.md#pollRemoteSearch) | **GET** /remoteSearch/v1/poll | Poll the server for search results for the supplied queryKey
[**startRemoteSearch**](RemoteSearchApi.md#startRemoteSearch) | **POST** /remoteSearch/v1/start | Start a search

<a name="destroyRemoteSearch"></a>
# **destroyRemoteSearch**
> Boolean destroyRemoteSearch(queryKey)

Destroy search results

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RemoteSearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

RemoteSearchApi apiInstance = new RemoteSearchApi();
String queryKey = "queryKey_example"; // String | 
try {
    Boolean result = apiInstance.destroyRemoteSearch(queryKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RemoteSearchApi#destroyRemoteSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queryKey** | **String**|  | [optional]

### Return type

**Boolean**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pollRemoteSearch"></a>
# **pollRemoteSearch**
> pollRemoteSearch(queryKey)

Poll the server for search results for the supplied queryKey

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RemoteSearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

RemoteSearchApi apiInstance = new RemoteSearchApi();
String queryKey = "queryKey_example"; // String | 
try {
    apiInstance.pollRemoteSearch(queryKey);
} catch (ApiException e) {
    System.err.println("Exception when calling RemoteSearchApi#pollRemoteSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queryKey** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="startRemoteSearch"></a>
# **startRemoteSearch**
> Boolean startRemoteSearch(body)

Start a search

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RemoteSearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

RemoteSearchApi apiInstance = new RemoteSearchApi();
ClusterSearchTask body = new ClusterSearchTask(); // ClusterSearchTask | 
try {
    Boolean result = apiInstance.startRemoteSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RemoteSearchApi#startRemoteSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClusterSearchTask**](ClusterSearchTask.md)|  | [optional]

### Return type

**Boolean**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


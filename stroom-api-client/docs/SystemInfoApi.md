# SystemInfoApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllSystemInfo**](SystemInfoApi.md#getAllSystemInfo) | **GET** /systemInfo/v1 | Get all system info results
[**getSystemInfoByName**](SystemInfoApi.md#getSystemInfoByName) | **GET** /systemInfo/v1/{name} | Get a system info result by name
[**getSystemInfoNames**](SystemInfoApi.md#getSystemInfoNames) | **GET** /systemInfo/v1/names | Get all system info result names

<a name="getAllSystemInfo"></a>
# **getAllSystemInfo**
> SystemInfoResultList getAllSystemInfo()

Get all system info results

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SystemInfoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SystemInfoApi apiInstance = new SystemInfoApi();
try {
    SystemInfoResultList result = apiInstance.getAllSystemInfo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemInfoApi#getAllSystemInfo");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SystemInfoResultList**](SystemInfoResultList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSystemInfoByName"></a>
# **getSystemInfoByName**
> SystemInfoResult getSystemInfoByName(name)

Get a system info result by name

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SystemInfoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SystemInfoApi apiInstance = new SystemInfoApi();
String name = "name_example"; // String | 
try {
    SystemInfoResult result = apiInstance.getSystemInfoByName(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemInfoApi#getSystemInfoByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |

### Return type

[**SystemInfoResult**](SystemInfoResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSystemInfoNames"></a>
# **getSystemInfoNames**
> List&lt;String&gt; getSystemInfoNames()

Get all system info result names

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SystemInfoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SystemInfoApi apiInstance = new SystemInfoApi();
try {
    List<String> result = apiInstance.getSystemInfoNames();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemInfoApi#getSystemInfoNames");
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


# IndexVolumesApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIndexVolume**](IndexVolumesApi.md#createIndexVolume) | **POST** /index/volume/v2 | Creates an index volume
[**deleteIndexVolume**](IndexVolumesApi.md#deleteIndexVolume) | **DELETE** /index/volume/v2/{id} | Deletes an index volume
[**fetchIndexVolume**](IndexVolumesApi.md#fetchIndexVolume) | **GET** /index/volume/v2/{id} | Fetch an index volume
[**findIndexVolumes**](IndexVolumesApi.md#findIndexVolumes) | **POST** /index/volume/v2/find | Finds index volumes matching request
[**rescanIndexVolumes**](IndexVolumesApi.md#rescanIndexVolumes) | **DELETE** /index/volume/v2/rescan | Rescans index volumes
[**updateIndexVolume**](IndexVolumesApi.md#updateIndexVolume) | **PUT** /index/volume/v2/{id} | Updates an index volume

<a name="createIndexVolume"></a>
# **createIndexVolume**
> IndexVolume createIndexVolume(body)

Creates an index volume

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IndexVolumesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

IndexVolumesApi apiInstance = new IndexVolumesApi();
IndexVolume body = new IndexVolume(); // IndexVolume | request
try {
    IndexVolume result = apiInstance.createIndexVolume(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndexVolumesApi#createIndexVolume");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IndexVolume**](IndexVolume.md)| request |

### Return type

[**IndexVolume**](IndexVolume.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteIndexVolume"></a>
# **deleteIndexVolume**
> Boolean deleteIndexVolume(id)

Deletes an index volume

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IndexVolumesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

IndexVolumesApi apiInstance = new IndexVolumesApi();
Integer id = 56; // Integer | 
try {
    Boolean result = apiInstance.deleteIndexVolume(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndexVolumesApi#deleteIndexVolume");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

**Boolean**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchIndexVolume"></a>
# **fetchIndexVolume**
> IndexVolume fetchIndexVolume(id)

Fetch an index volume

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IndexVolumesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

IndexVolumesApi apiInstance = new IndexVolumesApi();
Integer id = 56; // Integer | 
try {
    IndexVolume result = apiInstance.fetchIndexVolume(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndexVolumesApi#fetchIndexVolume");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**IndexVolume**](IndexVolume.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findIndexVolumes"></a>
# **findIndexVolumes**
> ResultPageIndexVolume findIndexVolumes(body)

Finds index volumes matching request

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IndexVolumesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

IndexVolumesApi apiInstance = new IndexVolumesApi();
ExpressionCriteria body = new ExpressionCriteria(); // ExpressionCriteria | request
try {
    ResultPageIndexVolume result = apiInstance.findIndexVolumes(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndexVolumesApi#findIndexVolumes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ExpressionCriteria**](ExpressionCriteria.md)| request |

### Return type

[**ResultPageIndexVolume**](ResultPageIndexVolume.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rescanIndexVolumes"></a>
# **rescanIndexVolumes**
> Boolean rescanIndexVolumes(nodeName)

Rescans index volumes

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IndexVolumesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

IndexVolumesApi apiInstance = new IndexVolumesApi();
String nodeName = "nodeName_example"; // String | 
try {
    Boolean result = apiInstance.rescanIndexVolumes(nodeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndexVolumesApi#rescanIndexVolumes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeName** | **String**|  | [optional]

### Return type

**Boolean**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateIndexVolume"></a>
# **updateIndexVolume**
> IndexVolume updateIndexVolume(body, id)

Updates an index volume

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IndexVolumesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

IndexVolumesApi apiInstance = new IndexVolumesApi();
IndexVolume body = new IndexVolume(); // IndexVolume | indexVolume
Integer id = 56; // Integer | 
try {
    IndexVolume result = apiInstance.updateIndexVolume(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndexVolumesApi#updateIndexVolume");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IndexVolume**](IndexVolume.md)| indexVolume |
 **id** | **Integer**|  |

### Return type

[**IndexVolume**](IndexVolume.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


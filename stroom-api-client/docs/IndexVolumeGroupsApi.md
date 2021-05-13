# IndexVolumeGroupsApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIndexVolumeGroup**](IndexVolumeGroupsApi.md#createIndexVolumeGroup) | **POST** /index/volumeGroup/v2 | Creates an index volume group
[**deleteIndexVolumeGroup**](IndexVolumeGroupsApi.md#deleteIndexVolumeGroup) | **DELETE** /index/volumeGroup/v2/{id} | Deletes an index volume group
[**fetchIndexVolumeGroup**](IndexVolumeGroupsApi.md#fetchIndexVolumeGroup) | **GET** /index/volumeGroup/v2/{id} | Gets an index volume group
[**findIndexVolumeGroups**](IndexVolumeGroupsApi.md#findIndexVolumeGroups) | **POST** /index/volumeGroup/v2/find | Finds index volume groups matching request
[**updateIndexVolumeGroup**](IndexVolumeGroupsApi.md#updateIndexVolumeGroup) | **PUT** /index/volumeGroup/v2/{id} | Updates an index volume group

<a name="createIndexVolumeGroup"></a>
# **createIndexVolumeGroup**
> IndexVolumeGroup createIndexVolumeGroup(body)

Creates an index volume group

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IndexVolumeGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

IndexVolumeGroupsApi apiInstance = new IndexVolumeGroupsApi();
String body = "body_example"; // String | name
try {
    IndexVolumeGroup result = apiInstance.createIndexVolumeGroup(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndexVolumeGroupsApi#createIndexVolumeGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)| name |

### Return type

[**IndexVolumeGroup**](IndexVolumeGroup.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteIndexVolumeGroup"></a>
# **deleteIndexVolumeGroup**
> Boolean deleteIndexVolumeGroup(id)

Deletes an index volume group

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IndexVolumeGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

IndexVolumeGroupsApi apiInstance = new IndexVolumeGroupsApi();
Integer id = 56; // Integer | 
try {
    Boolean result = apiInstance.deleteIndexVolumeGroup(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndexVolumeGroupsApi#deleteIndexVolumeGroup");
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

<a name="fetchIndexVolumeGroup"></a>
# **fetchIndexVolumeGroup**
> IndexVolumeGroup fetchIndexVolumeGroup(id)

Gets an index volume group

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IndexVolumeGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

IndexVolumeGroupsApi apiInstance = new IndexVolumeGroupsApi();
Integer id = 56; // Integer | 
try {
    IndexVolumeGroup result = apiInstance.fetchIndexVolumeGroup(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndexVolumeGroupsApi#fetchIndexVolumeGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**IndexVolumeGroup**](IndexVolumeGroup.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findIndexVolumeGroups"></a>
# **findIndexVolumeGroups**
> ResultPageIndexVolumeGroup findIndexVolumeGroups(body)

Finds index volume groups matching request

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IndexVolumeGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

IndexVolumeGroupsApi apiInstance = new IndexVolumeGroupsApi();
ExpressionCriteria body = new ExpressionCriteria(); // ExpressionCriteria | request
try {
    ResultPageIndexVolumeGroup result = apiInstance.findIndexVolumeGroups(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndexVolumeGroupsApi#findIndexVolumeGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ExpressionCriteria**](ExpressionCriteria.md)| request |

### Return type

[**ResultPageIndexVolumeGroup**](ResultPageIndexVolumeGroup.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateIndexVolumeGroup"></a>
# **updateIndexVolumeGroup**
> IndexVolumeGroup updateIndexVolumeGroup(id, body)

Updates an index volume group

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IndexVolumeGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

IndexVolumeGroupsApi apiInstance = new IndexVolumeGroupsApi();
Integer id = 56; // Integer | 
IndexVolumeGroup body = new IndexVolumeGroup(); // IndexVolumeGroup | 
try {
    IndexVolumeGroup result = apiInstance.updateIndexVolumeGroup(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndexVolumeGroupsApi#updateIndexVolumeGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
 **body** | [**IndexVolumeGroup**](IndexVolumeGroup.md)|  | [optional]

### Return type

[**IndexVolumeGroup**](IndexVolumeGroup.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


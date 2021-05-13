# StroomStatsStoresApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchStroomStatsStore**](StroomStatsStoresApi.md#fetchStroomStatsStore) | **GET** /statsStore/v1/{uuid} | Fetch a store doc doc by its UUID
[**updateStroomStatsStore**](StroomStatsStoresApi.md#updateStroomStatsStore) | **PUT** /statsStore/v1/{uuid} | Update a stats store doc

<a name="fetchStroomStatsStore"></a>
# **fetchStroomStatsStore**
> StroomStatsStoreDoc fetchStroomStatsStore(uuid)

Fetch a store doc doc by its UUID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StroomStatsStoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

StroomStatsStoresApi apiInstance = new StroomStatsStoresApi();
String uuid = "uuid_example"; // String | 
try {
    StroomStatsStoreDoc result = apiInstance.fetchStroomStatsStore(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StroomStatsStoresApi#fetchStroomStatsStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**|  |

### Return type

[**StroomStatsStoreDoc**](StroomStatsStoreDoc.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateStroomStatsStore"></a>
# **updateStroomStatsStore**
> StroomStatsStoreDoc updateStroomStatsStore(body, uuid)

Update a stats store doc

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StroomStatsStoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

StroomStatsStoresApi apiInstance = new StroomStatsStoresApi();
StroomStatsStoreDoc body = new StroomStatsStoreDoc(); // StroomStatsStoreDoc | doc
String uuid = "uuid_example"; // String | 
try {
    StroomStatsStoreDoc result = apiInstance.updateStroomStatsStore(body, uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StroomStatsStoresApi#updateStroomStatsStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StroomStatsStoreDoc**](StroomStatsStoreDoc.md)| doc |
 **uuid** | **String**|  |

### Return type

[**StroomStatsStoreDoc**](StroomStatsStoreDoc.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


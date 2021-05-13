# SqlStatisticsStoresApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchStatisticStore**](SqlStatisticsStoresApi.md#fetchStatisticStore) | **GET** /statistic/v1/{uuid} | Fetch a statistic doc by its UUID
[**updateStatisticStore**](SqlStatisticsStoresApi.md#updateStatisticStore) | **PUT** /statistic/v1/{uuid} | Update a statistic doc

<a name="fetchStatisticStore"></a>
# **fetchStatisticStore**
> StatisticStoreDoc fetchStatisticStore(uuid)

Fetch a statistic doc by its UUID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SqlStatisticsStoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SqlStatisticsStoresApi apiInstance = new SqlStatisticsStoresApi();
String uuid = "uuid_example"; // String | 
try {
    StatisticStoreDoc result = apiInstance.fetchStatisticStore(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SqlStatisticsStoresApi#fetchStatisticStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**|  |

### Return type

[**StatisticStoreDoc**](StatisticStoreDoc.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateStatisticStore"></a>
# **updateStatisticStore**
> StatisticStoreDoc updateStatisticStore(body, uuid)

Update a statistic doc

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SqlStatisticsStoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SqlStatisticsStoresApi apiInstance = new SqlStatisticsStoresApi();
StatisticStoreDoc body = new StatisticStoreDoc(); // StatisticStoreDoc | doc
String uuid = "uuid_example"; // String | 
try {
    StatisticStoreDoc result = apiInstance.updateStatisticStore(body, uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SqlStatisticsStoresApi#updateStatisticStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StatisticStoreDoc**](StatisticStoreDoc.md)| doc |
 **uuid** | **String**|  |

### Return type

[**StatisticStoreDoc**](StatisticStoreDoc.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


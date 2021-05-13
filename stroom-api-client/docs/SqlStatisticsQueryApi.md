# SqlStatisticsQueryApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**destroySqlStatisticsSearch**](SqlStatisticsQueryApi.md#destroySqlStatisticsSearch) | **POST** /sqlstatistics/v2/destroy | Destroy a running query
[**getSqlStatisticsDataSource**](SqlStatisticsQueryApi.md#getSqlStatisticsDataSource) | **POST** /sqlstatistics/v2/dataSource | Submit a request for a data source definition, supplying the DocRef for the data source
[**searchSqlStatistics**](SqlStatisticsQueryApi.md#searchSqlStatistics) | **POST** /sqlstatistics/v2/search | Submit a search request

<a name="destroySqlStatisticsSearch"></a>
# **destroySqlStatisticsSearch**
> Boolean destroySqlStatisticsSearch(body)

Destroy a running query

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SqlStatisticsQueryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SqlStatisticsQueryApi apiInstance = new SqlStatisticsQueryApi();
QueryKey body = new QueryKey(); // QueryKey | QueryKey
try {
    Boolean result = apiInstance.destroySqlStatisticsSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SqlStatisticsQueryApi#destroySqlStatisticsSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**QueryKey**](QueryKey.md)| QueryKey |

### Return type

**Boolean**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSqlStatisticsDataSource"></a>
# **getSqlStatisticsDataSource**
> DataSource getSqlStatisticsDataSource(body)

Submit a request for a data source definition, supplying the DocRef for the data source

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SqlStatisticsQueryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SqlStatisticsQueryApi apiInstance = new SqlStatisticsQueryApi();
DocRef body = new DocRef(); // DocRef | DocRef
try {
    DataSource result = apiInstance.getSqlStatisticsDataSource(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SqlStatisticsQueryApi#getSqlStatisticsDataSource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DocRef**](DocRef.md)| DocRef |

### Return type

[**DataSource**](DataSource.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchSqlStatistics"></a>
# **searchSqlStatistics**
> SearchResponse searchSqlStatistics(body)

Submit a search request

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SqlStatisticsQueryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SqlStatisticsQueryApi apiInstance = new SqlStatisticsQueryApi();
SearchRequest body = new SearchRequest(); // SearchRequest | SearchRequest
try {
    SearchResponse result = apiInstance.searchSqlStatistics(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SqlStatisticsQueryApi#searchSqlStatistics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SearchRequest**](SearchRequest.md)| SearchRequest |

### Return type

[**SearchResponse**](SearchResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


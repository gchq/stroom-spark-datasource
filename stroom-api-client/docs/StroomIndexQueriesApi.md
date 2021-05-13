# StroomIndexQueriesApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**destroyStroomIndex**](StroomIndexQueriesApi.md#destroyStroomIndex) | **POST** /stroom-index/v2/destroy | Destroy a running query
[**getStroomIndexDataSource**](StroomIndexQueriesApi.md#getStroomIndexDataSource) | **POST** /stroom-index/v2/dataSource | Submit a request for a data source definition, supplying the DocRef for the data source
[**searchStroomIndex**](StroomIndexQueriesApi.md#searchStroomIndex) | **POST** /stroom-index/v2/search | Submit a search request

<a name="destroyStroomIndex"></a>
# **destroyStroomIndex**
> Boolean destroyStroomIndex(body)

Destroy a running query

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StroomIndexQueriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

StroomIndexQueriesApi apiInstance = new StroomIndexQueriesApi();
QueryKey body = new QueryKey(); // QueryKey | QueryKey
try {
    Boolean result = apiInstance.destroyStroomIndex(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StroomIndexQueriesApi#destroyStroomIndex");
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

<a name="getStroomIndexDataSource"></a>
# **getStroomIndexDataSource**
> DataSource getStroomIndexDataSource(body)

Submit a request for a data source definition, supplying the DocRef for the data source

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StroomIndexQueriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

StroomIndexQueriesApi apiInstance = new StroomIndexQueriesApi();
DocRef body = new DocRef(); // DocRef | DocRef
try {
    DataSource result = apiInstance.getStroomIndexDataSource(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StroomIndexQueriesApi#getStroomIndexDataSource");
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

<a name="searchStroomIndex"></a>
# **searchStroomIndex**
> SearchResponse searchStroomIndex(body)

Submit a search request

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StroomIndexQueriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

StroomIndexQueriesApi apiInstance = new StroomIndexQueriesApi();
SearchRequest body = new SearchRequest(); // SearchRequest | SearchRequest
try {
    SearchResponse result = apiInstance.searchStroomIndex(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StroomIndexQueriesApi#searchStroomIndex");
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


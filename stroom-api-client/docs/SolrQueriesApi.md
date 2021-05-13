# SolrQueriesApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**destroySolrIndexSearch**](SolrQueriesApi.md#destroySolrIndexSearch) | **POST** /stroom-solr-index/v2/destroy | Destroy a running query
[**getSolrIndexDataSource**](SolrQueriesApi.md#getSolrIndexDataSource) | **POST** /stroom-solr-index/v2/dataSource | Submit a request for a data source definition, supplying the DocRef for the data source
[**searchSolrIndex**](SolrQueriesApi.md#searchSolrIndex) | **POST** /stroom-solr-index/v2/search | Submit a search request

<a name="destroySolrIndexSearch"></a>
# **destroySolrIndexSearch**
> Boolean destroySolrIndexSearch(body)

Destroy a running query

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SolrQueriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SolrQueriesApi apiInstance = new SolrQueriesApi();
QueryKey body = new QueryKey(); // QueryKey | QueryKey
try {
    Boolean result = apiInstance.destroySolrIndexSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SolrQueriesApi#destroySolrIndexSearch");
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

<a name="getSolrIndexDataSource"></a>
# **getSolrIndexDataSource**
> DataSource getSolrIndexDataSource(body)

Submit a request for a data source definition, supplying the DocRef for the data source

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SolrQueriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SolrQueriesApi apiInstance = new SolrQueriesApi();
DocRef body = new DocRef(); // DocRef | DocRef
try {
    DataSource result = apiInstance.getSolrIndexDataSource(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SolrQueriesApi#getSolrIndexDataSource");
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

<a name="searchSolrIndex"></a>
# **searchSolrIndex**
> SearchResponse searchSolrIndex(body)

Submit a search request

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SolrQueriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SolrQueriesApi apiInstance = new SolrQueriesApi();
SearchRequest body = new SearchRequest(); // SearchRequest | SearchRequest
try {
    SearchResponse result = apiInstance.searchSolrIndex(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SolrQueriesApi#searchSolrIndex");
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


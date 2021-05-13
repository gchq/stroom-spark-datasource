# SearchableApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**destroySearchableQuery**](SearchableApi.md#destroySearchableQuery) | **POST** /searchable/v2/destroy | Destroy a running query
[**getSearchableDataSource**](SearchableApi.md#getSearchableDataSource) | **POST** /searchable/v2/dataSource | Submit a request for a data source definition, supplying the DocRef for the data source
[**startSearchableQuery**](SearchableApi.md#startSearchableQuery) | **POST** /searchable/v2/search | Submit a search request

<a name="destroySearchableQuery"></a>
# **destroySearchableQuery**
> Boolean destroySearchableQuery(body)

Destroy a running query

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SearchableApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SearchableApi apiInstance = new SearchableApi();
QueryKey body = new QueryKey(); // QueryKey | QueryKey
try {
    Boolean result = apiInstance.destroySearchableQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchableApi#destroySearchableQuery");
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

<a name="getSearchableDataSource"></a>
# **getSearchableDataSource**
> DataSource getSearchableDataSource(body)

Submit a request for a data source definition, supplying the DocRef for the data source

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SearchableApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SearchableApi apiInstance = new SearchableApi();
DocRef body = new DocRef(); // DocRef | DocRef
try {
    DataSource result = apiInstance.getSearchableDataSource(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchableApi#getSearchableDataSource");
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

<a name="startSearchableQuery"></a>
# **startSearchableQuery**
> SearchResponse startSearchableQuery(body)

Submit a search request

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SearchableApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SearchableApi apiInstance = new SearchableApi();
SearchRequest body = new SearchRequest(); // SearchRequest | SearchRequest
try {
    SearchResponse result = apiInstance.startSearchableQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchableApi#startSearchableQuery");
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


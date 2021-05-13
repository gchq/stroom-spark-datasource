# StoredQueriesApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createStoredQuery**](StoredQueriesApi.md#createStoredQuery) | **POST** /storedQuery/v1/create | Create a stored query
[**deleteStoredQuery**](StoredQueriesApi.md#deleteStoredQuery) | **DELETE** /storedQuery/v1/delete | Delete a stored query
[**fetchStoredQuery**](StoredQueriesApi.md#fetchStoredQuery) | **POST** /storedQuery/v1/read | Fetch a stored query
[**findStoredQueries**](StoredQueriesApi.md#findStoredQueries) | **POST** /storedQuery/v1/find | Find stored queries
[**updateStoredQuery**](StoredQueriesApi.md#updateStoredQuery) | **PUT** /storedQuery/v1/update | Update a stored query

<a name="createStoredQuery"></a>
# **createStoredQuery**
> StoredQuery createStoredQuery(body)

Create a stored query

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StoredQueriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

StoredQueriesApi apiInstance = new StoredQueriesApi();
StoredQuery body = new StoredQuery(); // StoredQuery | storedQuery
try {
    StoredQuery result = apiInstance.createStoredQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoredQueriesApi#createStoredQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StoredQuery**](StoredQuery.md)| storedQuery |

### Return type

[**StoredQuery**](StoredQuery.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteStoredQuery"></a>
# **deleteStoredQuery**
> Boolean deleteStoredQuery(body)

Delete a stored query

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StoredQueriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

StoredQueriesApi apiInstance = new StoredQueriesApi();
StoredQuery body = new StoredQuery(); // StoredQuery | 
try {
    Boolean result = apiInstance.deleteStoredQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoredQueriesApi#deleteStoredQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StoredQuery**](StoredQuery.md)|  | [optional]

### Return type

**Boolean**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchStoredQuery"></a>
# **fetchStoredQuery**
> StoredQuery fetchStoredQuery(body)

Fetch a stored query

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StoredQueriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

StoredQueriesApi apiInstance = new StoredQueriesApi();
StoredQuery body = new StoredQuery(); // StoredQuery | storedQuery
try {
    StoredQuery result = apiInstance.fetchStoredQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoredQueriesApi#fetchStoredQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StoredQuery**](StoredQuery.md)| storedQuery |

### Return type

[**StoredQuery**](StoredQuery.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findStoredQueries"></a>
# **findStoredQueries**
> ResultPageStoredQuery findStoredQueries(body)

Find stored queries

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StoredQueriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

StoredQueriesApi apiInstance = new StoredQueriesApi();
FindStoredQueryCriteria body = new FindStoredQueryCriteria(); // FindStoredQueryCriteria | criteria
try {
    ResultPageStoredQuery result = apiInstance.findStoredQueries(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoredQueriesApi#findStoredQueries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FindStoredQueryCriteria**](FindStoredQueryCriteria.md)| criteria |

### Return type

[**ResultPageStoredQuery**](ResultPageStoredQuery.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateStoredQuery"></a>
# **updateStoredQuery**
> StoredQuery updateStoredQuery(body)

Update a stored query

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StoredQueriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

StoredQueriesApi apiInstance = new StoredQueriesApi();
StoredQuery body = new StoredQuery(); // StoredQuery | 
try {
    StoredQuery result = apiInstance.updateStoredQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoredQueriesApi#updateStoredQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StoredQuery**](StoredQuery.md)|  | [optional]

### Return type

[**StoredQuery**](StoredQuery.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


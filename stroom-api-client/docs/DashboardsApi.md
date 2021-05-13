# DashboardsApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downloadDashboardQuery**](DashboardsApi.md#downloadDashboardQuery) | **POST** /dashboard/v1/downloadQuery | Download a query
[**downloadDashboardSearchResults**](DashboardsApi.md#downloadDashboardSearchResults) | **POST** /dashboard/v1/downloadSearchResults | Download search results
[**fetchDashboard**](DashboardsApi.md#fetchDashboard) | **GET** /dashboard/v1/{uuid} | Fetch a dashboard doc by its UUID
[**fetchDashboardFunctions**](DashboardsApi.md#fetchDashboardFunctions) | **GET** /dashboard/v1/functions | Fetch all expression functions
[**fetchTimeZones**](DashboardsApi.md#fetchTimeZones) | **GET** /dashboard/v1/fetchTimeZones | Fetch time zone data from the server
[**pollDashboardSearchResults**](DashboardsApi.md#pollDashboardSearchResults) | **POST** /dashboard/v1/poll | Poll for new search results
[**updateDashboard**](DashboardsApi.md#updateDashboard) | **PUT** /dashboard/v1/{uuid} | Update a dashboard doc
[**validateDashboardExpression**](DashboardsApi.md#validateDashboardExpression) | **POST** /dashboard/v1/validateExpression | Validate an expression

<a name="downloadDashboardQuery"></a>
# **downloadDashboardQuery**
> ResourceGeneration downloadDashboardQuery(body)

Download a query

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DashboardsApi apiInstance = new DashboardsApi();
DownloadQueryRequest body = new DownloadQueryRequest(); // DownloadQueryRequest | downloadQueryRequest
try {
    ResourceGeneration result = apiInstance.downloadDashboardQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#downloadDashboardQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DownloadQueryRequest**](DownloadQueryRequest.md)| downloadQueryRequest |

### Return type

[**ResourceGeneration**](ResourceGeneration.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="downloadDashboardSearchResults"></a>
# **downloadDashboardSearchResults**
> ResourceGeneration downloadDashboardSearchResults(body)

Download search results

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DashboardsApi apiInstance = new DashboardsApi();
DownloadSearchResultsRequest body = new DownloadSearchResultsRequest(); // DownloadSearchResultsRequest | request
try {
    ResourceGeneration result = apiInstance.downloadDashboardSearchResults(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#downloadDashboardSearchResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DownloadSearchResultsRequest**](DownloadSearchResultsRequest.md)| request |

### Return type

[**ResourceGeneration**](ResourceGeneration.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchDashboard"></a>
# **fetchDashboard**
> DashboardDoc fetchDashboard(uuid)

Fetch a dashboard doc by its UUID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DashboardsApi apiInstance = new DashboardsApi();
String uuid = "uuid_example"; // String | 
try {
    DashboardDoc result = apiInstance.fetchDashboard(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#fetchDashboard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**|  |

### Return type

[**DashboardDoc**](DashboardDoc.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchDashboardFunctions"></a>
# **fetchDashboardFunctions**
> List&lt;FunctionSignature&gt; fetchDashboardFunctions()

Fetch all expression functions

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DashboardsApi apiInstance = new DashboardsApi();
try {
    List<FunctionSignature> result = apiInstance.fetchDashboardFunctions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#fetchDashboardFunctions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;FunctionSignature&gt;**](FunctionSignature.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchTimeZones"></a>
# **fetchTimeZones**
> List&lt;String&gt; fetchTimeZones()

Fetch time zone data from the server

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DashboardsApi apiInstance = new DashboardsApi();
try {
    List<String> result = apiInstance.fetchTimeZones();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#fetchTimeZones");
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

<a name="pollDashboardSearchResults"></a>
# **pollDashboardSearchResults**
> List&lt;DashboardSearchResponse&gt; pollDashboardSearchResults(body)

Poll for new search results

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DashboardsApi apiInstance = new DashboardsApi();
SearchBusPollRequest body = new SearchBusPollRequest(); // SearchBusPollRequest | request
try {
    List<DashboardSearchResponse> result = apiInstance.pollDashboardSearchResults(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#pollDashboardSearchResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SearchBusPollRequest**](SearchBusPollRequest.md)| request |

### Return type

[**List&lt;DashboardSearchResponse&gt;**](DashboardSearchResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDashboard"></a>
# **updateDashboard**
> DashboardDoc updateDashboard(body, uuid)

Update a dashboard doc

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DashboardsApi apiInstance = new DashboardsApi();
DashboardDoc body = new DashboardDoc(); // DashboardDoc | doc
String uuid = "uuid_example"; // String | 
try {
    DashboardDoc result = apiInstance.updateDashboard(body, uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#updateDashboard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DashboardDoc**](DashboardDoc.md)| doc |
 **uuid** | **String**|  |

### Return type

[**DashboardDoc**](DashboardDoc.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="validateDashboardExpression"></a>
# **validateDashboardExpression**
> ValidateExpressionResult validateDashboardExpression(body)

Validate an expression

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DashboardsApi apiInstance = new DashboardsApi();
String body = "body_example"; // String | expression
try {
    ValidateExpressionResult result = apiInstance.validateDashboardExpression(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#validateDashboardExpression");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)| expression |

### Return type

[**ValidateExpressionResult**](ValidateExpressionResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


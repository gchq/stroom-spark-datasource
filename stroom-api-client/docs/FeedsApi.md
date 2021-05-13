# FeedsApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchFeed**](FeedsApi.md#fetchFeed) | **GET** /feed/v1/{uuid} | Fetch a feed doc by its UUID
[**fetchSupportedEncodings**](FeedsApi.md#fetchSupportedEncodings) | **GET** /feed/v1/fetchSupportedEncodings | Fetch supported encodings
[**updateFeed**](FeedsApi.md#updateFeed) | **PUT** /feed/v1/{uuid} | Update a feed doc

<a name="fetchFeed"></a>
# **fetchFeed**
> FeedDoc fetchFeed(uuid)

Fetch a feed doc by its UUID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FeedsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

FeedsApi apiInstance = new FeedsApi();
String uuid = "uuid_example"; // String | 
try {
    FeedDoc result = apiInstance.fetchFeed(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FeedsApi#fetchFeed");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**|  |

### Return type

[**FeedDoc**](FeedDoc.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchSupportedEncodings"></a>
# **fetchSupportedEncodings**
> List&lt;String&gt; fetchSupportedEncodings()

Fetch supported encodings

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FeedsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

FeedsApi apiInstance = new FeedsApi();
try {
    List<String> result = apiInstance.fetchSupportedEncodings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FeedsApi#fetchSupportedEncodings");
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

<a name="updateFeed"></a>
# **updateFeed**
> FeedDoc updateFeed(body, uuid)

Update a feed doc

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FeedsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

FeedsApi apiInstance = new FeedsApi();
FeedDoc body = new FeedDoc(); // FeedDoc | doc
String uuid = "uuid_example"; // String | 
try {
    FeedDoc result = apiInstance.updateFeed(body, uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FeedsApi#updateFeed");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FeedDoc**](FeedDoc.md)| doc |
 **uuid** | **String**|  |

### Return type

[**FeedDoc**](FeedDoc.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


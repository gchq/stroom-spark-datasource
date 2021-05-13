# FeedStatusApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFeedStatus**](FeedStatusApi.md#getFeedStatus) | **POST** /feedStatus/v1/getFeedStatus | Submit a request to get the status of a feed

<a name="getFeedStatus"></a>
# **getFeedStatus**
> GetFeedStatusResponse getFeedStatus(body)

Submit a request to get the status of a feed

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FeedStatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

FeedStatusApi apiInstance = new FeedStatusApi();
GetFeedStatusRequest body = new GetFeedStatusRequest(); // GetFeedStatusRequest | GetFeedStatusRequest
try {
    GetFeedStatusResponse result = apiInstance.getFeedStatus(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FeedStatusApi#getFeedStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GetFeedStatusRequest**](GetFeedStatusRequest.md)| GetFeedStatusRequest |

### Return type

[**GetFeedStatusResponse**](GetFeedStatusResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


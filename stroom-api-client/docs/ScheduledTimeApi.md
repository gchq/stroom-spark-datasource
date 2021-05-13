# ScheduledTimeApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getScheduledTimes**](ScheduledTimeApi.md#getScheduledTimes) | **POST** /scheduledTime/v1 | Gets scheduled time info

<a name="getScheduledTimes"></a>
# **getScheduledTimes**
> ScheduledTimes getScheduledTimes(body)

Gets scheduled time info

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ScheduledTimeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ScheduledTimeApi apiInstance = new ScheduledTimeApi();
GetScheduledTimesRequest body = new GetScheduledTimesRequest(); // GetScheduledTimesRequest | request
try {
    ScheduledTimes result = apiInstance.getScheduledTimes(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledTimeApi#getScheduledTimes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GetScheduledTimesRequest**](GetScheduledTimesRequest.md)| request |

### Return type

[**ScheduledTimes**](ScheduledTimes.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


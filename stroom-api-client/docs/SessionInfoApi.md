# SessionInfoApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSessionInfo**](SessionInfoApi.md#getSessionInfo) | **GET** /sessionInfo/v1 | Get information for the current session

<a name="getSessionInfo"></a>
# **getSessionInfo**
> SessionInfo getSessionInfo()

Get information for the current session

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SessionInfoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SessionInfoApi apiInstance = new SessionInfoApi();
try {
    SessionInfo result = apiInstance.getSessionInfo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SessionInfoApi#getSessionInfo");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SessionInfo**](SessionInfo.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


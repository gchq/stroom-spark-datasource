# WelcomeApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchWelcome**](WelcomeApi.md#fetchWelcome) | **GET** /welcome/v1 | Get the configured HTML welcome message

<a name="fetchWelcome"></a>
# **fetchWelcome**
> Welcome fetchWelcome()

Get the configured HTML welcome message

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WelcomeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

WelcomeApi apiInstance = new WelcomeApi();
try {
    Welcome result = apiInstance.fetchWelcome();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WelcomeApi#fetchWelcome");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Welcome**](Welcome.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


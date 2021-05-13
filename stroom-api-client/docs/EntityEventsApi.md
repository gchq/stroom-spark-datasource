# EntityEventsApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fireEntityEvent**](EntityEventsApi.md#fireEntityEvent) | **PUT** /entityEvent/v1/{nodeName} | Sends an entity event

<a name="fireEntityEvent"></a>
# **fireEntityEvent**
> Boolean fireEntityEvent(body, nodeName)

Sends an entity event

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntityEventsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

EntityEventsApi apiInstance = new EntityEventsApi();
EntityEvent body = new EntityEvent(); // EntityEvent | entityevent
String nodeName = "nodeName_example"; // String | 
try {
    Boolean result = apiInstance.fireEntityEvent(body, nodeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityEventsApi#fireEntityEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EntityEvent**](EntityEvent.md)| entityevent |
 **nodeName** | **String**|  |

### Return type

**Boolean**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


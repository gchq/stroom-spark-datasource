# SessionsApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listSessions**](SessionsApi.md#listSessions) | **GET** /session/v1/list | Lists user sessions for a node, or all nodes in the cluster if nodeName is null
[**stroomLogout**](SessionsApi.md#stroomLogout) | **GET** /session/v1/logout | Logout of Stroom session
[**validateStroomSession**](SessionsApi.md#validateStroomSession) | **GET** /session/v1/noauth/validateSession | Validate the current session, return a redirect Uri if invalid.

<a name="listSessions"></a>
# **listSessions**
> SessionListResponse listSessions(nodeName)

Lists user sessions for a node, or all nodes in the cluster if nodeName is null

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SessionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SessionsApi apiInstance = new SessionsApi();
String nodeName = "nodeName_example"; // String | 
try {
    SessionListResponse result = apiInstance.listSessions(nodeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SessionsApi#listSessions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeName** | **String**|  | [optional]

### Return type

[**SessionListResponse**](SessionListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stroomLogout"></a>
# **stroomLogout**
> UrlResponse stroomLogout(redirectUri)

Logout of Stroom session

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SessionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SessionsApi apiInstance = new SessionsApi();
String redirectUri = "redirectUri_example"; // String | 
try {
    UrlResponse result = apiInstance.stroomLogout(redirectUri);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SessionsApi#stroomLogout");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **redirectUri** | **String**|  |

### Return type

[**UrlResponse**](UrlResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="validateStroomSession"></a>
# **validateStroomSession**
> ValidateSessionResponse validateStroomSession(redirectUri)

Validate the current session, return a redirect Uri if invalid.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SessionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SessionsApi apiInstance = new SessionsApi();
String redirectUri = "redirectUri_example"; // String | 
try {
    ValidateSessionResponse result = apiInstance.validateStroomSession(redirectUri);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SessionsApi#validateStroomSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **redirectUri** | **String**|  |

### Return type

[**ValidateSessionResponse**](ValidateSessionResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


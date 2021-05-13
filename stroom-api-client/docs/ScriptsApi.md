# ScriptsApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchLinkedScripts**](ScriptsApi.md#fetchLinkedScripts) | **POST** /script/v1/fetchLinkedScripts | Fetch related scripts
[**fetchScript**](ScriptsApi.md#fetchScript) | **GET** /script/v1/{uuid} | Fetch a script doc by its UUID
[**updateScript**](ScriptsApi.md#updateScript) | **PUT** /script/v1/{uuid} | Update a script doc

<a name="fetchLinkedScripts"></a>
# **fetchLinkedScripts**
> List&lt;ScriptDoc&gt; fetchLinkedScripts(body)

Fetch related scripts

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ScriptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ScriptsApi apiInstance = new ScriptsApi();
FetchLinkedScriptRequest body = new FetchLinkedScriptRequest(); // FetchLinkedScriptRequest | request
try {
    List<ScriptDoc> result = apiInstance.fetchLinkedScripts(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptsApi#fetchLinkedScripts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FetchLinkedScriptRequest**](FetchLinkedScriptRequest.md)| request |

### Return type

[**List&lt;ScriptDoc&gt;**](ScriptDoc.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchScript"></a>
# **fetchScript**
> ScriptDoc fetchScript(uuid)

Fetch a script doc by its UUID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ScriptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ScriptsApi apiInstance = new ScriptsApi();
String uuid = "uuid_example"; // String | 
try {
    ScriptDoc result = apiInstance.fetchScript(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptsApi#fetchScript");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**|  |

### Return type

[**ScriptDoc**](ScriptDoc.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateScript"></a>
# **updateScript**
> ScriptDoc updateScript(body, uuid)

Update a script doc

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ScriptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ScriptsApi apiInstance = new ScriptsApi();
ScriptDoc body = new ScriptDoc(); // ScriptDoc | doc
String uuid = "uuid_example"; // String | 
try {
    ScriptDoc result = apiInstance.updateScript(body, uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptsApi#updateScript");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ScriptDoc**](ScriptDoc.md)| doc |
 **uuid** | **String**|  |

### Return type

[**ScriptDoc**](ScriptDoc.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


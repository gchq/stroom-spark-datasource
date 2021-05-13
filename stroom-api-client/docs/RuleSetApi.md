# RuleSetApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**exportReceiveDataRules**](RuleSetApi.md#exportReceiveDataRules) | **POST** /ruleset/v2/export | Submit an export request
[**fetchReceiveDataRules**](RuleSetApi.md#fetchReceiveDataRules) | **GET** /ruleset/v2/{uuid} | Fetch a rules doc by its UUID
[**importReceiveDataRules**](RuleSetApi.md#importReceiveDataRules) | **POST** /ruleset/v2/import | Submit an import request
[**listReceiveDataRules**](RuleSetApi.md#listReceiveDataRules) | **GET** /ruleset/v2/list | Submit a request for a list of doc refs held by this service
[**updateReceiveDataRules**](RuleSetApi.md#updateReceiveDataRules) | **PUT** /ruleset/v2/{uuid} | Update a rules doc

<a name="exportReceiveDataRules"></a>
# **exportReceiveDataRules**
> Base64EncodedDocumentData exportReceiveDataRules(body)

Submit an export request

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RuleSetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

RuleSetApi apiInstance = new RuleSetApi();
DocRef body = new DocRef(); // DocRef | DocRef
try {
    Base64EncodedDocumentData result = apiInstance.exportReceiveDataRules(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuleSetApi#exportReceiveDataRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DocRef**](DocRef.md)| DocRef |

### Return type

[**Base64EncodedDocumentData**](Base64EncodedDocumentData.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchReceiveDataRules"></a>
# **fetchReceiveDataRules**
> ReceiveDataRules fetchReceiveDataRules(uuid)

Fetch a rules doc by its UUID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RuleSetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

RuleSetApi apiInstance = new RuleSetApi();
String uuid = "uuid_example"; // String | 
try {
    ReceiveDataRules result = apiInstance.fetchReceiveDataRules(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuleSetApi#fetchReceiveDataRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**|  |

### Return type

[**ReceiveDataRules**](ReceiveDataRules.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="importReceiveDataRules"></a>
# **importReceiveDataRules**
> DocRef importReceiveDataRules(body)

Submit an import request

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RuleSetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

RuleSetApi apiInstance = new RuleSetApi();
Base64EncodedDocumentData body = new Base64EncodedDocumentData(); // Base64EncodedDocumentData | DocumentData
try {
    DocRef result = apiInstance.importReceiveDataRules(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuleSetApi#importReceiveDataRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Base64EncodedDocumentData**](Base64EncodedDocumentData.md)| DocumentData |

### Return type

[**DocRef**](DocRef.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listReceiveDataRules"></a>
# **listReceiveDataRules**
> List&lt;DocRef&gt; listReceiveDataRules()

Submit a request for a list of doc refs held by this service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RuleSetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

RuleSetApi apiInstance = new RuleSetApi();
try {
    List<DocRef> result = apiInstance.listReceiveDataRules();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuleSetApi#listReceiveDataRules");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;DocRef&gt;**](DocRef.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateReceiveDataRules"></a>
# **updateReceiveDataRules**
> ReceiveDataRules updateReceiveDataRules(body, uuid)

Update a rules doc

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RuleSetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

RuleSetApi apiInstance = new RuleSetApi();
ReceiveDataRules body = new ReceiveDataRules(); // ReceiveDataRules | doc
String uuid = "uuid_example"; // String | 
try {
    ReceiveDataRules result = apiInstance.updateReceiveDataRules(body, uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuleSetApi#updateReceiveDataRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReceiveDataRules**](ReceiveDataRules.md)| doc |
 **uuid** | **String**|  |

### Return type

[**ReceiveDataRules**](ReceiveDataRules.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


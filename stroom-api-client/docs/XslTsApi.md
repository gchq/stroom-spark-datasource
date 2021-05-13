# XslTsApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchXslt**](XslTsApi.md#fetchXslt) | **GET** /xslt/v1/{uuid} | Fetch an xslt doc by its UUID
[**updateXslt**](XslTsApi.md#updateXslt) | **PUT** /xslt/v1/{uuid} | Update a an xslt doc

<a name="fetchXslt"></a>
# **fetchXslt**
> XsltDoc fetchXslt(uuid)

Fetch an xslt doc by its UUID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.XslTsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

XslTsApi apiInstance = new XslTsApi();
String uuid = "uuid_example"; // String | 
try {
    XsltDoc result = apiInstance.fetchXslt(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XslTsApi#fetchXslt");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**|  |

### Return type

[**XsltDoc**](XsltDoc.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateXslt"></a>
# **updateXslt**
> XsltDoc updateXslt(body, uuid)

Update a an xslt doc

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.XslTsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

XslTsApi apiInstance = new XslTsApi();
XsltDoc body = new XsltDoc(); // XsltDoc | doc
String uuid = "uuid_example"; // String | 
try {
    XsltDoc result = apiInstance.updateXslt(body, uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XslTsApi#updateXslt");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**XsltDoc**](XsltDoc.md)| doc |
 **uuid** | **String**|  |

### Return type

[**XsltDoc**](XsltDoc.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


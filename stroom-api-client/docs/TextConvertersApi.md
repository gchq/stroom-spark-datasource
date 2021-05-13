# TextConvertersApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchTextConverter**](TextConvertersApi.md#fetchTextConverter) | **GET** /textConverter/v1/{uuid} | Fetch a text converter doc by its UUID
[**updateTextConverter**](TextConvertersApi.md#updateTextConverter) | **PUT** /textConverter/v1/{uuid} | Update a text converter doc

<a name="fetchTextConverter"></a>
# **fetchTextConverter**
> TextConverterDoc fetchTextConverter(uuid)

Fetch a text converter doc by its UUID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TextConvertersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

TextConvertersApi apiInstance = new TextConvertersApi();
String uuid = "uuid_example"; // String | 
try {
    TextConverterDoc result = apiInstance.fetchTextConverter(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TextConvertersApi#fetchTextConverter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**|  |

### Return type

[**TextConverterDoc**](TextConverterDoc.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateTextConverter"></a>
# **updateTextConverter**
> TextConverterDoc updateTextConverter(body, uuid)

Update a text converter doc

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TextConvertersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

TextConvertersApi apiInstance = new TextConvertersApi();
TextConverterDoc body = new TextConverterDoc(); // TextConverterDoc | doc
String uuid = "uuid_example"; // String | 
try {
    TextConverterDoc result = apiInstance.updateTextConverter(body, uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TextConvertersApi#updateTextConverter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TextConverterDoc**](TextConverterDoc.md)| doc |
 **uuid** | **String**|  |

### Return type

[**TextConverterDoc**](TextConverterDoc.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


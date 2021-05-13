# XmlSchemasApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchXmlSchema**](XmlSchemasApi.md#fetchXmlSchema) | **GET** /xmlSchema/v1/{uuid} | Fetch a xml schema doc by its UUID
[**updateXmlSchema**](XmlSchemasApi.md#updateXmlSchema) | **PUT** /xmlSchema/v1/{uuid} | Update a xml schema doc

<a name="fetchXmlSchema"></a>
# **fetchXmlSchema**
> XmlSchemaDoc fetchXmlSchema(uuid)

Fetch a xml schema doc by its UUID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.XmlSchemasApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

XmlSchemasApi apiInstance = new XmlSchemasApi();
String uuid = "uuid_example"; // String | 
try {
    XmlSchemaDoc result = apiInstance.fetchXmlSchema(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XmlSchemasApi#fetchXmlSchema");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**|  |

### Return type

[**XmlSchemaDoc**](XmlSchemaDoc.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateXmlSchema"></a>
# **updateXmlSchema**
> XmlSchemaDoc updateXmlSchema(body, uuid)

Update a xml schema doc

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.XmlSchemasApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

XmlSchemasApi apiInstance = new XmlSchemasApi();
XmlSchemaDoc body = new XmlSchemaDoc(); // XmlSchemaDoc | doc
String uuid = "uuid_example"; // String | 
try {
    XmlSchemaDoc result = apiInstance.updateXmlSchema(body, uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XmlSchemasApi#updateXmlSchema");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**XmlSchemaDoc**](XmlSchemaDoc.md)| doc |
 **uuid** | **String**|  |

### Return type

[**XmlSchemaDoc**](XmlSchemaDoc.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


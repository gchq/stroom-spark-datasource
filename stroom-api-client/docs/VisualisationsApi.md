# VisualisationsApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchVisualisation**](VisualisationsApi.md#fetchVisualisation) | **GET** /visualisation/v1/{uuid} | Fetch a visualisation doc by its UUID
[**updateVisualisation**](VisualisationsApi.md#updateVisualisation) | **PUT** /visualisation/v1/{uuid} | Update a visualisation doc

<a name="fetchVisualisation"></a>
# **fetchVisualisation**
> VisualisationDoc fetchVisualisation(uuid)

Fetch a visualisation doc by its UUID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VisualisationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

VisualisationsApi apiInstance = new VisualisationsApi();
String uuid = "uuid_example"; // String | 
try {
    VisualisationDoc result = apiInstance.fetchVisualisation(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VisualisationsApi#fetchVisualisation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**|  |

### Return type

[**VisualisationDoc**](VisualisationDoc.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateVisualisation"></a>
# **updateVisualisation**
> VisualisationDoc updateVisualisation(body, uuid)

Update a visualisation doc

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VisualisationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

VisualisationsApi apiInstance = new VisualisationsApi();
VisualisationDoc body = new VisualisationDoc(); // VisualisationDoc | doc
String uuid = "uuid_example"; // String | 
try {
    VisualisationDoc result = apiInstance.updateVisualisation(body, uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VisualisationsApi#updateVisualisation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VisualisationDoc**](VisualisationDoc.md)| doc |
 **uuid** | **String**|  |

### Return type

[**VisualisationDoc**](VisualisationDoc.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


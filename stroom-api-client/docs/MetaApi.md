# MetaApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findMetaRow**](MetaApi.md#findMetaRow) | **POST** /meta/v1/find | Find matching meta data
[**getMetaReprocessSelectionSummary**](MetaApi.md#getMetaReprocessSelectionSummary) | **POST** /meta/v1/getReprocessSelectionSummary | Get a summary of the parent items of the selected meta data
[**getMetaSelectionSummary**](MetaApi.md#getMetaSelectionSummary) | **POST** /meta/v1/getSelectionSummary | Get a summary of the selected meta data
[**getStreamTypes**](MetaApi.md#getStreamTypes) | **GET** /meta/v1/getTypes | Get a list of possible stream types
[**updateMetaStatus**](MetaApi.md#updateMetaStatus) | **PUT** /meta/v1/update/status | Update status on matching meta data

<a name="findMetaRow"></a>
# **findMetaRow**
> ResultPageMetaRow findMetaRow(body)

Find matching meta data

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MetaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

MetaApi apiInstance = new MetaApi();
FindMetaCriteria body = new FindMetaCriteria(); // FindMetaCriteria | criteria
try {
    ResultPageMetaRow result = apiInstance.findMetaRow(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaApi#findMetaRow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FindMetaCriteria**](FindMetaCriteria.md)| criteria |

### Return type

[**ResultPageMetaRow**](ResultPageMetaRow.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMetaReprocessSelectionSummary"></a>
# **getMetaReprocessSelectionSummary**
> SelectionSummary getMetaReprocessSelectionSummary(body)

Get a summary of the parent items of the selected meta data

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MetaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

MetaApi apiInstance = new MetaApi();
FindMetaCriteria body = new FindMetaCriteria(); // FindMetaCriteria | criteria
try {
    SelectionSummary result = apiInstance.getMetaReprocessSelectionSummary(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaApi#getMetaReprocessSelectionSummary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FindMetaCriteria**](FindMetaCriteria.md)| criteria |

### Return type

[**SelectionSummary**](SelectionSummary.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMetaSelectionSummary"></a>
# **getMetaSelectionSummary**
> SelectionSummary getMetaSelectionSummary(body)

Get a summary of the selected meta data

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MetaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

MetaApi apiInstance = new MetaApi();
FindMetaCriteria body = new FindMetaCriteria(); // FindMetaCriteria | criteria
try {
    SelectionSummary result = apiInstance.getMetaSelectionSummary(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaApi#getMetaSelectionSummary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FindMetaCriteria**](FindMetaCriteria.md)| criteria |

### Return type

[**SelectionSummary**](SelectionSummary.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStreamTypes"></a>
# **getStreamTypes**
> List&lt;String&gt; getStreamTypes()

Get a list of possible stream types

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MetaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

MetaApi apiInstance = new MetaApi();
try {
    List<String> result = apiInstance.getStreamTypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaApi#getStreamTypes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateMetaStatus"></a>
# **updateMetaStatus**
> Integer updateMetaStatus(body)

Update status on matching meta data

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MetaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

MetaApi apiInstance = new MetaApi();
UpdateStatusRequest body = new UpdateStatusRequest(); // UpdateStatusRequest | 
try {
    Integer result = apiInstance.updateMetaStatus(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaApi#updateMetaStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateStatusRequest**](UpdateStatusRequest.md)|  | [optional]

### Return type

**Integer**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# PipelinesApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchPipeline**](PipelinesApi.md#fetchPipeline) | **GET** /pipeline/v1/{uuid} | Fetch a pipeline doc by its UUID
[**fetchPipelineData**](PipelinesApi.md#fetchPipelineData) | **POST** /pipeline/v1/fetchPipelineData | Fetch data for a pipeline
[**fetchPipelineXml**](PipelinesApi.md#fetchPipelineXml) | **POST** /pipeline/v1/fetchPipelineXml | Fetch the XML for a pipeline
[**getPipelinePropertyTypes**](PipelinesApi.md#getPipelinePropertyTypes) | **GET** /pipeline/v1/propertyTypes | Get pipeline property types
[**savePipelineXml**](PipelinesApi.md#savePipelineXml) | **PUT** /pipeline/v1/savePipelineXml | Update a pipeline doc with XML directly
[**updatePipeline**](PipelinesApi.md#updatePipeline) | **PUT** /pipeline/v1/{uuid} | Update a pipeline doc

<a name="fetchPipeline"></a>
# **fetchPipeline**
> PipelineDoc fetchPipeline(uuid)

Fetch a pipeline doc by its UUID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PipelinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

PipelinesApi apiInstance = new PipelinesApi();
String uuid = "uuid_example"; // String | 
try {
    PipelineDoc result = apiInstance.fetchPipeline(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#fetchPipeline");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**|  |

### Return type

[**PipelineDoc**](PipelineDoc.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchPipelineData"></a>
# **fetchPipelineData**
> List&lt;PipelineData&gt; fetchPipelineData(body)

Fetch data for a pipeline

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PipelinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

PipelinesApi apiInstance = new PipelinesApi();
DocRef body = new DocRef(); // DocRef | pipeline
try {
    List<PipelineData> result = apiInstance.fetchPipelineData(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#fetchPipelineData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DocRef**](DocRef.md)| pipeline |

### Return type

[**List&lt;PipelineData&gt;**](PipelineData.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchPipelineXml"></a>
# **fetchPipelineXml**
> FetchPipelineXmlResponse fetchPipelineXml(body)

Fetch the XML for a pipeline

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PipelinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

PipelinesApi apiInstance = new PipelinesApi();
DocRef body = new DocRef(); // DocRef | pipeline
try {
    FetchPipelineXmlResponse result = apiInstance.fetchPipelineXml(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#fetchPipelineXml");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DocRef**](DocRef.md)| pipeline |

### Return type

[**FetchPipelineXmlResponse**](FetchPipelineXmlResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPipelinePropertyTypes"></a>
# **getPipelinePropertyTypes**
> List&lt;FetchPropertyTypesResult&gt; getPipelinePropertyTypes()

Get pipeline property types

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PipelinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

PipelinesApi apiInstance = new PipelinesApi();
try {
    List<FetchPropertyTypesResult> result = apiInstance.getPipelinePropertyTypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#getPipelinePropertyTypes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;FetchPropertyTypesResult&gt;**](FetchPropertyTypesResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="savePipelineXml"></a>
# **savePipelineXml**
> Boolean savePipelineXml(body)

Update a pipeline doc with XML directly

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PipelinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

PipelinesApi apiInstance = new PipelinesApi();
SavePipelineXmlRequest body = new SavePipelineXmlRequest(); // SavePipelineXmlRequest | request
try {
    Boolean result = apiInstance.savePipelineXml(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#savePipelineXml");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SavePipelineXmlRequest**](SavePipelineXmlRequest.md)| request |

### Return type

**Boolean**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePipeline"></a>
# **updatePipeline**
> PipelineDoc updatePipeline(body, uuid)

Update a pipeline doc

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PipelinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

PipelinesApi apiInstance = new PipelinesApi();
PipelineDoc body = new PipelineDoc(); // PipelineDoc | doc
String uuid = "uuid_example"; // String | 
try {
    PipelineDoc result = apiInstance.updatePipeline(body, uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#updatePipeline");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PipelineDoc**](PipelineDoc.md)| doc |
 **uuid** | **String**|  |

### Return type

[**PipelineDoc**](PipelineDoc.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


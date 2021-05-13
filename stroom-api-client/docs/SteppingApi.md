# SteppingApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findElementDoc**](SteppingApi.md#findElementDoc) | **POST** /stepping/v1/findElementDoc | Load the document for an element
[**getPipelineForStepping**](SteppingApi.md#getPipelineForStepping) | **POST** /stepping/v1/getPipelineForStepping | Get a pipeline for stepping
[**step**](SteppingApi.md#step) | **POST** /stepping/v1/step | Step a pipeline

<a name="findElementDoc"></a>
# **findElementDoc**
> DocRef findElementDoc(body)

Load the document for an element

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SteppingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SteppingApi apiInstance = new SteppingApi();
FindElementDocRequest body = new FindElementDocRequest(); // FindElementDocRequest | 
try {
    DocRef result = apiInstance.findElementDoc(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SteppingApi#findElementDoc");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FindElementDocRequest**](FindElementDocRequest.md)|  | [optional]

### Return type

[**DocRef**](DocRef.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPipelineForStepping"></a>
# **getPipelineForStepping**
> DocRef getPipelineForStepping(body)

Get a pipeline for stepping

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SteppingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SteppingApi apiInstance = new SteppingApi();
GetPipelineForMetaRequest body = new GetPipelineForMetaRequest(); // GetPipelineForMetaRequest | request
try {
    DocRef result = apiInstance.getPipelineForStepping(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SteppingApi#getPipelineForStepping");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GetPipelineForMetaRequest**](GetPipelineForMetaRequest.md)| request |

### Return type

[**DocRef**](DocRef.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="step"></a>
# **step**
> SteppingResult step(body)

Step a pipeline

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SteppingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SteppingApi apiInstance = new SteppingApi();
PipelineStepRequest body = new PipelineStepRequest(); // PipelineStepRequest | request
try {
    SteppingResult result = apiInstance.step(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SteppingApi#step");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PipelineStepRequest**](PipelineStepRequest.md)| request |

### Return type

[**SteppingResult**](SteppingResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


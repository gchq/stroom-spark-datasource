# ProcessorFiltersApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProcessorFilter**](ProcessorFiltersApi.md#createProcessorFilter) | **POST** /processorFilter/v1 | Creates a filter
[**deleteProcessorFilter**](ProcessorFiltersApi.md#deleteProcessorFilter) | **DELETE** /processorFilter/v1/{id} | Deletes a filter
[**fetchProcessorFilter**](ProcessorFiltersApi.md#fetchProcessorFilter) | **GET** /processorFilter/v1/{id} | Fetch a filter
[**findProcessorFilters**](ProcessorFiltersApi.md#findProcessorFilters) | **POST** /processorFilter/v1/find | Finds processors and filters matching request
[**reprocessData**](ProcessorFiltersApi.md#reprocessData) | **POST** /processorFilter/v1/reprocess | Create filters to reprocess data
[**setProcessorFilterEnabled**](ProcessorFiltersApi.md#setProcessorFilterEnabled) | **PUT** /processorFilter/v1/{id}/enabled | Sets the enabled/disabled state for a filter
[**setProcessorFilterPriority**](ProcessorFiltersApi.md#setProcessorFilterPriority) | **PUT** /processorFilter/v1/{id}/priority | Sets the priority for a filter
[**updateProcessorFilter**](ProcessorFiltersApi.md#updateProcessorFilter) | **PUT** /processorFilter/v1/{id} | Updates a filter

<a name="createProcessorFilter"></a>
# **createProcessorFilter**
> ProcessorFilter createProcessorFilter(body)

Creates a filter

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessorFiltersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ProcessorFiltersApi apiInstance = new ProcessorFiltersApi();
CreateProcessFilterRequest body = new CreateProcessFilterRequest(); // CreateProcessFilterRequest | request
try {
    ProcessorFilter result = apiInstance.createProcessorFilter(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorFiltersApi#createProcessorFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateProcessFilterRequest**](CreateProcessFilterRequest.md)| request |

### Return type

[**ProcessorFilter**](ProcessorFilter.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProcessorFilter"></a>
# **deleteProcessorFilter**
> Boolean deleteProcessorFilter(id)

Deletes a filter

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessorFiltersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ProcessorFiltersApi apiInstance = new ProcessorFiltersApi();
Integer id = 56; // Integer | 
try {
    Boolean result = apiInstance.deleteProcessorFilter(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorFiltersApi#deleteProcessorFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

**Boolean**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchProcessorFilter"></a>
# **fetchProcessorFilter**
> ProcessorFilter fetchProcessorFilter(id)

Fetch a filter

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessorFiltersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ProcessorFiltersApi apiInstance = new ProcessorFiltersApi();
Integer id = 56; // Integer | 
try {
    ProcessorFilter result = apiInstance.fetchProcessorFilter(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorFiltersApi#fetchProcessorFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**ProcessorFilter**](ProcessorFilter.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findProcessorFilters"></a>
# **findProcessorFilters**
> ProcessorListRowResultPage findProcessorFilters(body)

Finds processors and filters matching request

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessorFiltersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ProcessorFiltersApi apiInstance = new ProcessorFiltersApi();
FetchProcessorRequest body = new FetchProcessorRequest(); // FetchProcessorRequest | request
try {
    ProcessorListRowResultPage result = apiInstance.findProcessorFilters(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorFiltersApi#findProcessorFilters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FetchProcessorRequest**](FetchProcessorRequest.md)| request |

### Return type

[**ProcessorListRowResultPage**](ProcessorListRowResultPage.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reprocessData"></a>
# **reprocessData**
> List&lt;ReprocessDataInfo&gt; reprocessData(body)

Create filters to reprocess data

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessorFiltersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ProcessorFiltersApi apiInstance = new ProcessorFiltersApi();
CreateReprocessFilterRequest body = new CreateReprocessFilterRequest(); // CreateReprocessFilterRequest | criteria
try {
    List<ReprocessDataInfo> result = apiInstance.reprocessData(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorFiltersApi#reprocessData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateReprocessFilterRequest**](CreateReprocessFilterRequest.md)| criteria |

### Return type

[**List&lt;ReprocessDataInfo&gt;**](ReprocessDataInfo.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setProcessorFilterEnabled"></a>
# **setProcessorFilterEnabled**
> Boolean setProcessorFilterEnabled(id, body)

Sets the enabled/disabled state for a filter

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessorFiltersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ProcessorFiltersApi apiInstance = new ProcessorFiltersApi();
Integer id = 56; // Integer | 
Boolean body = true; // Boolean | 
try {
    Boolean result = apiInstance.setProcessorFilterEnabled(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorFiltersApi#setProcessorFilterEnabled");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
 **body** | [**Boolean**](Boolean.md)|  | [optional]

### Return type

**Boolean**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setProcessorFilterPriority"></a>
# **setProcessorFilterPriority**
> Boolean setProcessorFilterPriority(id, body)

Sets the priority for a filter

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessorFiltersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ProcessorFiltersApi apiInstance = new ProcessorFiltersApi();
Integer id = 56; // Integer | 
Integer body = 56; // Integer | 
try {
    Boolean result = apiInstance.setProcessorFilterPriority(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorFiltersApi#setProcessorFilterPriority");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
 **body** | [**Integer**](Integer.md)|  | [optional]

### Return type

**Boolean**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProcessorFilter"></a>
# **updateProcessorFilter**
> ProcessorFilter updateProcessorFilter(id, body)

Updates a filter

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessorFiltersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ProcessorFiltersApi apiInstance = new ProcessorFiltersApi();
Integer id = 56; // Integer | 
ProcessorFilter body = new ProcessorFilter(); // ProcessorFilter | 
try {
    ProcessorFilter result = apiInstance.updateProcessorFilter(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorFiltersApi#updateProcessorFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
 **body** | [**ProcessorFilter**](ProcessorFilter.md)|  | [optional]

### Return type

[**ProcessorFilter**](ProcessorFilter.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


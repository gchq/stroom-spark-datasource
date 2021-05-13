# DataApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downloadData**](DataApi.md#downloadData) | **POST** /data/v1/download | Download matching data
[**fetchData**](DataApi.md#fetchData) | **POST** /data/v1/fetch | Fetch matching data
[**getChildStreamTypes**](DataApi.md#getChildStreamTypes) | **GET** /data/v1/{id}/parts/{partNo}/child-types | List child types for a stream
[**uploadData**](DataApi.md#uploadData) | **POST** /data/v1/upload | Upload data
[**viewDataInfo**](DataApi.md#viewDataInfo) | **GET** /data/v1/{id}/info | Find full info about a data item

<a name="downloadData"></a>
# **downloadData**
> ResourceGeneration downloadData(body)

Download matching data

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DataApi apiInstance = new DataApi();
FindMetaCriteria body = new FindMetaCriteria(); // FindMetaCriteria | criteria
try {
    ResourceGeneration result = apiInstance.downloadData(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#downloadData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FindMetaCriteria**](FindMetaCriteria.md)| criteria |

### Return type

[**ResourceGeneration**](ResourceGeneration.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchData"></a>
# **fetchData**
> AbstractFetchDataResult fetchData(body)

Fetch matching data

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DataApi apiInstance = new DataApi();
FetchDataRequest body = new FetchDataRequest(); // FetchDataRequest | request
try {
    AbstractFetchDataResult result = apiInstance.fetchData(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#fetchData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FetchDataRequest**](FetchDataRequest.md)| request |

### Return type

[**AbstractFetchDataResult**](AbstractFetchDataResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChildStreamTypes"></a>
# **getChildStreamTypes**
> List&lt;String&gt; getChildStreamTypes(id, partNo)

List child types for a stream

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DataApi apiInstance = new DataApi();
Long id = 789L; // Long | 
Long partNo = 789L; // Long | 
try {
    List<String> result = apiInstance.getChildStreamTypes(id, partNo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getChildStreamTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **partNo** | **Long**|  |

### Return type

**List&lt;String&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="uploadData"></a>
# **uploadData**
> ResourceKey uploadData(body)

Upload data

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DataApi apiInstance = new DataApi();
UploadDataRequest body = new UploadDataRequest(); // UploadDataRequest | request
try {
    ResourceKey result = apiInstance.uploadData(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#uploadData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UploadDataRequest**](UploadDataRequest.md)| request |

### Return type

[**ResourceKey**](ResourceKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="viewDataInfo"></a>
# **viewDataInfo**
> List&lt;DataInfoSection&gt; viewDataInfo(id)

Find full info about a data item

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DataApi apiInstance = new DataApi();
Long id = 789L; // Long | 
try {
    List<DataInfoSection> result = apiInstance.viewDataInfo(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#viewDataInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**List&lt;DataInfoSection&gt;**](DataInfoSection.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


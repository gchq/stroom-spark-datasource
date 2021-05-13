# DictionariesV1Api

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downloadDictionary**](DictionariesV1Api.md#downloadDictionary) | **POST** /dictionary/v1/download | Download a dictionary doc
[**fetchDictionary**](DictionariesV1Api.md#fetchDictionary) | **GET** /dictionary/v1/{uuid} | Fetch a dictionary doc by its UUID
[**updateDictionary**](DictionariesV1Api.md#updateDictionary) | **PUT** /dictionary/v1/{uuid} | Update a dictionary doc

<a name="downloadDictionary"></a>
# **downloadDictionary**
> ResourceGeneration downloadDictionary(body)

Download a dictionary doc

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DictionariesV1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DictionariesV1Api apiInstance = new DictionariesV1Api();
DocRef body = new DocRef(); // DocRef | 
try {
    ResourceGeneration result = apiInstance.downloadDictionary(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DictionariesV1Api#downloadDictionary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DocRef**](DocRef.md)|  | [optional]

### Return type

[**ResourceGeneration**](ResourceGeneration.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchDictionary"></a>
# **fetchDictionary**
> DictionaryDoc fetchDictionary(uuid)

Fetch a dictionary doc by its UUID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DictionariesV1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DictionariesV1Api apiInstance = new DictionariesV1Api();
String uuid = "uuid_example"; // String | 
try {
    DictionaryDoc result = apiInstance.fetchDictionary(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DictionariesV1Api#fetchDictionary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**|  |

### Return type

[**DictionaryDoc**](DictionaryDoc.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDictionary"></a>
# **updateDictionary**
> DictionaryDoc updateDictionary(body, uuid)

Update a dictionary doc

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DictionariesV1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DictionariesV1Api apiInstance = new DictionariesV1Api();
DictionaryDoc body = new DictionaryDoc(); // DictionaryDoc | doc
String uuid = "uuid_example"; // String | 
try {
    DictionaryDoc result = apiInstance.updateDictionary(body, uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DictionariesV1Api#updateDictionary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DictionaryDoc**](DictionaryDoc.md)| doc |
 **uuid** | **String**|  |

### Return type

[**DictionaryDoc**](DictionaryDoc.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


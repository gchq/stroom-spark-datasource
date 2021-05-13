# KafkaConfigApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downloadKafkaConfig**](KafkaConfigApi.md#downloadKafkaConfig) | **POST** /kafkaConfig/v1/download | Download a kafkaConfig doc
[**fetchKafkaConfig**](KafkaConfigApi.md#fetchKafkaConfig) | **GET** /kafkaConfig/v1/{uuid} | Fetch a kafkaConfig doc by its UUID
[**updateKafkaConfig**](KafkaConfigApi.md#updateKafkaConfig) | **PUT** /kafkaConfig/v1/{uuid} | Update a kafkaConfig doc

<a name="downloadKafkaConfig"></a>
# **downloadKafkaConfig**
> ResourceGeneration downloadKafkaConfig(body)

Download a kafkaConfig doc

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.KafkaConfigApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

KafkaConfigApi apiInstance = new KafkaConfigApi();
DocRef body = new DocRef(); // DocRef | docRef
try {
    ResourceGeneration result = apiInstance.downloadKafkaConfig(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KafkaConfigApi#downloadKafkaConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DocRef**](DocRef.md)| docRef |

### Return type

[**ResourceGeneration**](ResourceGeneration.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchKafkaConfig"></a>
# **fetchKafkaConfig**
> KafkaConfigDoc fetchKafkaConfig(uuid)

Fetch a kafkaConfig doc by its UUID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.KafkaConfigApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

KafkaConfigApi apiInstance = new KafkaConfigApi();
String uuid = "uuid_example"; // String | 
try {
    KafkaConfigDoc result = apiInstance.fetchKafkaConfig(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KafkaConfigApi#fetchKafkaConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**|  |

### Return type

[**KafkaConfigDoc**](KafkaConfigDoc.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateKafkaConfig"></a>
# **updateKafkaConfig**
> KafkaConfigDoc updateKafkaConfig(body, uuid)

Update a kafkaConfig doc

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.KafkaConfigApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

KafkaConfigApi apiInstance = new KafkaConfigApi();
KafkaConfigDoc body = new KafkaConfigDoc(); // KafkaConfigDoc | doc
String uuid = "uuid_example"; // String | 
try {
    KafkaConfigDoc result = apiInstance.updateKafkaConfig(body, uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KafkaConfigApi#updateKafkaConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**KafkaConfigDoc**](KafkaConfigDoc.md)| doc |
 **uuid** | **String**|  |

### Return type

[**KafkaConfigDoc**](KafkaConfigDoc.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# SolrIndicesApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchSolrIndex**](SolrIndicesApi.md#fetchSolrIndex) | **GET** /solrIndex/v1/{uuid} | Fetch a solr index doc by its UUID
[**fetchSolrTypes**](SolrIndicesApi.md#fetchSolrTypes) | **POST** /solrIndex/v1/fetchSolrTypes | Fetch Solr types
[**solrConnectionTest**](SolrIndicesApi.md#solrConnectionTest) | **POST** /solrIndex/v1/solrConnectionTest | Test connection to Solr
[**updateSolrIndex**](SolrIndicesApi.md#updateSolrIndex) | **PUT** /solrIndex/v1/{uuid} | Update a solr index doc

<a name="fetchSolrIndex"></a>
# **fetchSolrIndex**
> SolrIndexDoc fetchSolrIndex(uuid)

Fetch a solr index doc by its UUID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SolrIndicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SolrIndicesApi apiInstance = new SolrIndicesApi();
String uuid = "uuid_example"; // String | 
try {
    SolrIndexDoc result = apiInstance.fetchSolrIndex(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SolrIndicesApi#fetchSolrIndex");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**|  |

### Return type

[**SolrIndexDoc**](SolrIndexDoc.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchSolrTypes"></a>
# **fetchSolrTypes**
> List&lt;String&gt; fetchSolrTypes(body)

Fetch Solr types

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SolrIndicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SolrIndicesApi apiInstance = new SolrIndicesApi();
SolrIndexDoc body = new SolrIndexDoc(); // SolrIndexDoc | solrIndexDoc
try {
    List<String> result = apiInstance.fetchSolrTypes(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SolrIndicesApi#fetchSolrTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SolrIndexDoc**](SolrIndexDoc.md)| solrIndexDoc |

### Return type

**List&lt;String&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="solrConnectionTest"></a>
# **solrConnectionTest**
> SolrConnectionTestResponse solrConnectionTest(body)

Test connection to Solr

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SolrIndicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SolrIndicesApi apiInstance = new SolrIndicesApi();
SolrIndexDoc body = new SolrIndexDoc(); // SolrIndexDoc | solrIndexDoc
try {
    SolrConnectionTestResponse result = apiInstance.solrConnectionTest(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SolrIndicesApi#solrConnectionTest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SolrIndexDoc**](SolrIndexDoc.md)| solrIndexDoc |

### Return type

[**SolrConnectionTestResponse**](SolrConnectionTestResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSolrIndex"></a>
# **updateSolrIndex**
> SolrIndexDoc updateSolrIndex(body, uuid)

Update a solr index doc

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SolrIndicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SolrIndicesApi apiInstance = new SolrIndicesApi();
SolrIndexDoc body = new SolrIndexDoc(); // SolrIndexDoc | doc
String uuid = "uuid_example"; // String | 
try {
    SolrIndexDoc result = apiInstance.updateSolrIndex(body, uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SolrIndicesApi#updateSolrIndex");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SolrIndexDoc**](SolrIndexDoc.md)| doc |
 **uuid** | **String**|  |

### Return type

[**SolrIndexDoc**](SolrIndexDoc.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


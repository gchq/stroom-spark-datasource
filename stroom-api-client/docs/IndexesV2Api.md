# IndexesV2Api

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteIndexShards**](IndexesV2Api.md#deleteIndexShards) | **POST** /index/v2/shard/delete | Delete matching index shards
[**fetchIndex**](IndexesV2Api.md#fetchIndex) | **GET** /index/v2/{uuid} | Fetch a index doc by its UUID
[**findIndexShards**](IndexesV2Api.md#findIndexShards) | **POST** /index/v2/shard/find | Find matching index shards
[**flushIndexShards**](IndexesV2Api.md#flushIndexShards) | **POST** /index/v2/shard/flush | Flush matching index shards
[**updateIndex**](IndexesV2Api.md#updateIndex) | **PUT** /index/v2/{uuid} | Update an index doc

<a name="deleteIndexShards"></a>
# **deleteIndexShards**
> Long deleteIndexShards(body, nodeName)

Delete matching index shards

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IndexesV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

IndexesV2Api apiInstance = new IndexesV2Api();
FindIndexShardCriteria body = new FindIndexShardCriteria(); // FindIndexShardCriteria | criteria
String nodeName = "nodeName_example"; // String | 
try {
    Long result = apiInstance.deleteIndexShards(body, nodeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndexesV2Api#deleteIndexShards");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FindIndexShardCriteria**](FindIndexShardCriteria.md)| criteria |
 **nodeName** | **String**|  | [optional]

### Return type

**Long**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchIndex"></a>
# **fetchIndex**
> IndexDoc fetchIndex(uuid)

Fetch a index doc by its UUID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IndexesV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

IndexesV2Api apiInstance = new IndexesV2Api();
String uuid = "uuid_example"; // String | 
try {
    IndexDoc result = apiInstance.fetchIndex(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndexesV2Api#fetchIndex");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**|  |

### Return type

[**IndexDoc**](IndexDoc.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findIndexShards"></a>
# **findIndexShards**
> ResultPageIndexShard findIndexShards(body)

Find matching index shards

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IndexesV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

IndexesV2Api apiInstance = new IndexesV2Api();
FindIndexShardCriteria body = new FindIndexShardCriteria(); // FindIndexShardCriteria | criteria
try {
    ResultPageIndexShard result = apiInstance.findIndexShards(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndexesV2Api#findIndexShards");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FindIndexShardCriteria**](FindIndexShardCriteria.md)| criteria |

### Return type

[**ResultPageIndexShard**](ResultPageIndexShard.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="flushIndexShards"></a>
# **flushIndexShards**
> Long flushIndexShards(body, nodeName)

Flush matching index shards

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IndexesV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

IndexesV2Api apiInstance = new IndexesV2Api();
FindIndexShardCriteria body = new FindIndexShardCriteria(); // FindIndexShardCriteria | criteria
String nodeName = "nodeName_example"; // String | 
try {
    Long result = apiInstance.flushIndexShards(body, nodeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndexesV2Api#flushIndexShards");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FindIndexShardCriteria**](FindIndexShardCriteria.md)| criteria |
 **nodeName** | **String**|  | [optional]

### Return type

**Long**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateIndex"></a>
# **updateIndex**
> IndexDoc updateIndex(body, uuid)

Update an index doc

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IndexesV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

IndexesV2Api apiInstance = new IndexesV2Api();
IndexDoc body = new IndexDoc(); // IndexDoc | doc
String uuid = "uuid_example"; // String | 
try {
    IndexDoc result = apiInstance.updateIndex(body, uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndexesV2Api#updateIndex");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IndexDoc**](IndexDoc.md)| doc |
 **uuid** | **String**|  |

### Return type

[**IndexDoc**](IndexDoc.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


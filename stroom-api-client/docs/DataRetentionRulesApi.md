# DataRetentionRulesApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchDataRetentionRules**](DataRetentionRulesApi.md#fetchDataRetentionRules) | **GET** /dataRetentionRules/v1 | Get data retention rules
[**getDataRetentionImpactSummary**](DataRetentionRulesApi.md#getDataRetentionImpactSummary) | **POST** /dataRetentionRules/v1/impactSummary | Get a summary of meta deletions with the passed data retention rules
[**stopDataRetentionImpactSummary**](DataRetentionRulesApi.md#stopDataRetentionImpactSummary) | **DELETE** /dataRetentionRules/v1/impactSummary/{queryId} | Stop a running query
[**updateDataRetentionRules**](DataRetentionRulesApi.md#updateDataRetentionRules) | **PUT** /dataRetentionRules/v1 | Update data retention rules

<a name="fetchDataRetentionRules"></a>
# **fetchDataRetentionRules**
> DataRetentionRules fetchDataRetentionRules()

Get data retention rules

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataRetentionRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DataRetentionRulesApi apiInstance = new DataRetentionRulesApi();
try {
    DataRetentionRules result = apiInstance.fetchDataRetentionRules();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataRetentionRulesApi#fetchDataRetentionRules");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DataRetentionRules**](DataRetentionRules.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDataRetentionImpactSummary"></a>
# **getDataRetentionImpactSummary**
> DataRetentionDeleteSummaryResponse getDataRetentionImpactSummary(body)

Get a summary of meta deletions with the passed data retention rules

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataRetentionRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DataRetentionRulesApi apiInstance = new DataRetentionRulesApi();
DataRetentionDeleteSummaryRequest body = new DataRetentionDeleteSummaryRequest(); // DataRetentionDeleteSummaryRequest | request
try {
    DataRetentionDeleteSummaryResponse result = apiInstance.getDataRetentionImpactSummary(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataRetentionRulesApi#getDataRetentionImpactSummary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DataRetentionDeleteSummaryRequest**](DataRetentionDeleteSummaryRequest.md)| request |

### Return type

[**DataRetentionDeleteSummaryResponse**](DataRetentionDeleteSummaryResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stopDataRetentionImpactSummary"></a>
# **stopDataRetentionImpactSummary**
> Boolean stopDataRetentionImpactSummary(queryId)

Stop a running query

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataRetentionRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DataRetentionRulesApi apiInstance = new DataRetentionRulesApi();
String queryId = "queryId_example"; // String | 
try {
    Boolean result = apiInstance.stopDataRetentionImpactSummary(queryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataRetentionRulesApi#stopDataRetentionImpactSummary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queryId** | **String**|  |

### Return type

**Boolean**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDataRetentionRules"></a>
# **updateDataRetentionRules**
> DataRetentionRules updateDataRetentionRules(body)

Update data retention rules

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataRetentionRulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DataRetentionRulesApi apiInstance = new DataRetentionRulesApi();
DataRetentionRules body = new DataRetentionRules(); // DataRetentionRules | dataRetentionRules
try {
    DataRetentionRules result = apiInstance.updateDataRetentionRules(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataRetentionRulesApi#updateDataRetentionRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DataRetentionRules**](DataRetentionRules.md)| dataRetentionRules |

### Return type

[**DataRetentionRules**](DataRetentionRules.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


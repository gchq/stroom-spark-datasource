# SqlStatisticsRollUpsApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**statisticBitMaskConversion**](SqlStatisticsRollUpsApi.md#statisticBitMaskConversion) | **POST** /statistic/rollUp/v1/bitMaskConversion | Get rollup bit mask
[**statisticBitMaskPermGeneration**](SqlStatisticsRollUpsApi.md#statisticBitMaskPermGeneration) | **POST** /statistic/rollUp/v1/bitMaskPermGeneration | Create rollup bit mask
[**statisticFieldChange**](SqlStatisticsRollUpsApi.md#statisticFieldChange) | **POST** /statistic/rollUp/v1/dataSourceFieldChange | Change fields

<a name="statisticBitMaskConversion"></a>
# **statisticBitMaskConversion**
> List&lt;CustomRollUpMaskFields&gt; statisticBitMaskConversion(body)

Get rollup bit mask

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SqlStatisticsRollUpsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SqlStatisticsRollUpsApi apiInstance = new SqlStatisticsRollUpsApi();
List<Integer> body = Arrays.asList(56); // List<Integer> | maskValues
try {
    List<CustomRollUpMaskFields> result = apiInstance.statisticBitMaskConversion(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SqlStatisticsRollUpsApi#statisticBitMaskConversion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;Integer&gt;**](Integer.md)| maskValues |

### Return type

[**List&lt;CustomRollUpMaskFields&gt;**](CustomRollUpMaskFields.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="statisticBitMaskPermGeneration"></a>
# **statisticBitMaskPermGeneration**
> List&lt;CustomRollUpMask&gt; statisticBitMaskPermGeneration(body)

Create rollup bit mask

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SqlStatisticsRollUpsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SqlStatisticsRollUpsApi apiInstance = new SqlStatisticsRollUpsApi();
Integer body = 56; // Integer | fieldCount
try {
    List<CustomRollUpMask> result = apiInstance.statisticBitMaskPermGeneration(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SqlStatisticsRollUpsApi#statisticBitMaskPermGeneration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Integer**](Integer.md)| fieldCount |

### Return type

[**List&lt;CustomRollUpMask&gt;**](CustomRollUpMask.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="statisticFieldChange"></a>
# **statisticFieldChange**
> StatisticsDataSourceData statisticFieldChange(body)

Change fields

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SqlStatisticsRollUpsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SqlStatisticsRollUpsApi apiInstance = new SqlStatisticsRollUpsApi();
StatisticsDataSourceFieldChangeRequest body = new StatisticsDataSourceFieldChangeRequest(); // StatisticsDataSourceFieldChangeRequest | request
try {
    StatisticsDataSourceData result = apiInstance.statisticFieldChange(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SqlStatisticsRollUpsApi#statisticFieldChange");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StatisticsDataSourceFieldChangeRequest**](StatisticsDataSourceFieldChangeRequest.md)| request |

### Return type

[**StatisticsDataSourceData**](StatisticsDataSourceData.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


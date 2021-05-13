# StroomStatsRollUpsApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**statsBitMaskConversion**](StroomStatsRollUpsApi.md#statsBitMaskConversion) | **POST** /statsStore/rollUp/v1/bitMaskConversion | Get rollup bit mask
[**statsBitMaskPermGeneration**](StroomStatsRollUpsApi.md#statsBitMaskPermGeneration) | **POST** /statsStore/rollUp/v1/bitMaskPermGeneration | Create rollup bit mask
[**statsFieldChange**](StroomStatsRollUpsApi.md#statsFieldChange) | **POST** /statsStore/rollUp/v1/dataSourceFieldChange | Change fields

<a name="statsBitMaskConversion"></a>
# **statsBitMaskConversion**
> ResultPageCustomRollUpMaskFields statsBitMaskConversion(body)

Get rollup bit mask

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StroomStatsRollUpsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

StroomStatsRollUpsApi apiInstance = new StroomStatsRollUpsApi();
List<Integer> body = Arrays.asList(56); // List<Integer> | maskValues
try {
    ResultPageCustomRollUpMaskFields result = apiInstance.statsBitMaskConversion(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StroomStatsRollUpsApi#statsBitMaskConversion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;Integer&gt;**](Integer.md)| maskValues |

### Return type

[**ResultPageCustomRollUpMaskFields**](ResultPageCustomRollUpMaskFields.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="statsBitMaskPermGeneration"></a>
# **statsBitMaskPermGeneration**
> ResultPageCustomRollUpMask statsBitMaskPermGeneration(body)

Create rollup bit mask

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StroomStatsRollUpsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

StroomStatsRollUpsApi apiInstance = new StroomStatsRollUpsApi();
Integer body = 56; // Integer | fieldCount
try {
    ResultPageCustomRollUpMask result = apiInstance.statsBitMaskPermGeneration(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StroomStatsRollUpsApi#statsBitMaskPermGeneration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Integer**](Integer.md)| fieldCount |

### Return type

[**ResultPageCustomRollUpMask**](ResultPageCustomRollUpMask.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="statsFieldChange"></a>
# **statsFieldChange**
> StroomStatsStoreEntityData statsFieldChange(body)

Change fields

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StroomStatsRollUpsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

StroomStatsRollUpsApi apiInstance = new StroomStatsRollUpsApi();
StroomStatsStoreFieldChangeRequest body = new StroomStatsStoreFieldChangeRequest(); // StroomStatsStoreFieldChangeRequest | request
try {
    StroomStatsStoreEntityData result = apiInstance.statsFieldChange(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StroomStatsRollUpsApi#statsFieldChange");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StroomStatsStoreFieldChangeRequest**](StroomStatsStoreFieldChangeRequest.md)| request |

### Return type

[**StroomStatsStoreEntityData**](StroomStatsStoreEntityData.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


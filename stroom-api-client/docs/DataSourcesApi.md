# DataSourcesApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchDataSourceFields**](DataSourcesApi.md#fetchDataSourceFields) | **POST** /dataSource/v1/fetchFields | Fetch data source fields

<a name="fetchDataSourceFields"></a>
# **fetchDataSourceFields**
> List&lt;AbstractField&gt; fetchDataSourceFields(body)

Fetch data source fields

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataSourcesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DataSourcesApi apiInstance = new DataSourcesApi();
DocRef body = new DocRef(); // DocRef | dataSourceRef
try {
    List<AbstractField> result = apiInstance.fetchDataSourceFields(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataSourcesApi#fetchDataSourceFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DocRef**](DocRef.md)| dataSourceRef |

### Return type

[**List&lt;AbstractField&gt;**](AbstractField.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# DatabaseStatusApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findDbSystemTableStatus**](DatabaseStatusApi.md#findDbSystemTableStatus) | **POST** /dbStatus/v1 | Find status of the DB
[**getDbSystemTableStatus**](DatabaseStatusApi.md#getDbSystemTableStatus) | **GET** /dbStatus/v1 | Find status of the DB

<a name="findDbSystemTableStatus"></a>
# **findDbSystemTableStatus**
> ResultPageDBTableStatus findDbSystemTableStatus(body)

Find status of the DB

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DatabaseStatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DatabaseStatusApi apiInstance = new DatabaseStatusApi();
FindDBTableCriteria body = new FindDBTableCriteria(); // FindDBTableCriteria | criteria
try {
    ResultPageDBTableStatus result = apiInstance.findDbSystemTableStatus(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseStatusApi#findDbSystemTableStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FindDBTableCriteria**](FindDBTableCriteria.md)| criteria |

### Return type

[**ResultPageDBTableStatus**](ResultPageDBTableStatus.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDbSystemTableStatus"></a>
# **getDbSystemTableStatus**
> ResultPageDBTableStatus getDbSystemTableStatus()

Find status of the DB

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DatabaseStatusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DatabaseStatusApi apiInstance = new DatabaseStatusApi();
try {
    ResultPageDBTableStatus result = apiInstance.getDbSystemTableStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseStatusApi#getDbSystemTableStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResultPageDBTableStatus**](ResultPageDBTableStatus.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


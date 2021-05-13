# FilesystemVolumesApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFsVolume**](FilesystemVolumesApi.md#createFsVolume) | **POST** /fsVolume/v1 | Create a volume
[**deleteFsVolume**](FilesystemVolumesApi.md#deleteFsVolume) | **DELETE** /fsVolume/v1/{id} | Delete a volume
[**fetchFsVolume**](FilesystemVolumesApi.md#fetchFsVolume) | **GET** /fsVolume/v1/{id} | Get a volume
[**findFsVolumes**](FilesystemVolumesApi.md#findFsVolumes) | **POST** /fsVolume/v1/find | Finds volumes
[**rescanFsVolumes**](FilesystemVolumesApi.md#rescanFsVolumes) | **GET** /fsVolume/v1/rescan | Rescans volumes
[**updateFsVolume**](FilesystemVolumesApi.md#updateFsVolume) | **PUT** /fsVolume/v1/{id} | Update a volume

<a name="createFsVolume"></a>
# **createFsVolume**
> FsVolume createFsVolume(body)

Create a volume

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilesystemVolumesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

FilesystemVolumesApi apiInstance = new FilesystemVolumesApi();
FsVolume body = new FsVolume(); // FsVolume | 
try {
    FsVolume result = apiInstance.createFsVolume(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesystemVolumesApi#createFsVolume");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FsVolume**](FsVolume.md)|  | [optional]

### Return type

[**FsVolume**](FsVolume.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFsVolume"></a>
# **deleteFsVolume**
> Boolean deleteFsVolume(id)

Delete a volume

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilesystemVolumesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

FilesystemVolumesApi apiInstance = new FilesystemVolumesApi();
Integer id = 56; // Integer | 
try {
    Boolean result = apiInstance.deleteFsVolume(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesystemVolumesApi#deleteFsVolume");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

**Boolean**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchFsVolume"></a>
# **fetchFsVolume**
> FsVolume fetchFsVolume(id)

Get a volume

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilesystemVolumesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

FilesystemVolumesApi apiInstance = new FilesystemVolumesApi();
Integer id = 56; // Integer | 
try {
    FsVolume result = apiInstance.fetchFsVolume(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesystemVolumesApi#fetchFsVolume");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**FsVolume**](FsVolume.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findFsVolumes"></a>
# **findFsVolumes**
> ResultPageFsVolume findFsVolumes(body)

Finds volumes

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilesystemVolumesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

FilesystemVolumesApi apiInstance = new FilesystemVolumesApi();
FindFsVolumeCriteria body = new FindFsVolumeCriteria(); // FindFsVolumeCriteria | criteria
try {
    ResultPageFsVolume result = apiInstance.findFsVolumes(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesystemVolumesApi#findFsVolumes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FindFsVolumeCriteria**](FindFsVolumeCriteria.md)| criteria |

### Return type

[**ResultPageFsVolume**](ResultPageFsVolume.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rescanFsVolumes"></a>
# **rescanFsVolumes**
> Boolean rescanFsVolumes()

Rescans volumes

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilesystemVolumesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

FilesystemVolumesApi apiInstance = new FilesystemVolumesApi();
try {
    Boolean result = apiInstance.rescanFsVolumes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesystemVolumesApi#rescanFsVolumes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Boolean**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateFsVolume"></a>
# **updateFsVolume**
> FsVolume updateFsVolume(body, id)

Update a volume

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilesystemVolumesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

FilesystemVolumesApi apiInstance = new FilesystemVolumesApi();
FsVolume body = new FsVolume(); // FsVolume | volume
Integer id = 56; // Integer | 
try {
    FsVolume result = apiInstance.updateFsVolume(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesystemVolumesApi#updateFsVolume");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FsVolume**](FsVolume.md)| volume |
 **id** | **Integer**|  |

### Return type

[**FsVolume**](FsVolume.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


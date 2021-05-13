# DocPermissionsApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changeDocumentPermissions**](DocPermissionsApi.md#changeDocumentPermissions) | **POST** /permission/doc/v1/changeDocumentPermissions | Change document permissions
[**checkDocumentPermission**](DocPermissionsApi.md#checkDocumentPermission) | **POST** /permission/doc/v1/checkDocumentPermission | Check document permission
[**copyPermissionFromParent**](DocPermissionsApi.md#copyPermissionFromParent) | **POST** /permission/doc/v1/copyPermissionsFromParent | Copy permissions from parent
[**fetchAllDocumentPermissions**](DocPermissionsApi.md#fetchAllDocumentPermissions) | **POST** /permission/doc/v1/fetchAllDocumentPermissions | Fetch document permissions
[**filterUsers**](DocPermissionsApi.md#filterUsers) | **POST** /permission/doc/v1/filterUsers | Get all permissions for a given document type
[**getPermissionForDocType**](DocPermissionsApi.md#getPermissionForDocType) | **GET** /permission/doc/v1/getPermissionForDocType/${docType} | Get all permissions for a given document type

<a name="changeDocumentPermissions"></a>
# **changeDocumentPermissions**
> Boolean changeDocumentPermissions(body)

Change document permissions

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DocPermissionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DocPermissionsApi apiInstance = new DocPermissionsApi();
ChangeDocumentPermissionsRequest body = new ChangeDocumentPermissionsRequest(); // ChangeDocumentPermissionsRequest | request
try {
    Boolean result = apiInstance.changeDocumentPermissions(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocPermissionsApi#changeDocumentPermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ChangeDocumentPermissionsRequest**](ChangeDocumentPermissionsRequest.md)| request |

### Return type

**Boolean**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="checkDocumentPermission"></a>
# **checkDocumentPermission**
> Boolean checkDocumentPermission(body)

Check document permission

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DocPermissionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DocPermissionsApi apiInstance = new DocPermissionsApi();
CheckDocumentPermissionRequest body = new CheckDocumentPermissionRequest(); // CheckDocumentPermissionRequest | request
try {
    Boolean result = apiInstance.checkDocumentPermission(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocPermissionsApi#checkDocumentPermission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CheckDocumentPermissionRequest**](CheckDocumentPermissionRequest.md)| request |

### Return type

**Boolean**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="copyPermissionFromParent"></a>
# **copyPermissionFromParent**
> DocumentPermissions copyPermissionFromParent(body)

Copy permissions from parent

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DocPermissionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DocPermissionsApi apiInstance = new DocPermissionsApi();
CopyPermissionsFromParentRequest body = new CopyPermissionsFromParentRequest(); // CopyPermissionsFromParentRequest | request
try {
    DocumentPermissions result = apiInstance.copyPermissionFromParent(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocPermissionsApi#copyPermissionFromParent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CopyPermissionsFromParentRequest**](CopyPermissionsFromParentRequest.md)| request |

### Return type

[**DocumentPermissions**](DocumentPermissions.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchAllDocumentPermissions"></a>
# **fetchAllDocumentPermissions**
> DocumentPermissions fetchAllDocumentPermissions(body)

Fetch document permissions

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DocPermissionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DocPermissionsApi apiInstance = new DocPermissionsApi();
FetchAllDocumentPermissionsRequest body = new FetchAllDocumentPermissionsRequest(); // FetchAllDocumentPermissionsRequest | request
try {
    DocumentPermissions result = apiInstance.fetchAllDocumentPermissions(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocPermissionsApi#fetchAllDocumentPermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FetchAllDocumentPermissionsRequest**](FetchAllDocumentPermissionsRequest.md)| request |

### Return type

[**DocumentPermissions**](DocumentPermissions.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="filterUsers"></a>
# **filterUsers**
> List&lt;User&gt; filterUsers(body)

Get all permissions for a given document type

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DocPermissionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DocPermissionsApi apiInstance = new DocPermissionsApi();
FilterUsersRequest body = new FilterUsersRequest(); // FilterUsersRequest | 
try {
    List<User> result = apiInstance.filterUsers(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocPermissionsApi#filterUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FilterUsersRequest**](FilterUsersRequest.md)|  | [optional]

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPermissionForDocType"></a>
# **getPermissionForDocType**
> List&lt;String&gt; getPermissionForDocType(docType)

Get all permissions for a given document type

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DocPermissionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DocPermissionsApi apiInstance = new DocPermissionsApi();
String docType = "docType_example"; // String | 
try {
    List<String> result = apiInstance.getPermissionForDocType(docType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocPermissionsApi#getPermissionForDocType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docType** | **String**|  |

### Return type

**List&lt;String&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


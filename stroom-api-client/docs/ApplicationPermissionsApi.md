# ApplicationPermissionsApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changeUserPermissions**](ApplicationPermissionsApi.md#changeUserPermissions) | **POST** /permission/app/v1/changeUser | User and app permissions for the current session
[**fetchAllPermissions**](ApplicationPermissionsApi.md#fetchAllPermissions) | **GET** /permission/app/v1/fetchAllPermissions | Get all possible permissions
[**fetchUserAppPermissions**](ApplicationPermissionsApi.md#fetchUserAppPermissions) | **POST** /permission/app/v1/fetchUserAppPermissions | User and app permissions for the specified user
[**firePermissionChangeEvent**](ApplicationPermissionsApi.md#firePermissionChangeEvent) | **POST** /permission/changeEvent/v1/fireChange/{nodeName} | Fires a permission change event
[**getUserAndPermissions**](ApplicationPermissionsApi.md#getUserAndPermissions) | **GET** /permission/app/v1 | User and app permissions for the current session

<a name="changeUserPermissions"></a>
# **changeUserPermissions**
> Boolean changeUserPermissions(body)

User and app permissions for the current session

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApplicationPermissionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ApplicationPermissionsApi apiInstance = new ApplicationPermissionsApi();
ChangeUserRequest body = new ChangeUserRequest(); // ChangeUserRequest | changeUserRequest
try {
    Boolean result = apiInstance.changeUserPermissions(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationPermissionsApi#changeUserPermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ChangeUserRequest**](ChangeUserRequest.md)| changeUserRequest |

### Return type

**Boolean**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchAllPermissions"></a>
# **fetchAllPermissions**
> List&lt;String&gt; fetchAllPermissions()

Get all possible permissions

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApplicationPermissionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ApplicationPermissionsApi apiInstance = new ApplicationPermissionsApi();
try {
    List<String> result = apiInstance.fetchAllPermissions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationPermissionsApi#fetchAllPermissions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchUserAppPermissions"></a>
# **fetchUserAppPermissions**
> UserAndPermissions fetchUserAppPermissions(body)

User and app permissions for the specified user

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApplicationPermissionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ApplicationPermissionsApi apiInstance = new ApplicationPermissionsApi();
User body = new User(); // User | user
try {
    UserAndPermissions result = apiInstance.fetchUserAppPermissions(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationPermissionsApi#fetchUserAppPermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**User**](User.md)| user |

### Return type

[**UserAndPermissions**](UserAndPermissions.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="firePermissionChangeEvent"></a>
# **firePermissionChangeEvent**
> Boolean firePermissionChangeEvent(body, nodeName)

Fires a permission change event

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApplicationPermissionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ApplicationPermissionsApi apiInstance = new ApplicationPermissionsApi();
PermissionChangeRequest body = new PermissionChangeRequest(); // PermissionChangeRequest | request
String nodeName = "nodeName_example"; // String | 
try {
    Boolean result = apiInstance.firePermissionChangeEvent(body, nodeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationPermissionsApi#firePermissionChangeEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PermissionChangeRequest**](PermissionChangeRequest.md)| request |
 **nodeName** | **String**|  |

### Return type

**Boolean**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserAndPermissions"></a>
# **getUserAndPermissions**
> UserAndPermissions getUserAndPermissions()

User and app permissions for the current session

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApplicationPermissionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ApplicationPermissionsApi apiInstance = new ApplicationPermissionsApi();
try {
    UserAndPermissions result = apiInstance.getUserAndPermissions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationPermissionsApi#getUserAndPermissions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserAndPermissions**](UserAndPermissions.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


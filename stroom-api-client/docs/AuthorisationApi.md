# AuthorisationApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUserToGroup**](AuthorisationApi.md#addUserToGroup) | **PUT** /users/v1/{userUuid}/{groupUuid} | Adds user with UUID userUuid to the group with UUID groupUuid
[**createUser**](AuthorisationApi.md#createUser) | **POST** /users/v1/create/{name}/{isGroup} | Creates a user or group with the supplied name
[**deleteUser**](AuthorisationApi.md#deleteUser) | **DELETE** /users/v1/{uuid} | Deletes the user with the supplied UUID
[**fetchUser**](AuthorisationApi.md#fetchUser) | **GET** /users/v1/{userUuid} | Fetches the user with the supplied UUID
[**findUsers**](AuthorisationApi.md#findUsers) | **GET** /users/v1 | Find the users matching the supplied criteria
[**findUsersByCriteria**](AuthorisationApi.md#findUsersByCriteria) | **POST** /users/v1/find | Find the users matching the supplied criteria
[**getAssociatedUsers**](AuthorisationApi.md#getAssociatedUsers) | **GET** /users/v1/associates | Gets a list of associated users
[**removeUserFromGroup**](AuthorisationApi.md#removeUserFromGroup) | **DELETE** /users/v1/{userUuid}/{groupUuid} | Removes user with UUID userUuid from the group with UUID groupUuid
[**setUserStatus**](AuthorisationApi.md#setUserStatus) | **PUT** /users/v1/{userName}/status | Enables/disables the Stroom user with the supplied username

<a name="addUserToGroup"></a>
# **addUserToGroup**
> Boolean addUserToGroup(userUuid, groupUuid)

Adds user with UUID userUuid to the group with UUID groupUuid

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthorisationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AuthorisationApi apiInstance = new AuthorisationApi();
String userUuid = "userUuid_example"; // String | 
String groupUuid = "groupUuid_example"; // String | 
try {
    Boolean result = apiInstance.addUserToGroup(userUuid, groupUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorisationApi#addUserToGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userUuid** | **String**|  |
 **groupUuid** | **String**|  |

### Return type

**Boolean**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createUser"></a>
# **createUser**
> User createUser(name, isGroup)

Creates a user or group with the supplied name

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthorisationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AuthorisationApi apiInstance = new AuthorisationApi();
String name = "name_example"; // String | 
Boolean isGroup = true; // Boolean | 
try {
    User result = apiInstance.createUser(name, isGroup);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorisationApi#createUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **isGroup** | **Boolean**|  |

### Return type

[**User**](User.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteUser"></a>
# **deleteUser**
> Boolean deleteUser(uuid)

Deletes the user with the supplied UUID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthorisationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AuthorisationApi apiInstance = new AuthorisationApi();
String uuid = "uuid_example"; // String | 
try {
    Boolean result = apiInstance.deleteUser(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorisationApi#deleteUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**|  |

### Return type

**Boolean**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchUser"></a>
# **fetchUser**
> User fetchUser(userUuid)

Fetches the user with the supplied UUID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthorisationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AuthorisationApi apiInstance = new AuthorisationApi();
String userUuid = "userUuid_example"; // String | 
try {
    User result = apiInstance.fetchUser(userUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorisationApi#fetchUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userUuid** | **String**|  |

### Return type

[**User**](User.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findUsers"></a>
# **findUsers**
> List&lt;User&gt; findUsers(name, isGroup, uuid)

Find the users matching the supplied criteria

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthorisationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AuthorisationApi apiInstance = new AuthorisationApi();
String name = "name_example"; // String | 
Boolean isGroup = true; // Boolean | 
String uuid = "uuid_example"; // String | 
try {
    List<User> result = apiInstance.findUsers(name, isGroup, uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorisationApi#findUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  | [optional]
 **isGroup** | **Boolean**|  | [optional]
 **uuid** | **String**|  | [optional]

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findUsersByCriteria"></a>
# **findUsersByCriteria**
> ResultPageUser findUsersByCriteria(body)

Find the users matching the supplied criteria

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthorisationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AuthorisationApi apiInstance = new AuthorisationApi();
FindUserCriteria body = new FindUserCriteria(); // FindUserCriteria | criteria
try {
    ResultPageUser result = apiInstance.findUsersByCriteria(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorisationApi#findUsersByCriteria");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FindUserCriteria**](FindUserCriteria.md)| criteria |

### Return type

[**ResultPageUser**](ResultPageUser.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAssociatedUsers"></a>
# **getAssociatedUsers**
> List&lt;String&gt; getAssociatedUsers(filter)

Gets a list of associated users

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthorisationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AuthorisationApi apiInstance = new AuthorisationApi();
String filter = "filter_example"; // String | 
try {
    List<String> result = apiInstance.getAssociatedUsers(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorisationApi#getAssociatedUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**|  | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeUserFromGroup"></a>
# **removeUserFromGroup**
> Boolean removeUserFromGroup(userUuid, groupUuid)

Removes user with UUID userUuid from the group with UUID groupUuid

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthorisationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AuthorisationApi apiInstance = new AuthorisationApi();
String userUuid = "userUuid_example"; // String | 
String groupUuid = "groupUuid_example"; // String | 
try {
    Boolean result = apiInstance.removeUserFromGroup(userUuid, groupUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorisationApi#removeUserFromGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userUuid** | **String**|  |
 **groupUuid** | **String**|  |

### Return type

**Boolean**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setUserStatus"></a>
# **setUserStatus**
> Boolean setUserStatus(userName, enabled)

Enables/disables the Stroom user with the supplied username

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthorisationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AuthorisationApi apiInstance = new AuthorisationApi();
String userName = "userName_example"; // String | 
Boolean enabled = true; // Boolean | 
try {
    Boolean result = apiInstance.setUserStatus(userName, enabled);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorisationApi#setUserStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userName** | **String**|  |
 **enabled** | **Boolean**|  | [optional]

### Return type

**Boolean**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


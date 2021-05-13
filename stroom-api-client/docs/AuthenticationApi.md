# AuthenticationApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changePassword**](AuthenticationApi.md#changePassword) | **POST** /authentication/v1/noauth/changePassword | Change a user&#x27;s password.
[**confirmPassword**](AuthenticationApi.md#confirmPassword) | **POST** /authentication/v1/noauth/confirmPassword | Confirm an authenticated user&#x27;s current password.
[**fetchPasswordPolicy**](AuthenticationApi.md#fetchPasswordPolicy) | **GET** /authentication/v1/noauth/fetchPasswordPolicy | Get the password policy
[**getAuthenticationState**](AuthenticationApi.md#getAuthenticationState) | **GET** /authentication/v1/noauth/getAuthenticationState | Get the current authentication state
[**login**](AuthenticationApi.md#login) | **POST** /authentication/v1/noauth/login | Handle a login request made using username and password credentials.
[**logout**](AuthenticationApi.md#logout) | **GET** /authentication/v1/noauth/logout | Log a user out of their session
[**needsPasswordChange**](AuthenticationApi.md#needsPasswordChange) | **GET** /authentication/v1/needsPasswordChange | Check if a user&#x27;s password needs changing.
[**openIdAuth**](AuthenticationApi.md#openIdAuth) | **GET** /oauth2/v1/noauth/auth | Submit an OpenId AuthenticationRequest.
[**openIdCerts**](AuthenticationApi.md#openIdCerts) | **GET** /oauth2/v1/noauth/certs | Provides access to this service&#x27;s current public key. A client may use these keys to verify JWTs issued by this service.
[**openIdConfiguration**](AuthenticationApi.md#openIdConfiguration) | **GET** /oauth2/v1/noauth/.well-known/openid-configuration | Provides discovery for openid configuration
[**openIdToken**](AuthenticationApi.md#openIdToken) | **POST** /oauth2/v1/noauth/token | Get a token from an access code
[**resetEmail**](AuthenticationApi.md#resetEmail) | **GET** /authentication/v1/noauth/reset/{email} | Reset a user account using an email address.
[**resetPassword**](AuthenticationApi.md#resetPassword) | **POST** /authentication/v1/resetPassword | Reset an authenticated user&#x27;s password.

<a name="changePassword"></a>
# **changePassword**
> ChangePasswordResponse changePassword(body)

Change a user&#x27;s password.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AuthenticationApi apiInstance = new AuthenticationApi();
ChangePasswordRequest body = new ChangePasswordRequest(); // ChangePasswordRequest | changePasswordRequest
try {
    ChangePasswordResponse result = apiInstance.changePassword(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#changePassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ChangePasswordRequest**](ChangePasswordRequest.md)| changePasswordRequest |

### Return type

[**ChangePasswordResponse**](ChangePasswordResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="confirmPassword"></a>
# **confirmPassword**
> ConfirmPasswordResponse confirmPassword(body)

Confirm an authenticated user&#x27;s current password.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AuthenticationApi apiInstance = new AuthenticationApi();
ConfirmPasswordRequest body = new ConfirmPasswordRequest(); // ConfirmPasswordRequest | confirmPasswordRequest
try {
    ConfirmPasswordResponse result = apiInstance.confirmPassword(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#confirmPassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConfirmPasswordRequest**](ConfirmPasswordRequest.md)| confirmPasswordRequest |

### Return type

[**ConfirmPasswordResponse**](ConfirmPasswordResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchPasswordPolicy"></a>
# **fetchPasswordPolicy**
> PasswordPolicyConfig fetchPasswordPolicy()

Get the password policy

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AuthenticationApi apiInstance = new AuthenticationApi();
try {
    PasswordPolicyConfig result = apiInstance.fetchPasswordPolicy();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#fetchPasswordPolicy");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PasswordPolicyConfig**](PasswordPolicyConfig.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAuthenticationState"></a>
# **getAuthenticationState**
> AuthenticationState getAuthenticationState()

Get the current authentication state

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AuthenticationApi apiInstance = new AuthenticationApi();
try {
    AuthenticationState result = apiInstance.getAuthenticationState();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#getAuthenticationState");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AuthenticationState**](AuthenticationState.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="login"></a>
# **login**
> LoginResponse login(body)

Handle a login request made using username and password credentials.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AuthenticationApi apiInstance = new AuthenticationApi();
LoginRequest body = new LoginRequest(); // LoginRequest | Credentials
try {
    LoginResponse result = apiInstance.login(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#login");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LoginRequest**](LoginRequest.md)| Credentials |

### Return type

[**LoginResponse**](LoginResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="logout"></a>
# **logout**
> Boolean logout(redirectUri)

Log a user out of their session

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AuthenticationApi apiInstance = new AuthenticationApi();
String redirectUri = "redirectUri_example"; // String | 
try {
    Boolean result = apiInstance.logout(redirectUri);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#logout");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **redirectUri** | **String**|  |

### Return type

**Boolean**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="needsPasswordChange"></a>
# **needsPasswordChange**
> Boolean needsPasswordChange(email)

Check if a user&#x27;s password needs changing.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AuthenticationApi apiInstance = new AuthenticationApi();
String email = "email_example"; // String | 
try {
    Boolean result = apiInstance.needsPasswordChange(email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#needsPasswordChange");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**|  | [optional]

### Return type

**Boolean**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="openIdAuth"></a>
# **openIdAuth**
> openIdAuth(scope, responseType, clientId, redirectUri, nonce, state, prompt)

Submit an OpenId AuthenticationRequest.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AuthenticationApi apiInstance = new AuthenticationApi();
String scope = "scope_example"; // String | 
String responseType = "responseType_example"; // String | 
String clientId = "clientId_example"; // String | 
String redirectUri = "redirectUri_example"; // String | 
String nonce = "nonce_example"; // String | 
String state = "state_example"; // String | 
String prompt = "prompt_example"; // String | 
try {
    apiInstance.openIdAuth(scope, responseType, clientId, redirectUri, nonce, state, prompt);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#openIdAuth");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**|  |
 **responseType** | **String**|  |
 **clientId** | **String**|  |
 **redirectUri** | **String**|  |
 **nonce** | **String**|  | [optional]
 **state** | **String**|  | [optional]
 **prompt** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="openIdCerts"></a>
# **openIdCerts**
> Map&lt;String, List&lt;Map&lt;String, Object&gt;&gt;&gt; openIdCerts()

Provides access to this service&#x27;s current public key. A client may use these keys to verify JWTs issued by this service.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AuthenticationApi apiInstance = new AuthenticationApi();
try {
    Map<String, List<Map<String, Object>>> result = apiInstance.openIdCerts();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#openIdCerts");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Map&lt;String, List&lt;Map&lt;String, Object&gt;&gt;&gt;**](List.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="openIdConfiguration"></a>
# **openIdConfiguration**
> String openIdConfiguration()

Provides discovery for openid configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AuthenticationApi apiInstance = new AuthenticationApi();
try {
    String result = apiInstance.openIdConfiguration();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#openIdConfiguration");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="openIdToken"></a>
# **openIdToken**
> TokenResponse openIdToken(body)

Get a token from an access code

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AuthenticationApi apiInstance = new AuthenticationApi();
TokenRequest body = new TokenRequest(); // TokenRequest | tokenRequest
try {
    TokenResponse result = apiInstance.openIdToken(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#openIdToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TokenRequest**](TokenRequest.md)| tokenRequest |

### Return type

[**TokenResponse**](TokenResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resetEmail"></a>
# **resetEmail**
> Boolean resetEmail(email)

Reset a user account using an email address.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AuthenticationApi apiInstance = new AuthenticationApi();
String email = "email_example"; // String | 
try {
    Boolean result = apiInstance.resetEmail(email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#resetEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**|  |

### Return type

**Boolean**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resetPassword"></a>
# **resetPassword**
> ChangePasswordResponse resetPassword(body)

Reset an authenticated user&#x27;s password.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AuthenticationApi apiInstance = new AuthenticationApi();
ResetPasswordRequest body = new ResetPasswordRequest(); // ResetPasswordRequest | changePasswordRequest
try {
    ChangePasswordResponse result = apiInstance.resetPassword(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#resetPassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ResetPasswordRequest**](ResetPasswordRequest.md)| changePasswordRequest |

### Return type

[**ChangePasswordResponse**](ChangePasswordResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


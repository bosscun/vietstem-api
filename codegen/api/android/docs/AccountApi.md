# AccountApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountChangePassword**](AccountApi.md#accountChangePassword) | **POST** Accounts/change-password | Change a user&#39;s password.
[**accountConfirm**](AccountApi.md#accountConfirm) | **GET** Accounts/confirm | Confirm a user registration with identity verification token.
[**accountCount**](AccountApi.md#accountCount) | **GET** Accounts/count | Count instances of the model matched by where from the data source.
[**accountCreate**](AccountApi.md#accountCreate) | **POST** Accounts | Create a new instance of the model and persist it into the data source.
[**accountCreateChangeStreamGetAccountsChangeStream**](AccountApi.md#accountCreateChangeStreamGetAccountsChangeStream) | **GET** Accounts/change-stream | Create a change stream.
[**accountCreateChangeStreamPostAccountsChangeStream**](AccountApi.md#accountCreateChangeStreamPostAccountsChangeStream) | **POST** Accounts/change-stream | Create a change stream.
[**accountDeleteById**](AccountApi.md#accountDeleteById) | **DELETE** Accounts/{id} | Delete a model instance by {{id}} from the data source.
[**accountExistsGetAccountsidExists**](AccountApi.md#accountExistsGetAccountsidExists) | **GET** Accounts/{id}/exists | Check whether a model instance exists in the data source.
[**accountExistsHeadAccountsid**](AccountApi.md#accountExistsHeadAccountsid) | **HEAD** Accounts/{id} | Check whether a model instance exists in the data source.
[**accountFind**](AccountApi.md#accountFind) | **GET** Accounts | Find all instances of the model matched by filter from the data source.
[**accountFindById**](AccountApi.md#accountFindById) | **GET** Accounts/{id} | Find a model instance by {{id}} from the data source.
[**accountFindOne**](AccountApi.md#accountFindOne) | **GET** Accounts/findOne | Find first instance of the model matched by filter from the data source.
[**accountLogin**](AccountApi.md#accountLogin) | **POST** Accounts/login | Login a user with username/email and password.
[**accountLogout**](AccountApi.md#accountLogout) | **POST** Accounts/logout | Logout a user with access token.
[**accountPatchOrCreate**](AccountApi.md#accountPatchOrCreate) | **PATCH** Accounts | Patch an existing model instance or insert a new one into the data source.
[**accountPrototypeCountAccessTokens**](AccountApi.md#accountPrototypeCountAccessTokens) | **GET** Accounts/{id}/accessTokens/count | Counts accessTokens of Account.
[**accountPrototypeCountRoles**](AccountApi.md#accountPrototypeCountRoles) | **GET** Accounts/{id}/roles/count | Counts roles of Account.
[**accountPrototypeCreateAccessTokens**](AccountApi.md#accountPrototypeCreateAccessTokens) | **POST** Accounts/{id}/accessTokens | Creates a new instance in accessTokens of this model.
[**accountPrototypeCreateRoles**](AccountApi.md#accountPrototypeCreateRoles) | **POST** Accounts/{id}/roles | Creates a new instance in roles of this model.
[**accountPrototypeDeleteAccessTokens**](AccountApi.md#accountPrototypeDeleteAccessTokens) | **DELETE** Accounts/{id}/accessTokens | Deletes all accessTokens of this model.
[**accountPrototypeDeleteRoles**](AccountApi.md#accountPrototypeDeleteRoles) | **DELETE** Accounts/{id}/roles | Deletes all roles of this model.
[**accountPrototypeDestroyByIdAccessTokens**](AccountApi.md#accountPrototypeDestroyByIdAccessTokens) | **DELETE** Accounts/{id}/accessTokens/{fk} | Delete a related item by id for accessTokens.
[**accountPrototypeDestroyByIdRoles**](AccountApi.md#accountPrototypeDestroyByIdRoles) | **DELETE** Accounts/{id}/roles/{fk} | Delete a related item by id for roles.
[**accountPrototypeExistsRoles**](AccountApi.md#accountPrototypeExistsRoles) | **HEAD** Accounts/{id}/roles/rel/{fk} | Check the existence of roles relation to an item by id.
[**accountPrototypeFindByIdAccessTokens**](AccountApi.md#accountPrototypeFindByIdAccessTokens) | **GET** Accounts/{id}/accessTokens/{fk} | Find a related item by id for accessTokens.
[**accountPrototypeFindByIdRoles**](AccountApi.md#accountPrototypeFindByIdRoles) | **GET** Accounts/{id}/roles/{fk} | Find a related item by id for roles.
[**accountPrototypeGetAccessTokens**](AccountApi.md#accountPrototypeGetAccessTokens) | **GET** Accounts/{id}/accessTokens | Queries accessTokens of Account.
[**accountPrototypeGetRoles**](AccountApi.md#accountPrototypeGetRoles) | **GET** Accounts/{id}/roles | Queries roles of Account.
[**accountPrototypeLinkRoles**](AccountApi.md#accountPrototypeLinkRoles) | **PUT** Accounts/{id}/roles/rel/{fk} | Add a related item by id for roles.
[**accountPrototypePatchAttributes**](AccountApi.md#accountPrototypePatchAttributes) | **PATCH** Accounts/{id} | Patch attributes for a model instance and persist it into the data source.
[**accountPrototypeUnlinkRoles**](AccountApi.md#accountPrototypeUnlinkRoles) | **DELETE** Accounts/{id}/roles/rel/{fk} | Remove the roles relation to an item by id.
[**accountPrototypeUpdateByIdAccessTokens**](AccountApi.md#accountPrototypeUpdateByIdAccessTokens) | **PUT** Accounts/{id}/accessTokens/{fk} | Update a related item by id for accessTokens.
[**accountPrototypeUpdateByIdRoles**](AccountApi.md#accountPrototypeUpdateByIdRoles) | **PUT** Accounts/{id}/roles/{fk} | Update a related item by id for roles.
[**accountPrototypeVerify**](AccountApi.md#accountPrototypeVerify) | **POST** Accounts/{id}/verify | Trigger user&#39;s identity verification with configured verifyOptions
[**accountReplaceByIdPostAccountsidReplace**](AccountApi.md#accountReplaceByIdPostAccountsidReplace) | **POST** Accounts/{id}/replace | Replace attributes for a model instance and persist it into the data source.
[**accountReplaceByIdPutAccountsid**](AccountApi.md#accountReplaceByIdPutAccountsid) | **PUT** Accounts/{id} | Replace attributes for a model instance and persist it into the data source.
[**accountReplaceOrCreatePostAccountsReplaceOrCreate**](AccountApi.md#accountReplaceOrCreatePostAccountsReplaceOrCreate) | **POST** Accounts/replaceOrCreate | Replace an existing model instance or insert a new one into the data source.
[**accountReplaceOrCreatePutAccounts**](AccountApi.md#accountReplaceOrCreatePutAccounts) | **PUT** Accounts | Replace an existing model instance or insert a new one into the data source.
[**accountResetPassword**](AccountApi.md#accountResetPassword) | **POST** Accounts/reset | Reset password for a user with email.
[**accountSetPassword**](AccountApi.md#accountSetPassword) | **POST** Accounts/reset-password | Reset user&#39;s password via a password-reset token.
[**accountUpdateAll**](AccountApi.md#accountUpdateAll) | **POST** Accounts/update | Update instances of the model matched by {{where}} from the data source.
[**accountUpsertWithWhere**](AccountApi.md#accountUpsertWithWhere) | **POST** Accounts/upsertWithWhere | Update an existing model instance or insert a new one into the data source based on the where criteria.


<a name="accountChangePassword"></a>
# **accountChangePassword**
> Void accountChangePassword(oldPassword, newPassword)

Change a user&#39;s password.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String oldPassword = "oldPassword_example"; // String | 
String newPassword = "newPassword_example"; // String | 
try {
    Void result = apiInstance.accountChangePassword(oldPassword, newPassword);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountChangePassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oldPassword** | **String**|  |
 **newPassword** | **String**|  |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountConfirm"></a>
# **accountConfirm**
> Void accountConfirm(uid, token, redirect)

Confirm a user registration with identity verification token.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String uid = "uid_example"; // String | 
String token = "token_example"; // String | 
String redirect = "redirect_example"; // String | 
try {
    Void result = apiInstance.accountConfirm(uid, token, redirect);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountConfirm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **String**|  |
 **token** | **String**|  |
 **redirect** | **String**|  | [optional]

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountCount"></a>
# **accountCount**
> InlineResponse2002 accountCount(where)

Count instances of the model matched by where from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse2002 result = apiInstance.accountCount(where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountCreate"></a>
# **accountCreate**
> Account accountCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
Account data = new Account(); // Account | Model instance data
try {
    Account result = apiInstance.accountCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Account**](Account.md)| Model instance data | [optional]

### Return type

[**Account**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountCreateChangeStreamGetAccountsChangeStream"></a>
# **accountCreateChangeStreamGetAccountsChangeStream**
> File accountCreateChangeStreamGetAccountsChangeStream(options)

Create a change stream.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String options = "options_example"; // String | 
try {
    File result = apiInstance.accountCreateChangeStreamGetAccountsChangeStream(options);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountCreateChangeStreamGetAccountsChangeStream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **options** | **String**|  | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountCreateChangeStreamPostAccountsChangeStream"></a>
# **accountCreateChangeStreamPostAccountsChangeStream**
> File accountCreateChangeStreamPostAccountsChangeStream(options)

Create a change stream.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String options = "options_example"; // String | 
try {
    File result = apiInstance.accountCreateChangeStreamPostAccountsChangeStream(options);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountCreateChangeStreamPostAccountsChangeStream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **options** | **String**|  | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountDeleteById"></a>
# **accountDeleteById**
> Object accountDeleteById(id)

Delete a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String id = "id_example"; // String | Model id
try {
    Object result = apiInstance.accountDeleteById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountDeleteById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountExistsGetAccountsidExists"></a>
# **accountExistsGetAccountsidExists**
> InlineResponse200 accountExistsGetAccountsidExists(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.accountExistsGetAccountsidExists(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountExistsGetAccountsidExists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountExistsHeadAccountsid"></a>
# **accountExistsHeadAccountsid**
> InlineResponse200 accountExistsHeadAccountsid(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.accountExistsHeadAccountsid(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountExistsHeadAccountsid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountFind"></a>
# **accountFind**
> List&lt;Account&gt; accountFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<Account> result = apiInstance.accountFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;Account&gt;**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountFindById"></a>
# **accountFindById**
> Account accountFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Account result = apiInstance.accountFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Account**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountFindOne"></a>
# **accountFindOne**
> Account accountFindOne(filter)

Find first instance of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Account result = apiInstance.accountFindOne(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountFindOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Account**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountLogin"></a>
# **accountLogin**
> Object accountLogin(credentials, include)

Login a user with username/email and password.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
Object credentials = null; // Object | 
String include = "include_example"; // String | Related objects to include in the response. See the description of return value for more details.
try {
    Object result = apiInstance.accountLogin(credentials, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountLogin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **credentials** | **Object**|  |
 **include** | **String**| Related objects to include in the response. See the description of return value for more details. | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountLogout"></a>
# **accountLogout**
> Void accountLogout()

Logout a user with access token.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
try {
    Void result = apiInstance.accountLogout();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountLogout");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountPatchOrCreate"></a>
# **accountPatchOrCreate**
> Account accountPatchOrCreate(data)

Patch an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
Account data = new Account(); // Account | Model instance data
try {
    Account result = apiInstance.accountPatchOrCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountPatchOrCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Account**](Account.md)| Model instance data | [optional]

### Return type

[**Account**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountPrototypeCountAccessTokens"></a>
# **accountPrototypeCountAccessTokens**
> InlineResponse2002 accountPrototypeCountAccessTokens(id, where)

Counts accessTokens of Account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String id = "id_example"; // String | Account id
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse2002 result = apiInstance.accountPrototypeCountAccessTokens(id, where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountPrototypeCountAccessTokens");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Account id |
 **where** | **String**| Criteria to match model instances | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountPrototypeCountRoles"></a>
# **accountPrototypeCountRoles**
> InlineResponse2002 accountPrototypeCountRoles(id, where)

Counts roles of Account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String id = "id_example"; // String | Account id
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse2002 result = apiInstance.accountPrototypeCountRoles(id, where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountPrototypeCountRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Account id |
 **where** | **String**| Criteria to match model instances | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountPrototypeCreateAccessTokens"></a>
# **accountPrototypeCreateAccessTokens**
> AccountAccessToken accountPrototypeCreateAccessTokens(id, data)

Creates a new instance in accessTokens of this model.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String id = "id_example"; // String | Account id
AccountAccessToken data = new AccountAccessToken(); // AccountAccessToken | 
try {
    AccountAccessToken result = apiInstance.accountPrototypeCreateAccessTokens(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountPrototypeCreateAccessTokens");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Account id |
 **data** | [**AccountAccessToken**](AccountAccessToken.md)|  | [optional]

### Return type

[**AccountAccessToken**](AccountAccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountPrototypeCreateRoles"></a>
# **accountPrototypeCreateRoles**
> Role accountPrototypeCreateRoles(id, data)

Creates a new instance in roles of this model.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String id = "id_example"; // String | Account id
Role data = new Role(); // Role | 
try {
    Role result = apiInstance.accountPrototypeCreateRoles(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountPrototypeCreateRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Account id |
 **data** | [**Role**](Role.md)|  | [optional]

### Return type

[**Role**](Role.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountPrototypeDeleteAccessTokens"></a>
# **accountPrototypeDeleteAccessTokens**
> Void accountPrototypeDeleteAccessTokens(id)

Deletes all accessTokens of this model.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String id = "id_example"; // String | Account id
try {
    Void result = apiInstance.accountPrototypeDeleteAccessTokens(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountPrototypeDeleteAccessTokens");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Account id |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountPrototypeDeleteRoles"></a>
# **accountPrototypeDeleteRoles**
> Void accountPrototypeDeleteRoles(id)

Deletes all roles of this model.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String id = "id_example"; // String | Account id
try {
    Void result = apiInstance.accountPrototypeDeleteRoles(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountPrototypeDeleteRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Account id |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountPrototypeDestroyByIdAccessTokens"></a>
# **accountPrototypeDestroyByIdAccessTokens**
> Void accountPrototypeDestroyByIdAccessTokens(id, fk)

Delete a related item by id for accessTokens.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String id = "id_example"; // String | Account id
String fk = "fk_example"; // String | Foreign key for accessTokens
try {
    Void result = apiInstance.accountPrototypeDestroyByIdAccessTokens(id, fk);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountPrototypeDestroyByIdAccessTokens");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Account id |
 **fk** | **String**| Foreign key for accessTokens |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountPrototypeDestroyByIdRoles"></a>
# **accountPrototypeDestroyByIdRoles**
> Void accountPrototypeDestroyByIdRoles(id, fk)

Delete a related item by id for roles.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String id = "id_example"; // String | Account id
String fk = "fk_example"; // String | Foreign key for roles
try {
    Void result = apiInstance.accountPrototypeDestroyByIdRoles(id, fk);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountPrototypeDestroyByIdRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Account id |
 **fk** | **String**| Foreign key for roles |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountPrototypeExistsRoles"></a>
# **accountPrototypeExistsRoles**
> Boolean accountPrototypeExistsRoles(id, fk)

Check the existence of roles relation to an item by id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String id = "id_example"; // String | Account id
String fk = "fk_example"; // String | Foreign key for roles
try {
    Boolean result = apiInstance.accountPrototypeExistsRoles(id, fk);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountPrototypeExistsRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Account id |
 **fk** | **String**| Foreign key for roles |

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountPrototypeFindByIdAccessTokens"></a>
# **accountPrototypeFindByIdAccessTokens**
> AccountAccessToken accountPrototypeFindByIdAccessTokens(id, fk)

Find a related item by id for accessTokens.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String id = "id_example"; // String | Account id
String fk = "fk_example"; // String | Foreign key for accessTokens
try {
    AccountAccessToken result = apiInstance.accountPrototypeFindByIdAccessTokens(id, fk);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountPrototypeFindByIdAccessTokens");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Account id |
 **fk** | **String**| Foreign key for accessTokens |

### Return type

[**AccountAccessToken**](AccountAccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountPrototypeFindByIdRoles"></a>
# **accountPrototypeFindByIdRoles**
> Role accountPrototypeFindByIdRoles(id, fk)

Find a related item by id for roles.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String id = "id_example"; // String | Account id
String fk = "fk_example"; // String | Foreign key for roles
try {
    Role result = apiInstance.accountPrototypeFindByIdRoles(id, fk);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountPrototypeFindByIdRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Account id |
 **fk** | **String**| Foreign key for roles |

### Return type

[**Role**](Role.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountPrototypeGetAccessTokens"></a>
# **accountPrototypeGetAccessTokens**
> List&lt;AccountAccessToken&gt; accountPrototypeGetAccessTokens(id, filter)

Queries accessTokens of Account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String id = "id_example"; // String | Account id
String filter = "filter_example"; // String | 
try {
    List<AccountAccessToken> result = apiInstance.accountPrototypeGetAccessTokens(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountPrototypeGetAccessTokens");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Account id |
 **filter** | **String**|  | [optional]

### Return type

[**List&lt;AccountAccessToken&gt;**](AccountAccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountPrototypeGetRoles"></a>
# **accountPrototypeGetRoles**
> List&lt;Role&gt; accountPrototypeGetRoles(id, filter)

Queries roles of Account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String id = "id_example"; // String | Account id
String filter = "filter_example"; // String | 
try {
    List<Role> result = apiInstance.accountPrototypeGetRoles(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountPrototypeGetRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Account id |
 **filter** | **String**|  | [optional]

### Return type

[**List&lt;Role&gt;**](Role.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountPrototypeLinkRoles"></a>
# **accountPrototypeLinkRoles**
> RoleMapping accountPrototypeLinkRoles(id, fk, data)

Add a related item by id for roles.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String id = "id_example"; // String | Account id
String fk = "fk_example"; // String | Foreign key for roles
RoleMapping data = new RoleMapping(); // RoleMapping | 
try {
    RoleMapping result = apiInstance.accountPrototypeLinkRoles(id, fk, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountPrototypeLinkRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Account id |
 **fk** | **String**| Foreign key for roles |
 **data** | [**RoleMapping**](RoleMapping.md)|  | [optional]

### Return type

[**RoleMapping**](RoleMapping.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountPrototypePatchAttributes"></a>
# **accountPrototypePatchAttributes**
> Account accountPrototypePatchAttributes(id, data)

Patch attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String id = "id_example"; // String | Account id
Account data = new Account(); // Account | An object of model property name/value pairs
try {
    Account result = apiInstance.accountPrototypePatchAttributes(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountPrototypePatchAttributes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Account id |
 **data** | [**Account**](Account.md)| An object of model property name/value pairs | [optional]

### Return type

[**Account**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountPrototypeUnlinkRoles"></a>
# **accountPrototypeUnlinkRoles**
> Void accountPrototypeUnlinkRoles(id, fk)

Remove the roles relation to an item by id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String id = "id_example"; // String | Account id
String fk = "fk_example"; // String | Foreign key for roles
try {
    Void result = apiInstance.accountPrototypeUnlinkRoles(id, fk);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountPrototypeUnlinkRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Account id |
 **fk** | **String**| Foreign key for roles |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountPrototypeUpdateByIdAccessTokens"></a>
# **accountPrototypeUpdateByIdAccessTokens**
> AccountAccessToken accountPrototypeUpdateByIdAccessTokens(id, fk, data)

Update a related item by id for accessTokens.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String id = "id_example"; // String | Account id
String fk = "fk_example"; // String | Foreign key for accessTokens
AccountAccessToken data = new AccountAccessToken(); // AccountAccessToken | 
try {
    AccountAccessToken result = apiInstance.accountPrototypeUpdateByIdAccessTokens(id, fk, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountPrototypeUpdateByIdAccessTokens");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Account id |
 **fk** | **String**| Foreign key for accessTokens |
 **data** | [**AccountAccessToken**](AccountAccessToken.md)|  | [optional]

### Return type

[**AccountAccessToken**](AccountAccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountPrototypeUpdateByIdRoles"></a>
# **accountPrototypeUpdateByIdRoles**
> Role accountPrototypeUpdateByIdRoles(id, fk, data)

Update a related item by id for roles.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String id = "id_example"; // String | Account id
String fk = "fk_example"; // String | Foreign key for roles
Role data = new Role(); // Role | 
try {
    Role result = apiInstance.accountPrototypeUpdateByIdRoles(id, fk, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountPrototypeUpdateByIdRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Account id |
 **fk** | **String**| Foreign key for roles |
 **data** | [**Role**](Role.md)|  | [optional]

### Return type

[**Role**](Role.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountPrototypeVerify"></a>
# **accountPrototypeVerify**
> Void accountPrototypeVerify(id)

Trigger user&#39;s identity verification with configured verifyOptions

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String id = "id_example"; // String | Account id
try {
    Void result = apiInstance.accountPrototypeVerify(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountPrototypeVerify");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Account id |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountReplaceByIdPostAccountsidReplace"></a>
# **accountReplaceByIdPostAccountsidReplace**
> Account accountReplaceByIdPostAccountsidReplace(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String id = "id_example"; // String | Model id
Account data = new Account(); // Account | Model instance data
try {
    Account result = apiInstance.accountReplaceByIdPostAccountsidReplace(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountReplaceByIdPostAccountsidReplace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**Account**](Account.md)| Model instance data | [optional]

### Return type

[**Account**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountReplaceByIdPutAccountsid"></a>
# **accountReplaceByIdPutAccountsid**
> Account accountReplaceByIdPutAccountsid(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String id = "id_example"; // String | Model id
Account data = new Account(); // Account | Model instance data
try {
    Account result = apiInstance.accountReplaceByIdPutAccountsid(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountReplaceByIdPutAccountsid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**Account**](Account.md)| Model instance data | [optional]

### Return type

[**Account**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountReplaceOrCreatePostAccountsReplaceOrCreate"></a>
# **accountReplaceOrCreatePostAccountsReplaceOrCreate**
> Account accountReplaceOrCreatePostAccountsReplaceOrCreate(data)

Replace an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
Account data = new Account(); // Account | Model instance data
try {
    Account result = apiInstance.accountReplaceOrCreatePostAccountsReplaceOrCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountReplaceOrCreatePostAccountsReplaceOrCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Account**](Account.md)| Model instance data | [optional]

### Return type

[**Account**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountReplaceOrCreatePutAccounts"></a>
# **accountReplaceOrCreatePutAccounts**
> Account accountReplaceOrCreatePutAccounts(data)

Replace an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
Account data = new Account(); // Account | Model instance data
try {
    Account result = apiInstance.accountReplaceOrCreatePutAccounts(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountReplaceOrCreatePutAccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Account**](Account.md)| Model instance data | [optional]

### Return type

[**Account**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountResetPassword"></a>
# **accountResetPassword**
> Void accountResetPassword(options)

Reset password for a user with email.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
Object options = null; // Object | 
try {
    Void result = apiInstance.accountResetPassword(options);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountResetPassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **options** | **Object**|  |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountSetPassword"></a>
# **accountSetPassword**
> Void accountSetPassword(newPassword)

Reset user&#39;s password via a password-reset token.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String newPassword = "newPassword_example"; // String | 
try {
    Void result = apiInstance.accountSetPassword(newPassword);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountSetPassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **newPassword** | **String**|  |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountUpdateAll"></a>
# **accountUpdateAll**
> InlineResponse2001 accountUpdateAll(where, data)

Update instances of the model matched by {{where}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String where = "where_example"; // String | Criteria to match model instances
Account data = new Account(); // Account | An object of model property name/value pairs
try {
    InlineResponse2001 result = apiInstance.accountUpdateAll(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountUpdateAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**Account**](Account.md)| An object of model property name/value pairs | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountUpsertWithWhere"></a>
# **accountUpsertWithWhere**
> Account accountUpsertWithWhere(where, data)

Update an existing model instance or insert a new one into the data source based on the where criteria.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String where = "where_example"; // String | Criteria to match model instances
Account data = new Account(); // Account | An object of model property name/value pairs
try {
    Account result = apiInstance.accountUpsertWithWhere(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountUpsertWithWhere");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**Account**](Account.md)| An object of model property name/value pairs | [optional]

### Return type

[**Account**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


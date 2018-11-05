# AccountAccessTokenApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountAccessTokenCount**](AccountAccessTokenApi.md#accountAccessTokenCount) | **GET** AccountAccessTokens/count | Count instances of the model matched by where from the data source.
[**accountAccessTokenCreate**](AccountAccessTokenApi.md#accountAccessTokenCreate) | **POST** AccountAccessTokens | Create a new instance of the model and persist it into the data source.
[**accountAccessTokenCreateChangeStreamGetAccountAccessTokensChangeStream**](AccountAccessTokenApi.md#accountAccessTokenCreateChangeStreamGetAccountAccessTokensChangeStream) | **GET** AccountAccessTokens/change-stream | Create a change stream.
[**accountAccessTokenCreateChangeStreamPostAccountAccessTokensChangeStream**](AccountAccessTokenApi.md#accountAccessTokenCreateChangeStreamPostAccountAccessTokensChangeStream) | **POST** AccountAccessTokens/change-stream | Create a change stream.
[**accountAccessTokenDeleteById**](AccountAccessTokenApi.md#accountAccessTokenDeleteById) | **DELETE** AccountAccessTokens/{id} | Delete a model instance by {{id}} from the data source.
[**accountAccessTokenExistsGetAccountAccessTokensidExists**](AccountAccessTokenApi.md#accountAccessTokenExistsGetAccountAccessTokensidExists) | **GET** AccountAccessTokens/{id}/exists | Check whether a model instance exists in the data source.
[**accountAccessTokenExistsHeadAccountAccessTokensid**](AccountAccessTokenApi.md#accountAccessTokenExistsHeadAccountAccessTokensid) | **HEAD** AccountAccessTokens/{id} | Check whether a model instance exists in the data source.
[**accountAccessTokenFind**](AccountAccessTokenApi.md#accountAccessTokenFind) | **GET** AccountAccessTokens | Find all instances of the model matched by filter from the data source.
[**accountAccessTokenFindById**](AccountAccessTokenApi.md#accountAccessTokenFindById) | **GET** AccountAccessTokens/{id} | Find a model instance by {{id}} from the data source.
[**accountAccessTokenFindOne**](AccountAccessTokenApi.md#accountAccessTokenFindOne) | **GET** AccountAccessTokens/findOne | Find first instance of the model matched by filter from the data source.
[**accountAccessTokenPatchOrCreate**](AccountAccessTokenApi.md#accountAccessTokenPatchOrCreate) | **PATCH** AccountAccessTokens | Patch an existing model instance or insert a new one into the data source.
[**accountAccessTokenPrototypeGetUser**](AccountAccessTokenApi.md#accountAccessTokenPrototypeGetUser) | **GET** AccountAccessTokens/{id}/user | Fetches belongsTo relation user.
[**accountAccessTokenPrototypePatchAttributes**](AccountAccessTokenApi.md#accountAccessTokenPrototypePatchAttributes) | **PATCH** AccountAccessTokens/{id} | Patch attributes for a model instance and persist it into the data source.
[**accountAccessTokenReplaceByIdPostAccountAccessTokensidReplace**](AccountAccessTokenApi.md#accountAccessTokenReplaceByIdPostAccountAccessTokensidReplace) | **POST** AccountAccessTokens/{id}/replace | Replace attributes for a model instance and persist it into the data source.
[**accountAccessTokenReplaceByIdPutAccountAccessTokensid**](AccountAccessTokenApi.md#accountAccessTokenReplaceByIdPutAccountAccessTokensid) | **PUT** AccountAccessTokens/{id} | Replace attributes for a model instance and persist it into the data source.
[**accountAccessTokenReplaceOrCreatePostAccountAccessTokensReplaceOrCreate**](AccountAccessTokenApi.md#accountAccessTokenReplaceOrCreatePostAccountAccessTokensReplaceOrCreate) | **POST** AccountAccessTokens/replaceOrCreate | Replace an existing model instance or insert a new one into the data source.
[**accountAccessTokenReplaceOrCreatePutAccountAccessTokens**](AccountAccessTokenApi.md#accountAccessTokenReplaceOrCreatePutAccountAccessTokens) | **PUT** AccountAccessTokens | Replace an existing model instance or insert a new one into the data source.
[**accountAccessTokenUpdateAll**](AccountAccessTokenApi.md#accountAccessTokenUpdateAll) | **POST** AccountAccessTokens/update | Update instances of the model matched by {{where}} from the data source.
[**accountAccessTokenUpsertWithWhere**](AccountAccessTokenApi.md#accountAccessTokenUpsertWithWhere) | **POST** AccountAccessTokens/upsertWithWhere | Update an existing model instance or insert a new one into the data source based on the where criteria.


<a name="accountAccessTokenCount"></a>
# **accountAccessTokenCount**
> InlineResponse2002 accountAccessTokenCount(where)

Count instances of the model matched by where from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountAccessTokenApi;


AccountAccessTokenApi apiInstance = new AccountAccessTokenApi();
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse2002 result = apiInstance.accountAccessTokenCount(where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountAccessTokenApi#accountAccessTokenCount");
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

<a name="accountAccessTokenCreate"></a>
# **accountAccessTokenCreate**
> AccountAccessToken accountAccessTokenCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountAccessTokenApi;


AccountAccessTokenApi apiInstance = new AccountAccessTokenApi();
AccountAccessToken data = new AccountAccessToken(); // AccountAccessToken | Model instance data
try {
    AccountAccessToken result = apiInstance.accountAccessTokenCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountAccessTokenApi#accountAccessTokenCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**AccountAccessToken**](AccountAccessToken.md)| Model instance data | [optional]

### Return type

[**AccountAccessToken**](AccountAccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountAccessTokenCreateChangeStreamGetAccountAccessTokensChangeStream"></a>
# **accountAccessTokenCreateChangeStreamGetAccountAccessTokensChangeStream**
> File accountAccessTokenCreateChangeStreamGetAccountAccessTokensChangeStream(options)

Create a change stream.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountAccessTokenApi;


AccountAccessTokenApi apiInstance = new AccountAccessTokenApi();
String options = "options_example"; // String | 
try {
    File result = apiInstance.accountAccessTokenCreateChangeStreamGetAccountAccessTokensChangeStream(options);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountAccessTokenApi#accountAccessTokenCreateChangeStreamGetAccountAccessTokensChangeStream");
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

<a name="accountAccessTokenCreateChangeStreamPostAccountAccessTokensChangeStream"></a>
# **accountAccessTokenCreateChangeStreamPostAccountAccessTokensChangeStream**
> File accountAccessTokenCreateChangeStreamPostAccountAccessTokensChangeStream(options)

Create a change stream.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountAccessTokenApi;


AccountAccessTokenApi apiInstance = new AccountAccessTokenApi();
String options = "options_example"; // String | 
try {
    File result = apiInstance.accountAccessTokenCreateChangeStreamPostAccountAccessTokensChangeStream(options);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountAccessTokenApi#accountAccessTokenCreateChangeStreamPostAccountAccessTokensChangeStream");
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

<a name="accountAccessTokenDeleteById"></a>
# **accountAccessTokenDeleteById**
> Object accountAccessTokenDeleteById(id)

Delete a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountAccessTokenApi;


AccountAccessTokenApi apiInstance = new AccountAccessTokenApi();
String id = "id_example"; // String | Model id
try {
    Object result = apiInstance.accountAccessTokenDeleteById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountAccessTokenApi#accountAccessTokenDeleteById");
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

<a name="accountAccessTokenExistsGetAccountAccessTokensidExists"></a>
# **accountAccessTokenExistsGetAccountAccessTokensidExists**
> InlineResponse200 accountAccessTokenExistsGetAccountAccessTokensidExists(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountAccessTokenApi;


AccountAccessTokenApi apiInstance = new AccountAccessTokenApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.accountAccessTokenExistsGetAccountAccessTokensidExists(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountAccessTokenApi#accountAccessTokenExistsGetAccountAccessTokensidExists");
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

<a name="accountAccessTokenExistsHeadAccountAccessTokensid"></a>
# **accountAccessTokenExistsHeadAccountAccessTokensid**
> InlineResponse200 accountAccessTokenExistsHeadAccountAccessTokensid(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountAccessTokenApi;


AccountAccessTokenApi apiInstance = new AccountAccessTokenApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.accountAccessTokenExistsHeadAccountAccessTokensid(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountAccessTokenApi#accountAccessTokenExistsHeadAccountAccessTokensid");
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

<a name="accountAccessTokenFind"></a>
# **accountAccessTokenFind**
> List&lt;AccountAccessToken&gt; accountAccessTokenFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountAccessTokenApi;


AccountAccessTokenApi apiInstance = new AccountAccessTokenApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<AccountAccessToken> result = apiInstance.accountAccessTokenFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountAccessTokenApi#accountAccessTokenFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;AccountAccessToken&gt;**](AccountAccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountAccessTokenFindById"></a>
# **accountAccessTokenFindById**
> AccountAccessToken accountAccessTokenFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountAccessTokenApi;


AccountAccessTokenApi apiInstance = new AccountAccessTokenApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    AccountAccessToken result = apiInstance.accountAccessTokenFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountAccessTokenApi#accountAccessTokenFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**AccountAccessToken**](AccountAccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountAccessTokenFindOne"></a>
# **accountAccessTokenFindOne**
> AccountAccessToken accountAccessTokenFindOne(filter)

Find first instance of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountAccessTokenApi;


AccountAccessTokenApi apiInstance = new AccountAccessTokenApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    AccountAccessToken result = apiInstance.accountAccessTokenFindOne(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountAccessTokenApi#accountAccessTokenFindOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**AccountAccessToken**](AccountAccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountAccessTokenPatchOrCreate"></a>
# **accountAccessTokenPatchOrCreate**
> AccountAccessToken accountAccessTokenPatchOrCreate(data)

Patch an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountAccessTokenApi;


AccountAccessTokenApi apiInstance = new AccountAccessTokenApi();
AccountAccessToken data = new AccountAccessToken(); // AccountAccessToken | Model instance data
try {
    AccountAccessToken result = apiInstance.accountAccessTokenPatchOrCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountAccessTokenApi#accountAccessTokenPatchOrCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**AccountAccessToken**](AccountAccessToken.md)| Model instance data | [optional]

### Return type

[**AccountAccessToken**](AccountAccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountAccessTokenPrototypeGetUser"></a>
# **accountAccessTokenPrototypeGetUser**
> Account accountAccessTokenPrototypeGetUser(id, refresh)

Fetches belongsTo relation user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountAccessTokenApi;


AccountAccessTokenApi apiInstance = new AccountAccessTokenApi();
String id = "id_example"; // String | AccountAccessToken id
Boolean refresh = true; // Boolean | 
try {
    Account result = apiInstance.accountAccessTokenPrototypeGetUser(id, refresh);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountAccessTokenApi#accountAccessTokenPrototypeGetUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| AccountAccessToken id |
 **refresh** | **Boolean**|  | [optional]

### Return type

[**Account**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountAccessTokenPrototypePatchAttributes"></a>
# **accountAccessTokenPrototypePatchAttributes**
> AccountAccessToken accountAccessTokenPrototypePatchAttributes(id, data)

Patch attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountAccessTokenApi;


AccountAccessTokenApi apiInstance = new AccountAccessTokenApi();
String id = "id_example"; // String | AccountAccessToken id
AccountAccessToken data = new AccountAccessToken(); // AccountAccessToken | An object of model property name/value pairs
try {
    AccountAccessToken result = apiInstance.accountAccessTokenPrototypePatchAttributes(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountAccessTokenApi#accountAccessTokenPrototypePatchAttributes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| AccountAccessToken id |
 **data** | [**AccountAccessToken**](AccountAccessToken.md)| An object of model property name/value pairs | [optional]

### Return type

[**AccountAccessToken**](AccountAccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountAccessTokenReplaceByIdPostAccountAccessTokensidReplace"></a>
# **accountAccessTokenReplaceByIdPostAccountAccessTokensidReplace**
> AccountAccessToken accountAccessTokenReplaceByIdPostAccountAccessTokensidReplace(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountAccessTokenApi;


AccountAccessTokenApi apiInstance = new AccountAccessTokenApi();
String id = "id_example"; // String | Model id
AccountAccessToken data = new AccountAccessToken(); // AccountAccessToken | Model instance data
try {
    AccountAccessToken result = apiInstance.accountAccessTokenReplaceByIdPostAccountAccessTokensidReplace(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountAccessTokenApi#accountAccessTokenReplaceByIdPostAccountAccessTokensidReplace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**AccountAccessToken**](AccountAccessToken.md)| Model instance data | [optional]

### Return type

[**AccountAccessToken**](AccountAccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountAccessTokenReplaceByIdPutAccountAccessTokensid"></a>
# **accountAccessTokenReplaceByIdPutAccountAccessTokensid**
> AccountAccessToken accountAccessTokenReplaceByIdPutAccountAccessTokensid(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountAccessTokenApi;


AccountAccessTokenApi apiInstance = new AccountAccessTokenApi();
String id = "id_example"; // String | Model id
AccountAccessToken data = new AccountAccessToken(); // AccountAccessToken | Model instance data
try {
    AccountAccessToken result = apiInstance.accountAccessTokenReplaceByIdPutAccountAccessTokensid(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountAccessTokenApi#accountAccessTokenReplaceByIdPutAccountAccessTokensid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**AccountAccessToken**](AccountAccessToken.md)| Model instance data | [optional]

### Return type

[**AccountAccessToken**](AccountAccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountAccessTokenReplaceOrCreatePostAccountAccessTokensReplaceOrCreate"></a>
# **accountAccessTokenReplaceOrCreatePostAccountAccessTokensReplaceOrCreate**
> AccountAccessToken accountAccessTokenReplaceOrCreatePostAccountAccessTokensReplaceOrCreate(data)

Replace an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountAccessTokenApi;


AccountAccessTokenApi apiInstance = new AccountAccessTokenApi();
AccountAccessToken data = new AccountAccessToken(); // AccountAccessToken | Model instance data
try {
    AccountAccessToken result = apiInstance.accountAccessTokenReplaceOrCreatePostAccountAccessTokensReplaceOrCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountAccessTokenApi#accountAccessTokenReplaceOrCreatePostAccountAccessTokensReplaceOrCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**AccountAccessToken**](AccountAccessToken.md)| Model instance data | [optional]

### Return type

[**AccountAccessToken**](AccountAccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountAccessTokenReplaceOrCreatePutAccountAccessTokens"></a>
# **accountAccessTokenReplaceOrCreatePutAccountAccessTokens**
> AccountAccessToken accountAccessTokenReplaceOrCreatePutAccountAccessTokens(data)

Replace an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountAccessTokenApi;


AccountAccessTokenApi apiInstance = new AccountAccessTokenApi();
AccountAccessToken data = new AccountAccessToken(); // AccountAccessToken | Model instance data
try {
    AccountAccessToken result = apiInstance.accountAccessTokenReplaceOrCreatePutAccountAccessTokens(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountAccessTokenApi#accountAccessTokenReplaceOrCreatePutAccountAccessTokens");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**AccountAccessToken**](AccountAccessToken.md)| Model instance data | [optional]

### Return type

[**AccountAccessToken**](AccountAccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountAccessTokenUpdateAll"></a>
# **accountAccessTokenUpdateAll**
> InlineResponse2001 accountAccessTokenUpdateAll(where, data)

Update instances of the model matched by {{where}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountAccessTokenApi;


AccountAccessTokenApi apiInstance = new AccountAccessTokenApi();
String where = "where_example"; // String | Criteria to match model instances
AccountAccessToken data = new AccountAccessToken(); // AccountAccessToken | An object of model property name/value pairs
try {
    InlineResponse2001 result = apiInstance.accountAccessTokenUpdateAll(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountAccessTokenApi#accountAccessTokenUpdateAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**AccountAccessToken**](AccountAccessToken.md)| An object of model property name/value pairs | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="accountAccessTokenUpsertWithWhere"></a>
# **accountAccessTokenUpsertWithWhere**
> AccountAccessToken accountAccessTokenUpsertWithWhere(where, data)

Update an existing model instance or insert a new one into the data source based on the where criteria.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountAccessTokenApi;


AccountAccessTokenApi apiInstance = new AccountAccessTokenApi();
String where = "where_example"; // String | Criteria to match model instances
AccountAccessToken data = new AccountAccessToken(); // AccountAccessToken | An object of model property name/value pairs
try {
    AccountAccessToken result = apiInstance.accountAccessTokenUpsertWithWhere(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountAccessTokenApi#accountAccessTokenUpsertWithWhere");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**AccountAccessToken**](AccountAccessToken.md)| An object of model property name/value pairs | [optional]

### Return type

[**AccountAccessToken**](AccountAccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


# InstallationApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**installationCount**](InstallationApi.md#installationCount) | **GET** Installations/count | Count instances of the model matched by where from the data source.
[**installationCreate**](InstallationApi.md#installationCreate) | **POST** Installations | Create a new instance of the model and persist it into the data source.
[**installationCreateChangeStreamGetInstallationsChangeStream**](InstallationApi.md#installationCreateChangeStreamGetInstallationsChangeStream) | **GET** Installations/change-stream | Create a change stream.
[**installationCreateChangeStreamPostInstallationsChangeStream**](InstallationApi.md#installationCreateChangeStreamPostInstallationsChangeStream) | **POST** Installations/change-stream | Create a change stream.
[**installationDeleteById**](InstallationApi.md#installationDeleteById) | **DELETE** Installations/{id} | Delete a model instance by {{id}} from the data source.
[**installationExistsGetInstallationsidExists**](InstallationApi.md#installationExistsGetInstallationsidExists) | **GET** Installations/{id}/exists | Check whether a model instance exists in the data source.
[**installationExistsHeadInstallationsid**](InstallationApi.md#installationExistsHeadInstallationsid) | **HEAD** Installations/{id} | Check whether a model instance exists in the data source.
[**installationFind**](InstallationApi.md#installationFind) | **GET** Installations | Find all instances of the model matched by filter from the data source.
[**installationFindByApp**](InstallationApi.md#installationFindByApp) | **GET** Installations/byApp | Find installations by application id
[**installationFindById**](InstallationApi.md#installationFindById) | **GET** Installations/{id} | Find a model instance by {{id}} from the data source.
[**installationFindBySubscriptions**](InstallationApi.md#installationFindBySubscriptions) | **GET** Installations/bySubscriptions | Find installations by subscriptions
[**installationFindByUser**](InstallationApi.md#installationFindByUser) | **GET** Installations/byUser | Find installations by user id
[**installationFindOne**](InstallationApi.md#installationFindOne) | **GET** Installations/findOne | Find first instance of the model matched by filter from the data source.
[**installationPatchOrCreate**](InstallationApi.md#installationPatchOrCreate) | **PATCH** Installations | Patch an existing model instance or insert a new one into the data source.
[**installationPrototypePatchAttributes**](InstallationApi.md#installationPrototypePatchAttributes) | **PATCH** Installations/{id} | Patch attributes for a model instance and persist it into the data source.
[**installationReplaceByIdPostInstallationsidReplace**](InstallationApi.md#installationReplaceByIdPostInstallationsidReplace) | **POST** Installations/{id}/replace | Replace attributes for a model instance and persist it into the data source.
[**installationReplaceByIdPutInstallationsid**](InstallationApi.md#installationReplaceByIdPutInstallationsid) | **PUT** Installations/{id} | Replace attributes for a model instance and persist it into the data source.
[**installationReplaceOrCreatePostInstallationsReplaceOrCreate**](InstallationApi.md#installationReplaceOrCreatePostInstallationsReplaceOrCreate) | **POST** Installations/replaceOrCreate | Replace an existing model instance or insert a new one into the data source.
[**installationReplaceOrCreatePutInstallations**](InstallationApi.md#installationReplaceOrCreatePutInstallations) | **PUT** Installations | Replace an existing model instance or insert a new one into the data source.
[**installationUpdateAll**](InstallationApi.md#installationUpdateAll) | **POST** Installations/update | Update instances of the model matched by {{where}} from the data source.
[**installationUpsertWithWhere**](InstallationApi.md#installationUpsertWithWhere) | **POST** Installations/upsertWithWhere | Update an existing model instance or insert a new one into the data source based on the where criteria.


<a name="installationCount"></a>
# **installationCount**
> InlineResponse2002 installationCount(where)

Count instances of the model matched by where from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstallationApi;


InstallationApi apiInstance = new InstallationApi();
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse2002 result = apiInstance.installationCount(where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallationApi#installationCount");
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

<a name="installationCreate"></a>
# **installationCreate**
> Installation installationCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstallationApi;


InstallationApi apiInstance = new InstallationApi();
Installation data = new Installation(); // Installation | Model instance data
try {
    Installation result = apiInstance.installationCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallationApi#installationCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Installation**](Installation.md)| Model instance data | [optional]

### Return type

[**Installation**](Installation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="installationCreateChangeStreamGetInstallationsChangeStream"></a>
# **installationCreateChangeStreamGetInstallationsChangeStream**
> File installationCreateChangeStreamGetInstallationsChangeStream(options)

Create a change stream.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstallationApi;


InstallationApi apiInstance = new InstallationApi();
String options = "options_example"; // String | 
try {
    File result = apiInstance.installationCreateChangeStreamGetInstallationsChangeStream(options);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallationApi#installationCreateChangeStreamGetInstallationsChangeStream");
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

<a name="installationCreateChangeStreamPostInstallationsChangeStream"></a>
# **installationCreateChangeStreamPostInstallationsChangeStream**
> File installationCreateChangeStreamPostInstallationsChangeStream(options)

Create a change stream.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstallationApi;


InstallationApi apiInstance = new InstallationApi();
String options = "options_example"; // String | 
try {
    File result = apiInstance.installationCreateChangeStreamPostInstallationsChangeStream(options);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallationApi#installationCreateChangeStreamPostInstallationsChangeStream");
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

<a name="installationDeleteById"></a>
# **installationDeleteById**
> Object installationDeleteById(id)

Delete a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstallationApi;


InstallationApi apiInstance = new InstallationApi();
String id = "id_example"; // String | Model id
try {
    Object result = apiInstance.installationDeleteById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallationApi#installationDeleteById");
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

<a name="installationExistsGetInstallationsidExists"></a>
# **installationExistsGetInstallationsidExists**
> InlineResponse200 installationExistsGetInstallationsidExists(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstallationApi;


InstallationApi apiInstance = new InstallationApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.installationExistsGetInstallationsidExists(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallationApi#installationExistsGetInstallationsidExists");
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

<a name="installationExistsHeadInstallationsid"></a>
# **installationExistsHeadInstallationsid**
> InlineResponse200 installationExistsHeadInstallationsid(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstallationApi;


InstallationApi apiInstance = new InstallationApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.installationExistsHeadInstallationsid(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallationApi#installationExistsHeadInstallationsid");
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

<a name="installationFind"></a>
# **installationFind**
> List&lt;Installation&gt; installationFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstallationApi;


InstallationApi apiInstance = new InstallationApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<Installation> result = apiInstance.installationFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallationApi#installationFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;Installation&gt;**](Installation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="installationFindByApp"></a>
# **installationFindByApp**
> Object installationFindByApp(deviceType, appId, appVersion)

Find installations by application id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstallationApi;


InstallationApi apiInstance = new InstallationApi();
String deviceType = "deviceType_example"; // String | Device type
String appId = "appId_example"; // String | Application id
String appVersion = "appVersion_example"; // String | Application version
try {
    Object result = apiInstance.installationFindByApp(deviceType, appId, appVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallationApi#installationFindByApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceType** | **String**| Device type | [optional]
 **appId** | **String**| Application id | [optional]
 **appVersion** | **String**| Application version | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="installationFindById"></a>
# **installationFindById**
> Installation installationFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstallationApi;


InstallationApi apiInstance = new InstallationApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Installation result = apiInstance.installationFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallationApi#installationFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Installation**](Installation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="installationFindBySubscriptions"></a>
# **installationFindBySubscriptions**
> Object installationFindBySubscriptions(deviceType, subscriptions)

Find installations by subscriptions

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstallationApi;


InstallationApi apiInstance = new InstallationApi();
String deviceType = "deviceType_example"; // String | Device type
String subscriptions = "subscriptions_example"; // String | Subscriptions
try {
    Object result = apiInstance.installationFindBySubscriptions(deviceType, subscriptions);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallationApi#installationFindBySubscriptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceType** | **String**| Device type | [optional]
 **subscriptions** | **String**| Subscriptions | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="installationFindByUser"></a>
# **installationFindByUser**
> Object installationFindByUser(deviceType, userId)

Find installations by user id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstallationApi;


InstallationApi apiInstance = new InstallationApi();
String deviceType = "deviceType_example"; // String | Device type
String userId = "userId_example"; // String | User id
try {
    Object result = apiInstance.installationFindByUser(deviceType, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallationApi#installationFindByUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceType** | **String**| Device type | [optional]
 **userId** | **String**| User id | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="installationFindOne"></a>
# **installationFindOne**
> Installation installationFindOne(filter)

Find first instance of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstallationApi;


InstallationApi apiInstance = new InstallationApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Installation result = apiInstance.installationFindOne(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallationApi#installationFindOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Installation**](Installation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="installationPatchOrCreate"></a>
# **installationPatchOrCreate**
> Installation installationPatchOrCreate(data)

Patch an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstallationApi;


InstallationApi apiInstance = new InstallationApi();
Installation data = new Installation(); // Installation | Model instance data
try {
    Installation result = apiInstance.installationPatchOrCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallationApi#installationPatchOrCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Installation**](Installation.md)| Model instance data | [optional]

### Return type

[**Installation**](Installation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="installationPrototypePatchAttributes"></a>
# **installationPrototypePatchAttributes**
> Installation installationPrototypePatchAttributes(id, data)

Patch attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstallationApi;


InstallationApi apiInstance = new InstallationApi();
String id = "id_example"; // String | Installation id
Installation data = new Installation(); // Installation | An object of model property name/value pairs
try {
    Installation result = apiInstance.installationPrototypePatchAttributes(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallationApi#installationPrototypePatchAttributes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Installation id |
 **data** | [**Installation**](Installation.md)| An object of model property name/value pairs | [optional]

### Return type

[**Installation**](Installation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="installationReplaceByIdPostInstallationsidReplace"></a>
# **installationReplaceByIdPostInstallationsidReplace**
> Installation installationReplaceByIdPostInstallationsidReplace(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstallationApi;


InstallationApi apiInstance = new InstallationApi();
String id = "id_example"; // String | Model id
Installation data = new Installation(); // Installation | Model instance data
try {
    Installation result = apiInstance.installationReplaceByIdPostInstallationsidReplace(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallationApi#installationReplaceByIdPostInstallationsidReplace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**Installation**](Installation.md)| Model instance data | [optional]

### Return type

[**Installation**](Installation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="installationReplaceByIdPutInstallationsid"></a>
# **installationReplaceByIdPutInstallationsid**
> Installation installationReplaceByIdPutInstallationsid(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstallationApi;


InstallationApi apiInstance = new InstallationApi();
String id = "id_example"; // String | Model id
Installation data = new Installation(); // Installation | Model instance data
try {
    Installation result = apiInstance.installationReplaceByIdPutInstallationsid(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallationApi#installationReplaceByIdPutInstallationsid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**Installation**](Installation.md)| Model instance data | [optional]

### Return type

[**Installation**](Installation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="installationReplaceOrCreatePostInstallationsReplaceOrCreate"></a>
# **installationReplaceOrCreatePostInstallationsReplaceOrCreate**
> Installation installationReplaceOrCreatePostInstallationsReplaceOrCreate(data)

Replace an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstallationApi;


InstallationApi apiInstance = new InstallationApi();
Installation data = new Installation(); // Installation | Model instance data
try {
    Installation result = apiInstance.installationReplaceOrCreatePostInstallationsReplaceOrCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallationApi#installationReplaceOrCreatePostInstallationsReplaceOrCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Installation**](Installation.md)| Model instance data | [optional]

### Return type

[**Installation**](Installation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="installationReplaceOrCreatePutInstallations"></a>
# **installationReplaceOrCreatePutInstallations**
> Installation installationReplaceOrCreatePutInstallations(data)

Replace an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstallationApi;


InstallationApi apiInstance = new InstallationApi();
Installation data = new Installation(); // Installation | Model instance data
try {
    Installation result = apiInstance.installationReplaceOrCreatePutInstallations(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallationApi#installationReplaceOrCreatePutInstallations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Installation**](Installation.md)| Model instance data | [optional]

### Return type

[**Installation**](Installation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="installationUpdateAll"></a>
# **installationUpdateAll**
> InlineResponse2001 installationUpdateAll(where, data)

Update instances of the model matched by {{where}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstallationApi;


InstallationApi apiInstance = new InstallationApi();
String where = "where_example"; // String | Criteria to match model instances
Installation data = new Installation(); // Installation | An object of model property name/value pairs
try {
    InlineResponse2001 result = apiInstance.installationUpdateAll(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallationApi#installationUpdateAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**Installation**](Installation.md)| An object of model property name/value pairs | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="installationUpsertWithWhere"></a>
# **installationUpsertWithWhere**
> Installation installationUpsertWithWhere(where, data)

Update an existing model instance or insert a new one into the data source based on the where criteria.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstallationApi;


InstallationApi apiInstance = new InstallationApi();
String where = "where_example"; // String | Criteria to match model instances
Installation data = new Installation(); // Installation | An object of model property name/value pairs
try {
    Installation result = apiInstance.installationUpsertWithWhere(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallationApi#installationUpsertWithWhere");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**Installation**](Installation.md)| An object of model property name/value pairs | [optional]

### Return type

[**Installation**](Installation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


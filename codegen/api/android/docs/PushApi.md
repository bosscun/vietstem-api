# PushApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pushCount**](PushApi.md#pushCount) | **GET** push/count | Count instances of the model matched by where from the data source.
[**pushCreate**](PushApi.md#pushCreate) | **POST** push | Create a new instance of the model and persist it into the data source.
[**pushCreateChangeStreamGetPushChangeStream**](PushApi.md#pushCreateChangeStreamGetPushChangeStream) | **GET** push/change-stream | Create a change stream.
[**pushCreateChangeStreamPostPushChangeStream**](PushApi.md#pushCreateChangeStreamPostPushChangeStream) | **POST** push/change-stream | Create a change stream.
[**pushDeleteById**](PushApi.md#pushDeleteById) | **DELETE** push/{id} | Delete a model instance by {{id}} from the data source.
[**pushExistsGetPushidExists**](PushApi.md#pushExistsGetPushidExists) | **GET** push/{id}/exists | Check whether a model instance exists in the data source.
[**pushExistsHeadPushid**](PushApi.md#pushExistsHeadPushid) | **HEAD** push/{id} | Check whether a model instance exists in the data source.
[**pushFind**](PushApi.md#pushFind) | **GET** push | Find all instances of the model matched by filter from the data source.
[**pushFindById**](PushApi.md#pushFindById) | **GET** push/{id} | Find a model instance by {{id}} from the data source.
[**pushFindOne**](PushApi.md#pushFindOne) | **GET** push/findOne | Find first instance of the model matched by filter from the data source.
[**pushPatchOrCreate**](PushApi.md#pushPatchOrCreate) | **PATCH** push | Patch an existing model instance or insert a new one into the data source.
[**pushPrototypePatchAttributes**](PushApi.md#pushPrototypePatchAttributes) | **PATCH** push/{id} | Patch attributes for a model instance and persist it into the data source.
[**pushReplaceByIdPostPushidReplace**](PushApi.md#pushReplaceByIdPostPushidReplace) | **POST** push/{id}/replace | Replace attributes for a model instance and persist it into the data source.
[**pushReplaceByIdPutPushid**](PushApi.md#pushReplaceByIdPutPushid) | **PUT** push/{id} | Replace attributes for a model instance and persist it into the data source.
[**pushReplaceOrCreatePostPushReplaceOrCreate**](PushApi.md#pushReplaceOrCreatePostPushReplaceOrCreate) | **POST** push/replaceOrCreate | Replace an existing model instance or insert a new one into the data source.
[**pushReplaceOrCreatePutPush**](PushApi.md#pushReplaceOrCreatePutPush) | **PUT** push | Replace an existing model instance or insert a new one into the data source.
[**pushUpdateAll**](PushApi.md#pushUpdateAll) | **POST** push/update | Update instances of the model matched by {{where}} from the data source.
[**pushUpsertWithWhere**](PushApi.md#pushUpsertWithWhere) | **POST** push/upsertWithWhere | Update an existing model instance or insert a new one into the data source based on the where criteria.


<a name="pushCount"></a>
# **pushCount**
> InlineResponse2002 pushCount(where)

Count instances of the model matched by where from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PushApi;


PushApi apiInstance = new PushApi();
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse2002 result = apiInstance.pushCount(where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PushApi#pushCount");
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

<a name="pushCreate"></a>
# **pushCreate**
> Push pushCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PushApi;


PushApi apiInstance = new PushApi();
Push data = new Push(); // Push | Model instance data
try {
    Push result = apiInstance.pushCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PushApi#pushCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Push**](Push.md)| Model instance data | [optional]

### Return type

[**Push**](Push.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="pushCreateChangeStreamGetPushChangeStream"></a>
# **pushCreateChangeStreamGetPushChangeStream**
> File pushCreateChangeStreamGetPushChangeStream(options)

Create a change stream.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PushApi;


PushApi apiInstance = new PushApi();
String options = "options_example"; // String | 
try {
    File result = apiInstance.pushCreateChangeStreamGetPushChangeStream(options);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PushApi#pushCreateChangeStreamGetPushChangeStream");
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

<a name="pushCreateChangeStreamPostPushChangeStream"></a>
# **pushCreateChangeStreamPostPushChangeStream**
> File pushCreateChangeStreamPostPushChangeStream(options)

Create a change stream.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PushApi;


PushApi apiInstance = new PushApi();
String options = "options_example"; // String | 
try {
    File result = apiInstance.pushCreateChangeStreamPostPushChangeStream(options);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PushApi#pushCreateChangeStreamPostPushChangeStream");
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

<a name="pushDeleteById"></a>
# **pushDeleteById**
> Object pushDeleteById(id)

Delete a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PushApi;


PushApi apiInstance = new PushApi();
String id = "id_example"; // String | Model id
try {
    Object result = apiInstance.pushDeleteById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PushApi#pushDeleteById");
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

<a name="pushExistsGetPushidExists"></a>
# **pushExistsGetPushidExists**
> InlineResponse200 pushExistsGetPushidExists(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PushApi;


PushApi apiInstance = new PushApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.pushExistsGetPushidExists(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PushApi#pushExistsGetPushidExists");
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

<a name="pushExistsHeadPushid"></a>
# **pushExistsHeadPushid**
> InlineResponse200 pushExistsHeadPushid(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PushApi;


PushApi apiInstance = new PushApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.pushExistsHeadPushid(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PushApi#pushExistsHeadPushid");
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

<a name="pushFind"></a>
# **pushFind**
> List&lt;Push&gt; pushFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PushApi;


PushApi apiInstance = new PushApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<Push> result = apiInstance.pushFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PushApi#pushFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;Push&gt;**](Push.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="pushFindById"></a>
# **pushFindById**
> Push pushFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PushApi;


PushApi apiInstance = new PushApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Push result = apiInstance.pushFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PushApi#pushFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Push**](Push.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="pushFindOne"></a>
# **pushFindOne**
> Push pushFindOne(filter)

Find first instance of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PushApi;


PushApi apiInstance = new PushApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Push result = apiInstance.pushFindOne(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PushApi#pushFindOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Push**](Push.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="pushPatchOrCreate"></a>
# **pushPatchOrCreate**
> Push pushPatchOrCreate(data)

Patch an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PushApi;


PushApi apiInstance = new PushApi();
Push data = new Push(); // Push | Model instance data
try {
    Push result = apiInstance.pushPatchOrCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PushApi#pushPatchOrCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Push**](Push.md)| Model instance data | [optional]

### Return type

[**Push**](Push.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="pushPrototypePatchAttributes"></a>
# **pushPrototypePatchAttributes**
> Push pushPrototypePatchAttributes(id, data)

Patch attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PushApi;


PushApi apiInstance = new PushApi();
String id = "id_example"; // String | Push id
Push data = new Push(); // Push | An object of model property name/value pairs
try {
    Push result = apiInstance.pushPrototypePatchAttributes(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PushApi#pushPrototypePatchAttributes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Push id |
 **data** | [**Push**](Push.md)| An object of model property name/value pairs | [optional]

### Return type

[**Push**](Push.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="pushReplaceByIdPostPushidReplace"></a>
# **pushReplaceByIdPostPushidReplace**
> Push pushReplaceByIdPostPushidReplace(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PushApi;


PushApi apiInstance = new PushApi();
String id = "id_example"; // String | Model id
Push data = new Push(); // Push | Model instance data
try {
    Push result = apiInstance.pushReplaceByIdPostPushidReplace(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PushApi#pushReplaceByIdPostPushidReplace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**Push**](Push.md)| Model instance data | [optional]

### Return type

[**Push**](Push.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="pushReplaceByIdPutPushid"></a>
# **pushReplaceByIdPutPushid**
> Push pushReplaceByIdPutPushid(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PushApi;


PushApi apiInstance = new PushApi();
String id = "id_example"; // String | Model id
Push data = new Push(); // Push | Model instance data
try {
    Push result = apiInstance.pushReplaceByIdPutPushid(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PushApi#pushReplaceByIdPutPushid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**Push**](Push.md)| Model instance data | [optional]

### Return type

[**Push**](Push.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="pushReplaceOrCreatePostPushReplaceOrCreate"></a>
# **pushReplaceOrCreatePostPushReplaceOrCreate**
> Push pushReplaceOrCreatePostPushReplaceOrCreate(data)

Replace an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PushApi;


PushApi apiInstance = new PushApi();
Push data = new Push(); // Push | Model instance data
try {
    Push result = apiInstance.pushReplaceOrCreatePostPushReplaceOrCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PushApi#pushReplaceOrCreatePostPushReplaceOrCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Push**](Push.md)| Model instance data | [optional]

### Return type

[**Push**](Push.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="pushReplaceOrCreatePutPush"></a>
# **pushReplaceOrCreatePutPush**
> Push pushReplaceOrCreatePutPush(data)

Replace an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PushApi;


PushApi apiInstance = new PushApi();
Push data = new Push(); // Push | Model instance data
try {
    Push result = apiInstance.pushReplaceOrCreatePutPush(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PushApi#pushReplaceOrCreatePutPush");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Push**](Push.md)| Model instance data | [optional]

### Return type

[**Push**](Push.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="pushUpdateAll"></a>
# **pushUpdateAll**
> InlineResponse2001 pushUpdateAll(where, data)

Update instances of the model matched by {{where}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PushApi;


PushApi apiInstance = new PushApi();
String where = "where_example"; // String | Criteria to match model instances
Push data = new Push(); // Push | An object of model property name/value pairs
try {
    InlineResponse2001 result = apiInstance.pushUpdateAll(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PushApi#pushUpdateAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**Push**](Push.md)| An object of model property name/value pairs | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="pushUpsertWithWhere"></a>
# **pushUpsertWithWhere**
> Push pushUpsertWithWhere(where, data)

Update an existing model instance or insert a new one into the data source based on the where criteria.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PushApi;


PushApi apiInstance = new PushApi();
String where = "where_example"; // String | Criteria to match model instances
Push data = new Push(); // Push | An object of model property name/value pairs
try {
    Push result = apiInstance.pushUpsertWithWhere(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PushApi#pushUpsertWithWhere");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**Push**](Push.md)| An object of model property name/value pairs | [optional]

### Return type

[**Push**](Push.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


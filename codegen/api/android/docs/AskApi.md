# AskApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**askCount**](AskApi.md#askCount) | **GET** Asks/count | Count instances of the model matched by where from the data source.
[**askCreate**](AskApi.md#askCreate) | **POST** Asks | Create a new instance of the model and persist it into the data source.
[**askCreateChangeStreamGetAsksChangeStream**](AskApi.md#askCreateChangeStreamGetAsksChangeStream) | **GET** Asks/change-stream | Create a change stream.
[**askCreateChangeStreamPostAsksChangeStream**](AskApi.md#askCreateChangeStreamPostAsksChangeStream) | **POST** Asks/change-stream | Create a change stream.
[**askDeleteById**](AskApi.md#askDeleteById) | **DELETE** Asks/{id} | Delete a model instance by {{id}} from the data source.
[**askExistsGetAsksidExists**](AskApi.md#askExistsGetAsksidExists) | **GET** Asks/{id}/exists | Check whether a model instance exists in the data source.
[**askExistsHeadAsksid**](AskApi.md#askExistsHeadAsksid) | **HEAD** Asks/{id} | Check whether a model instance exists in the data source.
[**askFind**](AskApi.md#askFind) | **GET** Asks | Find all instances of the model matched by filter from the data source.
[**askFindById**](AskApi.md#askFindById) | **GET** Asks/{id} | Find a model instance by {{id}} from the data source.
[**askFindOne**](AskApi.md#askFindOne) | **GET** Asks/findOne | Find first instance of the model matched by filter from the data source.
[**askPatchOrCreate**](AskApi.md#askPatchOrCreate) | **PATCH** Asks | Patch an existing model instance or insert a new one into the data source.
[**askPrototypePatchAttributes**](AskApi.md#askPrototypePatchAttributes) | **PATCH** Asks/{id} | Patch attributes for a model instance and persist it into the data source.
[**askReplaceByIdPostAsksidReplace**](AskApi.md#askReplaceByIdPostAsksidReplace) | **POST** Asks/{id}/replace | Replace attributes for a model instance and persist it into the data source.
[**askReplaceByIdPutAsksid**](AskApi.md#askReplaceByIdPutAsksid) | **PUT** Asks/{id} | Replace attributes for a model instance and persist it into the data source.
[**askReplaceOrCreatePostAsksReplaceOrCreate**](AskApi.md#askReplaceOrCreatePostAsksReplaceOrCreate) | **POST** Asks/replaceOrCreate | Replace an existing model instance or insert a new one into the data source.
[**askReplaceOrCreatePutAsks**](AskApi.md#askReplaceOrCreatePutAsks) | **PUT** Asks | Replace an existing model instance or insert a new one into the data source.
[**askUpdateAll**](AskApi.md#askUpdateAll) | **POST** Asks/update | Update instances of the model matched by {{where}} from the data source.
[**askUpsertWithWhere**](AskApi.md#askUpsertWithWhere) | **POST** Asks/upsertWithWhere | Update an existing model instance or insert a new one into the data source based on the where criteria.


<a name="askCount"></a>
# **askCount**
> InlineResponse2002 askCount(where)

Count instances of the model matched by where from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AskApi;


AskApi apiInstance = new AskApi();
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse2002 result = apiInstance.askCount(where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AskApi#askCount");
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

<a name="askCreate"></a>
# **askCreate**
> Ask askCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AskApi;


AskApi apiInstance = new AskApi();
Ask data = new Ask(); // Ask | Model instance data
try {
    Ask result = apiInstance.askCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AskApi#askCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Ask**](Ask.md)| Model instance data | [optional]

### Return type

[**Ask**](Ask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="askCreateChangeStreamGetAsksChangeStream"></a>
# **askCreateChangeStreamGetAsksChangeStream**
> File askCreateChangeStreamGetAsksChangeStream(options)

Create a change stream.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AskApi;


AskApi apiInstance = new AskApi();
String options = "options_example"; // String | 
try {
    File result = apiInstance.askCreateChangeStreamGetAsksChangeStream(options);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AskApi#askCreateChangeStreamGetAsksChangeStream");
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

<a name="askCreateChangeStreamPostAsksChangeStream"></a>
# **askCreateChangeStreamPostAsksChangeStream**
> File askCreateChangeStreamPostAsksChangeStream(options)

Create a change stream.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AskApi;


AskApi apiInstance = new AskApi();
String options = "options_example"; // String | 
try {
    File result = apiInstance.askCreateChangeStreamPostAsksChangeStream(options);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AskApi#askCreateChangeStreamPostAsksChangeStream");
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

<a name="askDeleteById"></a>
# **askDeleteById**
> Object askDeleteById(id)

Delete a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AskApi;


AskApi apiInstance = new AskApi();
String id = "id_example"; // String | Model id
try {
    Object result = apiInstance.askDeleteById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AskApi#askDeleteById");
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

<a name="askExistsGetAsksidExists"></a>
# **askExistsGetAsksidExists**
> InlineResponse200 askExistsGetAsksidExists(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AskApi;


AskApi apiInstance = new AskApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.askExistsGetAsksidExists(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AskApi#askExistsGetAsksidExists");
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

<a name="askExistsHeadAsksid"></a>
# **askExistsHeadAsksid**
> InlineResponse200 askExistsHeadAsksid(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AskApi;


AskApi apiInstance = new AskApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.askExistsHeadAsksid(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AskApi#askExistsHeadAsksid");
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

<a name="askFind"></a>
# **askFind**
> List&lt;Ask&gt; askFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AskApi;


AskApi apiInstance = new AskApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<Ask> result = apiInstance.askFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AskApi#askFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;Ask&gt;**](Ask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="askFindById"></a>
# **askFindById**
> Ask askFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AskApi;


AskApi apiInstance = new AskApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Ask result = apiInstance.askFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AskApi#askFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Ask**](Ask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="askFindOne"></a>
# **askFindOne**
> Ask askFindOne(filter)

Find first instance of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AskApi;


AskApi apiInstance = new AskApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Ask result = apiInstance.askFindOne(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AskApi#askFindOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Ask**](Ask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="askPatchOrCreate"></a>
# **askPatchOrCreate**
> Ask askPatchOrCreate(data)

Patch an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AskApi;


AskApi apiInstance = new AskApi();
Ask data = new Ask(); // Ask | Model instance data
try {
    Ask result = apiInstance.askPatchOrCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AskApi#askPatchOrCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Ask**](Ask.md)| Model instance data | [optional]

### Return type

[**Ask**](Ask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="askPrototypePatchAttributes"></a>
# **askPrototypePatchAttributes**
> Ask askPrototypePatchAttributes(id, data)

Patch attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AskApi;


AskApi apiInstance = new AskApi();
String id = "id_example"; // String | Ask id
Ask data = new Ask(); // Ask | An object of model property name/value pairs
try {
    Ask result = apiInstance.askPrototypePatchAttributes(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AskApi#askPrototypePatchAttributes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Ask id |
 **data** | [**Ask**](Ask.md)| An object of model property name/value pairs | [optional]

### Return type

[**Ask**](Ask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="askReplaceByIdPostAsksidReplace"></a>
# **askReplaceByIdPostAsksidReplace**
> Ask askReplaceByIdPostAsksidReplace(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AskApi;


AskApi apiInstance = new AskApi();
String id = "id_example"; // String | Model id
Ask data = new Ask(); // Ask | Model instance data
try {
    Ask result = apiInstance.askReplaceByIdPostAsksidReplace(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AskApi#askReplaceByIdPostAsksidReplace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**Ask**](Ask.md)| Model instance data | [optional]

### Return type

[**Ask**](Ask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="askReplaceByIdPutAsksid"></a>
# **askReplaceByIdPutAsksid**
> Ask askReplaceByIdPutAsksid(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AskApi;


AskApi apiInstance = new AskApi();
String id = "id_example"; // String | Model id
Ask data = new Ask(); // Ask | Model instance data
try {
    Ask result = apiInstance.askReplaceByIdPutAsksid(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AskApi#askReplaceByIdPutAsksid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**Ask**](Ask.md)| Model instance data | [optional]

### Return type

[**Ask**](Ask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="askReplaceOrCreatePostAsksReplaceOrCreate"></a>
# **askReplaceOrCreatePostAsksReplaceOrCreate**
> Ask askReplaceOrCreatePostAsksReplaceOrCreate(data)

Replace an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AskApi;


AskApi apiInstance = new AskApi();
Ask data = new Ask(); // Ask | Model instance data
try {
    Ask result = apiInstance.askReplaceOrCreatePostAsksReplaceOrCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AskApi#askReplaceOrCreatePostAsksReplaceOrCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Ask**](Ask.md)| Model instance data | [optional]

### Return type

[**Ask**](Ask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="askReplaceOrCreatePutAsks"></a>
# **askReplaceOrCreatePutAsks**
> Ask askReplaceOrCreatePutAsks(data)

Replace an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AskApi;


AskApi apiInstance = new AskApi();
Ask data = new Ask(); // Ask | Model instance data
try {
    Ask result = apiInstance.askReplaceOrCreatePutAsks(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AskApi#askReplaceOrCreatePutAsks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Ask**](Ask.md)| Model instance data | [optional]

### Return type

[**Ask**](Ask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="askUpdateAll"></a>
# **askUpdateAll**
> InlineResponse2001 askUpdateAll(where, data)

Update instances of the model matched by {{where}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AskApi;


AskApi apiInstance = new AskApi();
String where = "where_example"; // String | Criteria to match model instances
Ask data = new Ask(); // Ask | An object of model property name/value pairs
try {
    InlineResponse2001 result = apiInstance.askUpdateAll(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AskApi#askUpdateAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**Ask**](Ask.md)| An object of model property name/value pairs | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="askUpsertWithWhere"></a>
# **askUpsertWithWhere**
> Ask askUpsertWithWhere(where, data)

Update an existing model instance or insert a new one into the data source based on the where criteria.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AskApi;


AskApi apiInstance = new AskApi();
String where = "where_example"; // String | Criteria to match model instances
Ask data = new Ask(); // Ask | An object of model property name/value pairs
try {
    Ask result = apiInstance.askUpsertWithWhere(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AskApi#askUpsertWithWhere");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**Ask**](Ask.md)| An object of model property name/value pairs | [optional]

### Return type

[**Ask**](Ask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


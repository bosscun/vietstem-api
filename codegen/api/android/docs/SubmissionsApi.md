# SubmissionsApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**submissionsCount**](SubmissionsApi.md#submissionsCount) | **GET** Submissions/count | Count instances of the model matched by where from the data source.
[**submissionsCreate**](SubmissionsApi.md#submissionsCreate) | **POST** Submissions | Create a new instance of the model and persist it into the data source.
[**submissionsCreateChangeStreamGetSubmissionsChangeStream**](SubmissionsApi.md#submissionsCreateChangeStreamGetSubmissionsChangeStream) | **GET** Submissions/change-stream | Create a change stream.
[**submissionsCreateChangeStreamPostSubmissionsChangeStream**](SubmissionsApi.md#submissionsCreateChangeStreamPostSubmissionsChangeStream) | **POST** Submissions/change-stream | Create a change stream.
[**submissionsDeleteById**](SubmissionsApi.md#submissionsDeleteById) | **DELETE** Submissions/{id} | Delete a model instance by {{id}} from the data source.
[**submissionsExistsGetSubmissionsidExists**](SubmissionsApi.md#submissionsExistsGetSubmissionsidExists) | **GET** Submissions/{id}/exists | Check whether a model instance exists in the data source.
[**submissionsExistsHeadSubmissionsid**](SubmissionsApi.md#submissionsExistsHeadSubmissionsid) | **HEAD** Submissions/{id} | Check whether a model instance exists in the data source.
[**submissionsFind**](SubmissionsApi.md#submissionsFind) | **GET** Submissions | Find all instances of the model matched by filter from the data source.
[**submissionsFindById**](SubmissionsApi.md#submissionsFindById) | **GET** Submissions/{id} | Find a model instance by {{id}} from the data source.
[**submissionsFindOne**](SubmissionsApi.md#submissionsFindOne) | **GET** Submissions/findOne | Find first instance of the model matched by filter from the data source.
[**submissionsPatchOrCreate**](SubmissionsApi.md#submissionsPatchOrCreate) | **PATCH** Submissions | Patch an existing model instance or insert a new one into the data source.
[**submissionsPrototypePatchAttributes**](SubmissionsApi.md#submissionsPrototypePatchAttributes) | **PATCH** Submissions/{id} | Patch attributes for a model instance and persist it into the data source.
[**submissionsReplaceByIdPostSubmissionsidReplace**](SubmissionsApi.md#submissionsReplaceByIdPostSubmissionsidReplace) | **POST** Submissions/{id}/replace | Replace attributes for a model instance and persist it into the data source.
[**submissionsReplaceByIdPutSubmissionsid**](SubmissionsApi.md#submissionsReplaceByIdPutSubmissionsid) | **PUT** Submissions/{id} | Replace attributes for a model instance and persist it into the data source.
[**submissionsReplaceOrCreatePostSubmissionsReplaceOrCreate**](SubmissionsApi.md#submissionsReplaceOrCreatePostSubmissionsReplaceOrCreate) | **POST** Submissions/replaceOrCreate | Replace an existing model instance or insert a new one into the data source.
[**submissionsReplaceOrCreatePutSubmissions**](SubmissionsApi.md#submissionsReplaceOrCreatePutSubmissions) | **PUT** Submissions | Replace an existing model instance or insert a new one into the data source.
[**submissionsUpdateAll**](SubmissionsApi.md#submissionsUpdateAll) | **POST** Submissions/update | Update instances of the model matched by {{where}} from the data source.
[**submissionsUpsertWithWhere**](SubmissionsApi.md#submissionsUpsertWithWhere) | **POST** Submissions/upsertWithWhere | Update an existing model instance or insert a new one into the data source based on the where criteria.


<a name="submissionsCount"></a>
# **submissionsCount**
> InlineResponse2002 submissionsCount(where)

Count instances of the model matched by where from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubmissionsApi;


SubmissionsApi apiInstance = new SubmissionsApi();
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse2002 result = apiInstance.submissionsCount(where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubmissionsApi#submissionsCount");
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

<a name="submissionsCreate"></a>
# **submissionsCreate**
> Submissions submissionsCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubmissionsApi;


SubmissionsApi apiInstance = new SubmissionsApi();
Submissions data = new Submissions(); // Submissions | Model instance data
try {
    Submissions result = apiInstance.submissionsCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubmissionsApi#submissionsCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Submissions**](Submissions.md)| Model instance data | [optional]

### Return type

[**Submissions**](Submissions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="submissionsCreateChangeStreamGetSubmissionsChangeStream"></a>
# **submissionsCreateChangeStreamGetSubmissionsChangeStream**
> File submissionsCreateChangeStreamGetSubmissionsChangeStream(options)

Create a change stream.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubmissionsApi;


SubmissionsApi apiInstance = new SubmissionsApi();
String options = "options_example"; // String | 
try {
    File result = apiInstance.submissionsCreateChangeStreamGetSubmissionsChangeStream(options);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubmissionsApi#submissionsCreateChangeStreamGetSubmissionsChangeStream");
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

<a name="submissionsCreateChangeStreamPostSubmissionsChangeStream"></a>
# **submissionsCreateChangeStreamPostSubmissionsChangeStream**
> File submissionsCreateChangeStreamPostSubmissionsChangeStream(options)

Create a change stream.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubmissionsApi;


SubmissionsApi apiInstance = new SubmissionsApi();
String options = "options_example"; // String | 
try {
    File result = apiInstance.submissionsCreateChangeStreamPostSubmissionsChangeStream(options);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubmissionsApi#submissionsCreateChangeStreamPostSubmissionsChangeStream");
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

<a name="submissionsDeleteById"></a>
# **submissionsDeleteById**
> Object submissionsDeleteById(id)

Delete a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubmissionsApi;


SubmissionsApi apiInstance = new SubmissionsApi();
String id = "id_example"; // String | Model id
try {
    Object result = apiInstance.submissionsDeleteById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubmissionsApi#submissionsDeleteById");
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

<a name="submissionsExistsGetSubmissionsidExists"></a>
# **submissionsExistsGetSubmissionsidExists**
> InlineResponse200 submissionsExistsGetSubmissionsidExists(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubmissionsApi;


SubmissionsApi apiInstance = new SubmissionsApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.submissionsExistsGetSubmissionsidExists(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubmissionsApi#submissionsExistsGetSubmissionsidExists");
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

<a name="submissionsExistsHeadSubmissionsid"></a>
# **submissionsExistsHeadSubmissionsid**
> InlineResponse200 submissionsExistsHeadSubmissionsid(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubmissionsApi;


SubmissionsApi apiInstance = new SubmissionsApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.submissionsExistsHeadSubmissionsid(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubmissionsApi#submissionsExistsHeadSubmissionsid");
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

<a name="submissionsFind"></a>
# **submissionsFind**
> List&lt;Submissions&gt; submissionsFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubmissionsApi;


SubmissionsApi apiInstance = new SubmissionsApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<Submissions> result = apiInstance.submissionsFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubmissionsApi#submissionsFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;Submissions&gt;**](Submissions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="submissionsFindById"></a>
# **submissionsFindById**
> Submissions submissionsFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubmissionsApi;


SubmissionsApi apiInstance = new SubmissionsApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Submissions result = apiInstance.submissionsFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubmissionsApi#submissionsFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Submissions**](Submissions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="submissionsFindOne"></a>
# **submissionsFindOne**
> Submissions submissionsFindOne(filter)

Find first instance of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubmissionsApi;


SubmissionsApi apiInstance = new SubmissionsApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Submissions result = apiInstance.submissionsFindOne(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubmissionsApi#submissionsFindOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Submissions**](Submissions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="submissionsPatchOrCreate"></a>
# **submissionsPatchOrCreate**
> Submissions submissionsPatchOrCreate(data)

Patch an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubmissionsApi;


SubmissionsApi apiInstance = new SubmissionsApi();
Submissions data = new Submissions(); // Submissions | Model instance data
try {
    Submissions result = apiInstance.submissionsPatchOrCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubmissionsApi#submissionsPatchOrCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Submissions**](Submissions.md)| Model instance data | [optional]

### Return type

[**Submissions**](Submissions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="submissionsPrototypePatchAttributes"></a>
# **submissionsPrototypePatchAttributes**
> Submissions submissionsPrototypePatchAttributes(id, data)

Patch attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubmissionsApi;


SubmissionsApi apiInstance = new SubmissionsApi();
String id = "id_example"; // String | Submissions id
Submissions data = new Submissions(); // Submissions | An object of model property name/value pairs
try {
    Submissions result = apiInstance.submissionsPrototypePatchAttributes(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubmissionsApi#submissionsPrototypePatchAttributes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Submissions id |
 **data** | [**Submissions**](Submissions.md)| An object of model property name/value pairs | [optional]

### Return type

[**Submissions**](Submissions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="submissionsReplaceByIdPostSubmissionsidReplace"></a>
# **submissionsReplaceByIdPostSubmissionsidReplace**
> Submissions submissionsReplaceByIdPostSubmissionsidReplace(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubmissionsApi;


SubmissionsApi apiInstance = new SubmissionsApi();
String id = "id_example"; // String | Model id
Submissions data = new Submissions(); // Submissions | Model instance data
try {
    Submissions result = apiInstance.submissionsReplaceByIdPostSubmissionsidReplace(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubmissionsApi#submissionsReplaceByIdPostSubmissionsidReplace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**Submissions**](Submissions.md)| Model instance data | [optional]

### Return type

[**Submissions**](Submissions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="submissionsReplaceByIdPutSubmissionsid"></a>
# **submissionsReplaceByIdPutSubmissionsid**
> Submissions submissionsReplaceByIdPutSubmissionsid(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubmissionsApi;


SubmissionsApi apiInstance = new SubmissionsApi();
String id = "id_example"; // String | Model id
Submissions data = new Submissions(); // Submissions | Model instance data
try {
    Submissions result = apiInstance.submissionsReplaceByIdPutSubmissionsid(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubmissionsApi#submissionsReplaceByIdPutSubmissionsid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**Submissions**](Submissions.md)| Model instance data | [optional]

### Return type

[**Submissions**](Submissions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="submissionsReplaceOrCreatePostSubmissionsReplaceOrCreate"></a>
# **submissionsReplaceOrCreatePostSubmissionsReplaceOrCreate**
> Submissions submissionsReplaceOrCreatePostSubmissionsReplaceOrCreate(data)

Replace an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubmissionsApi;


SubmissionsApi apiInstance = new SubmissionsApi();
Submissions data = new Submissions(); // Submissions | Model instance data
try {
    Submissions result = apiInstance.submissionsReplaceOrCreatePostSubmissionsReplaceOrCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubmissionsApi#submissionsReplaceOrCreatePostSubmissionsReplaceOrCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Submissions**](Submissions.md)| Model instance data | [optional]

### Return type

[**Submissions**](Submissions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="submissionsReplaceOrCreatePutSubmissions"></a>
# **submissionsReplaceOrCreatePutSubmissions**
> Submissions submissionsReplaceOrCreatePutSubmissions(data)

Replace an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubmissionsApi;


SubmissionsApi apiInstance = new SubmissionsApi();
Submissions data = new Submissions(); // Submissions | Model instance data
try {
    Submissions result = apiInstance.submissionsReplaceOrCreatePutSubmissions(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubmissionsApi#submissionsReplaceOrCreatePutSubmissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Submissions**](Submissions.md)| Model instance data | [optional]

### Return type

[**Submissions**](Submissions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="submissionsUpdateAll"></a>
# **submissionsUpdateAll**
> InlineResponse2001 submissionsUpdateAll(where, data)

Update instances of the model matched by {{where}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubmissionsApi;


SubmissionsApi apiInstance = new SubmissionsApi();
String where = "where_example"; // String | Criteria to match model instances
Submissions data = new Submissions(); // Submissions | An object of model property name/value pairs
try {
    InlineResponse2001 result = apiInstance.submissionsUpdateAll(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubmissionsApi#submissionsUpdateAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**Submissions**](Submissions.md)| An object of model property name/value pairs | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="submissionsUpsertWithWhere"></a>
# **submissionsUpsertWithWhere**
> Submissions submissionsUpsertWithWhere(where, data)

Update an existing model instance or insert a new one into the data source based on the where criteria.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubmissionsApi;


SubmissionsApi apiInstance = new SubmissionsApi();
String where = "where_example"; // String | Criteria to match model instances
Submissions data = new Submissions(); // Submissions | An object of model property name/value pairs
try {
    Submissions result = apiInstance.submissionsUpsertWithWhere(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubmissionsApi#submissionsUpsertWithWhere");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**Submissions**](Submissions.md)| An object of model property name/value pairs | [optional]

### Return type

[**Submissions**](Submissions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


# PostApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postCount**](PostApi.md#postCount) | **GET** Posts/count | Count instances of the model matched by where from the data source.
[**postCreate**](PostApi.md#postCreate) | **POST** Posts | Create a new instance of the model and persist it into the data source.
[**postCreateChangeStreamGetPostsChangeStream**](PostApi.md#postCreateChangeStreamGetPostsChangeStream) | **GET** Posts/change-stream | Create a change stream.
[**postCreateChangeStreamPostPostsChangeStream**](PostApi.md#postCreateChangeStreamPostPostsChangeStream) | **POST** Posts/change-stream | Create a change stream.
[**postDeleteById**](PostApi.md#postDeleteById) | **DELETE** Posts/{id} | Delete a model instance by {{id}} from the data source.
[**postExistsGetPostsidExists**](PostApi.md#postExistsGetPostsidExists) | **GET** Posts/{id}/exists | Check whether a model instance exists in the data source.
[**postExistsHeadPostsid**](PostApi.md#postExistsHeadPostsid) | **HEAD** Posts/{id} | Check whether a model instance exists in the data source.
[**postFind**](PostApi.md#postFind) | **GET** Posts | Find all instances of the model matched by filter from the data source.
[**postFindById**](PostApi.md#postFindById) | **GET** Posts/{id} | Find a model instance by {{id}} from the data source.
[**postFindOne**](PostApi.md#postFindOne) | **GET** Posts/findOne | Find first instance of the model matched by filter from the data source.
[**postPatchOrCreate**](PostApi.md#postPatchOrCreate) | **PATCH** Posts | Patch an existing model instance or insert a new one into the data source.
[**postPrototypePatchAttributes**](PostApi.md#postPrototypePatchAttributes) | **PATCH** Posts/{id} | Patch attributes for a model instance and persist it into the data source.
[**postReplaceByIdPostPostsidReplace**](PostApi.md#postReplaceByIdPostPostsidReplace) | **POST** Posts/{id}/replace | Replace attributes for a model instance and persist it into the data source.
[**postReplaceByIdPutPostsid**](PostApi.md#postReplaceByIdPutPostsid) | **PUT** Posts/{id} | Replace attributes for a model instance and persist it into the data source.
[**postReplaceOrCreatePostPostsReplaceOrCreate**](PostApi.md#postReplaceOrCreatePostPostsReplaceOrCreate) | **POST** Posts/replaceOrCreate | Replace an existing model instance or insert a new one into the data source.
[**postReplaceOrCreatePutPosts**](PostApi.md#postReplaceOrCreatePutPosts) | **PUT** Posts | Replace an existing model instance or insert a new one into the data source.
[**postUpdateAll**](PostApi.md#postUpdateAll) | **POST** Posts/update | Update instances of the model matched by {{where}} from the data source.
[**postUpsertWithWhere**](PostApi.md#postUpsertWithWhere) | **POST** Posts/upsertWithWhere | Update an existing model instance or insert a new one into the data source based on the where criteria.


<a name="postCount"></a>
# **postCount**
> InlineResponse2002 postCount(where)

Count instances of the model matched by where from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PostApi;


PostApi apiInstance = new PostApi();
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse2002 result = apiInstance.postCount(where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostApi#postCount");
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

<a name="postCreate"></a>
# **postCreate**
> Post postCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PostApi;


PostApi apiInstance = new PostApi();
Post data = new Post(); // Post | Model instance data
try {
    Post result = apiInstance.postCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostApi#postCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Post**](Post.md)| Model instance data | [optional]

### Return type

[**Post**](Post.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="postCreateChangeStreamGetPostsChangeStream"></a>
# **postCreateChangeStreamGetPostsChangeStream**
> File postCreateChangeStreamGetPostsChangeStream(options)

Create a change stream.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PostApi;


PostApi apiInstance = new PostApi();
String options = "options_example"; // String | 
try {
    File result = apiInstance.postCreateChangeStreamGetPostsChangeStream(options);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostApi#postCreateChangeStreamGetPostsChangeStream");
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

<a name="postCreateChangeStreamPostPostsChangeStream"></a>
# **postCreateChangeStreamPostPostsChangeStream**
> File postCreateChangeStreamPostPostsChangeStream(options)

Create a change stream.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PostApi;


PostApi apiInstance = new PostApi();
String options = "options_example"; // String | 
try {
    File result = apiInstance.postCreateChangeStreamPostPostsChangeStream(options);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostApi#postCreateChangeStreamPostPostsChangeStream");
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

<a name="postDeleteById"></a>
# **postDeleteById**
> Object postDeleteById(id)

Delete a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PostApi;


PostApi apiInstance = new PostApi();
String id = "id_example"; // String | Model id
try {
    Object result = apiInstance.postDeleteById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostApi#postDeleteById");
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

<a name="postExistsGetPostsidExists"></a>
# **postExistsGetPostsidExists**
> InlineResponse200 postExistsGetPostsidExists(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PostApi;


PostApi apiInstance = new PostApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.postExistsGetPostsidExists(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostApi#postExistsGetPostsidExists");
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

<a name="postExistsHeadPostsid"></a>
# **postExistsHeadPostsid**
> InlineResponse200 postExistsHeadPostsid(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PostApi;


PostApi apiInstance = new PostApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.postExistsHeadPostsid(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostApi#postExistsHeadPostsid");
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

<a name="postFind"></a>
# **postFind**
> List&lt;Post&gt; postFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PostApi;


PostApi apiInstance = new PostApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<Post> result = apiInstance.postFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostApi#postFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;Post&gt;**](Post.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="postFindById"></a>
# **postFindById**
> Post postFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PostApi;


PostApi apiInstance = new PostApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Post result = apiInstance.postFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostApi#postFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Post**](Post.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="postFindOne"></a>
# **postFindOne**
> Post postFindOne(filter)

Find first instance of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PostApi;


PostApi apiInstance = new PostApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Post result = apiInstance.postFindOne(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostApi#postFindOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Post**](Post.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="postPatchOrCreate"></a>
# **postPatchOrCreate**
> Post postPatchOrCreate(data)

Patch an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PostApi;


PostApi apiInstance = new PostApi();
Post data = new Post(); // Post | Model instance data
try {
    Post result = apiInstance.postPatchOrCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostApi#postPatchOrCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Post**](Post.md)| Model instance data | [optional]

### Return type

[**Post**](Post.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="postPrototypePatchAttributes"></a>
# **postPrototypePatchAttributes**
> Post postPrototypePatchAttributes(id, data)

Patch attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PostApi;


PostApi apiInstance = new PostApi();
String id = "id_example"; // String | Post id
Post data = new Post(); // Post | An object of model property name/value pairs
try {
    Post result = apiInstance.postPrototypePatchAttributes(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostApi#postPrototypePatchAttributes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Post id |
 **data** | [**Post**](Post.md)| An object of model property name/value pairs | [optional]

### Return type

[**Post**](Post.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="postReplaceByIdPostPostsidReplace"></a>
# **postReplaceByIdPostPostsidReplace**
> Post postReplaceByIdPostPostsidReplace(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PostApi;


PostApi apiInstance = new PostApi();
String id = "id_example"; // String | Model id
Post data = new Post(); // Post | Model instance data
try {
    Post result = apiInstance.postReplaceByIdPostPostsidReplace(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostApi#postReplaceByIdPostPostsidReplace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**Post**](Post.md)| Model instance data | [optional]

### Return type

[**Post**](Post.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="postReplaceByIdPutPostsid"></a>
# **postReplaceByIdPutPostsid**
> Post postReplaceByIdPutPostsid(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PostApi;


PostApi apiInstance = new PostApi();
String id = "id_example"; // String | Model id
Post data = new Post(); // Post | Model instance data
try {
    Post result = apiInstance.postReplaceByIdPutPostsid(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostApi#postReplaceByIdPutPostsid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**Post**](Post.md)| Model instance data | [optional]

### Return type

[**Post**](Post.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="postReplaceOrCreatePostPostsReplaceOrCreate"></a>
# **postReplaceOrCreatePostPostsReplaceOrCreate**
> Post postReplaceOrCreatePostPostsReplaceOrCreate(data)

Replace an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PostApi;


PostApi apiInstance = new PostApi();
Post data = new Post(); // Post | Model instance data
try {
    Post result = apiInstance.postReplaceOrCreatePostPostsReplaceOrCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostApi#postReplaceOrCreatePostPostsReplaceOrCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Post**](Post.md)| Model instance data | [optional]

### Return type

[**Post**](Post.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="postReplaceOrCreatePutPosts"></a>
# **postReplaceOrCreatePutPosts**
> Post postReplaceOrCreatePutPosts(data)

Replace an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PostApi;


PostApi apiInstance = new PostApi();
Post data = new Post(); // Post | Model instance data
try {
    Post result = apiInstance.postReplaceOrCreatePutPosts(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostApi#postReplaceOrCreatePutPosts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Post**](Post.md)| Model instance data | [optional]

### Return type

[**Post**](Post.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="postUpdateAll"></a>
# **postUpdateAll**
> InlineResponse2001 postUpdateAll(where, data)

Update instances of the model matched by {{where}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PostApi;


PostApi apiInstance = new PostApi();
String where = "where_example"; // String | Criteria to match model instances
Post data = new Post(); // Post | An object of model property name/value pairs
try {
    InlineResponse2001 result = apiInstance.postUpdateAll(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostApi#postUpdateAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**Post**](Post.md)| An object of model property name/value pairs | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="postUpsertWithWhere"></a>
# **postUpsertWithWhere**
> Post postUpsertWithWhere(where, data)

Update an existing model instance or insert a new one into the data source based on the where criteria.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PostApi;


PostApi apiInstance = new PostApi();
String where = "where_example"; // String | Criteria to match model instances
Post data = new Post(); // Post | An object of model property name/value pairs
try {
    Post result = apiInstance.postUpsertWithWhere(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostApi#postUpsertWithWhere");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**Post**](Post.md)| An object of model property name/value pairs | [optional]

### Return type

[**Post**](Post.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


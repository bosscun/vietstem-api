# CourseApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**courseCount**](CourseApi.md#courseCount) | **GET** Courses/count | Count instances of the model matched by where from the data source.
[**courseCreate**](CourseApi.md#courseCreate) | **POST** Courses | Create a new instance of the model and persist it into the data source.
[**courseCreateChangeStreamGetCoursesChangeStream**](CourseApi.md#courseCreateChangeStreamGetCoursesChangeStream) | **GET** Courses/change-stream | Create a change stream.
[**courseCreateChangeStreamPostCoursesChangeStream**](CourseApi.md#courseCreateChangeStreamPostCoursesChangeStream) | **POST** Courses/change-stream | Create a change stream.
[**courseDeleteById**](CourseApi.md#courseDeleteById) | **DELETE** Courses/{id} | Delete a model instance by {{id}} from the data source.
[**courseExistsGetCoursesidExists**](CourseApi.md#courseExistsGetCoursesidExists) | **GET** Courses/{id}/exists | Check whether a model instance exists in the data source.
[**courseExistsHeadCoursesid**](CourseApi.md#courseExistsHeadCoursesid) | **HEAD** Courses/{id} | Check whether a model instance exists in the data source.
[**courseFind**](CourseApi.md#courseFind) | **GET** Courses | Find all instances of the model matched by filter from the data source.
[**courseFindById**](CourseApi.md#courseFindById) | **GET** Courses/{id} | Find a model instance by {{id}} from the data source.
[**courseFindOne**](CourseApi.md#courseFindOne) | **GET** Courses/findOne | Find first instance of the model matched by filter from the data source.
[**coursePatchOrCreate**](CourseApi.md#coursePatchOrCreate) | **PATCH** Courses | Patch an existing model instance or insert a new one into the data source.
[**coursePrototypePatchAttributes**](CourseApi.md#coursePrototypePatchAttributes) | **PATCH** Courses/{id} | Patch attributes for a model instance and persist it into the data source.
[**courseReplaceByIdPostCoursesidReplace**](CourseApi.md#courseReplaceByIdPostCoursesidReplace) | **POST** Courses/{id}/replace | Replace attributes for a model instance and persist it into the data source.
[**courseReplaceByIdPutCoursesid**](CourseApi.md#courseReplaceByIdPutCoursesid) | **PUT** Courses/{id} | Replace attributes for a model instance and persist it into the data source.
[**courseReplaceOrCreatePostCoursesReplaceOrCreate**](CourseApi.md#courseReplaceOrCreatePostCoursesReplaceOrCreate) | **POST** Courses/replaceOrCreate | Replace an existing model instance or insert a new one into the data source.
[**courseReplaceOrCreatePutCourses**](CourseApi.md#courseReplaceOrCreatePutCourses) | **PUT** Courses | Replace an existing model instance or insert a new one into the data source.
[**courseUpdateAll**](CourseApi.md#courseUpdateAll) | **POST** Courses/update | Update instances of the model matched by {{where}} from the data source.
[**courseUpsertWithWhere**](CourseApi.md#courseUpsertWithWhere) | **POST** Courses/upsertWithWhere | Update an existing model instance or insert a new one into the data source based on the where criteria.


<a name="courseCount"></a>
# **courseCount**
> InlineResponse2002 courseCount(where)

Count instances of the model matched by where from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CourseApi;


CourseApi apiInstance = new CourseApi();
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse2002 result = apiInstance.courseCount(where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#courseCount");
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

<a name="courseCreate"></a>
# **courseCreate**
> Course courseCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CourseApi;


CourseApi apiInstance = new CourseApi();
Course data = new Course(); // Course | Model instance data
try {
    Course result = apiInstance.courseCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#courseCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Course**](Course.md)| Model instance data | [optional]

### Return type

[**Course**](Course.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="courseCreateChangeStreamGetCoursesChangeStream"></a>
# **courseCreateChangeStreamGetCoursesChangeStream**
> File courseCreateChangeStreamGetCoursesChangeStream(options)

Create a change stream.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CourseApi;


CourseApi apiInstance = new CourseApi();
String options = "options_example"; // String | 
try {
    File result = apiInstance.courseCreateChangeStreamGetCoursesChangeStream(options);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#courseCreateChangeStreamGetCoursesChangeStream");
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

<a name="courseCreateChangeStreamPostCoursesChangeStream"></a>
# **courseCreateChangeStreamPostCoursesChangeStream**
> File courseCreateChangeStreamPostCoursesChangeStream(options)

Create a change stream.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CourseApi;


CourseApi apiInstance = new CourseApi();
String options = "options_example"; // String | 
try {
    File result = apiInstance.courseCreateChangeStreamPostCoursesChangeStream(options);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#courseCreateChangeStreamPostCoursesChangeStream");
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

<a name="courseDeleteById"></a>
# **courseDeleteById**
> Object courseDeleteById(id)

Delete a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CourseApi;


CourseApi apiInstance = new CourseApi();
String id = "id_example"; // String | Model id
try {
    Object result = apiInstance.courseDeleteById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#courseDeleteById");
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

<a name="courseExistsGetCoursesidExists"></a>
# **courseExistsGetCoursesidExists**
> InlineResponse200 courseExistsGetCoursesidExists(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CourseApi;


CourseApi apiInstance = new CourseApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.courseExistsGetCoursesidExists(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#courseExistsGetCoursesidExists");
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

<a name="courseExistsHeadCoursesid"></a>
# **courseExistsHeadCoursesid**
> InlineResponse200 courseExistsHeadCoursesid(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CourseApi;


CourseApi apiInstance = new CourseApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.courseExistsHeadCoursesid(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#courseExistsHeadCoursesid");
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

<a name="courseFind"></a>
# **courseFind**
> List&lt;Course&gt; courseFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CourseApi;


CourseApi apiInstance = new CourseApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<Course> result = apiInstance.courseFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#courseFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;Course&gt;**](Course.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="courseFindById"></a>
# **courseFindById**
> Course courseFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CourseApi;


CourseApi apiInstance = new CourseApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Course result = apiInstance.courseFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#courseFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Course**](Course.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="courseFindOne"></a>
# **courseFindOne**
> Course courseFindOne(filter)

Find first instance of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CourseApi;


CourseApi apiInstance = new CourseApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Course result = apiInstance.courseFindOne(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#courseFindOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Course**](Course.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="coursePatchOrCreate"></a>
# **coursePatchOrCreate**
> Course coursePatchOrCreate(data)

Patch an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CourseApi;


CourseApi apiInstance = new CourseApi();
Course data = new Course(); // Course | Model instance data
try {
    Course result = apiInstance.coursePatchOrCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#coursePatchOrCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Course**](Course.md)| Model instance data | [optional]

### Return type

[**Course**](Course.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="coursePrototypePatchAttributes"></a>
# **coursePrototypePatchAttributes**
> Course coursePrototypePatchAttributes(id, data)

Patch attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CourseApi;


CourseApi apiInstance = new CourseApi();
String id = "id_example"; // String | Course id
Course data = new Course(); // Course | An object of model property name/value pairs
try {
    Course result = apiInstance.coursePrototypePatchAttributes(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#coursePrototypePatchAttributes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Course id |
 **data** | [**Course**](Course.md)| An object of model property name/value pairs | [optional]

### Return type

[**Course**](Course.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="courseReplaceByIdPostCoursesidReplace"></a>
# **courseReplaceByIdPostCoursesidReplace**
> Course courseReplaceByIdPostCoursesidReplace(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CourseApi;


CourseApi apiInstance = new CourseApi();
String id = "id_example"; // String | Model id
Course data = new Course(); // Course | Model instance data
try {
    Course result = apiInstance.courseReplaceByIdPostCoursesidReplace(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#courseReplaceByIdPostCoursesidReplace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**Course**](Course.md)| Model instance data | [optional]

### Return type

[**Course**](Course.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="courseReplaceByIdPutCoursesid"></a>
# **courseReplaceByIdPutCoursesid**
> Course courseReplaceByIdPutCoursesid(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CourseApi;


CourseApi apiInstance = new CourseApi();
String id = "id_example"; // String | Model id
Course data = new Course(); // Course | Model instance data
try {
    Course result = apiInstance.courseReplaceByIdPutCoursesid(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#courseReplaceByIdPutCoursesid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**Course**](Course.md)| Model instance data | [optional]

### Return type

[**Course**](Course.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="courseReplaceOrCreatePostCoursesReplaceOrCreate"></a>
# **courseReplaceOrCreatePostCoursesReplaceOrCreate**
> Course courseReplaceOrCreatePostCoursesReplaceOrCreate(data)

Replace an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CourseApi;


CourseApi apiInstance = new CourseApi();
Course data = new Course(); // Course | Model instance data
try {
    Course result = apiInstance.courseReplaceOrCreatePostCoursesReplaceOrCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#courseReplaceOrCreatePostCoursesReplaceOrCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Course**](Course.md)| Model instance data | [optional]

### Return type

[**Course**](Course.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="courseReplaceOrCreatePutCourses"></a>
# **courseReplaceOrCreatePutCourses**
> Course courseReplaceOrCreatePutCourses(data)

Replace an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CourseApi;


CourseApi apiInstance = new CourseApi();
Course data = new Course(); // Course | Model instance data
try {
    Course result = apiInstance.courseReplaceOrCreatePutCourses(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#courseReplaceOrCreatePutCourses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Course**](Course.md)| Model instance data | [optional]

### Return type

[**Course**](Course.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="courseUpdateAll"></a>
# **courseUpdateAll**
> InlineResponse2001 courseUpdateAll(where, data)

Update instances of the model matched by {{where}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CourseApi;


CourseApi apiInstance = new CourseApi();
String where = "where_example"; // String | Criteria to match model instances
Course data = new Course(); // Course | An object of model property name/value pairs
try {
    InlineResponse2001 result = apiInstance.courseUpdateAll(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#courseUpdateAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**Course**](Course.md)| An object of model property name/value pairs | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="courseUpsertWithWhere"></a>
# **courseUpsertWithWhere**
> Course courseUpsertWithWhere(where, data)

Update an existing model instance or insert a new one into the data source based on the where criteria.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CourseApi;


CourseApi apiInstance = new CourseApi();
String where = "where_example"; // String | Criteria to match model instances
Course data = new Course(); // Course | An object of model property name/value pairs
try {
    Course result = apiInstance.courseUpsertWithWhere(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#courseUpsertWithWhere");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**Course**](Course.md)| An object of model property name/value pairs | [optional]

### Return type

[**Course**](Course.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


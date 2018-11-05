# ApplicationApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**applicationCount**](ApplicationApi.md#applicationCount) | **GET** Applications/count | Count instances of the model matched by where from the data source.
[**applicationCreate**](ApplicationApi.md#applicationCreate) | **POST** Applications | Create a new instance of the model and persist it into the data source.
[**applicationCreateChangeStreamGetApplicationsChangeStream**](ApplicationApi.md#applicationCreateChangeStreamGetApplicationsChangeStream) | **GET** Applications/change-stream | Create a change stream.
[**applicationCreateChangeStreamPostApplicationsChangeStream**](ApplicationApi.md#applicationCreateChangeStreamPostApplicationsChangeStream) | **POST** Applications/change-stream | Create a change stream.
[**applicationDeleteById**](ApplicationApi.md#applicationDeleteById) | **DELETE** Applications/{id} | Delete a model instance by {{id}} from the data source.
[**applicationExistsGetApplicationsidExists**](ApplicationApi.md#applicationExistsGetApplicationsidExists) | **GET** Applications/{id}/exists | Check whether a model instance exists in the data source.
[**applicationExistsHeadApplicationsid**](ApplicationApi.md#applicationExistsHeadApplicationsid) | **HEAD** Applications/{id} | Check whether a model instance exists in the data source.
[**applicationFind**](ApplicationApi.md#applicationFind) | **GET** Applications | Find all instances of the model matched by filter from the data source.
[**applicationFindById**](ApplicationApi.md#applicationFindById) | **GET** Applications/{id} | Find a model instance by {{id}} from the data source.
[**applicationFindOne**](ApplicationApi.md#applicationFindOne) | **GET** Applications/findOne | Find first instance of the model matched by filter from the data source.
[**applicationPatchOrCreate**](ApplicationApi.md#applicationPatchOrCreate) | **PATCH** Applications | Patch an existing model instance or insert a new one into the data source.
[**applicationPrototypePatchAttributes**](ApplicationApi.md#applicationPrototypePatchAttributes) | **PATCH** Applications/{id} | Patch attributes for a model instance and persist it into the data source.
[**applicationReplaceByIdPostApplicationsidReplace**](ApplicationApi.md#applicationReplaceByIdPostApplicationsidReplace) | **POST** Applications/{id}/replace | Replace attributes for a model instance and persist it into the data source.
[**applicationReplaceByIdPutApplicationsid**](ApplicationApi.md#applicationReplaceByIdPutApplicationsid) | **PUT** Applications/{id} | Replace attributes for a model instance and persist it into the data source.
[**applicationReplaceOrCreatePostApplicationsReplaceOrCreate**](ApplicationApi.md#applicationReplaceOrCreatePostApplicationsReplaceOrCreate) | **POST** Applications/replaceOrCreate | Replace an existing model instance or insert a new one into the data source.
[**applicationReplaceOrCreatePutApplications**](ApplicationApi.md#applicationReplaceOrCreatePutApplications) | **PUT** Applications | Replace an existing model instance or insert a new one into the data source.
[**applicationUpdateAll**](ApplicationApi.md#applicationUpdateAll) | **POST** Applications/update | Update instances of the model matched by {{where}} from the data source.
[**applicationUpsertWithWhere**](ApplicationApi.md#applicationUpsertWithWhere) | **POST** Applications/upsertWithWhere | Update an existing model instance or insert a new one into the data source based on the where criteria.


<a name="applicationCount"></a>
# **applicationCount**
> InlineResponse2002 applicationCount(where)

Count instances of the model matched by where from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApplicationApi;


ApplicationApi apiInstance = new ApplicationApi();
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse2002 result = apiInstance.applicationCount(where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#applicationCount");
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

<a name="applicationCreate"></a>
# **applicationCreate**
> Application applicationCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApplicationApi;


ApplicationApi apiInstance = new ApplicationApi();
Application data = new Application(); // Application | Model instance data
try {
    Application result = apiInstance.applicationCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#applicationCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Application**](Application.md)| Model instance data | [optional]

### Return type

[**Application**](Application.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="applicationCreateChangeStreamGetApplicationsChangeStream"></a>
# **applicationCreateChangeStreamGetApplicationsChangeStream**
> File applicationCreateChangeStreamGetApplicationsChangeStream(options)

Create a change stream.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApplicationApi;


ApplicationApi apiInstance = new ApplicationApi();
String options = "options_example"; // String | 
try {
    File result = apiInstance.applicationCreateChangeStreamGetApplicationsChangeStream(options);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#applicationCreateChangeStreamGetApplicationsChangeStream");
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

<a name="applicationCreateChangeStreamPostApplicationsChangeStream"></a>
# **applicationCreateChangeStreamPostApplicationsChangeStream**
> File applicationCreateChangeStreamPostApplicationsChangeStream(options)

Create a change stream.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApplicationApi;


ApplicationApi apiInstance = new ApplicationApi();
String options = "options_example"; // String | 
try {
    File result = apiInstance.applicationCreateChangeStreamPostApplicationsChangeStream(options);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#applicationCreateChangeStreamPostApplicationsChangeStream");
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

<a name="applicationDeleteById"></a>
# **applicationDeleteById**
> Object applicationDeleteById(id)

Delete a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApplicationApi;


ApplicationApi apiInstance = new ApplicationApi();
String id = "id_example"; // String | Model id
try {
    Object result = apiInstance.applicationDeleteById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#applicationDeleteById");
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

<a name="applicationExistsGetApplicationsidExists"></a>
# **applicationExistsGetApplicationsidExists**
> InlineResponse200 applicationExistsGetApplicationsidExists(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApplicationApi;


ApplicationApi apiInstance = new ApplicationApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.applicationExistsGetApplicationsidExists(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#applicationExistsGetApplicationsidExists");
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

<a name="applicationExistsHeadApplicationsid"></a>
# **applicationExistsHeadApplicationsid**
> InlineResponse200 applicationExistsHeadApplicationsid(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApplicationApi;


ApplicationApi apiInstance = new ApplicationApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.applicationExistsHeadApplicationsid(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#applicationExistsHeadApplicationsid");
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

<a name="applicationFind"></a>
# **applicationFind**
> List&lt;Application&gt; applicationFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApplicationApi;


ApplicationApi apiInstance = new ApplicationApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<Application> result = apiInstance.applicationFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#applicationFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;Application&gt;**](Application.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="applicationFindById"></a>
# **applicationFindById**
> Application applicationFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApplicationApi;


ApplicationApi apiInstance = new ApplicationApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Application result = apiInstance.applicationFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#applicationFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Application**](Application.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="applicationFindOne"></a>
# **applicationFindOne**
> Application applicationFindOne(filter)

Find first instance of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApplicationApi;


ApplicationApi apiInstance = new ApplicationApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Application result = apiInstance.applicationFindOne(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#applicationFindOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Application**](Application.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="applicationPatchOrCreate"></a>
# **applicationPatchOrCreate**
> Application applicationPatchOrCreate(data)

Patch an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApplicationApi;


ApplicationApi apiInstance = new ApplicationApi();
Application data = new Application(); // Application | Model instance data
try {
    Application result = apiInstance.applicationPatchOrCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#applicationPatchOrCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Application**](Application.md)| Model instance data | [optional]

### Return type

[**Application**](Application.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="applicationPrototypePatchAttributes"></a>
# **applicationPrototypePatchAttributes**
> Application applicationPrototypePatchAttributes(id, data)

Patch attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApplicationApi;


ApplicationApi apiInstance = new ApplicationApi();
String id = "id_example"; // String | Application id
Application data = new Application(); // Application | An object of model property name/value pairs
try {
    Application result = apiInstance.applicationPrototypePatchAttributes(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#applicationPrototypePatchAttributes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Application id |
 **data** | [**Application**](Application.md)| An object of model property name/value pairs | [optional]

### Return type

[**Application**](Application.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="applicationReplaceByIdPostApplicationsidReplace"></a>
# **applicationReplaceByIdPostApplicationsidReplace**
> Application applicationReplaceByIdPostApplicationsidReplace(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApplicationApi;


ApplicationApi apiInstance = new ApplicationApi();
String id = "id_example"; // String | Model id
Application data = new Application(); // Application | Model instance data
try {
    Application result = apiInstance.applicationReplaceByIdPostApplicationsidReplace(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#applicationReplaceByIdPostApplicationsidReplace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**Application**](Application.md)| Model instance data | [optional]

### Return type

[**Application**](Application.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="applicationReplaceByIdPutApplicationsid"></a>
# **applicationReplaceByIdPutApplicationsid**
> Application applicationReplaceByIdPutApplicationsid(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApplicationApi;


ApplicationApi apiInstance = new ApplicationApi();
String id = "id_example"; // String | Model id
Application data = new Application(); // Application | Model instance data
try {
    Application result = apiInstance.applicationReplaceByIdPutApplicationsid(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#applicationReplaceByIdPutApplicationsid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**Application**](Application.md)| Model instance data | [optional]

### Return type

[**Application**](Application.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="applicationReplaceOrCreatePostApplicationsReplaceOrCreate"></a>
# **applicationReplaceOrCreatePostApplicationsReplaceOrCreate**
> Application applicationReplaceOrCreatePostApplicationsReplaceOrCreate(data)

Replace an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApplicationApi;


ApplicationApi apiInstance = new ApplicationApi();
Application data = new Application(); // Application | Model instance data
try {
    Application result = apiInstance.applicationReplaceOrCreatePostApplicationsReplaceOrCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#applicationReplaceOrCreatePostApplicationsReplaceOrCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Application**](Application.md)| Model instance data | [optional]

### Return type

[**Application**](Application.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="applicationReplaceOrCreatePutApplications"></a>
# **applicationReplaceOrCreatePutApplications**
> Application applicationReplaceOrCreatePutApplications(data)

Replace an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApplicationApi;


ApplicationApi apiInstance = new ApplicationApi();
Application data = new Application(); // Application | Model instance data
try {
    Application result = apiInstance.applicationReplaceOrCreatePutApplications(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#applicationReplaceOrCreatePutApplications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Application**](Application.md)| Model instance data | [optional]

### Return type

[**Application**](Application.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="applicationUpdateAll"></a>
# **applicationUpdateAll**
> InlineResponse2001 applicationUpdateAll(where, data)

Update instances of the model matched by {{where}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApplicationApi;


ApplicationApi apiInstance = new ApplicationApi();
String where = "where_example"; // String | Criteria to match model instances
Application data = new Application(); // Application | An object of model property name/value pairs
try {
    InlineResponse2001 result = apiInstance.applicationUpdateAll(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#applicationUpdateAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**Application**](Application.md)| An object of model property name/value pairs | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="applicationUpsertWithWhere"></a>
# **applicationUpsertWithWhere**
> Application applicationUpsertWithWhere(where, data)

Update an existing model instance or insert a new one into the data source based on the where criteria.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApplicationApi;


ApplicationApi apiInstance = new ApplicationApi();
String where = "where_example"; // String | Criteria to match model instances
Application data = new Application(); // Application | An object of model property name/value pairs
try {
    Application result = apiInstance.applicationUpsertWithWhere(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#applicationUpsertWithWhere");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**Application**](Application.md)| An object of model property name/value pairs | [optional]

### Return type

[**Application**](Application.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


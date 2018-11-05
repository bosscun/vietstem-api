# RoleMappingApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**roleMappingCount**](RoleMappingApi.md#roleMappingCount) | **GET** RoleMappings/count | Count instances of the model matched by where from the data source.
[**roleMappingCreate**](RoleMappingApi.md#roleMappingCreate) | **POST** RoleMappings | Create a new instance of the model and persist it into the data source.
[**roleMappingCreateChangeStreamGetRoleMappingsChangeStream**](RoleMappingApi.md#roleMappingCreateChangeStreamGetRoleMappingsChangeStream) | **GET** RoleMappings/change-stream | Create a change stream.
[**roleMappingCreateChangeStreamPostRoleMappingsChangeStream**](RoleMappingApi.md#roleMappingCreateChangeStreamPostRoleMappingsChangeStream) | **POST** RoleMappings/change-stream | Create a change stream.
[**roleMappingDeleteById**](RoleMappingApi.md#roleMappingDeleteById) | **DELETE** RoleMappings/{id} | Delete a model instance by {{id}} from the data source.
[**roleMappingExistsGetRoleMappingsidExists**](RoleMappingApi.md#roleMappingExistsGetRoleMappingsidExists) | **GET** RoleMappings/{id}/exists | Check whether a model instance exists in the data source.
[**roleMappingExistsHeadRoleMappingsid**](RoleMappingApi.md#roleMappingExistsHeadRoleMappingsid) | **HEAD** RoleMappings/{id} | Check whether a model instance exists in the data source.
[**roleMappingFind**](RoleMappingApi.md#roleMappingFind) | **GET** RoleMappings | Find all instances of the model matched by filter from the data source.
[**roleMappingFindById**](RoleMappingApi.md#roleMappingFindById) | **GET** RoleMappings/{id} | Find a model instance by {{id}} from the data source.
[**roleMappingFindOne**](RoleMappingApi.md#roleMappingFindOne) | **GET** RoleMappings/findOne | Find first instance of the model matched by filter from the data source.
[**roleMappingPatchOrCreate**](RoleMappingApi.md#roleMappingPatchOrCreate) | **PATCH** RoleMappings | Patch an existing model instance or insert a new one into the data source.
[**roleMappingPrototypeGetRole**](RoleMappingApi.md#roleMappingPrototypeGetRole) | **GET** RoleMappings/{id}/role | Fetches belongsTo relation role.
[**roleMappingPrototypePatchAttributes**](RoleMappingApi.md#roleMappingPrototypePatchAttributes) | **PATCH** RoleMappings/{id} | Patch attributes for a model instance and persist it into the data source.
[**roleMappingReplaceByIdPostRoleMappingsidReplace**](RoleMappingApi.md#roleMappingReplaceByIdPostRoleMappingsidReplace) | **POST** RoleMappings/{id}/replace | Replace attributes for a model instance and persist it into the data source.
[**roleMappingReplaceByIdPutRoleMappingsid**](RoleMappingApi.md#roleMappingReplaceByIdPutRoleMappingsid) | **PUT** RoleMappings/{id} | Replace attributes for a model instance and persist it into the data source.
[**roleMappingReplaceOrCreatePostRoleMappingsReplaceOrCreate**](RoleMappingApi.md#roleMappingReplaceOrCreatePostRoleMappingsReplaceOrCreate) | **POST** RoleMappings/replaceOrCreate | Replace an existing model instance or insert a new one into the data source.
[**roleMappingReplaceOrCreatePutRoleMappings**](RoleMappingApi.md#roleMappingReplaceOrCreatePutRoleMappings) | **PUT** RoleMappings | Replace an existing model instance or insert a new one into the data source.
[**roleMappingUpdateAll**](RoleMappingApi.md#roleMappingUpdateAll) | **POST** RoleMappings/update | Update instances of the model matched by {{where}} from the data source.
[**roleMappingUpsertWithWhere**](RoleMappingApi.md#roleMappingUpsertWithWhere) | **POST** RoleMappings/upsertWithWhere | Update an existing model instance or insert a new one into the data source based on the where criteria.


<a name="roleMappingCount"></a>
# **roleMappingCount**
> InlineResponse2002 roleMappingCount(where)

Count instances of the model matched by where from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleMappingApi;


RoleMappingApi apiInstance = new RoleMappingApi();
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse2002 result = apiInstance.roleMappingCount(where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleMappingApi#roleMappingCount");
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

<a name="roleMappingCreate"></a>
# **roleMappingCreate**
> RoleMapping roleMappingCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleMappingApi;


RoleMappingApi apiInstance = new RoleMappingApi();
RoleMapping data = new RoleMapping(); // RoleMapping | Model instance data
try {
    RoleMapping result = apiInstance.roleMappingCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleMappingApi#roleMappingCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**RoleMapping**](RoleMapping.md)| Model instance data | [optional]

### Return type

[**RoleMapping**](RoleMapping.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="roleMappingCreateChangeStreamGetRoleMappingsChangeStream"></a>
# **roleMappingCreateChangeStreamGetRoleMappingsChangeStream**
> File roleMappingCreateChangeStreamGetRoleMappingsChangeStream(options)

Create a change stream.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleMappingApi;


RoleMappingApi apiInstance = new RoleMappingApi();
String options = "options_example"; // String | 
try {
    File result = apiInstance.roleMappingCreateChangeStreamGetRoleMappingsChangeStream(options);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleMappingApi#roleMappingCreateChangeStreamGetRoleMappingsChangeStream");
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

<a name="roleMappingCreateChangeStreamPostRoleMappingsChangeStream"></a>
# **roleMappingCreateChangeStreamPostRoleMappingsChangeStream**
> File roleMappingCreateChangeStreamPostRoleMappingsChangeStream(options)

Create a change stream.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleMappingApi;


RoleMappingApi apiInstance = new RoleMappingApi();
String options = "options_example"; // String | 
try {
    File result = apiInstance.roleMappingCreateChangeStreamPostRoleMappingsChangeStream(options);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleMappingApi#roleMappingCreateChangeStreamPostRoleMappingsChangeStream");
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

<a name="roleMappingDeleteById"></a>
# **roleMappingDeleteById**
> Object roleMappingDeleteById(id)

Delete a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleMappingApi;


RoleMappingApi apiInstance = new RoleMappingApi();
String id = "id_example"; // String | Model id
try {
    Object result = apiInstance.roleMappingDeleteById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleMappingApi#roleMappingDeleteById");
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

<a name="roleMappingExistsGetRoleMappingsidExists"></a>
# **roleMappingExistsGetRoleMappingsidExists**
> InlineResponse200 roleMappingExistsGetRoleMappingsidExists(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleMappingApi;


RoleMappingApi apiInstance = new RoleMappingApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.roleMappingExistsGetRoleMappingsidExists(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleMappingApi#roleMappingExistsGetRoleMappingsidExists");
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

<a name="roleMappingExistsHeadRoleMappingsid"></a>
# **roleMappingExistsHeadRoleMappingsid**
> InlineResponse200 roleMappingExistsHeadRoleMappingsid(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleMappingApi;


RoleMappingApi apiInstance = new RoleMappingApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.roleMappingExistsHeadRoleMappingsid(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleMappingApi#roleMappingExistsHeadRoleMappingsid");
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

<a name="roleMappingFind"></a>
# **roleMappingFind**
> List&lt;RoleMapping&gt; roleMappingFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleMappingApi;


RoleMappingApi apiInstance = new RoleMappingApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<RoleMapping> result = apiInstance.roleMappingFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleMappingApi#roleMappingFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;RoleMapping&gt;**](RoleMapping.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="roleMappingFindById"></a>
# **roleMappingFindById**
> RoleMapping roleMappingFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleMappingApi;


RoleMappingApi apiInstance = new RoleMappingApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    RoleMapping result = apiInstance.roleMappingFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleMappingApi#roleMappingFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**RoleMapping**](RoleMapping.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="roleMappingFindOne"></a>
# **roleMappingFindOne**
> RoleMapping roleMappingFindOne(filter)

Find first instance of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleMappingApi;


RoleMappingApi apiInstance = new RoleMappingApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    RoleMapping result = apiInstance.roleMappingFindOne(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleMappingApi#roleMappingFindOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**RoleMapping**](RoleMapping.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="roleMappingPatchOrCreate"></a>
# **roleMappingPatchOrCreate**
> RoleMapping roleMappingPatchOrCreate(data)

Patch an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleMappingApi;


RoleMappingApi apiInstance = new RoleMappingApi();
RoleMapping data = new RoleMapping(); // RoleMapping | Model instance data
try {
    RoleMapping result = apiInstance.roleMappingPatchOrCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleMappingApi#roleMappingPatchOrCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**RoleMapping**](RoleMapping.md)| Model instance data | [optional]

### Return type

[**RoleMapping**](RoleMapping.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="roleMappingPrototypeGetRole"></a>
# **roleMappingPrototypeGetRole**
> Role roleMappingPrototypeGetRole(id, refresh)

Fetches belongsTo relation role.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleMappingApi;


RoleMappingApi apiInstance = new RoleMappingApi();
String id = "id_example"; // String | RoleMapping id
Boolean refresh = true; // Boolean | 
try {
    Role result = apiInstance.roleMappingPrototypeGetRole(id, refresh);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleMappingApi#roleMappingPrototypeGetRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| RoleMapping id |
 **refresh** | **Boolean**|  | [optional]

### Return type

[**Role**](Role.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="roleMappingPrototypePatchAttributes"></a>
# **roleMappingPrototypePatchAttributes**
> RoleMapping roleMappingPrototypePatchAttributes(id, data)

Patch attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleMappingApi;


RoleMappingApi apiInstance = new RoleMappingApi();
String id = "id_example"; // String | RoleMapping id
RoleMapping data = new RoleMapping(); // RoleMapping | An object of model property name/value pairs
try {
    RoleMapping result = apiInstance.roleMappingPrototypePatchAttributes(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleMappingApi#roleMappingPrototypePatchAttributes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| RoleMapping id |
 **data** | [**RoleMapping**](RoleMapping.md)| An object of model property name/value pairs | [optional]

### Return type

[**RoleMapping**](RoleMapping.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="roleMappingReplaceByIdPostRoleMappingsidReplace"></a>
# **roleMappingReplaceByIdPostRoleMappingsidReplace**
> RoleMapping roleMappingReplaceByIdPostRoleMappingsidReplace(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleMappingApi;


RoleMappingApi apiInstance = new RoleMappingApi();
String id = "id_example"; // String | Model id
RoleMapping data = new RoleMapping(); // RoleMapping | Model instance data
try {
    RoleMapping result = apiInstance.roleMappingReplaceByIdPostRoleMappingsidReplace(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleMappingApi#roleMappingReplaceByIdPostRoleMappingsidReplace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**RoleMapping**](RoleMapping.md)| Model instance data | [optional]

### Return type

[**RoleMapping**](RoleMapping.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="roleMappingReplaceByIdPutRoleMappingsid"></a>
# **roleMappingReplaceByIdPutRoleMappingsid**
> RoleMapping roleMappingReplaceByIdPutRoleMappingsid(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleMappingApi;


RoleMappingApi apiInstance = new RoleMappingApi();
String id = "id_example"; // String | Model id
RoleMapping data = new RoleMapping(); // RoleMapping | Model instance data
try {
    RoleMapping result = apiInstance.roleMappingReplaceByIdPutRoleMappingsid(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleMappingApi#roleMappingReplaceByIdPutRoleMappingsid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**RoleMapping**](RoleMapping.md)| Model instance data | [optional]

### Return type

[**RoleMapping**](RoleMapping.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="roleMappingReplaceOrCreatePostRoleMappingsReplaceOrCreate"></a>
# **roleMappingReplaceOrCreatePostRoleMappingsReplaceOrCreate**
> RoleMapping roleMappingReplaceOrCreatePostRoleMappingsReplaceOrCreate(data)

Replace an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleMappingApi;


RoleMappingApi apiInstance = new RoleMappingApi();
RoleMapping data = new RoleMapping(); // RoleMapping | Model instance data
try {
    RoleMapping result = apiInstance.roleMappingReplaceOrCreatePostRoleMappingsReplaceOrCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleMappingApi#roleMappingReplaceOrCreatePostRoleMappingsReplaceOrCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**RoleMapping**](RoleMapping.md)| Model instance data | [optional]

### Return type

[**RoleMapping**](RoleMapping.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="roleMappingReplaceOrCreatePutRoleMappings"></a>
# **roleMappingReplaceOrCreatePutRoleMappings**
> RoleMapping roleMappingReplaceOrCreatePutRoleMappings(data)

Replace an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleMappingApi;


RoleMappingApi apiInstance = new RoleMappingApi();
RoleMapping data = new RoleMapping(); // RoleMapping | Model instance data
try {
    RoleMapping result = apiInstance.roleMappingReplaceOrCreatePutRoleMappings(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleMappingApi#roleMappingReplaceOrCreatePutRoleMappings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**RoleMapping**](RoleMapping.md)| Model instance data | [optional]

### Return type

[**RoleMapping**](RoleMapping.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="roleMappingUpdateAll"></a>
# **roleMappingUpdateAll**
> InlineResponse2001 roleMappingUpdateAll(where, data)

Update instances of the model matched by {{where}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleMappingApi;


RoleMappingApi apiInstance = new RoleMappingApi();
String where = "where_example"; // String | Criteria to match model instances
RoleMapping data = new RoleMapping(); // RoleMapping | An object of model property name/value pairs
try {
    InlineResponse2001 result = apiInstance.roleMappingUpdateAll(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleMappingApi#roleMappingUpdateAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**RoleMapping**](RoleMapping.md)| An object of model property name/value pairs | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="roleMappingUpsertWithWhere"></a>
# **roleMappingUpsertWithWhere**
> RoleMapping roleMappingUpsertWithWhere(where, data)

Update an existing model instance or insert a new one into the data source based on the where criteria.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleMappingApi;


RoleMappingApi apiInstance = new RoleMappingApi();
String where = "where_example"; // String | Criteria to match model instances
RoleMapping data = new RoleMapping(); // RoleMapping | An object of model property name/value pairs
try {
    RoleMapping result = apiInstance.roleMappingUpsertWithWhere(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleMappingApi#roleMappingUpsertWithWhere");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**RoleMapping**](RoleMapping.md)| An object of model property name/value pairs | [optional]

### Return type

[**RoleMapping**](RoleMapping.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


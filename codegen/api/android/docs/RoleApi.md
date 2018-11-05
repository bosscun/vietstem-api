# RoleApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**roleCount**](RoleApi.md#roleCount) | **GET** Roles/count | Count instances of the model matched by where from the data source.
[**roleCreate**](RoleApi.md#roleCreate) | **POST** Roles | Create a new instance of the model and persist it into the data source.
[**roleCreateChangeStreamGetRolesChangeStream**](RoleApi.md#roleCreateChangeStreamGetRolesChangeStream) | **GET** Roles/change-stream | Create a change stream.
[**roleCreateChangeStreamPostRolesChangeStream**](RoleApi.md#roleCreateChangeStreamPostRolesChangeStream) | **POST** Roles/change-stream | Create a change stream.
[**roleDeleteById**](RoleApi.md#roleDeleteById) | **DELETE** Roles/{id} | Delete a model instance by {{id}} from the data source.
[**roleExistsGetRolesidExists**](RoleApi.md#roleExistsGetRolesidExists) | **GET** Roles/{id}/exists | Check whether a model instance exists in the data source.
[**roleExistsHeadRolesid**](RoleApi.md#roleExistsHeadRolesid) | **HEAD** Roles/{id} | Check whether a model instance exists in the data source.
[**roleFind**](RoleApi.md#roleFind) | **GET** Roles | Find all instances of the model matched by filter from the data source.
[**roleFindById**](RoleApi.md#roleFindById) | **GET** Roles/{id} | Find a model instance by {{id}} from the data source.
[**roleFindOne**](RoleApi.md#roleFindOne) | **GET** Roles/findOne | Find first instance of the model matched by filter from the data source.
[**rolePatchOrCreate**](RoleApi.md#rolePatchOrCreate) | **PATCH** Roles | Patch an existing model instance or insert a new one into the data source.
[**rolePrototypeCountPrincipals**](RoleApi.md#rolePrototypeCountPrincipals) | **GET** Roles/{id}/principals/count | Counts principals of Role.
[**rolePrototypeCreatePrincipals**](RoleApi.md#rolePrototypeCreatePrincipals) | **POST** Roles/{id}/principals | Creates a new instance in principals of this model.
[**rolePrototypeDeletePrincipals**](RoleApi.md#rolePrototypeDeletePrincipals) | **DELETE** Roles/{id}/principals | Deletes all principals of this model.
[**rolePrototypeDestroyByIdPrincipals**](RoleApi.md#rolePrototypeDestroyByIdPrincipals) | **DELETE** Roles/{id}/principals/{fk} | Delete a related item by id for principals.
[**rolePrototypeFindByIdPrincipals**](RoleApi.md#rolePrototypeFindByIdPrincipals) | **GET** Roles/{id}/principals/{fk} | Find a related item by id for principals.
[**rolePrototypeGetPrincipals**](RoleApi.md#rolePrototypeGetPrincipals) | **GET** Roles/{id}/principals | Queries principals of Role.
[**rolePrototypePatchAttributes**](RoleApi.md#rolePrototypePatchAttributes) | **PATCH** Roles/{id} | Patch attributes for a model instance and persist it into the data source.
[**rolePrototypeUpdateByIdPrincipals**](RoleApi.md#rolePrototypeUpdateByIdPrincipals) | **PUT** Roles/{id}/principals/{fk} | Update a related item by id for principals.
[**roleReplaceByIdPostRolesidReplace**](RoleApi.md#roleReplaceByIdPostRolesidReplace) | **POST** Roles/{id}/replace | Replace attributes for a model instance and persist it into the data source.
[**roleReplaceByIdPutRolesid**](RoleApi.md#roleReplaceByIdPutRolesid) | **PUT** Roles/{id} | Replace attributes for a model instance and persist it into the data source.
[**roleReplaceOrCreatePostRolesReplaceOrCreate**](RoleApi.md#roleReplaceOrCreatePostRolesReplaceOrCreate) | **POST** Roles/replaceOrCreate | Replace an existing model instance or insert a new one into the data source.
[**roleReplaceOrCreatePutRoles**](RoleApi.md#roleReplaceOrCreatePutRoles) | **PUT** Roles | Replace an existing model instance or insert a new one into the data source.
[**roleUpdateAll**](RoleApi.md#roleUpdateAll) | **POST** Roles/update | Update instances of the model matched by {{where}} from the data source.
[**roleUpsertWithWhere**](RoleApi.md#roleUpsertWithWhere) | **POST** Roles/upsertWithWhere | Update an existing model instance or insert a new one into the data source based on the where criteria.


<a name="roleCount"></a>
# **roleCount**
> InlineResponse2002 roleCount(where)

Count instances of the model matched by where from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse2002 result = apiInstance.roleCount(where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#roleCount");
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

<a name="roleCreate"></a>
# **roleCreate**
> Role roleCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
Role data = new Role(); // Role | Model instance data
try {
    Role result = apiInstance.roleCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#roleCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Role**](Role.md)| Model instance data | [optional]

### Return type

[**Role**](Role.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="roleCreateChangeStreamGetRolesChangeStream"></a>
# **roleCreateChangeStreamGetRolesChangeStream**
> File roleCreateChangeStreamGetRolesChangeStream(options)

Create a change stream.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
String options = "options_example"; // String | 
try {
    File result = apiInstance.roleCreateChangeStreamGetRolesChangeStream(options);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#roleCreateChangeStreamGetRolesChangeStream");
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

<a name="roleCreateChangeStreamPostRolesChangeStream"></a>
# **roleCreateChangeStreamPostRolesChangeStream**
> File roleCreateChangeStreamPostRolesChangeStream(options)

Create a change stream.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
String options = "options_example"; // String | 
try {
    File result = apiInstance.roleCreateChangeStreamPostRolesChangeStream(options);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#roleCreateChangeStreamPostRolesChangeStream");
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

<a name="roleDeleteById"></a>
# **roleDeleteById**
> Object roleDeleteById(id)

Delete a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
String id = "id_example"; // String | Model id
try {
    Object result = apiInstance.roleDeleteById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#roleDeleteById");
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

<a name="roleExistsGetRolesidExists"></a>
# **roleExistsGetRolesidExists**
> InlineResponse200 roleExistsGetRolesidExists(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.roleExistsGetRolesidExists(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#roleExistsGetRolesidExists");
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

<a name="roleExistsHeadRolesid"></a>
# **roleExistsHeadRolesid**
> InlineResponse200 roleExistsHeadRolesid(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.roleExistsHeadRolesid(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#roleExistsHeadRolesid");
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

<a name="roleFind"></a>
# **roleFind**
> List&lt;Role&gt; roleFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<Role> result = apiInstance.roleFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#roleFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;Role&gt;**](Role.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="roleFindById"></a>
# **roleFindById**
> Role roleFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Role result = apiInstance.roleFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#roleFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Role**](Role.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="roleFindOne"></a>
# **roleFindOne**
> Role roleFindOne(filter)

Find first instance of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Role result = apiInstance.roleFindOne(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#roleFindOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Role**](Role.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="rolePatchOrCreate"></a>
# **rolePatchOrCreate**
> Role rolePatchOrCreate(data)

Patch an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
Role data = new Role(); // Role | Model instance data
try {
    Role result = apiInstance.rolePatchOrCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#rolePatchOrCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Role**](Role.md)| Model instance data | [optional]

### Return type

[**Role**](Role.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="rolePrototypeCountPrincipals"></a>
# **rolePrototypeCountPrincipals**
> InlineResponse2002 rolePrototypeCountPrincipals(id, where)

Counts principals of Role.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
String id = "id_example"; // String | Role id
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse2002 result = apiInstance.rolePrototypeCountPrincipals(id, where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#rolePrototypeCountPrincipals");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Role id |
 **where** | **String**| Criteria to match model instances | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="rolePrototypeCreatePrincipals"></a>
# **rolePrototypeCreatePrincipals**
> RoleMapping rolePrototypeCreatePrincipals(id, data)

Creates a new instance in principals of this model.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
String id = "id_example"; // String | Role id
RoleMapping data = new RoleMapping(); // RoleMapping | 
try {
    RoleMapping result = apiInstance.rolePrototypeCreatePrincipals(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#rolePrototypeCreatePrincipals");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Role id |
 **data** | [**RoleMapping**](RoleMapping.md)|  | [optional]

### Return type

[**RoleMapping**](RoleMapping.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="rolePrototypeDeletePrincipals"></a>
# **rolePrototypeDeletePrincipals**
> Void rolePrototypeDeletePrincipals(id)

Deletes all principals of this model.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
String id = "id_example"; // String | Role id
try {
    Void result = apiInstance.rolePrototypeDeletePrincipals(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#rolePrototypeDeletePrincipals");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Role id |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="rolePrototypeDestroyByIdPrincipals"></a>
# **rolePrototypeDestroyByIdPrincipals**
> Void rolePrototypeDestroyByIdPrincipals(id, fk)

Delete a related item by id for principals.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
String id = "id_example"; // String | Role id
String fk = "fk_example"; // String | Foreign key for principals
try {
    Void result = apiInstance.rolePrototypeDestroyByIdPrincipals(id, fk);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#rolePrototypeDestroyByIdPrincipals");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Role id |
 **fk** | **String**| Foreign key for principals |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="rolePrototypeFindByIdPrincipals"></a>
# **rolePrototypeFindByIdPrincipals**
> RoleMapping rolePrototypeFindByIdPrincipals(id, fk)

Find a related item by id for principals.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
String id = "id_example"; // String | Role id
String fk = "fk_example"; // String | Foreign key for principals
try {
    RoleMapping result = apiInstance.rolePrototypeFindByIdPrincipals(id, fk);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#rolePrototypeFindByIdPrincipals");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Role id |
 **fk** | **String**| Foreign key for principals |

### Return type

[**RoleMapping**](RoleMapping.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="rolePrototypeGetPrincipals"></a>
# **rolePrototypeGetPrincipals**
> List&lt;RoleMapping&gt; rolePrototypeGetPrincipals(id, filter)

Queries principals of Role.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
String id = "id_example"; // String | Role id
String filter = "filter_example"; // String | 
try {
    List<RoleMapping> result = apiInstance.rolePrototypeGetPrincipals(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#rolePrototypeGetPrincipals");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Role id |
 **filter** | **String**|  | [optional]

### Return type

[**List&lt;RoleMapping&gt;**](RoleMapping.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="rolePrototypePatchAttributes"></a>
# **rolePrototypePatchAttributes**
> Role rolePrototypePatchAttributes(id, data)

Patch attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
String id = "id_example"; // String | Role id
Role data = new Role(); // Role | An object of model property name/value pairs
try {
    Role result = apiInstance.rolePrototypePatchAttributes(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#rolePrototypePatchAttributes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Role id |
 **data** | [**Role**](Role.md)| An object of model property name/value pairs | [optional]

### Return type

[**Role**](Role.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="rolePrototypeUpdateByIdPrincipals"></a>
# **rolePrototypeUpdateByIdPrincipals**
> RoleMapping rolePrototypeUpdateByIdPrincipals(id, fk, data)

Update a related item by id for principals.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
String id = "id_example"; // String | Role id
String fk = "fk_example"; // String | Foreign key for principals
RoleMapping data = new RoleMapping(); // RoleMapping | 
try {
    RoleMapping result = apiInstance.rolePrototypeUpdateByIdPrincipals(id, fk, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#rolePrototypeUpdateByIdPrincipals");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Role id |
 **fk** | **String**| Foreign key for principals |
 **data** | [**RoleMapping**](RoleMapping.md)|  | [optional]

### Return type

[**RoleMapping**](RoleMapping.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="roleReplaceByIdPostRolesidReplace"></a>
# **roleReplaceByIdPostRolesidReplace**
> Role roleReplaceByIdPostRolesidReplace(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
String id = "id_example"; // String | Model id
Role data = new Role(); // Role | Model instance data
try {
    Role result = apiInstance.roleReplaceByIdPostRolesidReplace(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#roleReplaceByIdPostRolesidReplace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**Role**](Role.md)| Model instance data | [optional]

### Return type

[**Role**](Role.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="roleReplaceByIdPutRolesid"></a>
# **roleReplaceByIdPutRolesid**
> Role roleReplaceByIdPutRolesid(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
String id = "id_example"; // String | Model id
Role data = new Role(); // Role | Model instance data
try {
    Role result = apiInstance.roleReplaceByIdPutRolesid(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#roleReplaceByIdPutRolesid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**Role**](Role.md)| Model instance data | [optional]

### Return type

[**Role**](Role.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="roleReplaceOrCreatePostRolesReplaceOrCreate"></a>
# **roleReplaceOrCreatePostRolesReplaceOrCreate**
> Role roleReplaceOrCreatePostRolesReplaceOrCreate(data)

Replace an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
Role data = new Role(); // Role | Model instance data
try {
    Role result = apiInstance.roleReplaceOrCreatePostRolesReplaceOrCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#roleReplaceOrCreatePostRolesReplaceOrCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Role**](Role.md)| Model instance data | [optional]

### Return type

[**Role**](Role.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="roleReplaceOrCreatePutRoles"></a>
# **roleReplaceOrCreatePutRoles**
> Role roleReplaceOrCreatePutRoles(data)

Replace an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
Role data = new Role(); // Role | Model instance data
try {
    Role result = apiInstance.roleReplaceOrCreatePutRoles(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#roleReplaceOrCreatePutRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Role**](Role.md)| Model instance data | [optional]

### Return type

[**Role**](Role.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="roleUpdateAll"></a>
# **roleUpdateAll**
> InlineResponse2001 roleUpdateAll(where, data)

Update instances of the model matched by {{where}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
String where = "where_example"; // String | Criteria to match model instances
Role data = new Role(); // Role | An object of model property name/value pairs
try {
    InlineResponse2001 result = apiInstance.roleUpdateAll(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#roleUpdateAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**Role**](Role.md)| An object of model property name/value pairs | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="roleUpsertWithWhere"></a>
# **roleUpsertWithWhere**
> Role roleUpsertWithWhere(where, data)

Update an existing model instance or insert a new one into the data source based on the where criteria.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
String where = "where_example"; // String | Criteria to match model instances
Role data = new Role(); // Role | An object of model property name/value pairs
try {
    Role result = apiInstance.roleUpsertWithWhere(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#roleUpsertWithWhere");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**Role**](Role.md)| An object of model property name/value pairs | [optional]

### Return type

[**Role**](Role.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


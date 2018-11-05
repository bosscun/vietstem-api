# CompanyApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companyCount**](CompanyApi.md#companyCount) | **GET** Companies/count | Count instances of the model matched by where from the data source.
[**companyCreate**](CompanyApi.md#companyCreate) | **POST** Companies | Create a new instance of the model and persist it into the data source.
[**companyCreateChangeStreamGetCompaniesChangeStream**](CompanyApi.md#companyCreateChangeStreamGetCompaniesChangeStream) | **GET** Companies/change-stream | Create a change stream.
[**companyCreateChangeStreamPostCompaniesChangeStream**](CompanyApi.md#companyCreateChangeStreamPostCompaniesChangeStream) | **POST** Companies/change-stream | Create a change stream.
[**companyDeleteById**](CompanyApi.md#companyDeleteById) | **DELETE** Companies/{id} | Delete a model instance by {{id}} from the data source.
[**companyExistsGetCompaniesidExists**](CompanyApi.md#companyExistsGetCompaniesidExists) | **GET** Companies/{id}/exists | Check whether a model instance exists in the data source.
[**companyExistsHeadCompaniesid**](CompanyApi.md#companyExistsHeadCompaniesid) | **HEAD** Companies/{id} | Check whether a model instance exists in the data source.
[**companyFind**](CompanyApi.md#companyFind) | **GET** Companies | Find all instances of the model matched by filter from the data source.
[**companyFindById**](CompanyApi.md#companyFindById) | **GET** Companies/{id} | Find a model instance by {{id}} from the data source.
[**companyFindOne**](CompanyApi.md#companyFindOne) | **GET** Companies/findOne | Find first instance of the model matched by filter from the data source.
[**companyPatchOrCreate**](CompanyApi.md#companyPatchOrCreate) | **PATCH** Companies | Patch an existing model instance or insert a new one into the data source.
[**companyPrototypePatchAttributes**](CompanyApi.md#companyPrototypePatchAttributes) | **PATCH** Companies/{id} | Patch attributes for a model instance and persist it into the data source.
[**companyReplaceByIdPostCompaniesidReplace**](CompanyApi.md#companyReplaceByIdPostCompaniesidReplace) | **POST** Companies/{id}/replace | Replace attributes for a model instance and persist it into the data source.
[**companyReplaceByIdPutCompaniesid**](CompanyApi.md#companyReplaceByIdPutCompaniesid) | **PUT** Companies/{id} | Replace attributes for a model instance and persist it into the data source.
[**companyReplaceOrCreatePostCompaniesReplaceOrCreate**](CompanyApi.md#companyReplaceOrCreatePostCompaniesReplaceOrCreate) | **POST** Companies/replaceOrCreate | Replace an existing model instance or insert a new one into the data source.
[**companyReplaceOrCreatePutCompanies**](CompanyApi.md#companyReplaceOrCreatePutCompanies) | **PUT** Companies | Replace an existing model instance or insert a new one into the data source.
[**companyUpdateAll**](CompanyApi.md#companyUpdateAll) | **POST** Companies/update | Update instances of the model matched by {{where}} from the data source.
[**companyUpsertWithWhere**](CompanyApi.md#companyUpsertWithWhere) | **POST** Companies/upsertWithWhere | Update an existing model instance or insert a new one into the data source based on the where criteria.


<a name="companyCount"></a>
# **companyCount**
> InlineResponse2002 companyCount(where)

Count instances of the model matched by where from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyApi;


CompanyApi apiInstance = new CompanyApi();
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse2002 result = apiInstance.companyCount(where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#companyCount");
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

<a name="companyCreate"></a>
# **companyCreate**
> Company companyCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyApi;


CompanyApi apiInstance = new CompanyApi();
Company data = new Company(); // Company | Model instance data
try {
    Company result = apiInstance.companyCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#companyCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Company**](Company.md)| Model instance data | [optional]

### Return type

[**Company**](Company.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="companyCreateChangeStreamGetCompaniesChangeStream"></a>
# **companyCreateChangeStreamGetCompaniesChangeStream**
> File companyCreateChangeStreamGetCompaniesChangeStream(options)

Create a change stream.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyApi;


CompanyApi apiInstance = new CompanyApi();
String options = "options_example"; // String | 
try {
    File result = apiInstance.companyCreateChangeStreamGetCompaniesChangeStream(options);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#companyCreateChangeStreamGetCompaniesChangeStream");
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

<a name="companyCreateChangeStreamPostCompaniesChangeStream"></a>
# **companyCreateChangeStreamPostCompaniesChangeStream**
> File companyCreateChangeStreamPostCompaniesChangeStream(options)

Create a change stream.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyApi;


CompanyApi apiInstance = new CompanyApi();
String options = "options_example"; // String | 
try {
    File result = apiInstance.companyCreateChangeStreamPostCompaniesChangeStream(options);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#companyCreateChangeStreamPostCompaniesChangeStream");
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

<a name="companyDeleteById"></a>
# **companyDeleteById**
> Object companyDeleteById(id)

Delete a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyApi;


CompanyApi apiInstance = new CompanyApi();
String id = "id_example"; // String | Model id
try {
    Object result = apiInstance.companyDeleteById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#companyDeleteById");
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

<a name="companyExistsGetCompaniesidExists"></a>
# **companyExistsGetCompaniesidExists**
> InlineResponse200 companyExistsGetCompaniesidExists(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyApi;


CompanyApi apiInstance = new CompanyApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.companyExistsGetCompaniesidExists(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#companyExistsGetCompaniesidExists");
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

<a name="companyExistsHeadCompaniesid"></a>
# **companyExistsHeadCompaniesid**
> InlineResponse200 companyExistsHeadCompaniesid(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyApi;


CompanyApi apiInstance = new CompanyApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.companyExistsHeadCompaniesid(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#companyExistsHeadCompaniesid");
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

<a name="companyFind"></a>
# **companyFind**
> List&lt;Company&gt; companyFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyApi;


CompanyApi apiInstance = new CompanyApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<Company> result = apiInstance.companyFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#companyFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;Company&gt;**](Company.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="companyFindById"></a>
# **companyFindById**
> Company companyFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyApi;


CompanyApi apiInstance = new CompanyApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Company result = apiInstance.companyFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#companyFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Company**](Company.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="companyFindOne"></a>
# **companyFindOne**
> Company companyFindOne(filter)

Find first instance of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyApi;


CompanyApi apiInstance = new CompanyApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Company result = apiInstance.companyFindOne(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#companyFindOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Company**](Company.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="companyPatchOrCreate"></a>
# **companyPatchOrCreate**
> Company companyPatchOrCreate(data)

Patch an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyApi;


CompanyApi apiInstance = new CompanyApi();
Company data = new Company(); // Company | Model instance data
try {
    Company result = apiInstance.companyPatchOrCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#companyPatchOrCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Company**](Company.md)| Model instance data | [optional]

### Return type

[**Company**](Company.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="companyPrototypePatchAttributes"></a>
# **companyPrototypePatchAttributes**
> Company companyPrototypePatchAttributes(id, data)

Patch attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyApi;


CompanyApi apiInstance = new CompanyApi();
String id = "id_example"; // String | Company id
Company data = new Company(); // Company | An object of model property name/value pairs
try {
    Company result = apiInstance.companyPrototypePatchAttributes(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#companyPrototypePatchAttributes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Company id |
 **data** | [**Company**](Company.md)| An object of model property name/value pairs | [optional]

### Return type

[**Company**](Company.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="companyReplaceByIdPostCompaniesidReplace"></a>
# **companyReplaceByIdPostCompaniesidReplace**
> Company companyReplaceByIdPostCompaniesidReplace(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyApi;


CompanyApi apiInstance = new CompanyApi();
String id = "id_example"; // String | Model id
Company data = new Company(); // Company | Model instance data
try {
    Company result = apiInstance.companyReplaceByIdPostCompaniesidReplace(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#companyReplaceByIdPostCompaniesidReplace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**Company**](Company.md)| Model instance data | [optional]

### Return type

[**Company**](Company.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="companyReplaceByIdPutCompaniesid"></a>
# **companyReplaceByIdPutCompaniesid**
> Company companyReplaceByIdPutCompaniesid(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyApi;


CompanyApi apiInstance = new CompanyApi();
String id = "id_example"; // String | Model id
Company data = new Company(); // Company | Model instance data
try {
    Company result = apiInstance.companyReplaceByIdPutCompaniesid(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#companyReplaceByIdPutCompaniesid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**Company**](Company.md)| Model instance data | [optional]

### Return type

[**Company**](Company.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="companyReplaceOrCreatePostCompaniesReplaceOrCreate"></a>
# **companyReplaceOrCreatePostCompaniesReplaceOrCreate**
> Company companyReplaceOrCreatePostCompaniesReplaceOrCreate(data)

Replace an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyApi;


CompanyApi apiInstance = new CompanyApi();
Company data = new Company(); // Company | Model instance data
try {
    Company result = apiInstance.companyReplaceOrCreatePostCompaniesReplaceOrCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#companyReplaceOrCreatePostCompaniesReplaceOrCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Company**](Company.md)| Model instance data | [optional]

### Return type

[**Company**](Company.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="companyReplaceOrCreatePutCompanies"></a>
# **companyReplaceOrCreatePutCompanies**
> Company companyReplaceOrCreatePutCompanies(data)

Replace an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyApi;


CompanyApi apiInstance = new CompanyApi();
Company data = new Company(); // Company | Model instance data
try {
    Company result = apiInstance.companyReplaceOrCreatePutCompanies(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#companyReplaceOrCreatePutCompanies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Company**](Company.md)| Model instance data | [optional]

### Return type

[**Company**](Company.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="companyUpdateAll"></a>
# **companyUpdateAll**
> InlineResponse2001 companyUpdateAll(where, data)

Update instances of the model matched by {{where}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyApi;


CompanyApi apiInstance = new CompanyApi();
String where = "where_example"; // String | Criteria to match model instances
Company data = new Company(); // Company | An object of model property name/value pairs
try {
    InlineResponse2001 result = apiInstance.companyUpdateAll(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#companyUpdateAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**Company**](Company.md)| An object of model property name/value pairs | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="companyUpsertWithWhere"></a>
# **companyUpsertWithWhere**
> Company companyUpsertWithWhere(where, data)

Update an existing model instance or insert a new one into the data source based on the where criteria.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyApi;


CompanyApi apiInstance = new CompanyApi();
String where = "where_example"; // String | Criteria to match model instances
Company data = new Company(); // Company | An object of model property name/value pairs
try {
    Company result = apiInstance.companyUpsertWithWhere(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#companyUpsertWithWhere");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**Company**](Company.md)| An object of model property name/value pairs | [optional]

### Return type

[**Company**](Company.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


# FaqApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**faqCount**](FaqApi.md#faqCount) | **GET** Faqs/count | Count instances of the model matched by where from the data source.
[**faqCreate**](FaqApi.md#faqCreate) | **POST** Faqs | Create a new instance of the model and persist it into the data source.
[**faqCreateChangeStreamGetFaqsChangeStream**](FaqApi.md#faqCreateChangeStreamGetFaqsChangeStream) | **GET** Faqs/change-stream | Create a change stream.
[**faqCreateChangeStreamPostFaqsChangeStream**](FaqApi.md#faqCreateChangeStreamPostFaqsChangeStream) | **POST** Faqs/change-stream | Create a change stream.
[**faqDeleteById**](FaqApi.md#faqDeleteById) | **DELETE** Faqs/{id} | Delete a model instance by {{id}} from the data source.
[**faqExistsGetFaqsidExists**](FaqApi.md#faqExistsGetFaqsidExists) | **GET** Faqs/{id}/exists | Check whether a model instance exists in the data source.
[**faqExistsHeadFaqsid**](FaqApi.md#faqExistsHeadFaqsid) | **HEAD** Faqs/{id} | Check whether a model instance exists in the data source.
[**faqFind**](FaqApi.md#faqFind) | **GET** Faqs | Find all instances of the model matched by filter from the data source.
[**faqFindById**](FaqApi.md#faqFindById) | **GET** Faqs/{id} | Find a model instance by {{id}} from the data source.
[**faqFindOne**](FaqApi.md#faqFindOne) | **GET** Faqs/findOne | Find first instance of the model matched by filter from the data source.
[**faqPatchOrCreate**](FaqApi.md#faqPatchOrCreate) | **PATCH** Faqs | Patch an existing model instance or insert a new one into the data source.
[**faqPrototypePatchAttributes**](FaqApi.md#faqPrototypePatchAttributes) | **PATCH** Faqs/{id} | Patch attributes for a model instance and persist it into the data source.
[**faqReplaceByIdPostFaqsidReplace**](FaqApi.md#faqReplaceByIdPostFaqsidReplace) | **POST** Faqs/{id}/replace | Replace attributes for a model instance and persist it into the data source.
[**faqReplaceByIdPutFaqsid**](FaqApi.md#faqReplaceByIdPutFaqsid) | **PUT** Faqs/{id} | Replace attributes for a model instance and persist it into the data source.
[**faqReplaceOrCreatePostFaqsReplaceOrCreate**](FaqApi.md#faqReplaceOrCreatePostFaqsReplaceOrCreate) | **POST** Faqs/replaceOrCreate | Replace an existing model instance or insert a new one into the data source.
[**faqReplaceOrCreatePutFaqs**](FaqApi.md#faqReplaceOrCreatePutFaqs) | **PUT** Faqs | Replace an existing model instance or insert a new one into the data source.
[**faqUpdateAll**](FaqApi.md#faqUpdateAll) | **POST** Faqs/update | Update instances of the model matched by {{where}} from the data source.
[**faqUpsertWithWhere**](FaqApi.md#faqUpsertWithWhere) | **POST** Faqs/upsertWithWhere | Update an existing model instance or insert a new one into the data source based on the where criteria.


<a name="faqCount"></a>
# **faqCount**
> InlineResponse2002 faqCount(where)

Count instances of the model matched by where from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FaqApi;


FaqApi apiInstance = new FaqApi();
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse2002 result = apiInstance.faqCount(where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaqApi#faqCount");
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

<a name="faqCreate"></a>
# **faqCreate**
> Faq faqCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FaqApi;


FaqApi apiInstance = new FaqApi();
Faq data = new Faq(); // Faq | Model instance data
try {
    Faq result = apiInstance.faqCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaqApi#faqCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Faq**](Faq.md)| Model instance data | [optional]

### Return type

[**Faq**](Faq.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="faqCreateChangeStreamGetFaqsChangeStream"></a>
# **faqCreateChangeStreamGetFaqsChangeStream**
> File faqCreateChangeStreamGetFaqsChangeStream(options)

Create a change stream.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FaqApi;


FaqApi apiInstance = new FaqApi();
String options = "options_example"; // String | 
try {
    File result = apiInstance.faqCreateChangeStreamGetFaqsChangeStream(options);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaqApi#faqCreateChangeStreamGetFaqsChangeStream");
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

<a name="faqCreateChangeStreamPostFaqsChangeStream"></a>
# **faqCreateChangeStreamPostFaqsChangeStream**
> File faqCreateChangeStreamPostFaqsChangeStream(options)

Create a change stream.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FaqApi;


FaqApi apiInstance = new FaqApi();
String options = "options_example"; // String | 
try {
    File result = apiInstance.faqCreateChangeStreamPostFaqsChangeStream(options);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaqApi#faqCreateChangeStreamPostFaqsChangeStream");
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

<a name="faqDeleteById"></a>
# **faqDeleteById**
> Object faqDeleteById(id)

Delete a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FaqApi;


FaqApi apiInstance = new FaqApi();
String id = "id_example"; // String | Model id
try {
    Object result = apiInstance.faqDeleteById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaqApi#faqDeleteById");
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

<a name="faqExistsGetFaqsidExists"></a>
# **faqExistsGetFaqsidExists**
> InlineResponse200 faqExistsGetFaqsidExists(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FaqApi;


FaqApi apiInstance = new FaqApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.faqExistsGetFaqsidExists(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaqApi#faqExistsGetFaqsidExists");
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

<a name="faqExistsHeadFaqsid"></a>
# **faqExistsHeadFaqsid**
> InlineResponse200 faqExistsHeadFaqsid(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FaqApi;


FaqApi apiInstance = new FaqApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.faqExistsHeadFaqsid(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaqApi#faqExistsHeadFaqsid");
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

<a name="faqFind"></a>
# **faqFind**
> List&lt;Faq&gt; faqFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FaqApi;


FaqApi apiInstance = new FaqApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<Faq> result = apiInstance.faqFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaqApi#faqFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;Faq&gt;**](Faq.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="faqFindById"></a>
# **faqFindById**
> Faq faqFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FaqApi;


FaqApi apiInstance = new FaqApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Faq result = apiInstance.faqFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaqApi#faqFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Faq**](Faq.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="faqFindOne"></a>
# **faqFindOne**
> Faq faqFindOne(filter)

Find first instance of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FaqApi;


FaqApi apiInstance = new FaqApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Faq result = apiInstance.faqFindOne(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaqApi#faqFindOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Faq**](Faq.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="faqPatchOrCreate"></a>
# **faqPatchOrCreate**
> Faq faqPatchOrCreate(data)

Patch an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FaqApi;


FaqApi apiInstance = new FaqApi();
Faq data = new Faq(); // Faq | Model instance data
try {
    Faq result = apiInstance.faqPatchOrCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaqApi#faqPatchOrCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Faq**](Faq.md)| Model instance data | [optional]

### Return type

[**Faq**](Faq.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="faqPrototypePatchAttributes"></a>
# **faqPrototypePatchAttributes**
> Faq faqPrototypePatchAttributes(id, data)

Patch attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FaqApi;


FaqApi apiInstance = new FaqApi();
String id = "id_example"; // String | Faq id
Faq data = new Faq(); // Faq | An object of model property name/value pairs
try {
    Faq result = apiInstance.faqPrototypePatchAttributes(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaqApi#faqPrototypePatchAttributes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Faq id |
 **data** | [**Faq**](Faq.md)| An object of model property name/value pairs | [optional]

### Return type

[**Faq**](Faq.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="faqReplaceByIdPostFaqsidReplace"></a>
# **faqReplaceByIdPostFaqsidReplace**
> Faq faqReplaceByIdPostFaqsidReplace(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FaqApi;


FaqApi apiInstance = new FaqApi();
String id = "id_example"; // String | Model id
Faq data = new Faq(); // Faq | Model instance data
try {
    Faq result = apiInstance.faqReplaceByIdPostFaqsidReplace(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaqApi#faqReplaceByIdPostFaqsidReplace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**Faq**](Faq.md)| Model instance data | [optional]

### Return type

[**Faq**](Faq.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="faqReplaceByIdPutFaqsid"></a>
# **faqReplaceByIdPutFaqsid**
> Faq faqReplaceByIdPutFaqsid(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FaqApi;


FaqApi apiInstance = new FaqApi();
String id = "id_example"; // String | Model id
Faq data = new Faq(); // Faq | Model instance data
try {
    Faq result = apiInstance.faqReplaceByIdPutFaqsid(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaqApi#faqReplaceByIdPutFaqsid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**Faq**](Faq.md)| Model instance data | [optional]

### Return type

[**Faq**](Faq.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="faqReplaceOrCreatePostFaqsReplaceOrCreate"></a>
# **faqReplaceOrCreatePostFaqsReplaceOrCreate**
> Faq faqReplaceOrCreatePostFaqsReplaceOrCreate(data)

Replace an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FaqApi;


FaqApi apiInstance = new FaqApi();
Faq data = new Faq(); // Faq | Model instance data
try {
    Faq result = apiInstance.faqReplaceOrCreatePostFaqsReplaceOrCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaqApi#faqReplaceOrCreatePostFaqsReplaceOrCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Faq**](Faq.md)| Model instance data | [optional]

### Return type

[**Faq**](Faq.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="faqReplaceOrCreatePutFaqs"></a>
# **faqReplaceOrCreatePutFaqs**
> Faq faqReplaceOrCreatePutFaqs(data)

Replace an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FaqApi;


FaqApi apiInstance = new FaqApi();
Faq data = new Faq(); // Faq | Model instance data
try {
    Faq result = apiInstance.faqReplaceOrCreatePutFaqs(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaqApi#faqReplaceOrCreatePutFaqs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Faq**](Faq.md)| Model instance data | [optional]

### Return type

[**Faq**](Faq.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="faqUpdateAll"></a>
# **faqUpdateAll**
> InlineResponse2001 faqUpdateAll(where, data)

Update instances of the model matched by {{where}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FaqApi;


FaqApi apiInstance = new FaqApi();
String where = "where_example"; // String | Criteria to match model instances
Faq data = new Faq(); // Faq | An object of model property name/value pairs
try {
    InlineResponse2001 result = apiInstance.faqUpdateAll(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaqApi#faqUpdateAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**Faq**](Faq.md)| An object of model property name/value pairs | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="faqUpsertWithWhere"></a>
# **faqUpsertWithWhere**
> Faq faqUpsertWithWhere(where, data)

Update an existing model instance or insert a new one into the data source based on the where criteria.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FaqApi;


FaqApi apiInstance = new FaqApi();
String where = "where_example"; // String | Criteria to match model instances
Faq data = new Faq(); // Faq | An object of model property name/value pairs
try {
    Faq result = apiInstance.faqUpsertWithWhere(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaqApi#faqUpsertWithWhere");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**Faq**](Faq.md)| An object of model property name/value pairs | [optional]

### Return type

[**Faq**](Faq.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


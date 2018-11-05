# ProductApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**productCount**](ProductApi.md#productCount) | **GET** Products/count | Count instances of the model matched by where from the data source.
[**productCreate**](ProductApi.md#productCreate) | **POST** Products | Create a new instance of the model and persist it into the data source.
[**productCreateChangeStreamGetProductsChangeStream**](ProductApi.md#productCreateChangeStreamGetProductsChangeStream) | **GET** Products/change-stream | Create a change stream.
[**productCreateChangeStreamPostProductsChangeStream**](ProductApi.md#productCreateChangeStreamPostProductsChangeStream) | **POST** Products/change-stream | Create a change stream.
[**productDeleteById**](ProductApi.md#productDeleteById) | **DELETE** Products/{id} | Delete a model instance by {{id}} from the data source.
[**productExistsGetProductsidExists**](ProductApi.md#productExistsGetProductsidExists) | **GET** Products/{id}/exists | Check whether a model instance exists in the data source.
[**productExistsHeadProductsid**](ProductApi.md#productExistsHeadProductsid) | **HEAD** Products/{id} | Check whether a model instance exists in the data source.
[**productFind**](ProductApi.md#productFind) | **GET** Products | Find all instances of the model matched by filter from the data source.
[**productFindById**](ProductApi.md#productFindById) | **GET** Products/{id} | Find a model instance by {{id}} from the data source.
[**productFindOne**](ProductApi.md#productFindOne) | **GET** Products/findOne | Find first instance of the model matched by filter from the data source.
[**productPatchOrCreate**](ProductApi.md#productPatchOrCreate) | **PATCH** Products | Patch an existing model instance or insert a new one into the data source.
[**productPrototypePatchAttributes**](ProductApi.md#productPrototypePatchAttributes) | **PATCH** Products/{id} | Patch attributes for a model instance and persist it into the data source.
[**productReplaceByIdPostProductsidReplace**](ProductApi.md#productReplaceByIdPostProductsidReplace) | **POST** Products/{id}/replace | Replace attributes for a model instance and persist it into the data source.
[**productReplaceByIdPutProductsid**](ProductApi.md#productReplaceByIdPutProductsid) | **PUT** Products/{id} | Replace attributes for a model instance and persist it into the data source.
[**productReplaceOrCreatePostProductsReplaceOrCreate**](ProductApi.md#productReplaceOrCreatePostProductsReplaceOrCreate) | **POST** Products/replaceOrCreate | Replace an existing model instance or insert a new one into the data source.
[**productReplaceOrCreatePutProducts**](ProductApi.md#productReplaceOrCreatePutProducts) | **PUT** Products | Replace an existing model instance or insert a new one into the data source.
[**productUpdateAll**](ProductApi.md#productUpdateAll) | **POST** Products/update | Update instances of the model matched by {{where}} from the data source.
[**productUpsertWithWhere**](ProductApi.md#productUpsertWithWhere) | **POST** Products/upsertWithWhere | Update an existing model instance or insert a new one into the data source based on the where criteria.


<a name="productCount"></a>
# **productCount**
> InlineResponse2002 productCount(where)

Count instances of the model matched by where from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse2002 result = apiInstance.productCount(where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productCount");
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

<a name="productCreate"></a>
# **productCreate**
> Product productCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
Product data = new Product(); // Product | Model instance data
try {
    Product result = apiInstance.productCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Product**](Product.md)| Model instance data | [optional]

### Return type

[**Product**](Product.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="productCreateChangeStreamGetProductsChangeStream"></a>
# **productCreateChangeStreamGetProductsChangeStream**
> File productCreateChangeStreamGetProductsChangeStream(options)

Create a change stream.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
String options = "options_example"; // String | 
try {
    File result = apiInstance.productCreateChangeStreamGetProductsChangeStream(options);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productCreateChangeStreamGetProductsChangeStream");
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

<a name="productCreateChangeStreamPostProductsChangeStream"></a>
# **productCreateChangeStreamPostProductsChangeStream**
> File productCreateChangeStreamPostProductsChangeStream(options)

Create a change stream.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
String options = "options_example"; // String | 
try {
    File result = apiInstance.productCreateChangeStreamPostProductsChangeStream(options);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productCreateChangeStreamPostProductsChangeStream");
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

<a name="productDeleteById"></a>
# **productDeleteById**
> Object productDeleteById(id)

Delete a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
String id = "id_example"; // String | Model id
try {
    Object result = apiInstance.productDeleteById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productDeleteById");
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

<a name="productExistsGetProductsidExists"></a>
# **productExistsGetProductsidExists**
> InlineResponse200 productExistsGetProductsidExists(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.productExistsGetProductsidExists(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productExistsGetProductsidExists");
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

<a name="productExistsHeadProductsid"></a>
# **productExistsHeadProductsid**
> InlineResponse200 productExistsHeadProductsid(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.productExistsHeadProductsid(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productExistsHeadProductsid");
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

<a name="productFind"></a>
# **productFind**
> List&lt;Product&gt; productFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<Product> result = apiInstance.productFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;Product&gt;**](Product.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="productFindById"></a>
# **productFindById**
> Product productFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Product result = apiInstance.productFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Product**](Product.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="productFindOne"></a>
# **productFindOne**
> Product productFindOne(filter)

Find first instance of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Product result = apiInstance.productFindOne(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productFindOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Product**](Product.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="productPatchOrCreate"></a>
# **productPatchOrCreate**
> Product productPatchOrCreate(data)

Patch an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
Product data = new Product(); // Product | Model instance data
try {
    Product result = apiInstance.productPatchOrCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productPatchOrCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Product**](Product.md)| Model instance data | [optional]

### Return type

[**Product**](Product.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="productPrototypePatchAttributes"></a>
# **productPrototypePatchAttributes**
> Product productPrototypePatchAttributes(id, data)

Patch attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
String id = "id_example"; // String | Product id
Product data = new Product(); // Product | An object of model property name/value pairs
try {
    Product result = apiInstance.productPrototypePatchAttributes(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productPrototypePatchAttributes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Product id |
 **data** | [**Product**](Product.md)| An object of model property name/value pairs | [optional]

### Return type

[**Product**](Product.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="productReplaceByIdPostProductsidReplace"></a>
# **productReplaceByIdPostProductsidReplace**
> Product productReplaceByIdPostProductsidReplace(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
String id = "id_example"; // String | Model id
Product data = new Product(); // Product | Model instance data
try {
    Product result = apiInstance.productReplaceByIdPostProductsidReplace(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productReplaceByIdPostProductsidReplace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**Product**](Product.md)| Model instance data | [optional]

### Return type

[**Product**](Product.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="productReplaceByIdPutProductsid"></a>
# **productReplaceByIdPutProductsid**
> Product productReplaceByIdPutProductsid(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
String id = "id_example"; // String | Model id
Product data = new Product(); // Product | Model instance data
try {
    Product result = apiInstance.productReplaceByIdPutProductsid(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productReplaceByIdPutProductsid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**Product**](Product.md)| Model instance data | [optional]

### Return type

[**Product**](Product.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="productReplaceOrCreatePostProductsReplaceOrCreate"></a>
# **productReplaceOrCreatePostProductsReplaceOrCreate**
> Product productReplaceOrCreatePostProductsReplaceOrCreate(data)

Replace an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
Product data = new Product(); // Product | Model instance data
try {
    Product result = apiInstance.productReplaceOrCreatePostProductsReplaceOrCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productReplaceOrCreatePostProductsReplaceOrCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Product**](Product.md)| Model instance data | [optional]

### Return type

[**Product**](Product.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="productReplaceOrCreatePutProducts"></a>
# **productReplaceOrCreatePutProducts**
> Product productReplaceOrCreatePutProducts(data)

Replace an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
Product data = new Product(); // Product | Model instance data
try {
    Product result = apiInstance.productReplaceOrCreatePutProducts(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productReplaceOrCreatePutProducts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Product**](Product.md)| Model instance data | [optional]

### Return type

[**Product**](Product.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="productUpdateAll"></a>
# **productUpdateAll**
> InlineResponse2001 productUpdateAll(where, data)

Update instances of the model matched by {{where}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
String where = "where_example"; // String | Criteria to match model instances
Product data = new Product(); // Product | An object of model property name/value pairs
try {
    InlineResponse2001 result = apiInstance.productUpdateAll(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productUpdateAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**Product**](Product.md)| An object of model property name/value pairs | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="productUpsertWithWhere"></a>
# **productUpsertWithWhere**
> Product productUpsertWithWhere(where, data)

Update an existing model instance or insert a new one into the data source based on the where criteria.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
String where = "where_example"; // String | Criteria to match model instances
Product data = new Product(); // Product | An object of model property name/value pairs
try {
    Product result = apiInstance.productUpsertWithWhere(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productUpsertWithWhere");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**Product**](Product.md)| An object of model property name/value pairs | [optional]

### Return type

[**Product**](Product.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


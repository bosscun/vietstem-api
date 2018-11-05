# NotificationApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**notificationCount**](NotificationApi.md#notificationCount) | **GET** Notifications/count | Count instances of the model matched by where from the data source.
[**notificationCreate**](NotificationApi.md#notificationCreate) | **POST** Notifications | Create a new instance of the model and persist it into the data source.
[**notificationCreateChangeStreamGetNotificationsChangeStream**](NotificationApi.md#notificationCreateChangeStreamGetNotificationsChangeStream) | **GET** Notifications/change-stream | Create a change stream.
[**notificationCreateChangeStreamPostNotificationsChangeStream**](NotificationApi.md#notificationCreateChangeStreamPostNotificationsChangeStream) | **POST** Notifications/change-stream | Create a change stream.
[**notificationDeleteById**](NotificationApi.md#notificationDeleteById) | **DELETE** Notifications/{id} | Delete a model instance by {{id}} from the data source.
[**notificationExistsGetNotificationsidExists**](NotificationApi.md#notificationExistsGetNotificationsidExists) | **GET** Notifications/{id}/exists | Check whether a model instance exists in the data source.
[**notificationExistsHeadNotificationsid**](NotificationApi.md#notificationExistsHeadNotificationsid) | **HEAD** Notifications/{id} | Check whether a model instance exists in the data source.
[**notificationFind**](NotificationApi.md#notificationFind) | **GET** Notifications | Find all instances of the model matched by filter from the data source.
[**notificationFindById**](NotificationApi.md#notificationFindById) | **GET** Notifications/{id} | Find a model instance by {{id}} from the data source.
[**notificationFindOne**](NotificationApi.md#notificationFindOne) | **GET** Notifications/findOne | Find first instance of the model matched by filter from the data source.
[**notificationPatchOrCreate**](NotificationApi.md#notificationPatchOrCreate) | **PATCH** Notifications | Patch an existing model instance or insert a new one into the data source.
[**notificationPrototypePatchAttributes**](NotificationApi.md#notificationPrototypePatchAttributes) | **PATCH** Notifications/{id} | Patch attributes for a model instance and persist it into the data source.
[**notificationReplaceByIdPostNotificationsidReplace**](NotificationApi.md#notificationReplaceByIdPostNotificationsidReplace) | **POST** Notifications/{id}/replace | Replace attributes for a model instance and persist it into the data source.
[**notificationReplaceByIdPutNotificationsid**](NotificationApi.md#notificationReplaceByIdPutNotificationsid) | **PUT** Notifications/{id} | Replace attributes for a model instance and persist it into the data source.
[**notificationReplaceOrCreatePostNotificationsReplaceOrCreate**](NotificationApi.md#notificationReplaceOrCreatePostNotificationsReplaceOrCreate) | **POST** Notifications/replaceOrCreate | Replace an existing model instance or insert a new one into the data source.
[**notificationReplaceOrCreatePutNotifications**](NotificationApi.md#notificationReplaceOrCreatePutNotifications) | **PUT** Notifications | Replace an existing model instance or insert a new one into the data source.
[**notificationUpdateAll**](NotificationApi.md#notificationUpdateAll) | **POST** Notifications/update | Update instances of the model matched by {{where}} from the data source.
[**notificationUpsertWithWhere**](NotificationApi.md#notificationUpsertWithWhere) | **POST** Notifications/upsertWithWhere | Update an existing model instance or insert a new one into the data source based on the where criteria.


<a name="notificationCount"></a>
# **notificationCount**
> InlineResponse2002 notificationCount(where)

Count instances of the model matched by where from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationApi;


NotificationApi apiInstance = new NotificationApi();
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse2002 result = apiInstance.notificationCount(where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#notificationCount");
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

<a name="notificationCreate"></a>
# **notificationCreate**
> Notification notificationCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationApi;


NotificationApi apiInstance = new NotificationApi();
Notification data = new Notification(); // Notification | Model instance data
try {
    Notification result = apiInstance.notificationCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#notificationCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Notification**](Notification.md)| Model instance data | [optional]

### Return type

[**Notification**](Notification.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="notificationCreateChangeStreamGetNotificationsChangeStream"></a>
# **notificationCreateChangeStreamGetNotificationsChangeStream**
> File notificationCreateChangeStreamGetNotificationsChangeStream(options)

Create a change stream.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationApi;


NotificationApi apiInstance = new NotificationApi();
String options = "options_example"; // String | 
try {
    File result = apiInstance.notificationCreateChangeStreamGetNotificationsChangeStream(options);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#notificationCreateChangeStreamGetNotificationsChangeStream");
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

<a name="notificationCreateChangeStreamPostNotificationsChangeStream"></a>
# **notificationCreateChangeStreamPostNotificationsChangeStream**
> File notificationCreateChangeStreamPostNotificationsChangeStream(options)

Create a change stream.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationApi;


NotificationApi apiInstance = new NotificationApi();
String options = "options_example"; // String | 
try {
    File result = apiInstance.notificationCreateChangeStreamPostNotificationsChangeStream(options);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#notificationCreateChangeStreamPostNotificationsChangeStream");
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

<a name="notificationDeleteById"></a>
# **notificationDeleteById**
> Object notificationDeleteById(id)

Delete a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationApi;


NotificationApi apiInstance = new NotificationApi();
String id = "id_example"; // String | Model id
try {
    Object result = apiInstance.notificationDeleteById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#notificationDeleteById");
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

<a name="notificationExistsGetNotificationsidExists"></a>
# **notificationExistsGetNotificationsidExists**
> InlineResponse200 notificationExistsGetNotificationsidExists(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationApi;


NotificationApi apiInstance = new NotificationApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.notificationExistsGetNotificationsidExists(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#notificationExistsGetNotificationsidExists");
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

<a name="notificationExistsHeadNotificationsid"></a>
# **notificationExistsHeadNotificationsid**
> InlineResponse200 notificationExistsHeadNotificationsid(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationApi;


NotificationApi apiInstance = new NotificationApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.notificationExistsHeadNotificationsid(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#notificationExistsHeadNotificationsid");
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

<a name="notificationFind"></a>
# **notificationFind**
> List&lt;Notification&gt; notificationFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationApi;


NotificationApi apiInstance = new NotificationApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<Notification> result = apiInstance.notificationFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#notificationFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;Notification&gt;**](Notification.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="notificationFindById"></a>
# **notificationFindById**
> Notification notificationFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationApi;


NotificationApi apiInstance = new NotificationApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Notification result = apiInstance.notificationFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#notificationFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Notification**](Notification.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="notificationFindOne"></a>
# **notificationFindOne**
> Notification notificationFindOne(filter)

Find first instance of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationApi;


NotificationApi apiInstance = new NotificationApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Notification result = apiInstance.notificationFindOne(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#notificationFindOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Notification**](Notification.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="notificationPatchOrCreate"></a>
# **notificationPatchOrCreate**
> Notification notificationPatchOrCreate(data)

Patch an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationApi;


NotificationApi apiInstance = new NotificationApi();
Notification data = new Notification(); // Notification | Model instance data
try {
    Notification result = apiInstance.notificationPatchOrCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#notificationPatchOrCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Notification**](Notification.md)| Model instance data | [optional]

### Return type

[**Notification**](Notification.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="notificationPrototypePatchAttributes"></a>
# **notificationPrototypePatchAttributes**
> Notification notificationPrototypePatchAttributes(id, data)

Patch attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationApi;


NotificationApi apiInstance = new NotificationApi();
String id = "id_example"; // String | Notification id
Notification data = new Notification(); // Notification | An object of model property name/value pairs
try {
    Notification result = apiInstance.notificationPrototypePatchAttributes(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#notificationPrototypePatchAttributes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Notification id |
 **data** | [**Notification**](Notification.md)| An object of model property name/value pairs | [optional]

### Return type

[**Notification**](Notification.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="notificationReplaceByIdPostNotificationsidReplace"></a>
# **notificationReplaceByIdPostNotificationsidReplace**
> Notification notificationReplaceByIdPostNotificationsidReplace(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationApi;


NotificationApi apiInstance = new NotificationApi();
String id = "id_example"; // String | Model id
Notification data = new Notification(); // Notification | Model instance data
try {
    Notification result = apiInstance.notificationReplaceByIdPostNotificationsidReplace(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#notificationReplaceByIdPostNotificationsidReplace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**Notification**](Notification.md)| Model instance data | [optional]

### Return type

[**Notification**](Notification.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="notificationReplaceByIdPutNotificationsid"></a>
# **notificationReplaceByIdPutNotificationsid**
> Notification notificationReplaceByIdPutNotificationsid(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationApi;


NotificationApi apiInstance = new NotificationApi();
String id = "id_example"; // String | Model id
Notification data = new Notification(); // Notification | Model instance data
try {
    Notification result = apiInstance.notificationReplaceByIdPutNotificationsid(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#notificationReplaceByIdPutNotificationsid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**Notification**](Notification.md)| Model instance data | [optional]

### Return type

[**Notification**](Notification.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="notificationReplaceOrCreatePostNotificationsReplaceOrCreate"></a>
# **notificationReplaceOrCreatePostNotificationsReplaceOrCreate**
> Notification notificationReplaceOrCreatePostNotificationsReplaceOrCreate(data)

Replace an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationApi;


NotificationApi apiInstance = new NotificationApi();
Notification data = new Notification(); // Notification | Model instance data
try {
    Notification result = apiInstance.notificationReplaceOrCreatePostNotificationsReplaceOrCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#notificationReplaceOrCreatePostNotificationsReplaceOrCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Notification**](Notification.md)| Model instance data | [optional]

### Return type

[**Notification**](Notification.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="notificationReplaceOrCreatePutNotifications"></a>
# **notificationReplaceOrCreatePutNotifications**
> Notification notificationReplaceOrCreatePutNotifications(data)

Replace an existing model instance or insert a new one into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationApi;


NotificationApi apiInstance = new NotificationApi();
Notification data = new Notification(); // Notification | Model instance data
try {
    Notification result = apiInstance.notificationReplaceOrCreatePutNotifications(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#notificationReplaceOrCreatePutNotifications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Notification**](Notification.md)| Model instance data | [optional]

### Return type

[**Notification**](Notification.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="notificationUpdateAll"></a>
# **notificationUpdateAll**
> InlineResponse2001 notificationUpdateAll(where, data)

Update instances of the model matched by {{where}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationApi;


NotificationApi apiInstance = new NotificationApi();
String where = "where_example"; // String | Criteria to match model instances
Notification data = new Notification(); // Notification | An object of model property name/value pairs
try {
    InlineResponse2001 result = apiInstance.notificationUpdateAll(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#notificationUpdateAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**Notification**](Notification.md)| An object of model property name/value pairs | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="notificationUpsertWithWhere"></a>
# **notificationUpsertWithWhere**
> Notification notificationUpsertWithWhere(where, data)

Update an existing model instance or insert a new one into the data source based on the where criteria.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationApi;


NotificationApi apiInstance = new NotificationApi();
String where = "where_example"; // String | Criteria to match model instances
Notification data = new Notification(); // Notification | An object of model property name/value pairs
try {
    Notification result = apiInstance.notificationUpsertWithWhere(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#notificationUpsertWithWhere");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**Notification**](Notification.md)| An object of model property name/value pairs | [optional]

### Return type

[**Notification**](Notification.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


# ContainerApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**containerCreateContainer**](ContainerApi.md#containerCreateContainer) | **POST** Containers | 
[**containerDestroyContainer**](ContainerApi.md#containerDestroyContainer) | **DELETE** Containers/{container} | 
[**containerDownload**](ContainerApi.md#containerDownload) | **GET** Containers/{container}/download/{file} | 
[**containerGetContainer**](ContainerApi.md#containerGetContainer) | **GET** Containers/{container} | 
[**containerGetContainers**](ContainerApi.md#containerGetContainers) | **GET** Containers | 
[**containerGetFile**](ContainerApi.md#containerGetFile) | **GET** Containers/{container}/files/{file} | 
[**containerGetFiles**](ContainerApi.md#containerGetFiles) | **GET** Containers/{container}/files | 
[**containerRemoveFile**](ContainerApi.md#containerRemoveFile) | **DELETE** Containers/{container}/files/{file} | 
[**containerUpload**](ContainerApi.md#containerUpload) | **POST** Containers/{container}/upload | 


<a name="containerCreateContainer"></a>
# **containerCreateContainer**
> Object containerCreateContainer(options)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContainerApi;


ContainerApi apiInstance = new ContainerApi();
Object options = null; // Object | 
try {
    Object result = apiInstance.containerCreateContainer(options);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContainerApi#containerCreateContainer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **options** | **Object**|  | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="containerDestroyContainer"></a>
# **containerDestroyContainer**
> InlineResponse2003 containerDestroyContainer(container)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContainerApi;


ContainerApi apiInstance = new ContainerApi();
String container = "container_example"; // String | 
try {
    InlineResponse2003 result = apiInstance.containerDestroyContainer(container);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContainerApi#containerDestroyContainer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **container** | **String**|  |

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="containerDownload"></a>
# **containerDownload**
> Void containerDownload(container, file)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContainerApi;


ContainerApi apiInstance = new ContainerApi();
String container = "container_example"; // String | 
String file = "file_example"; // String | 
try {
    Void result = apiInstance.containerDownload(container, file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContainerApi#containerDownload");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **container** | **String**|  |
 **file** | **String**|  |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="containerGetContainer"></a>
# **containerGetContainer**
> Object containerGetContainer(container)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContainerApi;


ContainerApi apiInstance = new ContainerApi();
String container = "container_example"; // String | 
try {
    Object result = apiInstance.containerGetContainer(container);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContainerApi#containerGetContainer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **container** | **String**|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="containerGetContainers"></a>
# **containerGetContainers**
> List&lt;XAny&gt; containerGetContainers()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContainerApi;


ContainerApi apiInstance = new ContainerApi();
try {
    List<XAny> result = apiInstance.containerGetContainers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContainerApi#containerGetContainers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;XAny&gt;**](XAny.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="containerGetFile"></a>
# **containerGetFile**
> Object containerGetFile(container, file)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContainerApi;


ContainerApi apiInstance = new ContainerApi();
String container = "container_example"; // String | 
String file = "file_example"; // String | 
try {
    Object result = apiInstance.containerGetFile(container, file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContainerApi#containerGetFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **container** | **String**|  |
 **file** | **String**|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="containerGetFiles"></a>
# **containerGetFiles**
> List&lt;XAny&gt; containerGetFiles(container)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContainerApi;


ContainerApi apiInstance = new ContainerApi();
String container = "container_example"; // String | 
try {
    List<XAny> result = apiInstance.containerGetFiles(container);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContainerApi#containerGetFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **container** | **String**|  |

### Return type

[**List&lt;XAny&gt;**](XAny.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="containerRemoveFile"></a>
# **containerRemoveFile**
> InlineResponse2003 containerRemoveFile(container, file)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContainerApi;


ContainerApi apiInstance = new ContainerApi();
String container = "container_example"; // String | 
String file = "file_example"; // String | 
try {
    InlineResponse2003 result = apiInstance.containerRemoveFile(container, file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContainerApi#containerRemoveFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **container** | **String**|  |
 **file** | **String**|  |

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="containerUpload"></a>
# **containerUpload**
> InlineResponse2004 containerUpload(container)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContainerApi;


ContainerApi apiInstance = new ContainerApi();
String container = "container_example"; // String | 
try {
    InlineResponse2004 result = apiInstance.containerUpload(container);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContainerApi#containerUpload");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **container** | **String**|  |

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


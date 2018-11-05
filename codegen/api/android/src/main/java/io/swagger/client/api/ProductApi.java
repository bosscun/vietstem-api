package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import io.reactivex.Observable;
import retrofit2.http.*; import retrofit2.Response;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import java.io.File;
import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.InlineResponse2001;
import io.swagger.client.model.InlineResponse2002;
import io.swagger.client.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ProductApi {
  /**
   * Count instances of the model matched by where from the data source.
   * 
   * @param where Criteria to match model instances (optional)
   * @return Call&lt;InlineResponse2002&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Products/count")
  Observable<InlineResponse2002> productCount(
    @retrofit2.http.Query("where") String where
  );

  /**
   * Create a new instance of the model and persist it into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Product&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Products")
  Observable<Product> productCreate(
    @retrofit2.http.Body Product data
  );

  /**
   * Create a change stream.
   * 
   * @param options  (optional)
   * @return Call&lt;File&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Products/change-stream")
  Observable<ResponseBody> productCreateChangeStreamGetProductsChangeStream(
    @retrofit2.http.Query("options") String options
  );

  /**
   * Create a change stream.
   * 
   * @param options  (optional)
   * @return Call&lt;File&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @POST("Products/change-stream")
  Observable<ResponseBody> productCreateChangeStreamPostProductsChangeStream(
    @retrofit2.http.Field("options") String options
  );

  /**
   * Delete a model instance by {{id}} from the data source.
   * 
   * @param id Model id (required)
   * @return Call&lt;Object&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("Products/{id}")
  Observable<Object> productDeleteById(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Check whether a model instance exists in the data source.
   * 
   * @param id Model id (required)
   * @return Call&lt;InlineResponse200&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Products/{id}/exists")
  Observable<InlineResponse200> productExistsGetProductsidExists(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Check whether a model instance exists in the data source.
   * 
   * @param id Model id (required)
   * @return Call&lt;InlineResponse200&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @HEAD("Products/{id}")
  Observable<InlineResponse200> productExistsHeadProductsid(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Find all instances of the model matched by filter from the data source.
   * 
   * @param filter Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;List&lt;Product&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Products")
  Observable<List<Product>> productFind(
    @retrofit2.http.Query("filter") String filter
  );

  /**
   * Find a model instance by {{id}} from the data source.
   * 
   * @param id Model id (required)
   * @param filter Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;Product&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Products/{id}")
  Observable<Product> productFindById(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("filter") String filter
  );

  /**
   * Find first instance of the model matched by filter from the data source.
   * 
   * @param filter Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;Product&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Products/findOne")
  Observable<Product> productFindOne(
    @retrofit2.http.Query("filter") String filter
  );

  /**
   * Patch an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Product&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("Products")
  Observable<Product> productPatchOrCreate(
    @retrofit2.http.Body Product data
  );

  /**
   * Patch attributes for a model instance and persist it into the data source.
   * 
   * @param id Product id (required)
   * @param data An object of model property name/value pairs (optional)
   * @return Call&lt;Product&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("Products/{id}")
  Observable<Product> productPrototypePatchAttributes(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body Product data
  );

  /**
   * Replace attributes for a model instance and persist it into the data source.
   * 
   * @param id Model id (required)
   * @param data Model instance data (optional)
   * @return Call&lt;Product&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Products/{id}/replace")
  Observable<Product> productReplaceByIdPostProductsidReplace(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body Product data
  );

  /**
   * Replace attributes for a model instance and persist it into the data source.
   * 
   * @param id Model id (required)
   * @param data Model instance data (optional)
   * @return Call&lt;Product&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("Products/{id}")
  Observable<Product> productReplaceByIdPutProductsid(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body Product data
  );

  /**
   * Replace an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Product&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Products/replaceOrCreate")
  Observable<Product> productReplaceOrCreatePostProductsReplaceOrCreate(
    @retrofit2.http.Body Product data
  );

  /**
   * Replace an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Product&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("Products")
  Observable<Product> productReplaceOrCreatePutProducts(
    @retrofit2.http.Body Product data
  );

  /**
   * Update instances of the model matched by {{where}} from the data source.
   * 
   * @param where Criteria to match model instances (optional)
   * @param data An object of model property name/value pairs (optional)
   * @return Call&lt;InlineResponse2001&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Products/update")
  Observable<InlineResponse2001> productUpdateAll(
    @retrofit2.http.Query("where") String where, @retrofit2.http.Body Product data
  );

  /**
   * Update an existing model instance or insert a new one into the data source based on the where criteria.
   * 
   * @param where Criteria to match model instances (optional)
   * @param data An object of model property name/value pairs (optional)
   * @return Call&lt;Product&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Products/upsertWithWhere")
  Observable<Product> productUpsertWithWhere(
    @retrofit2.http.Query("where") String where, @retrofit2.http.Body Product data
  );

}

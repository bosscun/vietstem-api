package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import io.reactivex.Observable;
import retrofit2.http.*; import retrofit2.Response;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.Ask;
import java.io.File;
import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.InlineResponse2001;
import io.swagger.client.model.InlineResponse2002;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface AskApi {
  /**
   * Count instances of the model matched by where from the data source.
   * 
   * @param where Criteria to match model instances (optional)
   * @return Call&lt;InlineResponse2002&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Asks/count")
  Observable<InlineResponse2002> askCount(
    @retrofit2.http.Query("where") String where
  );

  /**
   * Create a new instance of the model and persist it into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Ask&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Asks")
  Observable<Ask> askCreate(
    @retrofit2.http.Body Ask data
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
  @GET("Asks/change-stream")
  Observable<ResponseBody> askCreateChangeStreamGetAsksChangeStream(
    @retrofit2.http.Query("options") String options
  );

  /**
   * Create a change stream.
   * 
   * @param options  (optional)
   * @return Call&lt;File&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @POST("Asks/change-stream")
  Observable<ResponseBody> askCreateChangeStreamPostAsksChangeStream(
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
  @DELETE("Asks/{id}")
  Observable<Object> askDeleteById(
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
  @GET("Asks/{id}/exists")
  Observable<InlineResponse200> askExistsGetAsksidExists(
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
  @HEAD("Asks/{id}")
  Observable<InlineResponse200> askExistsHeadAsksid(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Find all instances of the model matched by filter from the data source.
   * 
   * @param filter Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;List&lt;Ask&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Asks")
  Observable<List<Ask>> askFind(
    @retrofit2.http.Query("filter") String filter
  );

  /**
   * Find a model instance by {{id}} from the data source.
   * 
   * @param id Model id (required)
   * @param filter Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;Ask&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Asks/{id}")
  Observable<Ask> askFindById(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("filter") String filter
  );

  /**
   * Find first instance of the model matched by filter from the data source.
   * 
   * @param filter Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;Ask&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Asks/findOne")
  Observable<Ask> askFindOne(
    @retrofit2.http.Query("filter") String filter
  );

  /**
   * Patch an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Ask&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("Asks")
  Observable<Ask> askPatchOrCreate(
    @retrofit2.http.Body Ask data
  );

  /**
   * Patch attributes for a model instance and persist it into the data source.
   * 
   * @param id Ask id (required)
   * @param data An object of model property name/value pairs (optional)
   * @return Call&lt;Ask&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("Asks/{id}")
  Observable<Ask> askPrototypePatchAttributes(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body Ask data
  );

  /**
   * Replace attributes for a model instance and persist it into the data source.
   * 
   * @param id Model id (required)
   * @param data Model instance data (optional)
   * @return Call&lt;Ask&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Asks/{id}/replace")
  Observable<Ask> askReplaceByIdPostAsksidReplace(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body Ask data
  );

  /**
   * Replace attributes for a model instance and persist it into the data source.
   * 
   * @param id Model id (required)
   * @param data Model instance data (optional)
   * @return Call&lt;Ask&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("Asks/{id}")
  Observable<Ask> askReplaceByIdPutAsksid(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body Ask data
  );

  /**
   * Replace an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Ask&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Asks/replaceOrCreate")
  Observable<Ask> askReplaceOrCreatePostAsksReplaceOrCreate(
    @retrofit2.http.Body Ask data
  );

  /**
   * Replace an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Ask&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("Asks")
  Observable<Ask> askReplaceOrCreatePutAsks(
    @retrofit2.http.Body Ask data
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
  @POST("Asks/update")
  Observable<InlineResponse2001> askUpdateAll(
    @retrofit2.http.Query("where") String where, @retrofit2.http.Body Ask data
  );

  /**
   * Update an existing model instance or insert a new one into the data source based on the where criteria.
   * 
   * @param where Criteria to match model instances (optional)
   * @param data An object of model property name/value pairs (optional)
   * @return Call&lt;Ask&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Asks/upsertWithWhere")
  Observable<Ask> askUpsertWithWhere(
    @retrofit2.http.Query("where") String where, @retrofit2.http.Body Ask data
  );

}

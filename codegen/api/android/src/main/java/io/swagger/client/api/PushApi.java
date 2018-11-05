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
import io.swagger.client.model.Push;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PushApi {
  /**
   * Count instances of the model matched by where from the data source.
   * 
   * @param where Criteria to match model instances (optional)
   * @return Call&lt;InlineResponse2002&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("push/count")
  Observable<InlineResponse2002> pushCount(
    @retrofit2.http.Query("where") String where
  );

  /**
   * Create a new instance of the model and persist it into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Push&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("push")
  Observable<Push> pushCreate(
    @retrofit2.http.Body Push data
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
  @GET("push/change-stream")
  Observable<ResponseBody> pushCreateChangeStreamGetPushChangeStream(
    @retrofit2.http.Query("options") String options
  );

  /**
   * Create a change stream.
   * 
   * @param options  (optional)
   * @return Call&lt;File&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @POST("push/change-stream")
  Observable<ResponseBody> pushCreateChangeStreamPostPushChangeStream(
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
  @DELETE("push/{id}")
  Observable<Object> pushDeleteById(
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
  @GET("push/{id}/exists")
  Observable<InlineResponse200> pushExistsGetPushidExists(
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
  @HEAD("push/{id}")
  Observable<InlineResponse200> pushExistsHeadPushid(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Find all instances of the model matched by filter from the data source.
   * 
   * @param filter Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;List&lt;Push&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("push")
  Observable<List<Push>> pushFind(
    @retrofit2.http.Query("filter") String filter
  );

  /**
   * Find a model instance by {{id}} from the data source.
   * 
   * @param id Model id (required)
   * @param filter Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;Push&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("push/{id}")
  Observable<Push> pushFindById(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("filter") String filter
  );

  /**
   * Find first instance of the model matched by filter from the data source.
   * 
   * @param filter Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;Push&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("push/findOne")
  Observable<Push> pushFindOne(
    @retrofit2.http.Query("filter") String filter
  );

  /**
   * Patch an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Push&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("push")
  Observable<Push> pushPatchOrCreate(
    @retrofit2.http.Body Push data
  );

  /**
   * Patch attributes for a model instance and persist it into the data source.
   * 
   * @param id Push id (required)
   * @param data An object of model property name/value pairs (optional)
   * @return Call&lt;Push&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("push/{id}")
  Observable<Push> pushPrototypePatchAttributes(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body Push data
  );

  /**
   * Replace attributes for a model instance and persist it into the data source.
   * 
   * @param id Model id (required)
   * @param data Model instance data (optional)
   * @return Call&lt;Push&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("push/{id}/replace")
  Observable<Push> pushReplaceByIdPostPushidReplace(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body Push data
  );

  /**
   * Replace attributes for a model instance and persist it into the data source.
   * 
   * @param id Model id (required)
   * @param data Model instance data (optional)
   * @return Call&lt;Push&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("push/{id}")
  Observable<Push> pushReplaceByIdPutPushid(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body Push data
  );

  /**
   * Replace an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Push&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("push/replaceOrCreate")
  Observable<Push> pushReplaceOrCreatePostPushReplaceOrCreate(
    @retrofit2.http.Body Push data
  );

  /**
   * Replace an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Push&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("push")
  Observable<Push> pushReplaceOrCreatePutPush(
    @retrofit2.http.Body Push data
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
  @POST("push/update")
  Observable<InlineResponse2001> pushUpdateAll(
    @retrofit2.http.Query("where") String where, @retrofit2.http.Body Push data
  );

  /**
   * Update an existing model instance or insert a new one into the data source based on the where criteria.
   * 
   * @param where Criteria to match model instances (optional)
   * @param data An object of model property name/value pairs (optional)
   * @return Call&lt;Push&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("push/upsertWithWhere")
  Observable<Push> pushUpsertWithWhere(
    @retrofit2.http.Query("where") String where, @retrofit2.http.Body Push data
  );

}

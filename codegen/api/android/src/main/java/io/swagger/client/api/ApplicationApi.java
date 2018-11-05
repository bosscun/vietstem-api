package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import io.reactivex.Observable;
import retrofit2.http.*; import retrofit2.Response;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.Application;
import java.io.File;
import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.InlineResponse2001;
import io.swagger.client.model.InlineResponse2002;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ApplicationApi {
  /**
   * Count instances of the model matched by where from the data source.
   * 
   * @param where Criteria to match model instances (optional)
   * @return Call&lt;InlineResponse2002&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Applications/count")
  Observable<InlineResponse2002> applicationCount(
    @retrofit2.http.Query("where") String where
  );

  /**
   * Create a new instance of the model and persist it into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Application&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Applications")
  Observable<Application> applicationCreate(
    @retrofit2.http.Body Application data
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
  @GET("Applications/change-stream")
  Observable<ResponseBody> applicationCreateChangeStreamGetApplicationsChangeStream(
    @retrofit2.http.Query("options") String options
  );

  /**
   * Create a change stream.
   * 
   * @param options  (optional)
   * @return Call&lt;File&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @POST("Applications/change-stream")
  Observable<ResponseBody> applicationCreateChangeStreamPostApplicationsChangeStream(
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
  @DELETE("Applications/{id}")
  Observable<Object> applicationDeleteById(
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
  @GET("Applications/{id}/exists")
  Observable<InlineResponse200> applicationExistsGetApplicationsidExists(
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
  @HEAD("Applications/{id}")
  Observable<InlineResponse200> applicationExistsHeadApplicationsid(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Find all instances of the model matched by filter from the data source.
   * 
   * @param filter Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;List&lt;Application&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Applications")
  Observable<List<Application>> applicationFind(
    @retrofit2.http.Query("filter") String filter
  );

  /**
   * Find a model instance by {{id}} from the data source.
   * 
   * @param id Model id (required)
   * @param filter Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;Application&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Applications/{id}")
  Observable<Application> applicationFindById(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("filter") String filter
  );

  /**
   * Find first instance of the model matched by filter from the data source.
   * 
   * @param filter Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;Application&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Applications/findOne")
  Observable<Application> applicationFindOne(
    @retrofit2.http.Query("filter") String filter
  );

  /**
   * Patch an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Application&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("Applications")
  Observable<Application> applicationPatchOrCreate(
    @retrofit2.http.Body Application data
  );

  /**
   * Patch attributes for a model instance and persist it into the data source.
   * 
   * @param id Application id (required)
   * @param data An object of model property name/value pairs (optional)
   * @return Call&lt;Application&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("Applications/{id}")
  Observable<Application> applicationPrototypePatchAttributes(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body Application data
  );

  /**
   * Replace attributes for a model instance and persist it into the data source.
   * 
   * @param id Model id (required)
   * @param data Model instance data (optional)
   * @return Call&lt;Application&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Applications/{id}/replace")
  Observable<Application> applicationReplaceByIdPostApplicationsidReplace(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body Application data
  );

  /**
   * Replace attributes for a model instance and persist it into the data source.
   * 
   * @param id Model id (required)
   * @param data Model instance data (optional)
   * @return Call&lt;Application&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("Applications/{id}")
  Observable<Application> applicationReplaceByIdPutApplicationsid(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body Application data
  );

  /**
   * Replace an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Application&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Applications/replaceOrCreate")
  Observable<Application> applicationReplaceOrCreatePostApplicationsReplaceOrCreate(
    @retrofit2.http.Body Application data
  );

  /**
   * Replace an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Application&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("Applications")
  Observable<Application> applicationReplaceOrCreatePutApplications(
    @retrofit2.http.Body Application data
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
  @POST("Applications/update")
  Observable<InlineResponse2001> applicationUpdateAll(
    @retrofit2.http.Query("where") String where, @retrofit2.http.Body Application data
  );

  /**
   * Update an existing model instance or insert a new one into the data source based on the where criteria.
   * 
   * @param where Criteria to match model instances (optional)
   * @param data An object of model property name/value pairs (optional)
   * @return Call&lt;Application&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Applications/upsertWithWhere")
  Observable<Application> applicationUpsertWithWhere(
    @retrofit2.http.Query("where") String where, @retrofit2.http.Body Application data
  );

}

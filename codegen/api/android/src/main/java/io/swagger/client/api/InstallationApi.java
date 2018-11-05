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
import io.swagger.client.model.Installation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface InstallationApi {
  /**
   * Count instances of the model matched by where from the data source.
   * 
   * @param where Criteria to match model instances (optional)
   * @return Call&lt;InlineResponse2002&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Installations/count")
  Observable<InlineResponse2002> installationCount(
    @retrofit2.http.Query("where") String where
  );

  /**
   * Create a new instance of the model and persist it into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Installation&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Installations")
  Observable<Installation> installationCreate(
    @retrofit2.http.Body Installation data
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
  @GET("Installations/change-stream")
  Observable<ResponseBody> installationCreateChangeStreamGetInstallationsChangeStream(
    @retrofit2.http.Query("options") String options
  );

  /**
   * Create a change stream.
   * 
   * @param options  (optional)
   * @return Call&lt;File&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @POST("Installations/change-stream")
  Observable<ResponseBody> installationCreateChangeStreamPostInstallationsChangeStream(
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
  @DELETE("Installations/{id}")
  Observable<Object> installationDeleteById(
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
  @GET("Installations/{id}/exists")
  Observable<InlineResponse200> installationExistsGetInstallationsidExists(
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
  @HEAD("Installations/{id}")
  Observable<InlineResponse200> installationExistsHeadInstallationsid(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Find all instances of the model matched by filter from the data source.
   * 
   * @param filter Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;List&lt;Installation&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Installations")
  Observable<List<Installation>> installationFind(
    @retrofit2.http.Query("filter") String filter
  );

  /**
   * Find installations by application id
   * 
   * @param deviceType Device type (optional)
   * @param appId Application id (optional)
   * @param appVersion Application version (optional)
   * @return Call&lt;Object&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Installations/byApp")
  Observable<Object> installationFindByApp(
    @retrofit2.http.Query("deviceType") String deviceType, @retrofit2.http.Query("appId") String appId, @retrofit2.http.Query("appVersion") String appVersion
  );

  /**
   * Find a model instance by {{id}} from the data source.
   * 
   * @param id Model id (required)
   * @param filter Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;Installation&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Installations/{id}")
  Observable<Installation> installationFindById(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("filter") String filter
  );

  /**
   * Find installations by subscriptions
   * 
   * @param deviceType Device type (optional)
   * @param subscriptions Subscriptions (optional)
   * @return Call&lt;Object&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Installations/bySubscriptions")
  Observable<Object> installationFindBySubscriptions(
    @retrofit2.http.Query("deviceType") String deviceType, @retrofit2.http.Query("subscriptions") String subscriptions
  );

  /**
   * Find installations by user id
   * 
   * @param deviceType Device type (optional)
   * @param userId User id (optional)
   * @return Call&lt;Object&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Installations/byUser")
  Observable<Object> installationFindByUser(
    @retrofit2.http.Query("deviceType") String deviceType, @retrofit2.http.Query("userId") String userId
  );

  /**
   * Find first instance of the model matched by filter from the data source.
   * 
   * @param filter Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;Installation&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Installations/findOne")
  Observable<Installation> installationFindOne(
    @retrofit2.http.Query("filter") String filter
  );

  /**
   * Patch an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Installation&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("Installations")
  Observable<Installation> installationPatchOrCreate(
    @retrofit2.http.Body Installation data
  );

  /**
   * Patch attributes for a model instance and persist it into the data source.
   * 
   * @param id Installation id (required)
   * @param data An object of model property name/value pairs (optional)
   * @return Call&lt;Installation&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("Installations/{id}")
  Observable<Installation> installationPrototypePatchAttributes(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body Installation data
  );

  /**
   * Replace attributes for a model instance and persist it into the data source.
   * 
   * @param id Model id (required)
   * @param data Model instance data (optional)
   * @return Call&lt;Installation&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Installations/{id}/replace")
  Observable<Installation> installationReplaceByIdPostInstallationsidReplace(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body Installation data
  );

  /**
   * Replace attributes for a model instance and persist it into the data source.
   * 
   * @param id Model id (required)
   * @param data Model instance data (optional)
   * @return Call&lt;Installation&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("Installations/{id}")
  Observable<Installation> installationReplaceByIdPutInstallationsid(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body Installation data
  );

  /**
   * Replace an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Installation&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Installations/replaceOrCreate")
  Observable<Installation> installationReplaceOrCreatePostInstallationsReplaceOrCreate(
    @retrofit2.http.Body Installation data
  );

  /**
   * Replace an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Installation&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("Installations")
  Observable<Installation> installationReplaceOrCreatePutInstallations(
    @retrofit2.http.Body Installation data
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
  @POST("Installations/update")
  Observable<InlineResponse2001> installationUpdateAll(
    @retrofit2.http.Query("where") String where, @retrofit2.http.Body Installation data
  );

  /**
   * Update an existing model instance or insert a new one into the data source based on the where criteria.
   * 
   * @param where Criteria to match model instances (optional)
   * @param data An object of model property name/value pairs (optional)
   * @return Call&lt;Installation&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Installations/upsertWithWhere")
  Observable<Installation> installationUpsertWithWhere(
    @retrofit2.http.Query("where") String where, @retrofit2.http.Body Installation data
  );

}

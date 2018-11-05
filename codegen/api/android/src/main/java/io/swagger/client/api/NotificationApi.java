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
import io.swagger.client.model.Notification;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface NotificationApi {
  /**
   * Count instances of the model matched by where from the data source.
   * 
   * @param where Criteria to match model instances (optional)
   * @return Call&lt;InlineResponse2002&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Notifications/count")
  Observable<InlineResponse2002> notificationCount(
    @retrofit2.http.Query("where") String where
  );

  /**
   * Create a new instance of the model and persist it into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Notification&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Notifications")
  Observable<Notification> notificationCreate(
    @retrofit2.http.Body Notification data
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
  @GET("Notifications/change-stream")
  Observable<ResponseBody> notificationCreateChangeStreamGetNotificationsChangeStream(
    @retrofit2.http.Query("options") String options
  );

  /**
   * Create a change stream.
   * 
   * @param options  (optional)
   * @return Call&lt;File&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @POST("Notifications/change-stream")
  Observable<ResponseBody> notificationCreateChangeStreamPostNotificationsChangeStream(
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
  @DELETE("Notifications/{id}")
  Observable<Object> notificationDeleteById(
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
  @GET("Notifications/{id}/exists")
  Observable<InlineResponse200> notificationExistsGetNotificationsidExists(
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
  @HEAD("Notifications/{id}")
  Observable<InlineResponse200> notificationExistsHeadNotificationsid(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Find all instances of the model matched by filter from the data source.
   * 
   * @param filter Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;List&lt;Notification&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Notifications")
  Observable<List<Notification>> notificationFind(
    @retrofit2.http.Query("filter") String filter
  );

  /**
   * Find a model instance by {{id}} from the data source.
   * 
   * @param id Model id (required)
   * @param filter Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;Notification&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Notifications/{id}")
  Observable<Notification> notificationFindById(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("filter") String filter
  );

  /**
   * Find first instance of the model matched by filter from the data source.
   * 
   * @param filter Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;Notification&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Notifications/findOne")
  Observable<Notification> notificationFindOne(
    @retrofit2.http.Query("filter") String filter
  );

  /**
   * Patch an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Notification&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("Notifications")
  Observable<Notification> notificationPatchOrCreate(
    @retrofit2.http.Body Notification data
  );

  /**
   * Patch attributes for a model instance and persist it into the data source.
   * 
   * @param id Notification id (required)
   * @param data An object of model property name/value pairs (optional)
   * @return Call&lt;Notification&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("Notifications/{id}")
  Observable<Notification> notificationPrototypePatchAttributes(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body Notification data
  );

  /**
   * Replace attributes for a model instance and persist it into the data source.
   * 
   * @param id Model id (required)
   * @param data Model instance data (optional)
   * @return Call&lt;Notification&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Notifications/{id}/replace")
  Observable<Notification> notificationReplaceByIdPostNotificationsidReplace(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body Notification data
  );

  /**
   * Replace attributes for a model instance and persist it into the data source.
   * 
   * @param id Model id (required)
   * @param data Model instance data (optional)
   * @return Call&lt;Notification&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("Notifications/{id}")
  Observable<Notification> notificationReplaceByIdPutNotificationsid(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body Notification data
  );

  /**
   * Replace an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Notification&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Notifications/replaceOrCreate")
  Observable<Notification> notificationReplaceOrCreatePostNotificationsReplaceOrCreate(
    @retrofit2.http.Body Notification data
  );

  /**
   * Replace an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Notification&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("Notifications")
  Observable<Notification> notificationReplaceOrCreatePutNotifications(
    @retrofit2.http.Body Notification data
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
  @POST("Notifications/update")
  Observable<InlineResponse2001> notificationUpdateAll(
    @retrofit2.http.Query("where") String where, @retrofit2.http.Body Notification data
  );

  /**
   * Update an existing model instance or insert a new one into the data source based on the where criteria.
   * 
   * @param where Criteria to match model instances (optional)
   * @param data An object of model property name/value pairs (optional)
   * @return Call&lt;Notification&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Notifications/upsertWithWhere")
  Observable<Notification> notificationUpsertWithWhere(
    @retrofit2.http.Query("where") String where, @retrofit2.http.Body Notification data
  );

}

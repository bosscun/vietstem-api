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
import io.swagger.client.model.Post;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PostApi {
  /**
   * Count instances of the model matched by where from the data source.
   * 
   * @param where Criteria to match model instances (optional)
   * @return Call&lt;InlineResponse2002&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Posts/count")
  Observable<InlineResponse2002> postCount(
    @retrofit2.http.Query("where") String where
  );

  /**
   * Create a new instance of the model and persist it into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Post&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Posts")
  Observable<Post> postCreate(
    @retrofit2.http.Body Post data
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
  @GET("Posts/change-stream")
  Observable<ResponseBody> postCreateChangeStreamGetPostsChangeStream(
    @retrofit2.http.Query("options") String options
  );

  /**
   * Create a change stream.
   * 
   * @param options  (optional)
   * @return Call&lt;File&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @POST("Posts/change-stream")
  Observable<ResponseBody> postCreateChangeStreamPostPostsChangeStream(
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
  @DELETE("Posts/{id}")
  Observable<Object> postDeleteById(
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
  @GET("Posts/{id}/exists")
  Observable<InlineResponse200> postExistsGetPostsidExists(
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
  @HEAD("Posts/{id}")
  Observable<InlineResponse200> postExistsHeadPostsid(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Find all instances of the model matched by filter from the data source.
   * 
   * @param filter Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;List&lt;Post&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Posts")
  Observable<List<Post>> postFind(
    @retrofit2.http.Query("filter") String filter
  );

  /**
   * Find a model instance by {{id}} from the data source.
   * 
   * @param id Model id (required)
   * @param filter Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;Post&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Posts/{id}")
  Observable<Post> postFindById(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("filter") String filter
  );

  /**
   * Find first instance of the model matched by filter from the data source.
   * 
   * @param filter Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;Post&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Posts/findOne")
  Observable<Post> postFindOne(
    @retrofit2.http.Query("filter") String filter
  );

  /**
   * Patch an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Post&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("Posts")
  Observable<Post> postPatchOrCreate(
    @retrofit2.http.Body Post data
  );

  /**
   * Patch attributes for a model instance and persist it into the data source.
   * 
   * @param id Post id (required)
   * @param data An object of model property name/value pairs (optional)
   * @return Call&lt;Post&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("Posts/{id}")
  Observable<Post> postPrototypePatchAttributes(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body Post data
  );

  /**
   * Replace attributes for a model instance and persist it into the data source.
   * 
   * @param id Model id (required)
   * @param data Model instance data (optional)
   * @return Call&lt;Post&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Posts/{id}/replace")
  Observable<Post> postReplaceByIdPostPostsidReplace(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body Post data
  );

  /**
   * Replace attributes for a model instance and persist it into the data source.
   * 
   * @param id Model id (required)
   * @param data Model instance data (optional)
   * @return Call&lt;Post&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("Posts/{id}")
  Observable<Post> postReplaceByIdPutPostsid(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body Post data
  );

  /**
   * Replace an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Post&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Posts/replaceOrCreate")
  Observable<Post> postReplaceOrCreatePostPostsReplaceOrCreate(
    @retrofit2.http.Body Post data
  );

  /**
   * Replace an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Post&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("Posts")
  Observable<Post> postReplaceOrCreatePutPosts(
    @retrofit2.http.Body Post data
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
  @POST("Posts/update")
  Observable<InlineResponse2001> postUpdateAll(
    @retrofit2.http.Query("where") String where, @retrofit2.http.Body Post data
  );

  /**
   * Update an existing model instance or insert a new one into the data source based on the where criteria.
   * 
   * @param where Criteria to match model instances (optional)
   * @param data An object of model property name/value pairs (optional)
   * @return Call&lt;Post&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Posts/upsertWithWhere")
  Observable<Post> postUpsertWithWhere(
    @retrofit2.http.Query("where") String where, @retrofit2.http.Body Post data
  );

}

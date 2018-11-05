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
import io.swagger.client.model.Submissions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SubmissionsApi {
  /**
   * Count instances of the model matched by where from the data source.
   * 
   * @param where Criteria to match model instances (optional)
   * @return Call&lt;InlineResponse2002&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Submissions/count")
  Observable<InlineResponse2002> submissionsCount(
    @retrofit2.http.Query("where") String where
  );

  /**
   * Create a new instance of the model and persist it into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Submissions&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Submissions")
  Observable<Submissions> submissionsCreate(
    @retrofit2.http.Body Submissions data
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
  @GET("Submissions/change-stream")
  Observable<ResponseBody> submissionsCreateChangeStreamGetSubmissionsChangeStream(
    @retrofit2.http.Query("options") String options
  );

  /**
   * Create a change stream.
   * 
   * @param options  (optional)
   * @return Call&lt;File&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @POST("Submissions/change-stream")
  Observable<ResponseBody> submissionsCreateChangeStreamPostSubmissionsChangeStream(
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
  @DELETE("Submissions/{id}")
  Observable<Object> submissionsDeleteById(
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
  @GET("Submissions/{id}/exists")
  Observable<InlineResponse200> submissionsExistsGetSubmissionsidExists(
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
  @HEAD("Submissions/{id}")
  Observable<InlineResponse200> submissionsExistsHeadSubmissionsid(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Find all instances of the model matched by filter from the data source.
   * 
   * @param filter Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;List&lt;Submissions&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Submissions")
  Observable<List<Submissions>> submissionsFind(
    @retrofit2.http.Query("filter") String filter
  );

  /**
   * Find a model instance by {{id}} from the data source.
   * 
   * @param id Model id (required)
   * @param filter Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;Submissions&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Submissions/{id}")
  Observable<Submissions> submissionsFindById(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("filter") String filter
  );

  /**
   * Find first instance of the model matched by filter from the data source.
   * 
   * @param filter Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;Submissions&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Submissions/findOne")
  Observable<Submissions> submissionsFindOne(
    @retrofit2.http.Query("filter") String filter
  );

  /**
   * Patch an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Submissions&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("Submissions")
  Observable<Submissions> submissionsPatchOrCreate(
    @retrofit2.http.Body Submissions data
  );

  /**
   * Patch attributes for a model instance and persist it into the data source.
   * 
   * @param id Submissions id (required)
   * @param data An object of model property name/value pairs (optional)
   * @return Call&lt;Submissions&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("Submissions/{id}")
  Observable<Submissions> submissionsPrototypePatchAttributes(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body Submissions data
  );

  /**
   * Replace attributes for a model instance and persist it into the data source.
   * 
   * @param id Model id (required)
   * @param data Model instance data (optional)
   * @return Call&lt;Submissions&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Submissions/{id}/replace")
  Observable<Submissions> submissionsReplaceByIdPostSubmissionsidReplace(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body Submissions data
  );

  /**
   * Replace attributes for a model instance and persist it into the data source.
   * 
   * @param id Model id (required)
   * @param data Model instance data (optional)
   * @return Call&lt;Submissions&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("Submissions/{id}")
  Observable<Submissions> submissionsReplaceByIdPutSubmissionsid(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body Submissions data
  );

  /**
   * Replace an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Submissions&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Submissions/replaceOrCreate")
  Observable<Submissions> submissionsReplaceOrCreatePostSubmissionsReplaceOrCreate(
    @retrofit2.http.Body Submissions data
  );

  /**
   * Replace an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Submissions&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("Submissions")
  Observable<Submissions> submissionsReplaceOrCreatePutSubmissions(
    @retrofit2.http.Body Submissions data
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
  @POST("Submissions/update")
  Observable<InlineResponse2001> submissionsUpdateAll(
    @retrofit2.http.Query("where") String where, @retrofit2.http.Body Submissions data
  );

  /**
   * Update an existing model instance or insert a new one into the data source based on the where criteria.
   * 
   * @param where Criteria to match model instances (optional)
   * @param data An object of model property name/value pairs (optional)
   * @return Call&lt;Submissions&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Submissions/upsertWithWhere")
  Observable<Submissions> submissionsUpsertWithWhere(
    @retrofit2.http.Query("where") String where, @retrofit2.http.Body Submissions data
  );

}

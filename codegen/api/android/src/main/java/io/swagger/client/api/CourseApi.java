package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import io.reactivex.Observable;
import retrofit2.http.*; import retrofit2.Response;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.Course;
import java.io.File;
import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.InlineResponse2001;
import io.swagger.client.model.InlineResponse2002;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CourseApi {
  /**
   * Count instances of the model matched by where from the data source.
   * 
   * @param where Criteria to match model instances (optional)
   * @return Call&lt;InlineResponse2002&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Courses/count")
  Observable<InlineResponse2002> courseCount(
    @retrofit2.http.Query("where") String where
  );

  /**
   * Create a new instance of the model and persist it into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Course&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Courses")
  Observable<Course> courseCreate(
    @retrofit2.http.Body Course data
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
  @GET("Courses/change-stream")
  Observable<ResponseBody> courseCreateChangeStreamGetCoursesChangeStream(
    @retrofit2.http.Query("options") String options
  );

  /**
   * Create a change stream.
   * 
   * @param options  (optional)
   * @return Call&lt;File&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @POST("Courses/change-stream")
  Observable<ResponseBody> courseCreateChangeStreamPostCoursesChangeStream(
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
  @DELETE("Courses/{id}")
  Observable<Object> courseDeleteById(
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
  @GET("Courses/{id}/exists")
  Observable<InlineResponse200> courseExistsGetCoursesidExists(
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
  @HEAD("Courses/{id}")
  Observable<InlineResponse200> courseExistsHeadCoursesid(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Find all instances of the model matched by filter from the data source.
   * 
   * @param filter Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;List&lt;Course&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Courses")
  Observable<List<Course>> courseFind(
    @retrofit2.http.Query("filter") String filter
  );

  /**
   * Find a model instance by {{id}} from the data source.
   * 
   * @param id Model id (required)
   * @param filter Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;Course&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Courses/{id}")
  Observable<Course> courseFindById(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("filter") String filter
  );

  /**
   * Find first instance of the model matched by filter from the data source.
   * 
   * @param filter Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;Course&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Courses/findOne")
  Observable<Course> courseFindOne(
    @retrofit2.http.Query("filter") String filter
  );

  /**
   * Patch an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Course&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("Courses")
  Observable<Course> coursePatchOrCreate(
    @retrofit2.http.Body Course data
  );

  /**
   * Patch attributes for a model instance and persist it into the data source.
   * 
   * @param id Course id (required)
   * @param data An object of model property name/value pairs (optional)
   * @return Call&lt;Course&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("Courses/{id}")
  Observable<Course> coursePrototypePatchAttributes(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body Course data
  );

  /**
   * Replace attributes for a model instance and persist it into the data source.
   * 
   * @param id Model id (required)
   * @param data Model instance data (optional)
   * @return Call&lt;Course&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Courses/{id}/replace")
  Observable<Course> courseReplaceByIdPostCoursesidReplace(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body Course data
  );

  /**
   * Replace attributes for a model instance and persist it into the data source.
   * 
   * @param id Model id (required)
   * @param data Model instance data (optional)
   * @return Call&lt;Course&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("Courses/{id}")
  Observable<Course> courseReplaceByIdPutCoursesid(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body Course data
  );

  /**
   * Replace an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Course&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Courses/replaceOrCreate")
  Observable<Course> courseReplaceOrCreatePostCoursesReplaceOrCreate(
    @retrofit2.http.Body Course data
  );

  /**
   * Replace an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Course&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("Courses")
  Observable<Course> courseReplaceOrCreatePutCourses(
    @retrofit2.http.Body Course data
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
  @POST("Courses/update")
  Observable<InlineResponse2001> courseUpdateAll(
    @retrofit2.http.Query("where") String where, @retrofit2.http.Body Course data
  );

  /**
   * Update an existing model instance or insert a new one into the data source based on the where criteria.
   * 
   * @param where Criteria to match model instances (optional)
   * @param data An object of model property name/value pairs (optional)
   * @return Call&lt;Course&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Courses/upsertWithWhere")
  Observable<Course> courseUpsertWithWhere(
    @retrofit2.http.Query("where") String where, @retrofit2.http.Body Course data
  );

}

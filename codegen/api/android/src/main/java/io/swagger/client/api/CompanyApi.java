package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import io.reactivex.Observable;
import retrofit2.http.*; import retrofit2.Response;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.Company;
import java.io.File;
import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.InlineResponse2001;
import io.swagger.client.model.InlineResponse2002;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CompanyApi {
  /**
   * Count instances of the model matched by where from the data source.
   * 
   * @param where Criteria to match model instances (optional)
   * @return Call&lt;InlineResponse2002&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Companies/count")
  Observable<InlineResponse2002> companyCount(
    @retrofit2.http.Query("where") String where
  );

  /**
   * Create a new instance of the model and persist it into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Company&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Companies")
  Observable<Company> companyCreate(
    @retrofit2.http.Body Company data
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
  @GET("Companies/change-stream")
  Observable<ResponseBody> companyCreateChangeStreamGetCompaniesChangeStream(
    @retrofit2.http.Query("options") String options
  );

  /**
   * Create a change stream.
   * 
   * @param options  (optional)
   * @return Call&lt;File&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @POST("Companies/change-stream")
  Observable<ResponseBody> companyCreateChangeStreamPostCompaniesChangeStream(
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
  @DELETE("Companies/{id}")
  Observable<Object> companyDeleteById(
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
  @GET("Companies/{id}/exists")
  Observable<InlineResponse200> companyExistsGetCompaniesidExists(
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
  @HEAD("Companies/{id}")
  Observable<InlineResponse200> companyExistsHeadCompaniesid(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Find all instances of the model matched by filter from the data source.
   * 
   * @param filter Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;List&lt;Company&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Companies")
  Observable<List<Company>> companyFind(
    @retrofit2.http.Query("filter") String filter
  );

  /**
   * Find a model instance by {{id}} from the data source.
   * 
   * @param id Model id (required)
   * @param filter Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;Company&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Companies/{id}")
  Observable<Company> companyFindById(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("filter") String filter
  );

  /**
   * Find first instance of the model matched by filter from the data source.
   * 
   * @param filter Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;Company&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Companies/findOne")
  Observable<Company> companyFindOne(
    @retrofit2.http.Query("filter") String filter
  );

  /**
   * Patch an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Company&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("Companies")
  Observable<Company> companyPatchOrCreate(
    @retrofit2.http.Body Company data
  );

  /**
   * Patch attributes for a model instance and persist it into the data source.
   * 
   * @param id Company id (required)
   * @param data An object of model property name/value pairs (optional)
   * @return Call&lt;Company&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("Companies/{id}")
  Observable<Company> companyPrototypePatchAttributes(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body Company data
  );

  /**
   * Replace attributes for a model instance and persist it into the data source.
   * 
   * @param id Model id (required)
   * @param data Model instance data (optional)
   * @return Call&lt;Company&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Companies/{id}/replace")
  Observable<Company> companyReplaceByIdPostCompaniesidReplace(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body Company data
  );

  /**
   * Replace attributes for a model instance and persist it into the data source.
   * 
   * @param id Model id (required)
   * @param data Model instance data (optional)
   * @return Call&lt;Company&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("Companies/{id}")
  Observable<Company> companyReplaceByIdPutCompaniesid(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body Company data
  );

  /**
   * Replace an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Company&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Companies/replaceOrCreate")
  Observable<Company> companyReplaceOrCreatePostCompaniesReplaceOrCreate(
    @retrofit2.http.Body Company data
  );

  /**
   * Replace an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Company&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("Companies")
  Observable<Company> companyReplaceOrCreatePutCompanies(
    @retrofit2.http.Body Company data
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
  @POST("Companies/update")
  Observable<InlineResponse2001> companyUpdateAll(
    @retrofit2.http.Query("where") String where, @retrofit2.http.Body Company data
  );

  /**
   * Update an existing model instance or insert a new one into the data source based on the where criteria.
   * 
   * @param where Criteria to match model instances (optional)
   * @param data An object of model property name/value pairs (optional)
   * @return Call&lt;Company&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Companies/upsertWithWhere")
  Observable<Company> companyUpsertWithWhere(
    @retrofit2.http.Query("where") String where, @retrofit2.http.Body Company data
  );

}

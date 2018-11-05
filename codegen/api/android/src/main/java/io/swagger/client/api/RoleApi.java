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
import io.swagger.client.model.Role;
import io.swagger.client.model.RoleMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface RoleApi {
  /**
   * Count instances of the model matched by where from the data source.
   * 
   * @param where Criteria to match model instances (optional)
   * @return Call&lt;InlineResponse2002&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Roles/count")
  Observable<InlineResponse2002> roleCount(
    @retrofit2.http.Query("where") String where
  );

  /**
   * Create a new instance of the model and persist it into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Role&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Roles")
  Observable<Role> roleCreate(
    @retrofit2.http.Body Role data
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
  @GET("Roles/change-stream")
  Observable<ResponseBody> roleCreateChangeStreamGetRolesChangeStream(
    @retrofit2.http.Query("options") String options
  );

  /**
   * Create a change stream.
   * 
   * @param options  (optional)
   * @return Call&lt;File&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @POST("Roles/change-stream")
  Observable<ResponseBody> roleCreateChangeStreamPostRolesChangeStream(
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
  @DELETE("Roles/{id}")
  Observable<Object> roleDeleteById(
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
  @GET("Roles/{id}/exists")
  Observable<InlineResponse200> roleExistsGetRolesidExists(
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
  @HEAD("Roles/{id}")
  Observable<InlineResponse200> roleExistsHeadRolesid(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Find all instances of the model matched by filter from the data source.
   * 
   * @param filter Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;List&lt;Role&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Roles")
  Observable<List<Role>> roleFind(
    @retrofit2.http.Query("filter") String filter
  );

  /**
   * Find a model instance by {{id}} from the data source.
   * 
   * @param id Model id (required)
   * @param filter Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;Role&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Roles/{id}")
  Observable<Role> roleFindById(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("filter") String filter
  );

  /**
   * Find first instance of the model matched by filter from the data source.
   * 
   * @param filter Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;Role&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Roles/findOne")
  Observable<Role> roleFindOne(
    @retrofit2.http.Query("filter") String filter
  );

  /**
   * Patch an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Role&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("Roles")
  Observable<Role> rolePatchOrCreate(
    @retrofit2.http.Body Role data
  );

  /**
   * Counts principals of Role.
   * 
   * @param id Role id (required)
   * @param where Criteria to match model instances (optional)
   * @return Call&lt;InlineResponse2002&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Roles/{id}/principals/count")
  Observable<InlineResponse2002> rolePrototypeCountPrincipals(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("where") String where
  );

  /**
   * Creates a new instance in principals of this model.
   * 
   * @param id Role id (required)
   * @param data  (optional)
   * @return Call&lt;RoleMapping&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Roles/{id}/principals")
  Observable<RoleMapping> rolePrototypeCreatePrincipals(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body RoleMapping data
  );

  /**
   * Deletes all principals of this model.
   * 
   * @param id Role id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("Roles/{id}/principals")
  Observable<Response<Void>> rolePrototypeDeletePrincipals(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Delete a related item by id for principals.
   * 
   * @param id Role id (required)
   * @param fk Foreign key for principals (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("Roles/{id}/principals/{fk}")
  Observable<Response<Void>> rolePrototypeDestroyByIdPrincipals(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Path("fk") String fk
  );

  /**
   * Find a related item by id for principals.
   * 
   * @param id Role id (required)
   * @param fk Foreign key for principals (required)
   * @return Call&lt;RoleMapping&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Roles/{id}/principals/{fk}")
  Observable<RoleMapping> rolePrototypeFindByIdPrincipals(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Path("fk") String fk
  );

  /**
   * Queries principals of Role.
   * 
   * @param id Role id (required)
   * @param filter  (optional)
   * @return Call&lt;List&lt;RoleMapping&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Roles/{id}/principals")
  Observable<List<RoleMapping>> rolePrototypeGetPrincipals(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("filter") String filter
  );

  /**
   * Patch attributes for a model instance and persist it into the data source.
   * 
   * @param id Role id (required)
   * @param data An object of model property name/value pairs (optional)
   * @return Call&lt;Role&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("Roles/{id}")
  Observable<Role> rolePrototypePatchAttributes(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body Role data
  );

  /**
   * Update a related item by id for principals.
   * 
   * @param id Role id (required)
   * @param fk Foreign key for principals (required)
   * @param data  (optional)
   * @return Call&lt;RoleMapping&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("Roles/{id}/principals/{fk}")
  Observable<RoleMapping> rolePrototypeUpdateByIdPrincipals(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Path("fk") String fk, @retrofit2.http.Body RoleMapping data
  );

  /**
   * Replace attributes for a model instance and persist it into the data source.
   * 
   * @param id Model id (required)
   * @param data Model instance data (optional)
   * @return Call&lt;Role&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Roles/{id}/replace")
  Observable<Role> roleReplaceByIdPostRolesidReplace(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body Role data
  );

  /**
   * Replace attributes for a model instance and persist it into the data source.
   * 
   * @param id Model id (required)
   * @param data Model instance data (optional)
   * @return Call&lt;Role&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("Roles/{id}")
  Observable<Role> roleReplaceByIdPutRolesid(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body Role data
  );

  /**
   * Replace an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Role&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Roles/replaceOrCreate")
  Observable<Role> roleReplaceOrCreatePostRolesReplaceOrCreate(
    @retrofit2.http.Body Role data
  );

  /**
   * Replace an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Role&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("Roles")
  Observable<Role> roleReplaceOrCreatePutRoles(
    @retrofit2.http.Body Role data
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
  @POST("Roles/update")
  Observable<InlineResponse2001> roleUpdateAll(
    @retrofit2.http.Query("where") String where, @retrofit2.http.Body Role data
  );

  /**
   * Update an existing model instance or insert a new one into the data source based on the where criteria.
   * 
   * @param where Criteria to match model instances (optional)
   * @param data An object of model property name/value pairs (optional)
   * @return Call&lt;Role&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Roles/upsertWithWhere")
  Observable<Role> roleUpsertWithWhere(
    @retrofit2.http.Query("where") String where, @retrofit2.http.Body Role data
  );

}

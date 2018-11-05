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

public interface RoleMappingApi {
  /**
   * Count instances of the model matched by where from the data source.
   * 
   * @param where Criteria to match model instances (optional)
   * @return Call&lt;InlineResponse2002&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("RoleMappings/count")
  Observable<InlineResponse2002> roleMappingCount(
    @retrofit2.http.Query("where") String where
  );

  /**
   * Create a new instance of the model and persist it into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;RoleMapping&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("RoleMappings")
  Observable<RoleMapping> roleMappingCreate(
    @retrofit2.http.Body RoleMapping data
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
  @GET("RoleMappings/change-stream")
  Observable<ResponseBody> roleMappingCreateChangeStreamGetRoleMappingsChangeStream(
    @retrofit2.http.Query("options") String options
  );

  /**
   * Create a change stream.
   * 
   * @param options  (optional)
   * @return Call&lt;File&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @POST("RoleMappings/change-stream")
  Observable<ResponseBody> roleMappingCreateChangeStreamPostRoleMappingsChangeStream(
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
  @DELETE("RoleMappings/{id}")
  Observable<Object> roleMappingDeleteById(
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
  @GET("RoleMappings/{id}/exists")
  Observable<InlineResponse200> roleMappingExistsGetRoleMappingsidExists(
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
  @HEAD("RoleMappings/{id}")
  Observable<InlineResponse200> roleMappingExistsHeadRoleMappingsid(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Find all instances of the model matched by filter from the data source.
   * 
   * @param filter Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;List&lt;RoleMapping&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("RoleMappings")
  Observable<List<RoleMapping>> roleMappingFind(
    @retrofit2.http.Query("filter") String filter
  );

  /**
   * Find a model instance by {{id}} from the data source.
   * 
   * @param id Model id (required)
   * @param filter Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;RoleMapping&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("RoleMappings/{id}")
  Observable<RoleMapping> roleMappingFindById(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("filter") String filter
  );

  /**
   * Find first instance of the model matched by filter from the data source.
   * 
   * @param filter Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;RoleMapping&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("RoleMappings/findOne")
  Observable<RoleMapping> roleMappingFindOne(
    @retrofit2.http.Query("filter") String filter
  );

  /**
   * Patch an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;RoleMapping&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("RoleMappings")
  Observable<RoleMapping> roleMappingPatchOrCreate(
    @retrofit2.http.Body RoleMapping data
  );

  /**
   * Fetches belongsTo relation role.
   * 
   * @param id RoleMapping id (required)
   * @param refresh  (optional)
   * @return Call&lt;Role&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("RoleMappings/{id}/role")
  Observable<Role> roleMappingPrototypeGetRole(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("refresh") Boolean refresh
  );

  /**
   * Patch attributes for a model instance and persist it into the data source.
   * 
   * @param id RoleMapping id (required)
   * @param data An object of model property name/value pairs (optional)
   * @return Call&lt;RoleMapping&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("RoleMappings/{id}")
  Observable<RoleMapping> roleMappingPrototypePatchAttributes(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body RoleMapping data
  );

  /**
   * Replace attributes for a model instance and persist it into the data source.
   * 
   * @param id Model id (required)
   * @param data Model instance data (optional)
   * @return Call&lt;RoleMapping&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("RoleMappings/{id}/replace")
  Observable<RoleMapping> roleMappingReplaceByIdPostRoleMappingsidReplace(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body RoleMapping data
  );

  /**
   * Replace attributes for a model instance and persist it into the data source.
   * 
   * @param id Model id (required)
   * @param data Model instance data (optional)
   * @return Call&lt;RoleMapping&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("RoleMappings/{id}")
  Observable<RoleMapping> roleMappingReplaceByIdPutRoleMappingsid(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body RoleMapping data
  );

  /**
   * Replace an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;RoleMapping&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("RoleMappings/replaceOrCreate")
  Observable<RoleMapping> roleMappingReplaceOrCreatePostRoleMappingsReplaceOrCreate(
    @retrofit2.http.Body RoleMapping data
  );

  /**
   * Replace an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;RoleMapping&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("RoleMappings")
  Observable<RoleMapping> roleMappingReplaceOrCreatePutRoleMappings(
    @retrofit2.http.Body RoleMapping data
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
  @POST("RoleMappings/update")
  Observable<InlineResponse2001> roleMappingUpdateAll(
    @retrofit2.http.Query("where") String where, @retrofit2.http.Body RoleMapping data
  );

  /**
   * Update an existing model instance or insert a new one into the data source based on the where criteria.
   * 
   * @param where Criteria to match model instances (optional)
   * @param data An object of model property name/value pairs (optional)
   * @return Call&lt;RoleMapping&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("RoleMappings/upsertWithWhere")
  Observable<RoleMapping> roleMappingUpsertWithWhere(
    @retrofit2.http.Query("where") String where, @retrofit2.http.Body RoleMapping data
  );

}

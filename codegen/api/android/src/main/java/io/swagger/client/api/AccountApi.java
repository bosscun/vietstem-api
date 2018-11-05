package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import io.reactivex.Observable;
import retrofit2.http.*; import retrofit2.Response;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.Account;
import io.swagger.client.model.AccountAccessToken;
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

public interface AccountApi {
  /**
   * Change a user&#39;s password.
   * 
   * @param oldPassword  (required)
   * @param newPassword  (required)
   * @return Call&lt;Void&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @POST("Accounts/change-password")
  Observable<Response<Void>> accountChangePassword(
    @retrofit2.http.Field("oldPassword") String oldPassword, @retrofit2.http.Field("newPassword") String newPassword
  );

  /**
   * Confirm a user registration with identity verification token.
   * 
   * @param uid  (required)
   * @param token  (required)
   * @param redirect  (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Accounts/confirm")
  Observable<Response<Void>> accountConfirm(
    @retrofit2.http.Query("uid") String uid, @retrofit2.http.Query("token") String token, @retrofit2.http.Query("redirect") String redirect
  );

  /**
   * Count instances of the model matched by where from the data source.
   * 
   * @param where Criteria to match model instances (optional)
   * @return Call&lt;InlineResponse2002&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Accounts/count")
  Observable<InlineResponse2002> accountCount(
    @retrofit2.http.Query("where") String where
  );

  /**
   * Create a new instance of the model and persist it into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Account&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Accounts")
  Observable<Account> accountCreate(
    @retrofit2.http.Body Account data
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
  @GET("Accounts/change-stream")
  Observable<ResponseBody> accountCreateChangeStreamGetAccountsChangeStream(
    @retrofit2.http.Query("options") String options
  );

  /**
   * Create a change stream.
   * 
   * @param options  (optional)
   * @return Call&lt;File&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @POST("Accounts/change-stream")
  Observable<ResponseBody> accountCreateChangeStreamPostAccountsChangeStream(
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
  @DELETE("Accounts/{id}")
  Observable<Object> accountDeleteById(
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
  @GET("Accounts/{id}/exists")
  Observable<InlineResponse200> accountExistsGetAccountsidExists(
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
  @HEAD("Accounts/{id}")
  Observable<InlineResponse200> accountExistsHeadAccountsid(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Find all instances of the model matched by filter from the data source.
   * 
   * @param filter Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;List&lt;Account&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Accounts")
  Observable<List<Account>> accountFind(
    @retrofit2.http.Query("filter") String filter
  );

  /**
   * Find a model instance by {{id}} from the data source.
   * 
   * @param id Model id (required)
   * @param filter Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;Account&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Accounts/{id}")
  Observable<Account> accountFindById(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("filter") String filter
  );

  /**
   * Find first instance of the model matched by filter from the data source.
   * 
   * @param filter Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;Account&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Accounts/findOne")
  Observable<Account> accountFindOne(
    @retrofit2.http.Query("filter") String filter
  );

  /**
   * Login a user with username/email and password.
   * 
   * @param credentials  (required)
   * @param include Related objects to include in the response. See the description of return value for more details. (optional)
   * @return Call&lt;Object&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Accounts/login")
  Observable<Object> accountLogin(
    @retrofit2.http.Body Object credentials, @retrofit2.http.Query("include") String include
  );

  /**
   * Logout a user with access token.
   * 
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Accounts/logout")
  Observable<Response<Void>> accountLogout();
    

  /**
   * Patch an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Account&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("Accounts")
  Observable<Account> accountPatchOrCreate(
    @retrofit2.http.Body Account data
  );

  /**
   * Counts accessTokens of Account.
   * 
   * @param id Account id (required)
   * @param where Criteria to match model instances (optional)
   * @return Call&lt;InlineResponse2002&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Accounts/{id}/accessTokens/count")
  Observable<InlineResponse2002> accountPrototypeCountAccessTokens(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("where") String where
  );

  /**
   * Counts roles of Account.
   * 
   * @param id Account id (required)
   * @param where Criteria to match model instances (optional)
   * @return Call&lt;InlineResponse2002&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Accounts/{id}/roles/count")
  Observable<InlineResponse2002> accountPrototypeCountRoles(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("where") String where
  );

  /**
   * Creates a new instance in accessTokens of this model.
   * 
   * @param id Account id (required)
   * @param data  (optional)
   * @return Call&lt;AccountAccessToken&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Accounts/{id}/accessTokens")
  Observable<AccountAccessToken> accountPrototypeCreateAccessTokens(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body AccountAccessToken data
  );

  /**
   * Creates a new instance in roles of this model.
   * 
   * @param id Account id (required)
   * @param data  (optional)
   * @return Call&lt;Role&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Accounts/{id}/roles")
  Observable<Role> accountPrototypeCreateRoles(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body Role data
  );

  /**
   * Deletes all accessTokens of this model.
   * 
   * @param id Account id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("Accounts/{id}/accessTokens")
  Observable<Response<Void>> accountPrototypeDeleteAccessTokens(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Deletes all roles of this model.
   * 
   * @param id Account id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("Accounts/{id}/roles")
  Observable<Response<Void>> accountPrototypeDeleteRoles(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Delete a related item by id for accessTokens.
   * 
   * @param id Account id (required)
   * @param fk Foreign key for accessTokens (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("Accounts/{id}/accessTokens/{fk}")
  Observable<Response<Void>> accountPrototypeDestroyByIdAccessTokens(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Path("fk") String fk
  );

  /**
   * Delete a related item by id for roles.
   * 
   * @param id Account id (required)
   * @param fk Foreign key for roles (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("Accounts/{id}/roles/{fk}")
  Observable<Response<Void>> accountPrototypeDestroyByIdRoles(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Path("fk") String fk
  );

  /**
   * Check the existence of roles relation to an item by id.
   * 
   * @param id Account id (required)
   * @param fk Foreign key for roles (required)
   * @return Call&lt;Boolean&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @HEAD("Accounts/{id}/roles/rel/{fk}")
  Observable<Boolean> accountPrototypeExistsRoles(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Path("fk") String fk
  );

  /**
   * Find a related item by id for accessTokens.
   * 
   * @param id Account id (required)
   * @param fk Foreign key for accessTokens (required)
   * @return Call&lt;AccountAccessToken&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Accounts/{id}/accessTokens/{fk}")
  Observable<AccountAccessToken> accountPrototypeFindByIdAccessTokens(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Path("fk") String fk
  );

  /**
   * Find a related item by id for roles.
   * 
   * @param id Account id (required)
   * @param fk Foreign key for roles (required)
   * @return Call&lt;Role&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Accounts/{id}/roles/{fk}")
  Observable<Role> accountPrototypeFindByIdRoles(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Path("fk") String fk
  );

  /**
   * Queries accessTokens of Account.
   * 
   * @param id Account id (required)
   * @param filter  (optional)
   * @return Call&lt;List&lt;AccountAccessToken&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Accounts/{id}/accessTokens")
  Observable<List<AccountAccessToken>> accountPrototypeGetAccessTokens(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("filter") String filter
  );

  /**
   * Queries roles of Account.
   * 
   * @param id Account id (required)
   * @param filter  (optional)
   * @return Call&lt;List&lt;Role&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Accounts/{id}/roles")
  Observable<List<Role>> accountPrototypeGetRoles(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("filter") String filter
  );

  /**
   * Add a related item by id for roles.
   * 
   * @param id Account id (required)
   * @param fk Foreign key for roles (required)
   * @param data  (optional)
   * @return Call&lt;RoleMapping&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("Accounts/{id}/roles/rel/{fk}")
  Observable<RoleMapping> accountPrototypeLinkRoles(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Path("fk") String fk, @retrofit2.http.Body RoleMapping data
  );

  /**
   * Patch attributes for a model instance and persist it into the data source.
   * 
   * @param id Account id (required)
   * @param data An object of model property name/value pairs (optional)
   * @return Call&lt;Account&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("Accounts/{id}")
  Observable<Account> accountPrototypePatchAttributes(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body Account data
  );

  /**
   * Remove the roles relation to an item by id.
   * 
   * @param id Account id (required)
   * @param fk Foreign key for roles (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("Accounts/{id}/roles/rel/{fk}")
  Observable<Response<Void>> accountPrototypeUnlinkRoles(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Path("fk") String fk
  );

  /**
   * Update a related item by id for accessTokens.
   * 
   * @param id Account id (required)
   * @param fk Foreign key for accessTokens (required)
   * @param data  (optional)
   * @return Call&lt;AccountAccessToken&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("Accounts/{id}/accessTokens/{fk}")
  Observable<AccountAccessToken> accountPrototypeUpdateByIdAccessTokens(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Path("fk") String fk, @retrofit2.http.Body AccountAccessToken data
  );

  /**
   * Update a related item by id for roles.
   * 
   * @param id Account id (required)
   * @param fk Foreign key for roles (required)
   * @param data  (optional)
   * @return Call&lt;Role&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("Accounts/{id}/roles/{fk}")
  Observable<Role> accountPrototypeUpdateByIdRoles(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Path("fk") String fk, @retrofit2.http.Body Role data
  );

  /**
   * Trigger user&#39;s identity verification with configured verifyOptions
   * 
   * @param id Account id (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Accounts/{id}/verify")
  Observable<Response<Void>> accountPrototypeVerify(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Replace attributes for a model instance and persist it into the data source.
   * 
   * @param id Model id (required)
   * @param data Model instance data (optional)
   * @return Call&lt;Account&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Accounts/{id}/replace")
  Observable<Account> accountReplaceByIdPostAccountsidReplace(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body Account data
  );

  /**
   * Replace attributes for a model instance and persist it into the data source.
   * 
   * @param id Model id (required)
   * @param data Model instance data (optional)
   * @return Call&lt;Account&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("Accounts/{id}")
  Observable<Account> accountReplaceByIdPutAccountsid(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body Account data
  );

  /**
   * Replace an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Account&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Accounts/replaceOrCreate")
  Observable<Account> accountReplaceOrCreatePostAccountsReplaceOrCreate(
    @retrofit2.http.Body Account data
  );

  /**
   * Replace an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Account&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("Accounts")
  Observable<Account> accountReplaceOrCreatePutAccounts(
    @retrofit2.http.Body Account data
  );

  /**
   * Reset password for a user with email.
   * 
   * @param options  (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Accounts/reset")
  Observable<Response<Void>> accountResetPassword(
    @retrofit2.http.Body Object options
  );

  /**
   * Reset user&#39;s password via a password-reset token.
   * 
   * @param newPassword  (required)
   * @return Call&lt;Void&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @POST("Accounts/reset-password")
  Observable<Response<Void>> accountSetPassword(
    @retrofit2.http.Field("newPassword") String newPassword
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
  @POST("Accounts/update")
  Observable<InlineResponse2001> accountUpdateAll(
    @retrofit2.http.Query("where") String where, @retrofit2.http.Body Account data
  );

  /**
   * Update an existing model instance or insert a new one into the data source based on the where criteria.
   * 
   * @param where Criteria to match model instances (optional)
   * @param data An object of model property name/value pairs (optional)
   * @return Call&lt;Account&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Accounts/upsertWithWhere")
  Observable<Account> accountUpsertWithWhere(
    @retrofit2.http.Query("where") String where, @retrofit2.http.Body Account data
  );

}

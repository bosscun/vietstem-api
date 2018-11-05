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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface AccountAccessTokenApi {
  /**
   * Count instances of the model matched by where from the data source.
   * 
   * @param where Criteria to match model instances (optional)
   * @return Call&lt;InlineResponse2002&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("AccountAccessTokens/count")
  Observable<InlineResponse2002> accountAccessTokenCount(
    @retrofit2.http.Query("where") String where
  );

  /**
   * Create a new instance of the model and persist it into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;AccountAccessToken&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("AccountAccessTokens")
  Observable<AccountAccessToken> accountAccessTokenCreate(
    @retrofit2.http.Body AccountAccessToken data
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
  @GET("AccountAccessTokens/change-stream")
  Observable<ResponseBody> accountAccessTokenCreateChangeStreamGetAccountAccessTokensChangeStream(
    @retrofit2.http.Query("options") String options
  );

  /**
   * Create a change stream.
   * 
   * @param options  (optional)
   * @return Call&lt;File&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @POST("AccountAccessTokens/change-stream")
  Observable<ResponseBody> accountAccessTokenCreateChangeStreamPostAccountAccessTokensChangeStream(
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
  @DELETE("AccountAccessTokens/{id}")
  Observable<Object> accountAccessTokenDeleteById(
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
  @GET("AccountAccessTokens/{id}/exists")
  Observable<InlineResponse200> accountAccessTokenExistsGetAccountAccessTokensidExists(
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
  @HEAD("AccountAccessTokens/{id}")
  Observable<InlineResponse200> accountAccessTokenExistsHeadAccountAccessTokensid(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Find all instances of the model matched by filter from the data source.
   * 
   * @param filter Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;List&lt;AccountAccessToken&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("AccountAccessTokens")
  Observable<List<AccountAccessToken>> accountAccessTokenFind(
    @retrofit2.http.Query("filter") String filter
  );

  /**
   * Find a model instance by {{id}} from the data source.
   * 
   * @param id Model id (required)
   * @param filter Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;AccountAccessToken&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("AccountAccessTokens/{id}")
  Observable<AccountAccessToken> accountAccessTokenFindById(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("filter") String filter
  );

  /**
   * Find first instance of the model matched by filter from the data source.
   * 
   * @param filter Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;AccountAccessToken&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("AccountAccessTokens/findOne")
  Observable<AccountAccessToken> accountAccessTokenFindOne(
    @retrofit2.http.Query("filter") String filter
  );

  /**
   * Patch an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;AccountAccessToken&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("AccountAccessTokens")
  Observable<AccountAccessToken> accountAccessTokenPatchOrCreate(
    @retrofit2.http.Body AccountAccessToken data
  );

  /**
   * Fetches belongsTo relation user.
   * 
   * @param id AccountAccessToken id (required)
   * @param refresh  (optional)
   * @return Call&lt;Account&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("AccountAccessTokens/{id}/user")
  Observable<Account> accountAccessTokenPrototypeGetUser(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("refresh") Boolean refresh
  );

  /**
   * Patch attributes for a model instance and persist it into the data source.
   * 
   * @param id AccountAccessToken id (required)
   * @param data An object of model property name/value pairs (optional)
   * @return Call&lt;AccountAccessToken&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("AccountAccessTokens/{id}")
  Observable<AccountAccessToken> accountAccessTokenPrototypePatchAttributes(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body AccountAccessToken data
  );

  /**
   * Replace attributes for a model instance and persist it into the data source.
   * 
   * @param id Model id (required)
   * @param data Model instance data (optional)
   * @return Call&lt;AccountAccessToken&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("AccountAccessTokens/{id}/replace")
  Observable<AccountAccessToken> accountAccessTokenReplaceByIdPostAccountAccessTokensidReplace(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body AccountAccessToken data
  );

  /**
   * Replace attributes for a model instance and persist it into the data source.
   * 
   * @param id Model id (required)
   * @param data Model instance data (optional)
   * @return Call&lt;AccountAccessToken&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("AccountAccessTokens/{id}")
  Observable<AccountAccessToken> accountAccessTokenReplaceByIdPutAccountAccessTokensid(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body AccountAccessToken data
  );

  /**
   * Replace an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;AccountAccessToken&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("AccountAccessTokens/replaceOrCreate")
  Observable<AccountAccessToken> accountAccessTokenReplaceOrCreatePostAccountAccessTokensReplaceOrCreate(
    @retrofit2.http.Body AccountAccessToken data
  );

  /**
   * Replace an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;AccountAccessToken&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("AccountAccessTokens")
  Observable<AccountAccessToken> accountAccessTokenReplaceOrCreatePutAccountAccessTokens(
    @retrofit2.http.Body AccountAccessToken data
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
  @POST("AccountAccessTokens/update")
  Observable<InlineResponse2001> accountAccessTokenUpdateAll(
    @retrofit2.http.Query("where") String where, @retrofit2.http.Body AccountAccessToken data
  );

  /**
   * Update an existing model instance or insert a new one into the data source based on the where criteria.
   * 
   * @param where Criteria to match model instances (optional)
   * @param data An object of model property name/value pairs (optional)
   * @return Call&lt;AccountAccessToken&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("AccountAccessTokens/upsertWithWhere")
  Observable<AccountAccessToken> accountAccessTokenUpsertWithWhere(
    @retrofit2.http.Query("where") String where, @retrofit2.http.Body AccountAccessToken data
  );

}

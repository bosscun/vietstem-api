package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import io.reactivex.Observable;
import retrofit2.http.*; import retrofit2.Response;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.Faq;
import java.io.File;
import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.InlineResponse2001;
import io.swagger.client.model.InlineResponse2002;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface FaqApi {
  /**
   * Count instances of the model matched by where from the data source.
   * 
   * @param where Criteria to match model instances (optional)
   * @return Call&lt;InlineResponse2002&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Faqs/count")
  Observable<InlineResponse2002> faqCount(
    @retrofit2.http.Query("where") String where
  );

  /**
   * Create a new instance of the model and persist it into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Faq&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Faqs")
  Observable<Faq> faqCreate(
    @retrofit2.http.Body Faq data
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
  @GET("Faqs/change-stream")
  Observable<ResponseBody> faqCreateChangeStreamGetFaqsChangeStream(
    @retrofit2.http.Query("options") String options
  );

  /**
   * Create a change stream.
   * 
   * @param options  (optional)
   * @return Call&lt;File&gt;
   */
  @retrofit2.http.FormUrlEncoded
  @POST("Faqs/change-stream")
  Observable<ResponseBody> faqCreateChangeStreamPostFaqsChangeStream(
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
  @DELETE("Faqs/{id}")
  Observable<Object> faqDeleteById(
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
  @GET("Faqs/{id}/exists")
  Observable<InlineResponse200> faqExistsGetFaqsidExists(
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
  @HEAD("Faqs/{id}")
  Observable<InlineResponse200> faqExistsHeadFaqsid(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Find all instances of the model matched by filter from the data source.
   * 
   * @param filter Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;List&lt;Faq&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Faqs")
  Observable<List<Faq>> faqFind(
    @retrofit2.http.Query("filter") String filter
  );

  /**
   * Find a model instance by {{id}} from the data source.
   * 
   * @param id Model id (required)
   * @param filter Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;Faq&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Faqs/{id}")
  Observable<Faq> faqFindById(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("filter") String filter
  );

  /**
   * Find first instance of the model matched by filter from the data source.
   * 
   * @param filter Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) (optional)
   * @return Call&lt;Faq&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Faqs/findOne")
  Observable<Faq> faqFindOne(
    @retrofit2.http.Query("filter") String filter
  );

  /**
   * Patch an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Faq&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("Faqs")
  Observable<Faq> faqPatchOrCreate(
    @retrofit2.http.Body Faq data
  );

  /**
   * Patch attributes for a model instance and persist it into the data source.
   * 
   * @param id Faq id (required)
   * @param data An object of model property name/value pairs (optional)
   * @return Call&lt;Faq&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("Faqs/{id}")
  Observable<Faq> faqPrototypePatchAttributes(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body Faq data
  );

  /**
   * Replace attributes for a model instance and persist it into the data source.
   * 
   * @param id Model id (required)
   * @param data Model instance data (optional)
   * @return Call&lt;Faq&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Faqs/{id}/replace")
  Observable<Faq> faqReplaceByIdPostFaqsidReplace(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body Faq data
  );

  /**
   * Replace attributes for a model instance and persist it into the data source.
   * 
   * @param id Model id (required)
   * @param data Model instance data (optional)
   * @return Call&lt;Faq&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("Faqs/{id}")
  Observable<Faq> faqReplaceByIdPutFaqsid(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body Faq data
  );

  /**
   * Replace an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Faq&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Faqs/replaceOrCreate")
  Observable<Faq> faqReplaceOrCreatePostFaqsReplaceOrCreate(
    @retrofit2.http.Body Faq data
  );

  /**
   * Replace an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return Call&lt;Faq&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("Faqs")
  Observable<Faq> faqReplaceOrCreatePutFaqs(
    @retrofit2.http.Body Faq data
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
  @POST("Faqs/update")
  Observable<InlineResponse2001> faqUpdateAll(
    @retrofit2.http.Query("where") String where, @retrofit2.http.Body Faq data
  );

  /**
   * Update an existing model instance or insert a new one into the data source based on the where criteria.
   * 
   * @param where Criteria to match model instances (optional)
   * @param data An object of model property name/value pairs (optional)
   * @return Call&lt;Faq&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Faqs/upsertWithWhere")
  Observable<Faq> faqUpsertWithWhere(
    @retrofit2.http.Query("where") String where, @retrofit2.http.Body Faq data
  );

}

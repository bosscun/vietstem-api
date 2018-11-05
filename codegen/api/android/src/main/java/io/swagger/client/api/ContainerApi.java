package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import io.reactivex.Observable;
import retrofit2.http.*; import retrofit2.Response;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import io.swagger.client.model.InlineResponse2003;
import io.swagger.client.model.InlineResponse2004;
import io.swagger.client.model.XAny;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ContainerApi {
  /**
   * 
   * 
   * @param options  (optional)
   * @return Call&lt;Object&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Containers")
  Observable<Object> containerCreateContainer(
    @retrofit2.http.Body Object options
  );

  /**
   * 
   * 
   * @param container  (required)
   * @return Call&lt;InlineResponse2003&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("Containers/{container}")
  Observable<InlineResponse2003> containerDestroyContainer(
    @retrofit2.http.Path("container") String container
  );

  /**
   * 
   * 
   * @param container  (required)
   * @param file  (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Containers/{container}/download/{file}")
  Observable<Response<Void>> containerDownload(
    @retrofit2.http.Path("container") String container, @retrofit2.http.Path("file") String file
  );

  /**
   * 
   * 
   * @param container  (required)
   * @return Call&lt;Object&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Containers/{container}")
  Observable<Object> containerGetContainer(
    @retrofit2.http.Path("container") String container
  );

  /**
   * 
   * 
   * @return Call&lt;List&lt;XAny&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Containers")
  Observable<List<XAny>> containerGetContainers();
    

  /**
   * 
   * 
   * @param container  (required)
   * @param file  (required)
   * @return Call&lt;Object&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Containers/{container}/files/{file}")
  Observable<Object> containerGetFile(
    @retrofit2.http.Path("container") String container, @retrofit2.http.Path("file") String file
  );

  /**
   * 
   * 
   * @param container  (required)
   * @return Call&lt;List&lt;XAny&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("Containers/{container}/files")
  Observable<List<XAny>> containerGetFiles(
    @retrofit2.http.Path("container") String container
  );

  /**
   * 
   * 
   * @param container  (required)
   * @param file  (required)
   * @return Call&lt;InlineResponse2003&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("Containers/{container}/files/{file}")
  Observable<InlineResponse2003> containerRemoveFile(
    @retrofit2.http.Path("container") String container, @retrofit2.http.Path("file") String file
  );

  /**
   * 
   * 
   * @param container  (required)
   * @return Call&lt;InlineResponse2004&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("Containers/{container}/upload")
  Observable<InlineResponse2004> containerUpload(
    @retrofit2.http.Path("container") String container
  );

}

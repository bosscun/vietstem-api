//
// ContainerAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation
import Alamofire
import RxSwift



open class ContainerAPI {
    /**

     - parameter options: (body)  (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func containerCreateContainer(options: JSON? = nil, completion: @escaping ((_ data: Any?,_ error: Error?) -> Void)) {
        containerCreateContainerWithRequestBuilder(options: options).execute { (response, error) -> Void in
            completion(response?.body, error);
        }
    }

    /**

     - parameter options: (body)  (optional)
     - returns: Observable<Any>
     */
    open class func containerCreateContainer(options: JSON? = nil) -> Observable<Any> {
        return Observable.create { observer -> Disposable in
            containerCreateContainer(options: options) { data, error in
                if let error = error {
                    observer.on(.error(error))
                } else {
                    observer.on(.next(data!))
                }
                observer.on(.completed)
            }
            return Disposables.create()
        }
    }

    /**
     - POST /Containers
     - examples: [{contentType=application/json, example="{}"}]
     
     - parameter options: (body)  (optional)

     - returns: RequestBuilder<JSON> 
     */
    open class func containerCreateContainerWithRequestBuilder(options: JSON? = nil) -> RequestBuilder<JSON> {
        let path = "/Containers"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = JSONEncodingHelper.encodingParameters(forEncodableObject: options)

        let url = NSURLComponents(string: URLString)


        let requestBuilder: RequestBuilder<JSON>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }

    /**

     - parameter container: (path)  
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func containerDestroyContainer(container: String, completion: @escaping ((_ data: InlineResponse2003?,_ error: Error?) -> Void)) {
        containerDestroyContainerWithRequestBuilder(container: container).execute { (response, error) -> Void in
            completion(response?.body, error);
        }
    }

    /**

     - parameter container: (path)  
     - returns: Observable<InlineResponse2003>
     */
    open class func containerDestroyContainer(container: String) -> Observable<InlineResponse2003> {
        return Observable.create { observer -> Disposable in
            containerDestroyContainer(container: container) { data, error in
                if let error = error {
                    observer.on(.error(error))
                } else {
                    observer.on(.next(data!))
                }
                observer.on(.completed)
            }
            return Disposables.create()
        }
    }

    /**
     - DELETE /Containers/{container}
     - examples: [{contentType=application/json, example={
  "undefined" : "{}"
}}]
     
     - parameter container: (path)  

     - returns: RequestBuilder<InlineResponse2003> 
     */
    open class func containerDestroyContainerWithRequestBuilder(container: String) -> RequestBuilder<InlineResponse2003> {
        var path = "/Containers/{container}"
        path = path.replacingOccurrences(of: "{container}", with: "\(container)", options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = NSURLComponents(string: URLString)


        let requestBuilder: RequestBuilder<InlineResponse2003>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "DELETE", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**

     - parameter container: (path)  
     - parameter file: (path)  
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func containerDownload(container: String, file: String, completion: @escaping ((_ error: Error?) -> Void)) {
        containerDownloadWithRequestBuilder(container: container, file: file).execute { (response, error) -> Void in
            completion(error);
        }
    }

    /**

     - parameter container: (path)  
     - parameter file: (path)  
     - returns: Observable<Void>
     */
    open class func containerDownload(container: String, file: String) -> Observable<Void> {
        return Observable.create { observer -> Disposable in
            containerDownload(container: container, file: file) { error in
                if let error = error {
                    observer.on(.error(error))
                } else {
                    observer.on(.next(()))
                }
                observer.on(.completed)
            }
            return Disposables.create()
        }
    }

    /**
     - GET /Containers/{container}/download/{file}
     
     - parameter container: (path)  
     - parameter file: (path)  

     - returns: RequestBuilder<Void> 
     */
    open class func containerDownloadWithRequestBuilder(container: String, file: String) -> RequestBuilder<Void> {
        var path = "/Containers/{container}/download/{file}"
        path = path.replacingOccurrences(of: "{container}", with: "\(container)", options: .literal, range: nil)
        path = path.replacingOccurrences(of: "{file}", with: "\(file)", options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = NSURLComponents(string: URLString)


        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getNonDecodableBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**

     - parameter container: (path)  
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func containerGetContainer(container: String, completion: @escaping ((_ data: Any?,_ error: Error?) -> Void)) {
        containerGetContainerWithRequestBuilder(container: container).execute { (response, error) -> Void in
            completion(response?.body, error);
        }
    }

    /**

     - parameter container: (path)  
     - returns: Observable<Any>
     */
    open class func containerGetContainer(container: String) -> Observable<Any> {
        return Observable.create { observer -> Disposable in
            containerGetContainer(container: container) { data, error in
                if let error = error {
                    observer.on(.error(error))
                } else {
                    observer.on(.next(data!))
                }
                observer.on(.completed)
            }
            return Disposables.create()
        }
    }

    /**
     - GET /Containers/{container}
     - examples: [{contentType=application/json, example="{}"}]
     
     - parameter container: (path)  

     - returns: RequestBuilder<JSON> 
     */
    open class func containerGetContainerWithRequestBuilder(container: String) -> RequestBuilder<JSON> {
        var path = "/Containers/{container}"
        path = path.replacingOccurrences(of: "{container}", with: "\(container)", options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = NSURLComponents(string: URLString)


        let requestBuilder: RequestBuilder<JSON>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**

     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func containerGetContainers(completion: @escaping ((_ data: [XAny]?,_ error: Error?) -> Void)) {
        containerGetContainersWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error);
        }
    }

    /**

     - returns: Observable<[XAny]>
     */
    open class func containerGetContainers() -> Observable<[XAny]> {
        return Observable.create { observer -> Disposable in
            containerGetContainers() { data, error in
                if let error = error {
                    observer.on(.error(error))
                } else {
                    observer.on(.next(data!))
                }
                observer.on(.completed)
            }
            return Disposables.create()
        }
    }

    /**
     - GET /Containers
     - examples: [{contentType=application/json, example=[ { }, { } ]}]

     - returns: RequestBuilder<[XAny]> 
     */
    open class func containerGetContainersWithRequestBuilder() -> RequestBuilder<[XAny]> {
        let path = "/Containers"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = NSURLComponents(string: URLString)


        let requestBuilder: RequestBuilder<[XAny]>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**

     - parameter container: (path)  
     - parameter file: (path)  
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func containerGetFile(container: String, file: String, completion: @escaping ((_ data: Any?,_ error: Error?) -> Void)) {
        containerGetFileWithRequestBuilder(container: container, file: file).execute { (response, error) -> Void in
            completion(response?.body, error);
        }
    }

    /**

     - parameter container: (path)  
     - parameter file: (path)  
     - returns: Observable<Any>
     */
    open class func containerGetFile(container: String, file: String) -> Observable<Any> {
        return Observable.create { observer -> Disposable in
            containerGetFile(container: container, file: file) { data, error in
                if let error = error {
                    observer.on(.error(error))
                } else {
                    observer.on(.next(data!))
                }
                observer.on(.completed)
            }
            return Disposables.create()
        }
    }

    /**
     - GET /Containers/{container}/files/{file}
     - examples: [{contentType=application/json, example="{}"}]
     
     - parameter container: (path)  
     - parameter file: (path)  

     - returns: RequestBuilder<JSON> 
     */
    open class func containerGetFileWithRequestBuilder(container: String, file: String) -> RequestBuilder<JSON> {
        var path = "/Containers/{container}/files/{file}"
        path = path.replacingOccurrences(of: "{container}", with: "\(container)", options: .literal, range: nil)
        path = path.replacingOccurrences(of: "{file}", with: "\(file)", options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = NSURLComponents(string: URLString)


        let requestBuilder: RequestBuilder<JSON>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**

     - parameter container: (path)  
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func containerGetFiles(container: String, completion: @escaping ((_ data: [XAny]?,_ error: Error?) -> Void)) {
        containerGetFilesWithRequestBuilder(container: container).execute { (response, error) -> Void in
            completion(response?.body, error);
        }
    }

    /**

     - parameter container: (path)  
     - returns: Observable<[XAny]>
     */
    open class func containerGetFiles(container: String) -> Observable<[XAny]> {
        return Observable.create { observer -> Disposable in
            containerGetFiles(container: container) { data, error in
                if let error = error {
                    observer.on(.error(error))
                } else {
                    observer.on(.next(data!))
                }
                observer.on(.completed)
            }
            return Disposables.create()
        }
    }

    /**
     - GET /Containers/{container}/files
     - examples: [{contentType=application/json, example=[ { }, { } ]}]
     
     - parameter container: (path)  

     - returns: RequestBuilder<[XAny]> 
     */
    open class func containerGetFilesWithRequestBuilder(container: String) -> RequestBuilder<[XAny]> {
        var path = "/Containers/{container}/files"
        path = path.replacingOccurrences(of: "{container}", with: "\(container)", options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = NSURLComponents(string: URLString)


        let requestBuilder: RequestBuilder<[XAny]>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**

     - parameter container: (path)  
     - parameter file: (path)  
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func containerRemoveFile(container: String, file: String, completion: @escaping ((_ data: InlineResponse2003?,_ error: Error?) -> Void)) {
        containerRemoveFileWithRequestBuilder(container: container, file: file).execute { (response, error) -> Void in
            completion(response?.body, error);
        }
    }

    /**

     - parameter container: (path)  
     - parameter file: (path)  
     - returns: Observable<InlineResponse2003>
     */
    open class func containerRemoveFile(container: String, file: String) -> Observable<InlineResponse2003> {
        return Observable.create { observer -> Disposable in
            containerRemoveFile(container: container, file: file) { data, error in
                if let error = error {
                    observer.on(.error(error))
                } else {
                    observer.on(.next(data!))
                }
                observer.on(.completed)
            }
            return Disposables.create()
        }
    }

    /**
     - DELETE /Containers/{container}/files/{file}
     - examples: [{contentType=application/json, example={
  "undefined" : "{}"
}}]
     
     - parameter container: (path)  
     - parameter file: (path)  

     - returns: RequestBuilder<InlineResponse2003> 
     */
    open class func containerRemoveFileWithRequestBuilder(container: String, file: String) -> RequestBuilder<InlineResponse2003> {
        var path = "/Containers/{container}/files/{file}"
        path = path.replacingOccurrences(of: "{container}", with: "\(container)", options: .literal, range: nil)
        path = path.replacingOccurrences(of: "{file}", with: "\(file)", options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = NSURLComponents(string: URLString)


        let requestBuilder: RequestBuilder<InlineResponse2003>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "DELETE", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**

     - parameter container: (path)  
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func containerUpload(container: String, completion: @escaping ((_ data: InlineResponse2004?,_ error: Error?) -> Void)) {
        containerUploadWithRequestBuilder(container: container).execute { (response, error) -> Void in
            completion(response?.body, error);
        }
    }

    /**

     - parameter container: (path)  
     - returns: Observable<InlineResponse2004>
     */
    open class func containerUpload(container: String) -> Observable<InlineResponse2004> {
        return Observable.create { observer -> Disposable in
            containerUpload(container: container) { data, error in
                if let error = error {
                    observer.on(.error(error))
                } else {
                    observer.on(.next(data!))
                }
                observer.on(.completed)
            }
            return Disposables.create()
        }
    }

    /**
     - POST /Containers/{container}/upload
     - examples: [{contentType=application/json, example={
  "result" : "{}"
}}]
     
     - parameter container: (path)  

     - returns: RequestBuilder<InlineResponse2004> 
     */
    open class func containerUploadWithRequestBuilder(container: String) -> RequestBuilder<InlineResponse2004> {
        var path = "/Containers/{container}/upload"
        path = path.replacingOccurrences(of: "{container}", with: "\(container)", options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = NSURLComponents(string: URLString)


        let requestBuilder: RequestBuilder<InlineResponse2004>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

}

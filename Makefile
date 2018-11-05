watch:
	tsc-watch --onSuccess "node server/server.js"
debug:
	tsc-watch --onSuccess "node --inspect server/server.js"

codegen: codegen-fetch codegen-ios codegen-android codegen-angular

codegen-angular:
	# angular
	yes | ./node_modules/.bin/lb-sdk server/server.js codegen/api/angular

codegen-export:
	# def
	lb export-api-def > codegen/def.yaml
	cd codegen && \
		patch < def.patch

codegen-fetch: codegen-export
	# fetch
	cd codegen && \
		java -jar swagger-codegen-cli-2.2.3.jar generate -i def.yaml -l typescript-fetch -o api/fetch
	sed -i~ -e 's/XAny/any/g' codegen/api/fetch/api.ts
	find codegen/api/fetch -not -name api.ts -delete || true

codegen-ios: codegen-export
	# ios
	cd codegen && \
		java -jar swagger-codegen-cli-2.3.1.jar generate -l swift4 -i def.yaml -DresponseAs=RxSwift -o api/ios
	cd codegen/api/ios && \
		sed -i~ \
			-e 's/: Any\?/: JSON?/g' \
			-e 's/: \[Any\]\?/: [JSON]?/g' \
			-e 's/Any\.self/JSON.self/g' \
			-e 's/\[Any\]\.self/[JSON].self/g' \
			-e 's/XJSON/XAny/g' \
			SwaggerClient/Classes/Swaggers/Models/*.swift && \
		sed -i~ \
			-e 's/RequestBuilder<Any>/RequestBuilder<JSON>/g' \
			-e 's/options: Any/options: JSON/g' \
			SwaggerClient/Classes/Swaggers/APIs/*.swift && \
		perl -i -ne 's/\?([,\)])/? = nil\1/g if ~/public init\(/; print' SwaggerClient/Classes/Swaggers/Models/*.swift && \
		find . -name \*.swift~ -delete || true
	cd codegen && \
		cp JSON.swift api/ios/SwaggerClient

codegen-android: codegen-export
	# android api
	cd codegen && \
		java -jar swagger-codegen-cli-2.3.1.jar generate -l java -i def.yaml -DuseRxJava2=true -Dlibrary=retrofit2 -DhideGenerationTimestamp=true -o api/android
	cd codegen/api/android && \
		sed -i~ \
			 -e 's/Observable<Void>/Observable<Response<Void>>/g' \
			 -e 's/import retrofit2.http.\*;/import retrofit2.http.*; import retrofit2.Response;/g' \
			src/main/java/io/swagger/client/api/*.java && \
		find . -name \*.java~ -delete || true

upload:
	tsc
	rsync -aP --no-o --no-g  -e 'ssh -Snone' --exclude=node_modules --exclude=.git ./ dev@51.38.186.136:api.tantn.ql6625.fr/app
	ssh dev@51.38.186.136 'cd api.tantn.ql6625.fr/app && npm install && pm2 reload api.tantn.ql6625.fr --update-env  '

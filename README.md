# Grails 5.0.0 Bug Demonstrations

See https://github.com/grails/grails-core/issues/11999

# Executable wars and jars do not have access to plugin resources

	sdk use grails 5.0.0.RC2
	git clone https://github.com/codeconsole/grails4bugs
	cd grails4bugs
	cd sample-plugin
	grails package
	cd ..
	grails run-app

http://localhost:8080

Notice a javascript alert "Hello World" which is coming from the plugin sample-plugin

Also notice http://localhost:8080/assets/helloWorld.js?compile=false the js is available.

Now build a runnable war


	grails package
	./build/libs/grails4bugs-0.1.war

Notice NO javascript alert "Hello World"

Also notice http://localhost:8080/assets/helloWorld.js?compile=false returns a 404

Now build a runnable bar


	./gradlew bootJar
	./build/libs/grails4bugs-0.1.jar

Notice NO javascript alert "Hello World"

Also notice http://localhost:8080/assets/helloWorld.js?compile=false returns a 404

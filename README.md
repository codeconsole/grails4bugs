# Grails 5.0.0/4.1.0 Bug Demonstrations

	sdk use grails 4.1.0.M5
	git clone https://github.com/codeconsole/grails4bugs
	cd grails4bugs
	grails package
	./build/libs/grails4bugs-0.1.jar 

http://localhost:8080

```
org.grails.taglib.GrailsTagException: [views/index.gsp:44] Error executing tag <sitemesh:captureContent>: Cannot get property 'config' on null object
	at org.grails.gsp.GroovyPage.throwRootCause(GroovyPage.java:473)
	at org.grails.gsp.GroovyPage.invokeTag(GroovyPage.java:415)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:107)
	at groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:323)
	at org.codehaus.groovy.runtime.metaclass.ClosureMetaClass.invokeMethod(ClosureMetaClass.java:351)
	at org.codehaus.groovy.runtime.callsite.PogoMetaClassSite.callCurrent(PogoMetaClassSite.java:61)
	at org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCallCurrent(CallSiteArray.java:51)
	at org.codehaus.groovy.runtime.callsite.AbstractCallSite.callCurrent(AbstractCallSite.java:171)
	at gsp_grails4bugs_m5index_gsp$_run_closure2.doCall(gsp_grails4bugs_m5index_gsp.groovy:64)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:107)
	at groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:323)
	at org.codehaus.groovy.runtime.metaclass.ClosureMetaClass.invokeMethod(ClosureMetaClass.java:263)
	at groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1035)
	at groovy.lang.Closure.call(Closure.java:412)
	at groovy.lang.Closure.call(Closure.java:406)
	at org.grails.taglib.TagBodyClosure.executeClosure(TagBodyClosure.java:200)
	at org.grails.taglib.TagBodyClosure.captureClosureOutput(TagBodyClosure.java:102)
	at org.grails.taglib.TagBodyClosure.call(TagBodyClosure.java:213)
	at org.grails.plugins.web.taglib.SitemeshTagLib.captureTagContent(SitemeshTagLib.groovy:48)
	at org.grails.plugins.web.taglib.SitemeshTagLib.captureTagContent(SitemeshTagLib.groovy)
	at org.grails.plugins.web.taglib.SitemeshTagLib$_closure3.doCall(SitemeshTagLib.groovy:156)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:107)
	at groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:323)
	at org.codehaus.groovy.runtime.metaclass.ClosureMetaClass.invokeMethod(ClosureMetaClass.java:263)
	at groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1035)
	at groovy.lang.Closure.call(Closure.java:412)
	at org.grails.gsp.GroovyPage.invokeTagLibClosure(GroovyPage.java:446)
	at org.grails.gsp.GroovyPage.invokeTag(GroovyPage.java:364)
	at org.grails.gsp.GroovyPage$invokeTag$4.callCurrent(Unknown Source)
	at org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCallCurrent(CallSiteArray.java:51)
	at org.codehaus.groovy.runtime.callsite.AbstractCallSite.callCurrent(AbstractCallSite.java:171)
	at gsp_grails4bugs_m5index_gsp.run(gsp_grails4bugs_m5index_gsp.groovy:78)
	at org.grails.gsp.GroovyPageWritable.doWriteTo(GroovyPageWritable.java:145)
	at org.grails.gsp.GroovyPageWritable.writeTo(GroovyPageWritable.java:82)
	at org.grails.web.servlet.view.GroovyPageView.renderTemplate(GroovyPageView.java:76)
	at org.grails.web.servlet.view.AbstractGrailsView.renderWithinGrailsWebRequest(AbstractGrailsView.java:71)
	at org.grails.web.servlet.view.AbstractGrailsView.renderMergedOutputModel(AbstractGrailsView.java:55)
	at org.springframework.web.servlet.view.AbstractView.render(AbstractView.java:316)
	at org.grails.web.sitemesh.GrailsLayoutView.renderInnerView(GrailsLayoutView.java:150)
	at org.grails.web.sitemesh.GrailsLayoutView.obtainContent(GrailsLayoutView.java:128)
	at org.grails.web.sitemesh.GrailsLayoutView.renderTemplate(GrailsLayoutView.java:63)
	at org.grails.web.servlet.view.AbstractGrailsView.renderWithinGrailsWebRequest(AbstractGrailsView.java:71)
	at org.grails.web.servlet.view.AbstractGrailsView.renderMergedOutputModel(AbstractGrailsView.java:55)
	at org.springframework.web.servlet.view.AbstractView.render(AbstractView.java:316)
	at org.springframework.web.servlet.DispatcherServlet.render(DispatcherServlet.java:1394)
	at org.springframework.web.servlet.DispatcherServlet.processDispatchResult(DispatcherServlet.java:1139)
	at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1078)
	at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:961)
	at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1006)
	at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:898)
	at javax.servlet.http.HttpServlet.service(HttpServlet.java:626)
	at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883)
	at javax.servlet.http.HttpServlet.service(HttpServlet.java:733)
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:231)
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)
	at org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:53)
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193)
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)
	at org.grails.web.servlet.mvc.GrailsWebRequestFilter.doFilterInternal(GrailsWebRequestFilter.java:77)
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:119)
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193)
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)
	at org.grails.web.filters.HiddenHttpMethodFilter.doFilterInternal(HiddenHttpMethodFilter.java:67)
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:119)
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193)
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)
	at org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:201)
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:119)
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193)
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)
	at org.springframework.boot.actuate.metrics.web.servlet.WebMvcMetricsFilter.doFilterInternal(WebMvcMetricsFilter.java:93)
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:119)
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193)
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)
	at org.springframework.web.filter.CorsFilter.doFilterInternal(CorsFilter.java:91)
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:119)
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193)
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)
	at org.apache.catalina.core.StandardWrapperValve.invoke(StandardWrapperValve.java:202)
	at org.apache.catalina.core.StandardContextValve.invoke(StandardContextValve.java:97)
	at org.apache.catalina.authenticator.AuthenticatorBase.invoke(AuthenticatorBase.java:542)
	at org.apache.catalina.core.StandardHostValve.invoke(StandardHostValve.java:143)
	at org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:92)
	at org.apache.catalina.core.StandardEngineValve.invoke(StandardEngineValve.java:78)
	at org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:343)
	at org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:374)
	at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:65)
	at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:888)
	at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1597)
	at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61)
	at java.base/java.lang.Thread.run(Thread.java:834)
Caused by: java.lang.NullPointerException: Cannot get property 'config' on null object
	at org.codehaus.groovy.runtime.NullObject.getProperty(NullObject.java:60)
	at org.codehaus.groovy.runtime.InvokerHelper.getProperty(InvokerHelper.java:194)
	at org.codehaus.groovy.runtime.callsite.NullCallSite.getProperty(NullCallSite.java:46)
	at org.codehaus.groovy.runtime.callsite.AbstractCallSite.callGetProperty(AbstractCallSite.java:329)
	at gsp_grails4bugs_m5index_gsp$_run_closure2$_closure4.doCall(gsp_grails4bugs_m5index_gsp.groovy:35)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:107)
	at groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:323)
	at org.codehaus.groovy.runtime.metaclass.ClosureMetaClass.invokeMethod(ClosureMetaClass.java:263)
	at groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1035)
	at groovy.lang.Closure.call(Closure.java:412)
	at groovy.lang.Closure.call(Closure.java:406)
	at org.grails.taglib.TagBodyClosure.executeClosure(TagBodyClosure.java:200)
	at org.grails.taglib.TagBodyClosure.captureClosureOutput(TagBodyClosure.java:102)
	at org.grails.taglib.TagBodyClosure.call(TagBodyClosure.java:213)
	at org.grails.plugins.web.taglib.SitemeshTagLib.wrapContentInBuffer(SitemeshTagLib.groovy:106)
	at org.grails.plugins.web.taglib.SitemeshTagLib$_closure4.doCall(SitemeshTagLib.groovy:177)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:107)
	at groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:323)
	at org.codehaus.groovy.runtime.metaclass.ClosureMetaClass.invokeMethod(ClosureMetaClass.java:263)
	at groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1035)
	at groovy.lang.Closure.call(Closure.java:412)
	at org.grails.gsp.GroovyPage.invokeTagLibClosure(GroovyPage.java:446)
	at org.grails.gsp.GroovyPage.invokeTag(GroovyPage.java:364)
	... 104 common frames omitted
```
Note: using `grails run-app' works. Only running the jar does not work.  Executable jars broke starting in 4.1.0.M3

Demonstrate executable working with 4.1.0.M2:

	git checkout 4.1.0.M2
	grails clean
	grails package	
	./build/libs/grails4bugs-0.1.jar 

http://localhost:8080

Works!

How this app was built:

Note: this is a freshly created **Grails 4.1.0.M5** application with the following modifications:

	sdk use grails 5.0.0.M1
	rm -rf *
	cd ..
	grails create-app grails4bugs

**BUG** 

modified **build.gradle** to stop war generation

	// apply plugin:"war"
  
modified **build.gradle** to create executable jar

	bootJar {
	    launchScript()
	}

Verify working:
	grails run-app

http://localhost:8080

Stop run-app and package
	grails package
  
Run jar
	./build/libs/grails4bugs-0.1.jar 
  
http://localhost:8080

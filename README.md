# Grails 5.0.1 Bug Demonstrations

# Running Multiple Datasources with JDK 17 results in Exception

Step 1 - Verify App works with JDK < 17
```
git clone https://github.com/codeconsole/grails4bugs
cd grails4bugs
sdk use java 11.0.2-open
./gradlew clean bootRun
Grails application running at http://localhost:8080 in environment: development
```

Step 2 - Verify App does not work with JDK
```
sdk use java 17.0.1-open  
./gradlew clean bootRun
Grails application running at http://localhost:8080 in environment: development
```

```
org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'hibernateDatastore': Bean instantiation via constructor failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.grails.orm.hibernate.HibernateDatastore]: Constructor threw exception; nested exception is groovy.lang.MissingMethodException: No signature of method: java.lang.Object.clone() is applicable for argument types: () values: []
Possible solutions: collect(), collect(groovy.lang.Closure), collect(java.util.Collection, groovy.lang.Closure), any(), find(), sleep(long)
        at org.springframework.beans.factory.support.ConstructorResolver.instantiate(ConstructorResolver.java:315)
        at org.springframework.beans.factory.support.ConstructorResolver.autowireConstructor(ConstructorResolver.java:296)
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.autowireConstructor(AbstractAutowireCapableBeanFactory.java:1372)
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1222)
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:582)
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542)
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335)
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234)
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333)
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208)
        at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:410)
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1352)
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1195)
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:582)
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542)
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335)
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234)
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333)
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208)
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:944)
        at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:918)
        at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:583)
        at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:145)
        at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:754)
        at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:434)
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:338)
        at grails.boot.GrailsApp.run(GrailsApp.groovy:99)
        at grails.boot.GrailsApp.run(GrailsApp.groovy:485)
        at grails.boot.GrailsApp.run(GrailsApp.groovy:472)
        at grails4bugs.Application.main(Application.groovy:11)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
        at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.base/java.lang.reflect.Method.invoke(Method.java:568)
        at org.springframework.boot.devtools.restart.RestartLauncher.run(RestartLauncher.java:49)
Caused by: org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.grails.orm.hibernate.HibernateDatastore]: Constructor threw exception; nested exception is groovy.lang.MissingMethodException: No signature of method: java.lang.Object.clone() is applicable for argument types: () values: []
Possible solutions: collect(), collect(groovy.lang.Closure), collect(java.util.Collection, groovy.lang.Closure), any(), find(), sleep(long)
        at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:224)
        at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:117)
        at org.springframework.beans.factory.support.ConstructorResolver.instantiate(ConstructorResolver.java:311)
        ... 34 common frames omitted
Caused by: groovy.lang.MissingMethodException: No signature of method: java.lang.Object.clone() is applicable for argument types: () values: []
Possible solutions: collect(), collect(groovy.lang.Closure), collect(java.util.Collection, groovy.lang.Closure), any(), find(), sleep(long)
        at org.codehaus.groovy.runtime.ScriptBytecodeAdapter.unwrap(ScriptBytecodeAdapter.java:70)
        at org.codehaus.groovy.runtime.ScriptBytecodeAdapter.invokeMethodOnSuperN(ScriptBytecodeAdapter.java:146)
        at org.codehaus.groovy.runtime.ScriptBytecodeAdapter.invokeMethodOnSuper0(ScriptBytecodeAdapter.java:164)
        at org.grails.orm.hibernate.connections.HibernateConnectionSourceSettings$HibernateSettings$OsivSettings.clone(HibernateConnectionSourceSettings.groovy)
        at org.grails.orm.hibernate.connections.HibernateConnectionSourceSettings$HibernateSettings$OsivSettings$clone.call(Unknown Source)
        at org.grails.orm.hibernate.connections.HibernateConnectionSourceSettings$HibernateSettings.clone(HibernateConnectionSourceSettings.groovy)
        at org.grails.orm.hibernate.connections.HibernateConnectionSourceSettings$HibernateSettings$clone$0.call(Unknown Source)
        at org.grails.orm.hibernate.connections.HibernateConnectionSourceSettings.clone(HibernateConnectionSourceSettings.groovy)
        at org.grails.orm.hibernate.connections.HibernateConnectionSourceSettings$clone.call(Unknown Source)
        at org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)
        at org.grails.datastore.mapping.core.connections.ConnectionSourceSettings$clone.call(Unknown Source)
        at org.grails.datastore.mapping.config.ConfigurationBuilder.<init>(ConfigurationBuilder.groovy:77)
        at org.grails.datastore.mapping.config.ConfigurationBuilder.<init>(ConfigurationBuilder.groovy)
        at org.grails.orm.hibernate.connections.HibernateConnectionSourceSettingsBuilder.<init>(HibernateConnectionSourceSettingsBuilder.groovy:19)
        at org.grails.orm.hibernate.connections.AbstractHibernateConnectionSourceFactory.buildSettingsWithPrefix(AbstractHibernateConnectionSourceFactory.java:95)
        at org.grails.orm.hibernate.connections.AbstractHibernateConnectionSourceFactory.buildSettings(AbstractHibernateConnectionSourceFactory.java:87)
        at org.grails.orm.hibernate.connections.AbstractHibernateConnectionSourceFactory.buildSettings(AbstractHibernateConnectionSourceFactory.java:23)
        at org.grails.datastore.mapping.core.connections.AbstractConnectionSourceFactory.create(AbstractConnectionSourceFactory.java:63)
        at org.grails.datastore.mapping.core.connections.InMemoryConnectionSources.<init>(InMemoryConnectionSources.groovy:25)
        at org.grails.datastore.mapping.core.connections.ConnectionSourcesInitializer.create(ConnectionSourcesInitializer.groovy:28)
        at org.grails.orm.hibernate.HibernateDatastore.<init>(HibernateDatastore.java:212)
        at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
        at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)
        at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
        at java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)
        at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)
        at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:211)
        ... 36 common frames omitted

```
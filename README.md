# Grails 5.1.8 Bug Demonstrations
# Grails CLI does not work with JDK 17 with Security Plugins
# Update: 9/5/22 - The following has been confirmed working with Grails 5.2.3
Step 1 - Verify app starts with JDK 17
```bash
git clone https://github.com/codeconsole/grails4bugs
cd grails4bugs
sdk use java 22.2.r17-grl
./gradlew clean bootRun
```
```Grails application running at http://localhost:8080 in environment: development```


Step 2 - Verify grails cli does not work with JDK 17
```bash
grails run-app
```
```
| Error Failed to compile s2-create-role-hierarchy-entry.groovy: BUG! exception in phase 'semantic analysis' in source unit 's2-create-role-hierarchy-entry.groovy' Unsupported class file major version 61 (Use --stacktrace to see the full trace)
| Error Command [run-app] error: Cannot invoke "org.grails.cli.profile.commands.script.GroovyScriptCommand.setProfile(org.grails.cli.profile.Profile)" because "data" is null (Use --stacktrace to see the full trace)
```

# How this app was set up

This is a very basic app that was created with the `grails create-app grails4bugs` command.

Step 1 - Verify App starts with JDK 17
```bash
git create-app grails4bugs
cd grails4bugs
sdk use java 22.2.r17-grl
./gradlew clean bootRun
```
```Grails application running at http://localhost:8080 in environment: development```

Step 2 - Verify cli does not work with JDK 17
```bash
grails run-app

| Error Failed to compile CreateFunctionalTest.groovy: startup failed:
General error during conversion: Unsupported class file major version 61
```

Step 3 - Verify cli working
```bash
grails run-app
```
```Grails application running at http://localhost:8080 in environment: development```


Step 5 - Add Spring Security Core Plugin
Nothing was changed except the following was added to `build.gradle`

Modify `build.gradle`
```
    implementation "org.grails.plugins:spring-security-core:5.1.0"
    implementation 'org.grails.plugins:spring-security-ui:4.0.0.M1'  
```

https://github.com/grails/grails-spring-security-core

https://github.com/grails/grails-spring-security-core/issues/767

https://github.com/grails-plugins/grails-spring-security-ui

https://github.com/grails-plugins/grails-spring-security-ui/issues/127
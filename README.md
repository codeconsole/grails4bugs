# Grails 5.2.3 Bug Demonstrations
# Grails CLI does not work with JDK 17 with Security Plugins

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
sdk use java 22.1.0.r17-grl
./gradlew clean bootRun
```
```Grails application running at http://localhost:8080 in environment: development```

Step 2 - Verify cli does not work with JDK 17
```bash
grails run-app

| Error Failed to compile CreateFunctionalTest.groovy: startup failed:
General error during conversion: Unsupported class file major version 61
```

Step 3 - Fix cli for basic app
Modify `gradle.properties` and change groovy to 3.0.11
```
groovyVersion=3.0.11
```

Step 4 - Verify cli working
```bash
grails run-app
```
```Grails application running at http://localhost:8080 in environment: development```


Step 5 - Add Spring Security Core Plugin
Nothing was changed except the following was added to `build.gradle`

Modify `build.gradle`
```
    implementation "org.grails.plugins:spring-security-core:5.0.0"
```

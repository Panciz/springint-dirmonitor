# springint-dirmonitor

**Spring Integration File Modification Monitor** 

A simple spring-boot  application that monitor a dir (and its sub-dirs) and raises and event if a file contained in the dir is modified or created.

No event are raised for files already present in the dir.

The directory to monitor is passed as argument at runtime.

The project is based on [Spring Integration](https://projects.spring.io/spring-integration/) and [Spring DSL](https://github.com/spring-projects/spring-integration-java-dsl/wiki/spring-integration-java-dsl-reference)

The event dispatcher and consumer are instantiated at runtime using spring DSL. 

to run

`mvn package`

and 

`jar -jar target\springint-0.0.1-SNAPSHOT.jar --readingDir=/dir/to/monitor`

 



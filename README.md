# spring-ai-reactive

## Simple service in java and spring framework for using new spring-ai module's reactive API

Our
project's [spring initializr](https://start.spring.io/#!type=maven-project&language=java&platformVersion=3.3.0&packaging=jar&jvmVersion=21&groupId=ali.artukov&artifactId=spring-ai-reactive&name=spring-ai-reactive&description=Simple%20service%20in%20java%20and%20spring%20framework%20for%20using%20new%20spring-ai%20module's%20reactive%20API&packageName=ali.artukov.spring-ai-reactive&dependencies=spring-ai-openai,lombok,web).

Plus added next dependency for enabling swagger:

```xml
<!-- https://mvnrepository.com/artifact/org.springdoc/springdoc-openapi-starter-webmvc-ui -->
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>2.5.0</version>
</dependency>
```

Full content of `pom.xml` file:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.3.0</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>
    <groupId>ali.artukov</groupId>
    <artifactId>spring-ai-reactive</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>spring-ai-reactive</name>
    <description>Simple service in java and spring framework for using new spring-ai module's reactive API</description>
    <properties>
        <java.version>21</java.version>
        <spring-ai.version>1.0.0-M1</spring-ai.version>
    </properties>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.ai</groupId>
            <artifactId>spring-ai-openai-spring-boot-starter</artifactId>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>io.projectreactor</groupId>
            <artifactId>reactor-test</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.springdoc</groupId>
            <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
            <version>2.5.0</version>
        </dependency>
    </dependencies>
    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>org.springframework.ai</groupId>
                <artifactId>spring-ai-bom</artifactId>
                <version>${spring-ai.version}</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <configuration>
                    <excludes>
                        <exclude>
                            <groupId>org.projectlombok</groupId>
                            <artifactId>lombok</artifactId>
                        </exclude>
                    </excludes>
                </configuration>
            </plugin>
        </plugins>
    </build>
    <repositories>
        <repository>
            <id>spring-milestones</id>
            <name>Spring Milestones</name>
            <url>https://repo.spring.io/milestone</url>
            <snapshots>
                <enabled>false</enabled>
            </snapshots>
        </repository>
    </repositories>

</project>
```

# How to run

- Clone project from my [github repository](https://github.com/AliArtukov/spring-ai-reactive)
- Create OPENAI_API_KEY variable with your openai api kiy value
- Run next commands:

 ```shell
mvn spring-boot:run
 ```

- Open swagger page http://localhost:8080/swagger in your browser
- Use all the methods and have fun

# Result

I called GET method `/reactive-chat` without param http://localhost:8080/reactive-chat and received the following response:

```text
Sure Here's a list of all major versions of Java along with some of their top features:

### JDK1.0 (January1996)
- **Initial release**: The first official release of Java.
- **Applets**: Support for Java applets.
- **AWT**: Abstract Window Toolkit for GUI programming.

### JDK1.1 (February1997)
- **Inner Classes**: Support for nested classes.
- **JavaBeans**: Component architecture.
- **RMI**: Remote Method Invocation for distributed computing.
- **JDBC**: Java Database Connectivity for database access.

### J2SE1.2 (December1998)
- **Swing**: New GUI components.
- **Collections Framework**: Introduction of the Collections API.
- **JIT Compiler**: Just-In-Time compiler for improved performance.

### J2SE1.3 (May2000)
- **HotSpot JVM**: Improved performance with the HotSpot virtual machine.
- **Java Sound API**: Basic sound support.
- **RMI over IIOP**: Remote Method Invocation over Internet Inter-ORB Protocol.

### J2SE1.4 (February2002)
- **Assertions**: Added assert keyword- **Regular Expressions: Support for regex patterns.
- **NIO**: New I/O for high-performance I/O operations.
- ** API**: Built-in logging capabilities.

### J2SE5.0 (September2004)
- **Generics**: Type-safe collections.
- **Annotations**: Metadata for code.
- **Enums**: Enumeration types.
- **Varargs**: Variable-length argument lists.
- **Concurrency Utilities**: Enhanced support for multithreading.

### Java SE6 (December2006)
- **Scripting Language Support**: Integration with scripting languages.
- **Compiler API**: Programmatic access to the Java compiler.
- **Pluggable Annotations**: Annotation processing capabilities.
- **Improved Web Services**: Better support for web services.

### Java7 (July2011)
- **Project Coin**: Small language enhancements (e.g., try-with-resources, diamond operator).
- **NIO.2**: Enhanced I/O capabilities.
- **Fork/Join Framework**: Parallel programming capabilities.
- **Strings in switch**: Switch statement can use String objects.

### Java SE8 (March2014)
- **Lambda Expressions**: Functional programming constructs.
- **Stream API**: Processing sequences of elements.
- **Optional Class**: Handling null values more gracefully.
- **Date and Time API**: New java.time package for modern date/time handling.
- **Nashorn JavaScript Engine**: Improved JavaScript integration.

### Java SE9 (September2017)
- **Module System**: Project Jigsaw for modular applications.
- **JShell**: Interactive REPL (Read-Eval-Print Loop).
- **Enhanced Javadoc**: New search capabilities and better documentation.
- **Stream API Enhancements**: New methods and improvements.

### Java SE10 (March2018)
- **Local-Variable Type Inference**: var keyword for local variables.
 **Garbage Collector Interface**: Cleaner garbage collection APIs.
- **Application Class-Data Sharing**: Improved startup and footprint.

### Java SE11 (September2018)
- ** Support (LTS)**: First LTS release since Java SE8.
- **HTTP Client**: Standardized HTTP client implementation.
- **Local-Variable Syntax Parameters**: Enhanced var usage.
- **Removed APIs**: Deprecation and removal of obsolete APIs.

### Java SE12 (March2019)
- **Switch (Preview)**: Enhanced switch statements.
- **JVM Constants API**: New API for modeling nominal descriptions of key class-file and run-time artifacts.

### Java SE13 (September2019)
- ** (Preview)**: Multi-line string literals.
- **Switch Expressions (Preview)**: Continued enhancement of switch statements.
- **Dynamic CDS Archives**: Application class-data sharing.

### Java SE14 (March2020)
- **Switch Expressions**: Finalized feature.
- **Records (Preview)**: Compact, immutable data carriers.
- **Pattern Matching for instanceof (Preview)**: Simplified type checks.

### Java SE15 (September2020)
- **Se (Preview)**: Restrict which classes can extend or implement them.
- **Hidden Classes**: Support for non-discoverable classes.
- **Text Blocks**: Finalized feature.

### Java SE16 (March2021)
- **Pattern Matching for instanceof**: Finalized feature.
- **Records**: Finalized feature.
- **Vector API (Incubator)**: SIMD programming capabilities.

### Java SE17 (September2021)
- **Long-Term Support (LTS)**: Another LTS release.
- **Sealed Classes**: Finalized.
- **Foreign Function & Memory API (Incubator)**: Interoperability with native code.

### Java SE18 (March2022)
- **UTF-8 by Default**: Standard charset UTF-8 by default.
- **Simple Web Server**: Minimal HTTP server for prototyping and testing.

### Java SE19 (September2022)
- **Virtual (Preview)**: Lightweight concurrency model.
- **Structured Concurrency (Incubator)**: Simplifies multithreaded programming.
- **Pattern Matching for switch (Preview)**: Enhanced pattern matching.

### Java SE20 (March2023)
- **Scoped Values (Incubator)**: Shared, immutable data for structured concurrency.
- **Pattern Matching for switch**: Continued enhancement.
- **Foreign Function & Memory API**: Continued improvements.

Each version of Java has built upon its predecessors, adding new features and enhancements to improve performance, security, of use.
```

I called GET method `/reactive-chat` with param `Write list of all versions of Spring Framework with their top features` http://localhost:8080/reactive-chat?message=Write%20list%20of%20all%20versions%20of%20Spring%20Framework%20with%20their%20top%20features and received the
following response:

```text
Spring Framework is a comprehensive application framework and inversion-of-control container for the. It has undergone numerous iterations, each introducing new features and improvements. Below is a list of major Spring Framework versions along with their top features:

###1. Spring Framework1.x (2004)
- **Inversion of Control (IoC)**: Introduced the core concept of IoC, which allows for the decoupling of application components.
- **Aspect-Oriented Programming ( Introdu basic AOP capabilities.
- **Transaction Management**: Simplified transaction management across different transaction APIs.
- **MVC Framework**: Introduced a lightweight MVC framework for building web applications.

###2. Spring Framework2.x (2006)
- **Enhanced AOP Support**: Improved AOP capabilities.
- **XML Configuration**: Expanded XML configuration options.
- **Spring Web Flow**: Introduced to manage the page flow in web applications.
- **JDBC Simplification**: Improved JDBC support with enhanced error handling and simplified data access.

###3. Spring Framework3.x (2009)
- **Java5+ Support**: Full support for Java5 features like annotations and generics.
- **RESTful Web Services**: Enhanced support for creating RESTful web services.
- **Spring Expression Language (SpEL)**: Introduced for dynamic expression evaluation.
- **Annotation-Based Configuration**: Reduced XML configuration through extensive use of annotations.

###4. Spring Framework4.x (2013)
- **Java8 Support**: Full support for Java8 features.
- **Groovy Beans**: Support for Groovy DSL in Spring configuration.
- **WebSocket Support**: Introduced support for WebSocket-based communication.
- **Conditional Configuration**: Introduced @Conditional annotations for more flexible Spring5.x (2017)
- **Reactive Programming**: Introduced support for reactive programming through Project Reactor.
- **Java8/9/10/11 Support**: Full support for newer Java versions.
- **Kotlin Support**: Added first-class support for Kotlin.
- **Functional Web Framework**: Introduced a new functional web framework option alongside the traditional annotation-based model.
- **HTTP/2 Support**: Enhanced support for HTTP/2 and server-push mechanisms.
- **Improved Testing**: Enhanced testing support with the `spring-test` module.

###6. Spring Framework6.x (Expected in2023)
- **Java17 Baseline**: Transition to Java17 as the minimum supported version.
- **Enhanced Native Image Support**: Improved support for GraalVM native images.
- **Declarative HTTP Clients**: Enhanced support for declarative HTTP clients.
- **Improved Modularization**: Better modularization and support for module descriptors.
- **Improved Observability**: Enhanced support for observability and monitoring, including integration with Micrometer and other observability tools.

Each version of the Spring Framework has built on its predecessors, introducing new features and improvements aimed at simplifying Java enterprise development. The framework's adaptability and comprehensive feature set have made it a mainstay in the Java
```

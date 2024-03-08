
# Spring MVC HelloWorld project

A project that demonstrates the features of Spring MVC.


## Tech Stack

**Java:** Java 17

**spring-webmvc:** 5.3.xx

**Maven:** 3.9.x

## Reference
* [Spring Web MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
* [The DispatcherServlet](https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/mvc.html#mvc-servlet)
* [Code-based Servlet container initialization](https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/mvc.html#mvc-container-config)

## Core Files
* **[web.xml](https://github.com/navrwork/spring-mvc/blob/main/HelloWorldMvc/src/main/webapp/WEB-INF/web.xml)** - The web.xml file provides configuration and deployment information for the web components that comprise a web application. Note: In a Servlet 3.0+ environment, you have the option of configuring the Servlet container programmatically, using WebApplicationInitializer interface, as an alternative or in combination with a web.xml file. Refer to [this link](https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/mvc.html#mvc-container-config) for more info.
* **[DispatcherServlet / HwFrontController](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/servlet/DispatcherServlet.html)** - Central dispatcher (front coltroller) for HTTP request handlers/controllers. The Spring Web model-view-controller (MVC) framework is designed around a DispatcherServlet that dispatches requests to handlers, with configurable handler mappings, view resolution, locale and theme resolution as well as support for uploading files. The default handler is based on the @Controller and @RequestMapping annotations, offering a wide range of flexible handling methods.
* **[HwFrontController-servlet.xml](https://github.com/navrwork/spring-mvc/blob/main/HelloWorldMvc/src/main/webapp/WEB-INF/HwFrontController-servlet.xml)** - Spring config file.
* **[HelloController.java](https://github.com/navrwork/spring-mvc/blob/main/HelloWorldMvc/src/main/java/com/navr/webmvc/helloworld/HelloController.java)** - A controller class.
* **[ByeController.java](https://github.com/navrwork/spring-mvc/blob/main/HelloWorldMvc/src/main/java/com/navr/webmvc/helloworld/ByeController.java)** - Another controller class.


## Endpoints (localhost)
* http://localhost:8080/HelloWorldMvc/hello
* http://localhost:8080/HelloWorldMvc/helloV1
* http://localhost:8080/HelloWorldMvc/helloV2?id=abc
* http://localhost:8080/HelloWorldMvc/bye


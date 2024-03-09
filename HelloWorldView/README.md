
# Spring MVC HelloWorld View project

A Spring MVC project that demonstrates the use of View (JSP files) and ViewResolver.


## Tech Stack

**Java:** Java 17

**spring-webmvc:** 5.3.xx

**Maven:** 3.9.x

**Tomcat Server:** Apache Tomcat/8.5.99

## Reference
* [Spring Web MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
* [The DispatcherServlet](https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/mvc.html#mvc-servlet)
* [Spring MVC - Internal Resource View Resolver](https://www.tutorialspoint.com/springmvc/springmvc_internalresourceviewresolver.htm)
* [A Guide to the ViewResolver in Spring MVC](https://www.baeldung.com/spring-mvc-view-resolver-tutorial)

## Core Files
* **[web.xml](https://github.com/navrwork/spring-mvc/blob/main/HelloWorldView/src/main/webapp/WEB-INF/web.xml)** - The web.xml file provides configuration and deployment information for the web components that comprise a web application. Note: In a Servlet 3.0+ environment, you have the option of configuring the Servlet container programmatically, using WebApplicationInitializer interface, as an alternative or in combination with a web.xml file. Refer to [this link](https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/mvc.html#mvc-container-config) for more info.
* **[DispatcherServlet / FrontController](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/servlet/DispatcherServlet.html)** - Central dispatcher (front coltroller) for HTTP request handlers/controllers. The Spring Web model-view-controller (MVC) framework is designed around a DispatcherServlet that dispatches requests to handlers, with configurable handler mappings, view resolution, locale and theme resolution as well as support for uploading files. The default handler is based on the @Controller and @RequestMapping annotations, offering a wide range of flexible handling methods.
* **[spring-mvc.xml](https://github.com/navrwork/spring-mvc/blob/main/HelloWorldView/src/main/webapp/WEB-INF/spring-mvc.xml)** - Spring config file with custom name.
* **[HelloController.java](https://github.com/navrwork/spring-mvc/blob/main/HelloWorldView/src/main/java/com/navr/webmvc/hello/HelloController.java)** - A controller class.

## Views
* HelloWorldView/src/main/webapp/WEB-INF/view/hello.jsp
* HelloWorldView/src/main/webapp/WEB-INF/view/welcome.jsp

## ViewResolver
* [InternalResourceViewResolver](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/servlet/view/InternalResourceViewResolver.html)

## Endpoints (localhost)
* http://localhost:8080/HelloWorldView/hello
* http://localhost:8080/HelloWorldView/welcome


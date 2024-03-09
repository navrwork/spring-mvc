
# Spring MVC Login Demo project

A Spring MVC project that demonstrates Controller, View, ViewResolver and Model components of MVC framework.


## Tech Stack

**Java:** Java 17

**spring-webmvc:** 5.3.xx

**javax.servlet-api:** 3.1.x

**Maven:** 3.9.x

**Tomcat Server:** Apache Tomcat/8.5.99

## Reference
* [Spring Web MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
* [The DispatcherServlet](https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/mvc.html#mvc-servlet)
* [Spring MVC - Internal Resource View Resolver](https://www.tutorialspoint.com/springmvc/springmvc_internalresourceviewresolver.htm)
* [A Guide to the ViewResolver in Spring MVC](https://www.baeldung.com/spring-mvc-view-resolver-tutorial)
* [Spring MVC Model Interface](https://www.javatpoint.com/spring-mvc-model-interface)

## Core Files
* **[web.xml](https://github.com/navrwork/spring-mvc/blob/main/LoginDemo/src/main/webapp/WEB-INF/web.xml)** - The web.xml file provides configuration and deployment information for the web components that comprise a web application. Note: In a Servlet 3.0+ environment, you have the option of configuring the Servlet container programmatically, using WebApplicationInitializer interface, as an alternative or in combination with a web.xml file. Refer to [this link](https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/mvc.html#mvc-container-config) for more info.
* **[DispatcherServlet / FrontController](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/servlet/DispatcherServlet.html)** - Central dispatcher (front controller) for HTTP request handlers/controllers. The Spring Web model-view-controller (MVC) framework is designed around a DispatcherServlet that dispatches requests to handlers, with configurable handler mappings, view resolution, locale and theme resolution as well as support for uploading files. The default handler is based on the @Controller and @RequestMapping annotations, offering a wide range of flexible handling methods.
* **[spring-mvc.xml](https://github.com/navrwork/spring-mvc/blob/main/LoginDemo/src/main/webapp/WEB-INF/spring-mvc.xml)** - Spring config file with custom name.
* **[LoginController.java](https://github.com/navrwork/spring-mvc/blob/main/LoginDemo/src/main/java/com/navr/webmvc/logindemo/LoginController.java)** - Login controller class.
* **[WelcomeController.java](https://github.com/navrwork/spring-mvc/blob/main/LoginDemo/src/main/java/com/navr/webmvc/logindemo/WelcomeController.java)** - Another controller class.

## Views
* hello.jsp
* welcome.jsp
* loginPage.jsp

## ViewResolver
* [InternalResourceViewResolver](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/servlet/view/InternalResourceViewResolver.html)

## Endpoints (localhost)
* http://localhost:8080/LoginDemo/login
* http://localhost:8080/LoginDemo/hello
* http://localhost:8080/LoginDemo/welcome


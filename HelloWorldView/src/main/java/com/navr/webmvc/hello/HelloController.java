package com.navr.webmvc.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping(value={"/hello", "/helloV1"})
    public String helloV1() {
        System.out.println("Inside helloV1 ...");
        // return "/WEB-INF/view/hello.jsp"; // Use this when there's no ViewResolver involved.
        return "hello"; // Interpreted by ViewResolver. Redirect to /WEB-INF/view/hello.jsp
    }

    @GetMapping("welcome")
    public String welcome() {
        return "welcome"; // Interpreted by ViewResolver. Redirect to /WEB-INF/view/welcome.jsp
    }

}

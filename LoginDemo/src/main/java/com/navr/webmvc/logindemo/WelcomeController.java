package com.navr.webmvc.logindemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {


    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("helloMsg", "Hola");
        return "hello"; // redirect to /WEB-INF/view/hello.jsp
    }

    @GetMapping("/welcome")
    public String welcome(Model model) {
        model.addAttribute("userName", "Mr.Bean");
        model.addAttribute("userCity", "Chicago");
        return "welcome"; // redirect to /WEB-INF/view/welcome.jsp
    }
}

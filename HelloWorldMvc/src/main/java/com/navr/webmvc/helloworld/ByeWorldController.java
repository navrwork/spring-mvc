package com.navr.webmvc.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ByeWorldController {

    @GetMapping("/bye")
    @ResponseBody
    public String bye() {
        return "Bye World!";
    }
}

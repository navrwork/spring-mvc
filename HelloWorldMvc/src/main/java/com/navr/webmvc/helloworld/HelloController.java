package com.navr.webmvc.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @ResponseBody
    @GetMapping(value={"/hello", "/helloV1"})
    public String helloV1() {
        return "Hello World (helloV1) !!";
    }


    @ResponseBody
    @GetMapping("/helloV2")
    public String helloV2(@RequestParam String id) {
        return "Hello "+id+" (helloV2) !!";
    }
}

package com.navr.webmvc.logindemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @GetMapping ("/login")
    public String login() {
        return "loginPage";
    }

    @PostMapping ("/doLogin")
    public String doLogin(HttpServletRequest req, Model m) {
        String loginId = req.getParameter("loginId");
        String loginPassword = req.getParameter("loginPassword");
        System.out.printf("loginId=%s, loginPassword=%s%n", loginId, loginPassword);
        if(loginId.equals("admin") && loginPassword.equals("admin")) {
            String msg="Hello "+ loginId+". Your login was successful!";
            //add a message to the model
            m.addAttribute("message", msg);
            return "loginSuccess";
        } else {
            String msg="Sorry "+ loginId+". You entered an incorrect password";
            m.addAttribute("message", msg);
            return "loginFailure";
        }
    }
}

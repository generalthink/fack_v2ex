package com.generalthink.v2ex.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping({"/","/index"})
    public String index() {
        
        return "index";
    }
    
    @GetMapping("/signin")
    public String showSigninPage() {
        return "signin";
    }
    /**
     * 处理登陆逻辑
     * @return
     */
    @PostMapping("/signin")
    public String signin() {
        
        return "";
    }
    
    
    @GetMapping("/signup")
    public String showSignupPage() {
        return "signup";
    }
    
    /**
     * 处理注册逻辑
     * @return
     */
    @PostMapping("/signup")
    public String signup() {
        return "";
    }

}

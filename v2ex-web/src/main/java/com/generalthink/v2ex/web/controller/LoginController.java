package com.generalthink.v2ex.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.generalthink.v2ex.data.service.UserService;


@Controller
public class LoginController {
    
    @Autowired
    private UserService userService;

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
    public String signin(@RequestParam(required=true,name="account") String account,@RequestParam(required=true)String password) {
        return "index";
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

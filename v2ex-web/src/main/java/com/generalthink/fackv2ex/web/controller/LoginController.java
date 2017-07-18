package com.generalthink.fackv2ex.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/index")
    public String index() {
        
        return "index";
    }

}

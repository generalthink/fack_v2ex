package com.generalthink.v2ex.web.controller;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.generalthink.v2ex.data.entity.User;
import com.generalthink.v2ex.data.service.UserService;
import com.generalthink.v2ex.web.common.Constants;
import com.generalthink.v2ex.web.utils.CaptchaServiceUtil;


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
    public String signin(@RequestParam(required=true,name="account") String account,@RequestParam(name="password",required=true)String password,
                         HttpSession session) {
        
        Optional<User> optionalUser = userService.signin(account, password);
        if(optionalUser.isPresent()) {
            session.setAttribute(Constants.CURRENT_USER, optionalUser.get());
            return "index";
        } else {
            
            return "signin"; 
        }
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
    public ModelAndView signup(@RequestParam(name="name",required=true)String name,@RequestParam(required=true) String email,
                         @RequestParam(required=true) String password,@RequestParam(required=true) String valCode,
                         HttpSession session) {
        boolean validateCode = CaptchaServiceUtil.getInstance().validateResponseForID(session.getId(),valCode.toUpperCase());
        if(!validateCode) {
            ModelAndView mav = new ModelAndView("signup");
            mav.addObject("errorMsg", "验证码错误");
            return mav;
        } else {
            User user = userService.signup(name, password, email);
            session.setAttribute(Constants.CURRENT_USER, user);
        }
        return new ModelAndView("index");
    }
    @ResponseBody
    @RequestMapping("/validateName")
    public Boolean validateName(@RequestParam(required=true)String name) {
        boolean existName = userService.existUserName(name);
        //jquery validate remote验证，如果为false表示验证不通过
        return !existName;
    }
    
    @ResponseBody
    @RequestMapping("/validateEmail")
    public Boolean validateEmail(@RequestParam(required=true)String email) {
        boolean existEmail = userService.existEmail(email);
        return !existEmail;
    }
    

}

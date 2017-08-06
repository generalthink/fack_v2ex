package com.generalthink.v2ex.web.spring.aop;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@ControllerAdvice
public class CustomExceptionAdvice {

    @ExceptionHandler(RuntimeException.class)
    public ModelAndView dealException(RuntimeException exception, Controller controller) {
        
        System.out.println(controller);
        log.error("catch Exception : {}", exception);
        ModelAndView mav = new ModelAndView();
        mav.addObject("errorMsg", "异常操作导致报错,请查看异常信息");
        mav.addObject("errorStack", exception.getStackTrace());
        mav.setViewName("/eror/400");
        return mav;
    }
    
}

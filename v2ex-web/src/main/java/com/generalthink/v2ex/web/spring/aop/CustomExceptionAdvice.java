package com.generalthink.v2ex.web.spring.aop;

import javax.servlet.http.HttpServletRequest;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@ControllerAdvice
public class CustomExceptionAdvice {

    @ExceptionHandler(RuntimeException.class)
    public ModelAndView dealException(RuntimeException exception,HttpServletRequest request) {
        
        log.error("Exception Info : {} and url : {},", exception,request.getRequestURL());
        ModelAndView mav = new ModelAndView();
        mav.addObject("errorMsg", "异常操作,请查看日志");
        mav.addObject("errorStack", exception.getStackTrace());
        mav.setViewName("/error/400");
        return mav;
    }
    
}

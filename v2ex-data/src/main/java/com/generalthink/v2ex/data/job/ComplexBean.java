package com.generalthink.v2ex.data.job;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class ComplexBean {
    
    public void printMessage() {
        System.out.println("我是一个复杂的定时任务,每五秒执行一次"+new Date());
    }

}

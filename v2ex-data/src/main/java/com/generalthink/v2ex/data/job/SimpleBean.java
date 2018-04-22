package com.generalthink.v2ex.data.job;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class SimpleBean {
    
    public void printMessage() {
        System.out.println("我是一个简单的定时任务，执行每隔2秒执行一次，总共执行五次"+new Date());
    }

}

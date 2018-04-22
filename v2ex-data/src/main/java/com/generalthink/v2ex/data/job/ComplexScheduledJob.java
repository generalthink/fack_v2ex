package com.generalthink.v2ex.data.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;


public class ComplexScheduledJob extends QuartzJobBean{

    private ComplexBean complexBean;
    
    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        complexBean.printMessage();
        
    }

    public void setComplexBean(ComplexBean complexBean) {
        this.complexBean = complexBean;
    }
    
    

}

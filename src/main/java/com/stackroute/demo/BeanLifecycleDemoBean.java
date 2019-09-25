package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("AfterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroyed");
    }

    public void customInit(){
        System.out.println("Custom Init");
    }

    public void customDestroy(){
        System.out.println("Custom Destroy");
    }
}

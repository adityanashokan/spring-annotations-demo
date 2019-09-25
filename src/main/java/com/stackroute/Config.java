package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    public BeanLifecycleDemoBean getBLCD(){
        return new BeanLifecycleDemoBean();
    }
}

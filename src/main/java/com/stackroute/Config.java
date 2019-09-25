package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.demo.BeanPostProcessorDemoBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    public BeanLifecycleDemoBean getBLCD(){
        return new BeanLifecycleDemoBean();
    }

    @Bean
    public BeanPostProcessorDemoBean getBPPD(){
        return new BeanPostProcessorDemoBean();
    }
}

package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {
        /*
        ApplicationContext context = new AnnotationConfigApplicationContext(MovieConfig.class);
        Movie m1 = (Movie) context.getBean("movieA",Movie.class);
        System.out.println("Bean File Loaded using ApplicationContext");
        m1.display();
        */

        ApplicationContext context1 = new AnnotationConfigApplicationContext(Config.class);
        BeanLifecycleDemoBean b = (BeanLifecycleDemoBean) context1.getBean(BeanLifecycleDemoBean.class);
        System.out.println("BeanLifecycleDemoBean Initiated");


    }
}

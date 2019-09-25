package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(MovieConfig.class);
        Movie m1 = (Movie) context.getBean(Movie.class);
        System.out.println("Bean File Loaded using ApplicationContext");
        m1.display();

        Movie m2 = (Movie)context.getBean(Movie.class);
        m2.display();

        System.out.println(m1==m2);
    }
}

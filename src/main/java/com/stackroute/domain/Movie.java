package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;

public class Movie implements ApplicationContextAware, BeanNameAware, BeanFactoryAware {
    @Autowired
    private Actor actor;

    private ApplicationContext context;
    private BeanFactory factory;

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void display(){
        actor.display();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
        System.out.println("Application Context Set.");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Name is : " + s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.factory = beanFactory;
        System.out.println("BeanFactory Set.");
    }
}

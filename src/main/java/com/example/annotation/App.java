package com.example.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppCofig.class);
        Manager manager = context.getBean("manager", Manager.class);
        System.out.println(manager);
    }

}

package com.example.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MyBean myBean = context.getBean("MyBean", MyBean.class);
        System.out.println(myBean.getMessage());
    }
}
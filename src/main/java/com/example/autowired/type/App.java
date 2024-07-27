package com.example.autowired.type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("AutowiredByTypeContext.xml");
        Manager manager = context.getBean("manager", Manager.class);
        System.out.println(manager);

    }

}

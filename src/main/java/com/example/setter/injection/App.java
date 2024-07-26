package com.example.setter.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SetterInjectionContext.xml");
        Car myCar = context.getBean("Car", Car.class);
        System.out.println(myCar);
    }
}

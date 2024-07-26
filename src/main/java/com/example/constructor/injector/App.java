package com.example.constructor.injector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context= new ClassPathXmlApplicationContext("ConstructorInjectorContext.xml");
        Car myCar = context.getBean("Car", Car.class);
        System.out.println(myCar);
    }
}

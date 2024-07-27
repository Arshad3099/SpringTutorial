package com.example.component.scan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("ComponentScanContext.xml");
        Car car = context.getBean("car",Car.class);
        System.out.println(car);
    }
}

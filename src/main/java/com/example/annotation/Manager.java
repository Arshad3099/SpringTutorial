package com.example.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Manager {

    @Value("Amit T")
    private String managerName;

    @Autowired
    private Employee employee;

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "ManagerName='" + managerName + '\'' +
                ", employee=" + employee +
                '}';
    }

}

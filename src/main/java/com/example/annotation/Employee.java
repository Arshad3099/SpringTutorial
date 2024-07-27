package com.example.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    @Value("Arshad Syed")
    private String empName;

    @Value("Backup Dev")
    private String role;

    @Value("23")
    private int age;

    @Value("30000.22")
    private double salary;

    public Employee(String empName, String role, int age, double salary) {
        this.empName = empName;
        this.role = role;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmpName='" + empName + '\'' +
                ", role='" + role + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

}

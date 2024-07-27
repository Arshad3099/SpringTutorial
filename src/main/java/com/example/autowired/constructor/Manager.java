package com.example.autowired.constructor;

public class Manager {

    private String managerName;
    private Employee employee;

    public Manager(Employee employee) {
        this.employee = employee;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "ManagerName='" + managerName + '\'' +
                ", employee=" + employee +
                '}';
    }

}

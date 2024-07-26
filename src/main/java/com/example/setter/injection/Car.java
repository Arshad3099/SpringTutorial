package com.example.setter.injection;

public class Car {

    private Specs specs;
    private String Model;

    public Car() {
    }

    public Car(Specs specs, String model) {
        this.specs = specs;
        Model = model;
    }

    public Specs getSpecs() {
        return specs;
    }

    public void setSpecs(Specs specs) {
        this.specs = specs;
    }

    @Override
    public String toString() {
        return "Car{" +
                "specs=" + specs +
                ", Model='" + Model + '\'' +
                '}';
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }
}

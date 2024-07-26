package com.example.constructor.injector;

public class Specs {

    private String color;
    private String topSpeed;
    private int capacity;

    public Specs() {

    }

    public Specs(String color, String topSpeed, int capacity) {
        this.color = color;
        this.topSpeed = topSpeed;
        this.capacity = capacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(String topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Specs{" +
                "color='" + color + '\'' +
                ", topSpeed='" + topSpeed + '\'' +
                ", capacity='" + capacity + '\'' +
                '}';
    }
}

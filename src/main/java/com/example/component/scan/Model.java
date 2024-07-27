package com.example.component.scan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Model {

    @Value("Red")
    private String color;

    @Value("200kmph")
    private String speed;

    @Value("120L")
    private String capacity;

    public Model(String color, String speed, String capacity) {
        this.color = color;
        this.speed = speed;
        this.capacity = capacity;
    }

    public Model() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Model{" +
                "color='" + color + '\'' +
                ", speed='" + speed + '\'' +
                ", capacity='" + capacity + '\'' +
                '}';
    }
}

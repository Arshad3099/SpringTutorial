package com.example.beans;

public class MyBean {

    private String message;

    public MyBean() {

    }

    public MyBean(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "message='" + message + '\'' +
                '}';
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

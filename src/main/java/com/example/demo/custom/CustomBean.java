package com.example.demo.custom;


public class CustomBean {
    private String message;

    public CustomBean(String message) {
        this.message = message;
    }

    public void showMessage() {
        System.out.println(message);
    }
}
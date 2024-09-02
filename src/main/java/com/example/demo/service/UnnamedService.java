package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class UnnamedService {
    private String message;

    // Add a no-argument constructor if needed
    public UnnamedService() {
        // Default constructor
    }

    // Getter
    public String getMessage() {
        return message;
    }

    // Setter
    public void setMessage(String message) {
        this.message = message;
    }

    public void showMessage() {
        System.out.println(message);
    }
}

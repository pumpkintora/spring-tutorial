package com.example.demo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    public void saveUser() {
        System.out.println("User saved!");
    }
}
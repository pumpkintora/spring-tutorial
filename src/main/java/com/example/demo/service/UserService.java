package com.example.demo.service;


import com.example.demo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }
//
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }
    // Add a no-argument constructor if needed
//    public UserService() {
//        // Default constructor
//    }


    public void performOperation() {
        System.out.println("Service layer performing operation...");
        userDao.saveUser();
    }
}
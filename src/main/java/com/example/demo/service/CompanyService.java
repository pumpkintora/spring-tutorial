package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {
    private String company;

    public CompanyService() {}

    // Getter
    public String getCompany() {
        return company;
    }

    // Setter
    public void setCompany(String company) {
        this.company = company;
    }

    public void showCompany() {
        System.out.println("Company is " + this.company + ".");
    }
}

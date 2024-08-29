package com.example.demo.config;

import com.example.demo.custom.CustomBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public CustomBean customBean() {
        return new CustomBean("Hello from @Bean method!");
    }
}
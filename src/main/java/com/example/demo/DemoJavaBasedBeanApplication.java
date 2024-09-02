package com.example.demo;

import com.example.demo.config.AppConfig;
import com.example.demo.custom.CustomBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoJavaBasedBeanApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomBean customBean = context.getBean(CustomBean.class);
        customBean.showMessage();
    }
}

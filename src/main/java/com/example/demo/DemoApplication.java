package com.example.demo;

import com.example.demo.config.AppConfig;
import com.example.demo.custom.CustomBean;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;

//@SpringBootApplication
public class DemoApplication {

//	public static void main(String[] args) {
//		// without using import
//		// ApplicationContext context = new ClassPathXmlApplicationContext("services.xml", "daos.xml");
//		// using import
//		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		// using groovy script
////		ApplicationContext context = new GenericGroovyApplicationContext("classpath:beans.groovy");
//		// Get the UserService bean and call its method
//		UserService userService = (UserService) context.getBean("userService");
//		userService.performOperation();
//	}

	public static void main(String[] args) {
		// Create a new ApplicationContext
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		// Retrieve the BeanFactory
		DefaultListableBeanFactory beanFactory = (DefaultListableBeanFactory) context.getBeanFactory();

		// Register a singleton bean if it doesn't already exist
		if (!beanFactory.containsBean("customBean")) {
			CustomBean existingBean = new CustomBean("Hello from existing bean!");
			beanFactory.registerSingleton("customBean", existingBean);
		}

		// Register a bean definition programmatically if it doesn't already exist
		if (!beanFactory.containsBean("customBeanByDefinition")) {
			BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(CustomBean.class);
			beanDefinitionBuilder.addConstructorArgValue("Hello from bean definition!");
			BeanDefinition beanDefinition = beanDefinitionBuilder.getBeanDefinition();
			beanFactory.registerBeanDefinition("customBeanByDefinition", beanDefinition);
		}

		// Retrieve and use the beans
		CustomBean bean1 = (CustomBean) context.getBean("customBean");
		bean1.showMessage();

		CustomBean bean2 = (CustomBean) context.getBean("customBeanByDefinition");
		bean2.showMessage();

		// Close the context
		context.close();
	}

}

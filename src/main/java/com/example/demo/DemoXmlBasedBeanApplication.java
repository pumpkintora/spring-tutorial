package com.example.demo;

import com.example.demo.service.CompanyService;
import com.example.demo.service.UnnamedService;
import com.example.demo.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoXmlBasedBeanApplication {
	public static void main(String[] args) {
		// without using import
		 ApplicationContext context = new ClassPathXmlApplicationContext("services.xml", "daos.xml");
		// using import
//		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// using groovy script
//		ApplicationContext context = new GenericGroovyApplicationContext("classpath:beans.groovy");
		// Get the UserService bean and call its method
		UserService userService = (UserService) context.getBean("userService");
		userService.performOperation();

		CompanyService companyService = (CompanyService) context.getBean("orgService");
		companyService.showCompany();

		UnnamedService unnamedService = (UnnamedService) context.getBean("unnamedService");
		unnamedService.showMessage();
	}
}

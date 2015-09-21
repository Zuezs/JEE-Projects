package com.eintern.spring.HelloSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		//BeanFactorys big brother
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	}
	
}

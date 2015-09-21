package com.eintern.training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		/*@SuppressWarnings("deprecation")
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("Spring.xml"));
		HelloWorld hmw = (HelloWorld) factory.getBean("hello");
		hmw.sayHiWorld();
		hmw.sayHello();*/
		
		//BeanFactorys big brother
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		Shape hw = (Shape) context.getBean("circle");
		hw.draw();
		
		
		
		
		
	}
	
}

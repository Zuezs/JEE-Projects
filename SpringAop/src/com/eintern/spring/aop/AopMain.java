package com.eintern.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eintern.spring.model.Circle;
import com.eintern.spring.model.HibernateDaoImpl;
import com.eintern.spring.model.JDBCDaoImpl;
import com.eintern.spring.service.ShapeService;

public class AopMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		HibernateDaoImpl dao = ctx.getBean("hibernateDaoImpl", HibernateDaoImpl.class);
		
		//Circle circle = dao.getCircle(1);
		//System.out.println(dao.getCircle(1));
		//System.out.println("# of circles in database: " + dao.getCircleCount());
		/*dao.insertCircle(new Circle(6, "Sixth Circle"));
		System.out.println(dao.getAllCircles().size());*/
		//dao.createTriangleTable();
		
		
		//Hibernate method
		dao.addCircle(11 , "1nes");
		System.out.println( dao.getCircle(5));
	}
}

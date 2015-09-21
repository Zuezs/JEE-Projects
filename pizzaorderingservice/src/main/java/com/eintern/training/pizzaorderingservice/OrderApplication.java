package com.eintern.training.pizzaorderingservice;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/pizzaservices")
public class OrderApplication extends Application{

	private Set<Object> singletons = new HashSet<Object>();
	private Set<Class<?>> classes = new HashSet<>();
	
	public OrderApplication() {
	
		singletons.add(new OrderService());
	}
	
	//Returns a set of preinstantiated services. These singleton objects will be 
	//used to handle all their corresponding requests
	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
	
	//Returns set of service classes that will be instantiated per request
	@Override
	public Set<Class<?>> getClasses() {
		return classes;
	}
	
	
}

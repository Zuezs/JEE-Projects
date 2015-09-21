package com.eintern.struts.pizzaorderingapp.delegate;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.eintern.struts.pizzaorderingapp.model.entities.Order;
import com.eintern.struts.pizzaorderingapp.model.entities.OrderStatus;

public class OrderDelegate {

	public OrderStatus processOrder(Order order){
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.HOUR, 1);
		return new OrderStatus(true, "Jorge", cal.getTime());
	}
	
	public List<Order> getOrderHistory(String name){
		
		List<Order> orders = new ArrayList<Order>();
		
		orders.add(new Order("a", "a,b,c"));
		orders.add(new Order("b", "b,b,c"));
		orders.add(new Order("c", "c,b,c"));
		orders.add(new Order("d", "d,b,c"));
		orders.add(new Order("e", "e,b,c"));
		orders.add(new Order("f", "f,b,c"));
		orders.add(new Order("g", "g,b,c"));
		orders.add(new Order("h", "h,b,c"));
		orders.add(new Order("i", "i,b,c"));
		
		if(Math.random() > 0.5){
			orders.add(new Order("j", "j,b,c"));
		}
		
		return orders;
		
	}
	
}

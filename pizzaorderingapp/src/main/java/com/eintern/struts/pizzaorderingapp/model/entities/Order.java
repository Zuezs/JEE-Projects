package com.eintern.struts.pizzaorderingapp.model.entities;

public class Order {

	private String name;
	private String toppings;
	
	public Order(String name, String toppings) {
		super();
		this.name = name;
		this.toppings = toppings;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getToppings() {
		return toppings;
	}

	public void setToppings(String toppings) {
		this.toppings = toppings;
	}
	
	
	@Override
	public String toString() {
		
		return "The name is " +this.name+ " the toppings are " +this.toppings;
	}
	
	
}

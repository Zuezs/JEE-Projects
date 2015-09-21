package com.eintern.struts.pizzaorderingapp.action.form;

import org.apache.struts.action.ActionForm;

@Deprecated
public class OrderForm extends ActionForm {

	private static final long serialVersionUID = 1L;

	
	
	private String name;
	private String toppings;
	
	
	
	
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
	
	
	
}

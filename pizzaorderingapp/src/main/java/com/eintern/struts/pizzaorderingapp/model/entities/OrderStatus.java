package com.eintern.struts.pizzaorderingapp.model.entities;

import java.util.Date;

public class OrderStatus {

	private boolean accepted;
	private String maker;
	private Date eta;
	
	
	
	public OrderStatus(boolean accepted, String maker, Date eta) {
		super();
		this.accepted = accepted;
		this.maker = maker;
		this.eta = eta;
	}
	public boolean isAccepted() {
		return accepted;
	}
	public void setAccepted(boolean accepted) {
		this.accepted = accepted;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public Date getEta() {
		return eta;
	}
	public void setEta(Date eta) {
		this.eta = eta;
	}
	
	
	
}

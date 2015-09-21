package com.eintern.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="CreditApp")
public class CreditApp {

	@Id 
	@Column(name="UserName")
	String UserName;
	String firstName;
	String lastName;
	String address;
	String creditScore;
	String salary;
	String pending = "Pending";
	
	
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(String creditScore) {
		this.creditScore = creditScore;
	}
	
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getPending() {
		return pending;
	}
	public void setPending(String pending) {
		this.pending = pending;
	}
	@Override
	public String toString(){
		return "First name: " + this.firstName + " Last name: " + this.lastName + " Email: "
				+ this.UserName + " Address: " + this.address + " Credit Score: " + this.creditScore;
	}
	
	
}

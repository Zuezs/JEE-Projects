package com.eintern.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CreditUser")
public class User {

	@Id 
	@Column(name="UserName")
	String email;
	
	@OneToOne
	@JoinColumn(name="User_Name")
	Registration registree;
	
	@OneToOne
	@JoinColumn(name="UserName")
	Authentication authentication = new Authentication();
	
	@OneToOne
	@JoinColumn(name="UserName")
	CreditApp credit = new CreditApp();

	public Registration getRegistree() {
		return registree;
	}

	public void setRegistree(Registration registree) {
		this.registree = registree;
	}

	public Authentication getAuthentication() {
		return authentication;
	}

	public void setAuthentication(Authentication authentication) {
		this.authentication = authentication;
	}

	public CreditApp getCredit() {
		return credit;
	}

	public void setCredit(CreditApp credit) {
		this.credit = credit;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}

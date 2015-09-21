package com.eintern.hibernateTest;

public interface AuthDao {
	
	public boolean authorizeUser(String name, String password);

}

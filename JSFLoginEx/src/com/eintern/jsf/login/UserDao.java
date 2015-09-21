package com.eintern.jsf.login;

import java.util.List;



public interface UserDao {
	
	void addUserBean(UserB userB);
	boolean authorizeUser(String name, String password);
	List<UserB> getUsers();
	UserB getUserByName(String name);
}

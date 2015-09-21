package com.eintern.jsf.login;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class UserBean {

	@ManagedProperty(value="#{userDaoImp}")
	private UserDaoImp userDaoImp = new UserDaoImp();
	
	private UserB user = new UserB();
	List<UserB> users;
	
	@Override
	public String toString() {
		return "UserBean [user=" + user + "]";
	}

	public String login(){
		
		//Default page for not logging in correctly
		String nextPage = "failure";
		
		//if user name and password equals what the database has stored let user log into the system
		if(userDaoImp.authorizeUser(user.getUsername(), user.getPassword()) == true){
			//Takes user to the success page
			nextPage = "success";
			//Lists all the users on the page
			users = userDaoImp.getUsers();
		}
		//Returns the value of the page the user is going to
		return nextPage;
	}
	
	public String register(){
		
		//Current Page
		String nextPage = "";
		//This object contains all request information for specific request
		FacesContext cntx = FacesContext.getCurrentInstance();
		
		//If the name trying to register is already used
		if(userDaoImp.getUserByName(user.getUsername()) != null){
			//Leave message saying user is already in the system
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "User already in system.", "The user already exists");
			cntx.addMessage(null, message);
			
		}else{
			//If not in the system add the user to the database
			user.setUsername(user.getUsername());
			user.setPassword(user.getPassword());
			
			userDaoImp.addUserBean(user);
			
		}
		
		//If no message is left send that user to the registered page
		if(cntx.getMessageList().isEmpty()){
			//String value of registered to registered.jsf
			nextPage = "registered";
		}
		
		//Returns user to that page
		return nextPage;
		
	}

	public UserB getUser() {
		return user;
	}

	public void setUser(UserB user) {
		this.user = user;
	}

	public UserDaoImp getUserDaoImp() {
		return userDaoImp;
	}

	public void setUserDaoImp(UserDaoImp userDaoImp) {
		this.userDaoImp = userDaoImp;
	}

	public List<UserB> getUsers() {
		return users;
	}

	public void setUsers(List<UserB> users) {
		this.users = users;
	}
	
	
}

package com.eintern.hibernateTest;

import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.eintern.hibernate.Authentication;
import com.eintern.hibernate.Registration;

public class AuthTest implements AuthDao{

	//Creating local sessionFactory and session
	SessionFactory sessionFactory;
	Session session;
	
	//Session start func - can start session anywhere with this
	public void sessionStart(){
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
	
	}
	
	//Session close func - can close session anywhere with this
	public void sessionClose(){
		
		session.close();
	}
	
	//Method used for grabbing name and password from form
	//Also uses criteria 
	@Override
	public boolean authorizeUser(String name, String password) {
		
		//session must start in order to get criteria
		sessionStart();
		
		Criteria cr = session.createCriteria(Authentication.class);
		//Wont Work With Restrictions!
		
		Registration registree = new Registration();
		String salt = registree.getSalt();
		
		cr.add(Restrictions.eq("userName", name))
		  .add(Restrictions.eq("password", DigestUtils.md5Hex(password + salt)));
		
		  @SuppressWarnings("unchecked")
		List<Authentication> results = cr.list();
		  
		

			if(!results.isEmpty()){
				/*for(Authentication a : results){
					if(a.getUserName().equals(name) && a.getPassword().equals(DigestUtils.md5Hex(password + salt))){
						return true;
					}
				}*/
				System.out.println("Welcome");
				return true;
			}else{
				System.out.println("TRY AGAIN");

				return false;
			}	
		
	}
	
	
}

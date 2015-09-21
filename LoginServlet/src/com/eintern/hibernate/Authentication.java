package com.eintern.hibernate;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.codec.digest.DigestUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

@Entity
@Table (name="Auth")
public class Authentication {
	
	//Denotes that userId is the primary key
	@Id
	@Column(name="UserName")
	String userName;
	@Column(name="hashPass")
	String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString(){
		return "Username: " +this.userName + " Password: " + this.password;
	}

	/*//Creating local sessionFactory and session
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
		public boolean authorizeUser(String name, String password) {
			
			//session must start in order to get criteria
			sessionStart();
			
			Criteria cr = session.createCriteria(Authentication.class);
			//Wont Work With Restrictions!
			
			Registration registree = new Registration();
			String salt = registree.getSalt();
			
			cr.add(Restrictions.eq("userName", name))
			  .add(Restrictions.eq("password", DigestUtils.md5Hex(password + salt)));
			
			  List<Authentication> results = cr.list();

				if(!results.isEmpty()){
					for(Authentication a : results){
						if(a.getUserName().equals(name) && a.getPassword().equals(DigestUtils.md5Hex(password + salt))){
							return true;
						}
					}
					System.out.println("Welcome");
					return true;
				}else{
					System.out.println("TRY AGAIN");

					return false;
				}	
			
		}
	*/
	
	
	
	
	
}

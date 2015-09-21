package com.eintern.hibernateTest;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.eintern.hibernate.Authentication;
import com.eintern.hibernate.CreditApp;
import com.eintern.hibernate.Registration;
import com.eintern.hibernate.User;

public class RegisterTest {

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
		
	public boolean compare(String username){
		
		sessionStart();
		session.beginTransaction();
		
		Criteria cr = session.createCriteria(Authentication.class);
			cr.add(Restrictions.like("userName", username));
		List<Authentication> list = cr.list();
		
		
		List<Authentication> users = new ArrayList<Authentication>();
		
		sessionClose();
		
		if(!list.isEmpty()){
			return false;
		}else{
			return true;
		}
		
	}
	
	public void registerUser(String firstname, String lastname, String email, String password){
		
		Registration registerUser = new Registration();
		Authentication authen = new Authentication();
		CreditApp credit = new CreditApp();
		User user = new User();
		
		String salt = "Random$SaltValue#WithSpecialCharacters12@$@4&#%^$*";
		String hash = DigestUtils.md5Hex(password + salt);
	
		sessionStart();
		session.beginTransaction();
		
		registerUser.setFirstName(firstname);
		registerUser.setLastName(lastname);
		registerUser.setEmail(email);
		registerUser.setPassword(password);
		registerUser.setHash(hash);
		registerUser.setSalt(salt);
		registerUser.getRole();
		
		user.setEmail(email);
		
		authen.setUserName(email);
		authen.setPassword(hash);
		
		credit.setUserName(email);
		credit.getPending();
		
		user.setRegistree(registerUser);
		
		session.save(user);
		session.save(registerUser);
		session.save(authen);
		session.save(credit);
	
		session.flush();
		session.getTransaction().commit();
		sessionClose();
		
		System.out.println("Data Inserted!");
		
		/*String mailSmtpHost = "localhost";
		String mailTo = "tallenbusiness@gmail.com";
		String mailFrom = "sender@abc.com";
		String mailSubject = "Welcome to the Credit Management System!";
		String mailText = "Thank you for registering at our site!";
		
		EmailTest.sendEmail(mailTo, mailFrom, mailSubject, mailText, mailSmtpHost);
		System.out.println("Email successfully sent!");*/
	}
	
	public Registration getUser(String name){
		
		//session must start in order to get criteria
		sessionStart();
		session.beginTransaction();
		
		Criteria cr = session.createCriteria(Registration.class);
		cr.add(Restrictions.eq("email", name));
		 
		 Registration user = new Registration();
		 
		 List<Registration> list = cr.list();
		 
		 for(Registration r : list){
			 //Testing the results in the console
			 System.out.println(r);
			 user.setFirstName(r.getFirstName());
			 user.setLastName(r.getLastName());
			 user.setRole(r.getRole());
		 }
		 
		
		session.flush();
		session.getTransaction().commit();
		sessionClose();
		 
		return user;
	}
	
	

	
	@SuppressWarnings("unchecked")
	public List<Registration> showAllStats(){
		
		List<Registration> list = new ArrayList<Registration>();
		
		//session must start in order to get criteria
		sessionStart();
		session.beginTransaction();
		
		Criteria cr = session.createCriteria(Registration.class);
		
		list = cr.list();
		
		sessionClose();
		
		return list;
		
	}
	
	public void editRegister(String email, String fname, String lname, String password, String role){
		
		Registration register = new Registration();
		String salt = "Random$SaltValue#WithSpecialCharacters12@$@4&#%^$*";
		String hash = DigestUtils.md5Hex(password + salt);
		
		sessionStart();
		session.beginTransaction();
		
		Criteria cr = session.createCriteria(Registration.class);
		String hqlUpdate = "Update Registration r set r.firstName = :fname, r.lastName = :lname, "
				+ "r.password = :password, r.role = :role, r.hash = :hash WHERE r.email = :email";
		int updatedEntity = session.createQuery(hqlUpdate)
						.setString("fname", fname)
						.setString("lname", lname)
						.setString("password", password)
						.setString("role", role)
						.setString("hash", hash)
						.setString("email", email)
						.executeUpdate();
				
		
		session.flush();
		session.getTransaction().commit();
		sessionClose();
		
		System.out.println("User Edited!");
	
	}
	
	public void deleteUser(String email){
		
		sessionStart();
		session.beginTransaction();
		
		String hql1 = "DELETE FROM Authentication WHERE userName= :email";
		session.createQuery(hql1).setString("email", email).executeUpdate();
		
		String hql2 = "DELETE FROM CreditApp WHERE UserName= :email";
		session.createQuery(hql2).setString("email", email).executeUpdate();	
		
		String hql3 = "DELETE FROM User WHERE email= :email";
		session.createQuery(hql3).setString("email", email).executeUpdate();
		
		session.flush();
		session.getTransaction().commit();
		sessionClose();
		
		sessionStart();
		session.beginTransaction();
		
		String hql = "DELETE FROM Registration WHERE email= :email";
		session.createQuery(hql).setString("email", email).executeUpdate();
		
		session.flush();
		session.getTransaction().commit();
		sessionClose();
		
		System.out.println("User Deleted!");
		
	}
	
}

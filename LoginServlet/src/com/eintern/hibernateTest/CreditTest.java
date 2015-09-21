package com.eintern.hibernateTest;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.eintern.hibernate.CreditApp;

public class CreditTest {

	//Creating local sessionFactory and session
			SessionFactory sessionFactory  = new Configuration().configure().buildSessionFactory();;
			Session session;
			
			
			//Session start func - can start session anywhere with this
			public void sessionStart(){
				session = sessionFactory.openSession();
			
			}
			
			//Session close func - can close session anywhere with this
			public void sessionClose(){
				
				
				session.close();
			}
			
			@Override
			public void finalize(){
				sessionFactory.close();
			}
			
			public void addCredit(String email, String fname, String lname, String address, String salary, String credit){
				
				sessionStart();
				session.beginTransaction();
				CreditApp user = new CreditApp();
				
				user.setUserName(email);
				user.setFirstName(fname);
				user.setLastName(lname);
				user.setAddress(address);
				user.setSalary(salary);
				user.setCreditScore(credit);
				user.getPending();
				
				//Save the user in CreditApp table
				session.save(user);
				
				//Commit
				session.flush();
				session.getTransaction().commit();
				sessionClose();
				
				System.out.println("Row Inserted!");
				
				
			}
			
			public void updateStatus(String email, String pending){
				
				CreditApp credit = new CreditApp();
				
				sessionStart();
				session.beginTransaction();
				
				Criteria cr = session.createCriteria(CreditApp.class);
				String hqlUpdate = "Update CreditApp c set c.pending = :pending WHERE c.UserName = :email";
				int updatedEntity = session.createQuery(hqlUpdate)
						.setString("email", email)
						.setString("pending", pending)
						.executeUpdate();
				
				session.flush();
				session.getTransaction().commit();
				sessionClose();
				
				System.out.println("Status Updated!");
			}
			
			public void deleteCredit(String email){
				
				CreditApp credit = new CreditApp();
				
				sessionStart();
				session.beginTransaction();
				
				Criteria cr = session.createCriteria(CreditApp.class);
				String hqlUpdate = "Update CreditApp c set c.firstName = NULL, c.lastName = NULL, "
						+ "c.address = NULL, c.creditScore = NULL, c.salary = NULL WHERE c.UserName = :email";
				int updatedEntity = session.createQuery(hqlUpdate)
								.setString("email", email)
								.executeUpdate();
						
				
				session.flush();
				session.getTransaction().commit();
				sessionClose();
				
				System.out.println("Credit Deleted!");
				
				
			}
			
			public void registerCredit(String email, String fname, String lname, String address, String salary, String creditScore){
				
				CreditApp credit = new CreditApp();
				
				sessionStart();
				session.beginTransaction();
				
				Criteria cr = session.createCriteria(CreditApp.class);
				String hqlUpdate = "Update CreditApp c set c.firstName = :fname, c.lastName = :lname, "
						+ "c.address = :address, c.creditScore = :creditScore, c.salary = :salary, c.pending = :pending WHERE c.UserName = :email";
				int updatedEntity = session.createQuery(hqlUpdate)
								.setString("fname", fname)
								.setString("lname", lname)
								.setString("address", address)
								.setString("creditScore", creditScore)
								.setString("salary", salary)
								.setString("email", email)
								.setString("pending", "Pending")
								.executeUpdate();
				
				session.flush();
				session.getTransaction().commit();
				sessionClose();
				
				System.out.println("Application applied!");
				
			}
			
			public CreditApp showStatus(String name){
				
				//session must start in order to get criteria
				sessionStart();
				session.beginTransaction();
				
				Criteria cr = session.createCriteria(CreditApp.class);
				cr.add(Restrictions.eq("UserName", name));
				
				 List<CreditApp> results = cr.list();
				 
				 CreditApp user = new CreditApp();
				 
				 for(CreditApp r : results){
					 //Testing the results in the console
					 System.out.println(r);
					 user.setFirstName(r.getFirstName());
					 user.setLastName(r.getLastName());
					 user.setAddress(r.getAddress());
					 user.setSalary(r.getSalary());
					 user.setCreditScore(r.getCreditScore());
					 user.setPending(r.getPending());
				 }
				
				session.flush();
				session.getTransaction().commit();
				sessionClose();
				 
				return user;
			}
			
		public List<CreditApp> showAllStats(){
			
			List<CreditApp> list = new ArrayList<CreditApp>();
			
			//session must start in order to get criteria
			sessionStart();
			session.beginTransaction();
			
			Criteria cr = session.createCriteria(CreditApp.class);
			
			list = cr.list();
			
			sessionClose();
			return list;
			
		}
	
}

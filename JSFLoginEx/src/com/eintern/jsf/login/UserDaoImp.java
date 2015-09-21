package com.eintern.jsf.login;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;


import org.hibernate.Criteria;
import org.hibernate.Session;

import org.hibernate.criterion.Restrictions;



@ManagedBean(eager = true)
@ApplicationScoped
public class UserDaoImp implements UserDao {
	
	
	@Override
	public void addUserBean(UserB userB) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(userB);
		session.flush();
		session.getTransaction().commit();
		session.close();
		
		System.out.println("User Saved!");
		
	}

	@Override
	public boolean authorizeUser(String name, String password) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		Criteria cr = session.createCriteria(UserB.class);
		//Wont Work With Restrictions!
		
		cr.add(Restrictions.eq("username", name))
		  .add(Restrictions.eq("password", password)).list();
		
		List<UserB> results = cr.list();
		session.close();
			
		if(!results.isEmpty()){
				System.out.println("Welcome");
				return true;
			}else{
				System.out.println("TRY AGAIN");
				return false;
			}
	}

	@Override
	public List<UserB> getUsers() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		Criteria cr = session.createCriteria(UserB.class);
		List<UserB> results = cr.list();
		session.close();
		return results;
		
	}

	@Override
	public UserB getUserByName(String name) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		Criteria cr = session.createCriteria(UserB.class);
		cr.add(Restrictions.eq("username", name));
		UserB user = (UserB) cr.uniqueResult();
		return user;
	}
	
}

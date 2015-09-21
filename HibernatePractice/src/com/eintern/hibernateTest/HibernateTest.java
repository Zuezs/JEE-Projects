package com.eintern.hibernateTest;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.eintern.hibernate.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Query query = session.createQuery("from UserDetails user where user.userId = 2");
		query.setCacheable(true);
		List users = query.list();
		
		session.clear();
		
		session.getTransaction().commit();
		session.close();
		
		Session session2 = sessionFactory.openSession();
		session2.beginTransaction();

		
		Query query2 = session2.createQuery("from UserDetails user where user.userId = 2");
		query2.setCacheable(true);
		users = query2.list();
		
		
		session2.clear();
		session2.getTransaction().commit();
		session2.close();
		
	}
}

package com.eintern.spring.model;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

//Need to mark as a spring bean
@Repository
public class HibernateDaoImpl {
	
	//Needs to be autowired from xml file from
	//org.springframework.orm.hibernate4.LocalSessionFactoryBean class
	//Using hibernate 4
	@Autowired
	private SessionFactory sessionFactory; 

	//First hibernate Spring method!
	public int getCircleCount(){
		String hql = "SELECT COUNT(*) FROM Circle";
		Query query = getSessionFactory().openSession().createQuery(hql);
		return ((Long) query.uniqueResult()).intValue();
		
	}

	public String getCircle(int id){
		String hql = "SELECT name FROM Circle WHERE id= :id";
		Query query = getSessionFactory().openSession().createQuery(hql)
					.setParameter("id", id);
		//Circle circle
		
		return (String) query.uniqueResult();
	}
	
	@Transactional
	public void addCircle(int id, String name){
		
		Circle circle = new Circle();
		circle.setId(id); circle.setName(name);
		sessionFactory.getCurrentSession().save(circle);

		
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
		
}

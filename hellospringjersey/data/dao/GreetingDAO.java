package com.eintern.spring.hellospringjersey.data.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eintern.spring.hellospringjersey.data.entity.Greeting;

@Repository
public class GreetingDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<Greeting> findGreetingsForNameWithMoreThanThree() {
		Session s = sessionFactory.getCurrentSession();
		Query q = s.getNamedQuery("findGreetingsForNameMoreThanThree");
		List<Greeting> l = q.list();
		for (Greeting g : l)
			g.setGreeting(g.getGreeting() + "!");
		return q.list();
	}
}

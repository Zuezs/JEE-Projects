package com.eintern.jsf.calculator;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import org.hibernate.Criteria;
import org.hibernate.Session;

@ManagedBean(eager = true)
@ApplicationScoped
public class CalcDaoImp implements CalcDao{

	@Override
	public void addCalcBean(Calculator calc) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(calc);
		session.flush();
		session.getTransaction().commit();
		session.close();
		
		System.out.println("Calculation Saved!");
		
	}

	@Override
	public List<Calculator> getCalculations() {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		Criteria cr = session.createCriteria(Calculator.class);
		List<Calculator> results = cr.list();
		session.close();
		return results;
	}

}

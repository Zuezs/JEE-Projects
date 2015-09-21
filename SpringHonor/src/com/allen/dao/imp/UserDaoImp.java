package com.allen.dao.imp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.allen.dao.UserDao;
import com.allen.model.Administer;
import com.allen.model.Parent;
import com.allen.model.Student;
import com.allen.model.Teacher;


@Service
public class UserDaoImp implements UserDao {

	
	@Autowired
	private SessionFactory sessionFactory;

	
	@Override
	@Transactional 
	public void addStudent(Student student) {
		
		sessionFactory.getCurrentSession().saveOrUpdate(student);
	}
	
	@Override
	@Transactional
	public Student getById(long id) {
		
		Criteria cr = sessionFactory.getCurrentSession().createCriteria(Student.class);
		cr.add(Restrictions.eq("studentId", id));
		
		Student student = new Student();
		student = (Student) cr.list();
		return student;
	}
	
	@Override
	@Transactional
	public void deleteStudent(long id) {
		
		Student s = new Student();
		s.setStudentId(id);
		sessionFactory.getCurrentSession().delete(s);
	}

	@Override
	@Transactional
	public List<Student> showAllStudents() {

		Criteria cr = sessionFactory.getCurrentSession().createCriteria(Student.class);
		return cr.list();
		
		
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}

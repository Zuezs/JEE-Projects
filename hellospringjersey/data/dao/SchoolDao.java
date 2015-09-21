package com.eintern.spring.hellospringjersey.data.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eintern.spring.hellospringjersey.data.entity.Student;
import com.eintern.spring.hellospringjersey.data.entity.Teacher;

@Repository
public class SchoolDao {
	@Autowired
	private SessionFactory sf;
	
	@Transactional
	public Teacher saveTeacher(Teacher teacher) {
		Session s = sf.getCurrentSession();
		List<Student> students = teacher.getStudents();
		for (int i=0;i<students.size();++i) {
			Criteria c = s.createCriteria(Student.class);
			Student st = (Student) c.add(Restrictions.eq("name", students.get(i).getName())).uniqueResult();
			if (st != null)
				students.set(i, st);
			students.get(i).getTeachers().add(teacher);
		}
		return (Teacher) s.get(Teacher.class, s.save(teacher));
	}
}

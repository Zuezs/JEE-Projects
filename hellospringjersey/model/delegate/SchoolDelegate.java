package com.eintern.spring.hellospringjersey.model.delegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eintern.spring.hellospringjersey.data.dao.SchoolDao;
import com.eintern.spring.hellospringjersey.data.dao.StudentDao;
import com.eintern.spring.hellospringjersey.data.dao.TeacherDao;
import com.eintern.spring.hellospringjersey.data.entity.Student;
import com.eintern.spring.hellospringjersey.data.entity.Teacher;

@Component
public class SchoolDelegate {
	@Autowired
	private TeacherDao teacherDao;
	
	@Autowired
	private StudentDao studentDao;
	
	@Autowired
	private SchoolDao schoolDao;
	
	public Teacher saveTeacher(Teacher t) {
		return teacherDao.save(t);
	}
	
	public Teacher getTeacherByName(String name) {
		return teacherDao.findByName(name);
	}
	
	public Student getStudentByName(String name) {
		return studentDao.findByName(name);
	}
	
	public Teacher addTeacher(Teacher teacher) {
		return schoolDao.saveTeacher(teacher);
	}
}

package com.allen.dao;

import java.util.List;

import com.allen.model.Administer;
import com.allen.model.Parent;
import com.allen.model.Student;
import com.allen.model.Teacher;

public interface UserDao{
	
	
	void addStudent(Student student);
	Student getById(long id);
	List<Student> showAllStudents();
	void deleteStudent(long id);
}

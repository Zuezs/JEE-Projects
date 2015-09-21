package com.allen.user;

import com.allen.model.Administer;
import com.allen.model.Student;

public interface AdminUser {

	void insertUser(Student student);
	void insertUser(Administer admin);
	
}

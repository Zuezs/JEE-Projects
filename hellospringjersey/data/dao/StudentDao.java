package com.eintern.spring.hellospringjersey.data.dao;

import org.springframework.data.repository.CrudRepository;

import com.eintern.spring.hellospringjersey.data.entity.Student;

public interface StudentDao extends CrudRepository<Student, Long> {
	public Student findByName(String name);
}

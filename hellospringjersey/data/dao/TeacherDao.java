package com.eintern.spring.hellospringjersey.data.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.eintern.spring.hellospringjersey.data.entity.Teacher;

public interface TeacherDao extends CrudRepository<Teacher,Long>{
	public Teacher findByName(String name);
}

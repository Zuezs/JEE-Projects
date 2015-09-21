package com.eintern.spring.hellospringjersey.data.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Student {
	@Id
	@GeneratedValue(generator="seq_studentid", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="seq_studentid",sequenceName="seq_studentid")
	private long id;
	
	@Column(unique=true,nullable=false)
	private String name;

	@ManyToMany(mappedBy="students",fetch=FetchType.EAGER)
	private List<Teacher> teachers = new ArrayList<>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", teachers="
				+ teachers.stream().<Long>map(Teacher::getId).collect(Collectors.toList()) + "]";
	}
}

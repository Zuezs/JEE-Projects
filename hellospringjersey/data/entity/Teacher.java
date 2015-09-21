package com.eintern.spring.hellospringjersey.data.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.CascadeType;

@Entity
public class Teacher {
	@Id
	@GeneratedValue(generator="seq_teacherid", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="seq_teacherid",sequenceName="seq_teacherid")
	private long id;
	
	@Column(unique=true,nullable=false)
	private String name;

	@ManyToMany(cascade={javax.persistence.CascadeType.ALL})
	@JoinTable/*(name="TEACHER_STUDENT",joinColumns={@JoinColumn(name="teacher_id",referencedColumnName="id",table="Teacher")},
				inverseJoinColumns={@JoinColumn(name="student_id",referencedColumnName="id",table="Student")})*/
	private List<Student> students = new ArrayList<>();
	
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

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", students="
				+ students + "]";
	}
	
	
}

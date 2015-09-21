package com.allen.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name="Student")
public class Student {

	/*(generator="seq_studentid", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name="seq_studentid",sequenceName="student_gen", allocationSize=1)*/
	
	@Id
	@GeneratedValue(generator="seq_studentid", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name="seq_studentid",sequenceName="student_gen", allocationSize=1)
	@Column(name="studentId")
	private long studentId;
	private String firstName;
	private String lastName;
	private String email;
	private String address;
	private int age;
	private int grade;
	private String sex;
	private int studentRole = 4;

	public Student() {
		super();
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getStudentRole() {
		return studentRole;
	}

	public void setStudentRole(int studentRole) {
		this.studentRole = studentRole;
	}
	
}

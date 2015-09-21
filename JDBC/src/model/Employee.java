package model;


public class Employee {

	private int id;
	private int age;
	private String firstname;
	private String lastname;
	private String title;
	private int salary;
	private int deptno;
	
	public Employee(int i, String string, String string2, String string3, int j, int k, int l){}

	public Employee() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	@Override
	public
	String toString(){
		return this.id + ", " + this.firstname + ", " + this.lastname + ", " + this.title + ", " +
	this.age + ", " + this.salary + ", " + this.deptno;
	
	}
	
	
}

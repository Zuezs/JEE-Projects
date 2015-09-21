package dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import model.Employee;

public class EmployeeDAOImpl implements EmployeDAO {

	List<Employee> employees;
	
	
	private  Connection getConnection() {
		Connection conn = null;
		Properties properties = new Properties();
		String url = null;
		String username = null;
		String password = null;
		
		try{
			properties.load(new FileReader("src/dao/connection.properties"));
			url = properties.getProperty("url");
			username = properties.getProperty("username");
			password = properties.getProperty("password");
			
			String driver = properties.getProperty("driver");
			Class.forName(driver); //loads the class into memory -- Reflection
			
			DriverManager dm=null;
			//dm.getConnection(url)
			
			conn = DriverManager.getConnection(url, username, password);
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		
		//System.out.println(conn);
		return conn;
	}
	
	@Override
	public int insertEmployee(Employee employee) {
		
		int id = employee.getId();
		String firstname = employee.getFirstname();
		String lastname = employee.getLastname();
		String title = employee.getTitle();
		int age = employee.getAge();
		int salary = employee.getSalary();
		int deptNo = employee.getDeptno();
		int result = 0;
		
		String sql = "INSERT INTO EMPLOYEES values ("
				+ id + ",'"
				+ firstname + "','"
				+ lastname + "','"
				+ title + "',"
				+ age + ","
				+ salary + ","
				+ deptNo + ")";
		
		Connection conn = getConnection();
		System.out.println("Insertion Done");
		try{
			Statement stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			
			}catch(SQLException e){
				e.printStackTrace();
			}finally{
				if(conn != null){
					try{
						conn.close();
					}catch(SQLException e){
						e.printStackTrace();
					}
				}
			}
		
		return result;	
	}

	@Override
	public boolean deleteEmployee(int empID) {
		
		String sql = "DELETE FROM EMPLOYEES WHERE ( EMP_NO = " +empID+ ")";
		
		Connection conn = getConnection();
		int result;
		try{
			Statement stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			
			}catch(SQLException e){
				e.printStackTrace();
			}finally{
				if(conn != null){
					try{
						System.out.println("Delete Done");
						conn.close();
					}catch(SQLException e){
						e.printStackTrace();
					}
				}
			}
		
		return true;	
	
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		
		int id = employee.getId();
		String firstname = employee.getFirstname();
		String lastname = employee.getLastname();
		String title = employee.getTitle();
		int age = employee.getAge();
		int salary = employee.getSalary();
		int deptNo = employee.getDeptno();
		int result = 0;
		
		String sql = "UPDATE EMPLOYEES SET"
				+ " EMP_NO =" + id + ","
				+ " FIRST_NAME = ' " + firstname + "',"
				+ " LAST_NAME = '" + lastname + "',"
				+ " TITLE = '" + title + "',"
				+ " AGE = " + age + ","
				+ " SALARY = " + salary + ","
				+ " DEPT_NO = " + deptNo + " WHERE EMP_NO = " + employee.getId()+ "";
		
		Connection conn = getConnection();
		
		try{
			Statement stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			
			}catch(SQLException e){
				e.printStackTrace();
			}finally{
				if(conn != null){
					try{
						System.out.println("Update Done");
						conn.close();
					}catch(SQLException e){
						e.printStackTrace();
					}
				}
			}
		
		return true;
	}

	@Override
	public Employee getEmployee(int employeeID) {
		
		ResultSet rset = null; 
		Employee employee = new Employee();
		
		
		String sql = "SELECT * FROM EMPLOYEES WHERE EMP_NO = " + employeeID + "";
		
		Connection conn = getConnection();
		
		try{
			Statement stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);
			
			while(rset.next()){
				
				int id = rset.getInt("EMP_NO");
				String firstname = rset.getString("FIRST_NAME");
				String lastname = rset.getString("LAST_NAME");
				String title = rset.getString("TITLE");
				int age = rset.getInt("AGE");
				int salary = rset.getInt("SALARY");
				int deptNo = rset.getInt("DEPT_NO");
				
				employee.setId(id);
				employee.setFirstname(firstname);
				employee.setLastname(lastname);
				employee.setTitle(title);
				employee.setAge(age);
				employee.setSalary(salary);
				employee.setDeptno(deptNo);
				
				System.out.println(employee.toString());
								
			}
			System.out.println("Finish Adding List");
			
			rset.close();
			}catch(SQLException e){
				e.printStackTrace();
			}finally{
				if(conn != null){
					try{
						System.out.println("Get One Done");
						conn.close();
					}catch(SQLException e){
						e.printStackTrace();
					}
				}
			}
		
		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> list = new ArrayList<Employee>();
		ResultSet rset = null; 
		Employee employee = new Employee();
		
		String sql = "SELECT * FROM EMPLOYEES";
		
		Connection conn = getConnection();
		
		try{
			Statement stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);
			
			while(rset.next()){
				
				int id = rset.getInt("EMP_NO");
				String firstname = rset.getString("FIRST_NAME");
				String lastname = rset.getString("LAST_NAME");
				String title = rset.getString("TITLE");
				int age = rset.getInt("AGE");
				int salary = rset.getInt("SALARY");
				int deptNo = rset.getInt("DEPT_NO");
				
				employee.setId(id);
				employee.setFirstname(firstname);
				employee.setLastname(lastname);
				employee.setTitle(title);
				employee.setAge(age);
				employee.setSalary(salary);
				employee.setDeptno(deptNo);
				
				list.add(employee);
				System.out.println(employee.toString());
				
			}
			System.out.println("Finish Adding List");
			
			rset.close();
			}catch(SQLException e){
				e.printStackTrace();
			}finally{
				if(conn != null){
					try{
						System.out.println("Get All Done");
						conn.close();
					}catch(SQLException e){
						e.printStackTrace();
					}
				}
			}
		return list;
	}

}

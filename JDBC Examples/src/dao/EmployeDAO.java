package dao;

import java.util.List;
import model.Employee;

public interface EmployeDAO {

	public int insertEmployee(Employee employee);
	
	public boolean deleteEmployee(int employeeID);
	
	public Employee getEmployee(int employeeID);
	
	public List<Employee> getAllEmployees();
	
	public boolean updateEmployee(Employee employee);
}

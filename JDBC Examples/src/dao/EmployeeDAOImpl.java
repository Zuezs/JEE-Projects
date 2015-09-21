package dao;

import java.util.List;

import model.Employee;

public class EmployeeDAOImpl implements EmployeDAO {

	@Override
	public int insertEmployee(Employee employee) {
		return 0;
	}

	@Override
	public boolean deleteEmployee(int empID) {
		return false;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		
		return false;
	}

	@Override
	public Employee getEmployee(int employeeID) {
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return null;
	}

}

package dao;

import java.util.ArrayList;
import java.util.List;

import model.Employee;

public class EmployeeDAOTest {
	
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		//Create instance of Employee
		Employee employee1 = new Employee();
		//Create instance of connections and implementations
		EmployeeDAOImpl impl = new EmployeeDAOImpl();
		
		//Set employee values
		employee1.setFirstname("King");
		employee1.setLastname("Zues");
		employee1.setId(12);
		employee1.setAge(99);
		employee1.setDeptno(50);
		employee1.setSalary(2000000000);
		employee1.setTitle("Legend");
		
		// impl uses Implementation insertEmployee with employee1 inserted  
		//impl.insertEmployee(employee1);
		//boolean T = true;
		int num = 12;
		//T = impl.deleteEmployee(num);
		/*if(T == true){
			System.out.println("SUCCESS");
		}else{
			System.out.println("FAIL!");
		}*/
		//impl.updateEmployee(employee1);
		//impl.getAllEmployees();
		impl.getEmployee(num);
		System.out.println(impl.getEmployee(num).getAge());
		
	}

}

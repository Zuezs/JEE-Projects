//Tyron Allens 
package jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultSetDemo {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
						
		String sql = "SELECT * FROM EMPLOYEES";
		
		try{
			conn = JDBCUtility.getConnection();
			
			//create Statement
			//Statement is an interface that represents an SQL statement
			Statement stmt =  conn.createStatement();
			
			//Execute the SQL Statement and retrieve the results
			ResultSet rs = stmt.executeQuery(sql);
			
			//Result Set is a record pointer that always points to BEFORE that 1st
			while(rs.next()){
				
			//the passed-in value specifies the column 
				System.out.println("\nEmployee ID: \t" + rs.getInt(1));
				System.out.println("Employee FirstName: \t" + rs.getString(2));
				System.out.println("Employee LastName: \t" + rs.getString(3));
				System.out.println("Employee Dept Title: \t" + rs.getString(4));
				System.out.println("Employee Dept Age: \t" + rs.getInt(5));
				System.out.println("Employee Dept Salary: \t" + rs.getInt(6));
				System.out.println("Employee Dept ID: \t" + rs.getInt(7));				
			}
			
		}catch(SQLException e){
			
		}finally{
			if(conn != null){
				try{
					conn.close();
				}catch(SQLException e){
					
				}
			}
		}
		
	}
	
	
}

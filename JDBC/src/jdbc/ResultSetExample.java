package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetExample {

	public static void main(String[] args){
		Connection conn = null;
		
		String sql = "SELECT * FROM EMPLOYEES"; //NOTE: Do NOT place semi-colon to end SQL statement
		
		try {
			conn = JDBCUtility.getConnection();
			
			//create Statement
			// Statement is an interface that represents an SQL statement
			Statement stmt = conn.createStatement();
			
			// Execute the SQL Statement and retrieve the results
			ResultSet rs = stmt.executeQuery(sql);
			
			//ResultSet is a record pointer that always points to BEFORE the 1st record
			while (rs.next()){
				//the passed-in value specifies the column
				System.out.println("Employee ID: \t" + rs.getInt(1));
				//rs.getObject("EMPLOYEE_NAME");
				System.out.println("Employee FirstName: \t" + rs.getString(2));
				System.out.println("Employee LastName: \t" + rs.getString(3));
				System.out.println("Employee Dept ID: \t" + rs.getInt(4));
			}
		} catch (SQLException e){}
		  finally {
			  if (conn != null){
				  try {
					  conn.close();
				  } catch (SQLException e){}
			  }
		  }
	}
}

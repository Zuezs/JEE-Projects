package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class StoredProcedure {
	
	private static final String connectionUrl =  "jdbc:oracle:thin:@localhost:1521:xe";

	public static void updateEmployeeDepartment(int num, int deptNo) throws SQLException{
		Connection conn = null;
		
		PreparedStatement pstmt = null;
		
		try {
			conn = DriverManager.getConnection(connectionUrl, "eintern", "password");
			
			pstmt = conn.prepareStatement("UPDATE EMPLOYEES " 
				+ "SET employee_dept = ? " 
				+ "WHERE emp_id = ?");
					
			pstmt.setInt(1, num);
			pstmt.setInt(2, deptNo);
			pstmt.executeUpdate();
		} finally {
			if (pstmt != null){
				pstmt.close();
			}
		}
	}
	
	
	public static void main (String[] args){
		try {
			updateEmployeeDepartment(1, 2);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Done");
	}
}

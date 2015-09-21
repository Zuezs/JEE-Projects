package jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DynaInsertDemo {
	public static void main(String[] args) {
		
		int empID = 5;
		String firstname = "John";
		String lastname = "Anderson";
		int deptNo = 66;
		
		Connection conn = null;
		//? are known as place holders
		String sql = "insert into employees values (?,?,?,?)";
		
		try {
			conn = JDBCUtility.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			//Replacing place holders with the values - Index start from 1
			stmt.setInt(1, empID);
			
			//Set rest of the values...
			stmt.setString(2, firstname);
			stmt.setString(3, lastname);
			stmt.setInt(4, deptNo);
			stmt.executeUpdate();
			
			stmt.close();
			
			System.out.println("Record inserted...");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}

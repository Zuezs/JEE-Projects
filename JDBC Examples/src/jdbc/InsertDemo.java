package jdbc;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class InsertDemo {
	public static void main(String[] args) {
		Connection conn = null;
		// Writer query
		String sql = "insert into employees values(4, 'J', 'Z', 30)";
		
		try {
			conn = JDBCUtility.getConnection();
			// Creating a statement
			Statement stmt = conn.createStatement();
			
			// Executing query
			int no = stmt.executeUpdate(sql);
			
			
			System.out.println("Record inserted...: " + no);
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

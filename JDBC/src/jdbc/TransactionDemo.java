package jdbc;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class TransactionDemo {
	public static void main(String[] args) {
		Connection conn = null;
		String sql1 = "insert into employees values(201,'Mili','Pena',2000)";
		String sql2 = "update employees set dept_number=22 where firstname='Mili'";
		String sql3 = "delete from employees where firstname='Aron'";
		
		try {
			conn = JDBCUtility.getConnection();
			Statement stmt = conn.createStatement();
			//Adding batch of queries to statement object
			System.out.println("Beginning Transaction...");
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			
			//Setting the auto-commit off - by default it's true
			conn.setAutoCommit(false);
			
			//Executing the batch of queries
			stmt.executeBatch();
			
			//If everything goes fine without exception
			conn.commit();
			System.out.println("Changes are updated successfully...");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Changes are failed due to exception...");
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			System.out.println("Changes failed due to " + e.getMessage());
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

package jdbc;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class ProcedureDemo {
	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			conn = JDBCUtility.getConnection();
			//Creating callable statement to invoke getName procedure
			//CallableStatement stmt = conn.prepareCall("{call getName(?,?)}");
			CallableStatement stmt = conn.prepareCall("{? = call getFName(?)}");
			
			//Replacing the 1st placeholder with person id
			//stmt.setInt(1, 1);
			stmt.setInt(2, 1);
			
			//Specifying the Database type for 2nd parameter for output
			//stmt.registerOutParameter(2, Types.VARCHAR);
			stmt.registerOutParameter(1, Types.VARCHAR);

			//Invoking procedure
			stmt.execute();
			System.out.println("First Name: " + stmt.getString(1));
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

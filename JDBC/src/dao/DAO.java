package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;
import oracle.jdbc.pool.OracleDataSource;

public class DAO {

	public static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String usr = "System";
	public static final String pwd = "manager";

	public static void main(String[] args) {

		// Class.forName("oracle.jdbc.OracleDriver");
		OracleDriver driver = new OracleDriver();
		OracleDataSource ds = null;
		Connection conn = null;
		
		try {

			DriverManager.registerDriver(driver);

			conn = (Connection) DriverManager.getConnection(url,
					usr, pwd);

			ds = new OracleDataSource();
			ds.setURL(url);
			conn = ds.getConnection(usr, pwd);
			
			//Loop through data
			Statement stmt = conn.createStatement();
			
			ResultSet result = stmt.executeQuery("SELECT * FROM STUDENTS");
			
			while (result.next()){
				String name = result.getString("STUDENT_NAME");
				System.out.println("Name: " + name);
			}


			// INSERT - 
			stmt.executeUpdate("INSERT into aron.STUDENTS values (1032, 'Me2g', 23, 'Bible class', 4)");
			System.out.println("Table altered!");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}
}

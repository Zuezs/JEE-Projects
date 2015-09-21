package jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.OracleDriver;

public class ConnectionDemo {

	public static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String username = "eintern";
	public static final String password = "password";
	
	public static void main(String[] args){
		Connection conn = null;
		
		//Instantiate the DB driver class
		OracleDriver driver = new OracleDriver();
		
		
		//Register the DB driver with the Driver Manager
		try {
			DriverManager.registerDriver(driver);

			//Request the connection
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connection successful");
			
			//Retrieve database metadata
			DatabaseMetaData meta = conn.getMetaData();
			System.out.println("DB Name: " + meta.getDatabaseProductName());
			System.out.println("DB Version: " + meta.getDatabaseProductVersion());
			System.out.println("Driver Name: " + meta.getDriverName());
			System.out.println("Driver Version: " + meta.getDriverVersion());
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null){
				try {
					conn.close();
				} catch (SQLException e){
					e.printStackTrace();
				}
			}
		}
		
	}
	
}

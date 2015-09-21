package jdbc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import oracle.jdbc.OracleDriver;

public class JDBCUtility {

	/**
	 * Used to get a Connection to the Database. Connection properties are specified in the 
	 * connection.properties file
	 * @return Connection object to database
	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException {
		Properties properties = new Properties();
		String url = null;
		String username = null;
		String password = null;
		
		try{
			properties.load(new FileReader("src/jdbc/connection.properties"));
			url = properties.getProperty("url");
			username = properties.getProperty("username");
			password = properties.getProperty("password");
			
			String driver = properties.getProperty("driver");
			Class.forName(driver); //loads the class into memory -- Reflection
		} catch (ClassNotFoundException e){}
		  catch (FileNotFoundException e) {}
		  catch (IOException e) {}
		  
		Connection conn = DriverManager.getConnection(url, username, password);
		return conn;
	}
	
	//old way
	@Deprecated
	/**
	 * Used to get a connection to the database
	 * @return
	 * @throws SQLException
	 */
	public static Connection getConnectionWOReflection() throws SQLException {
		Properties properties = new Properties();
		String url = null;
		String username = null;
		String password = null;
		
		try{
			properties.load(new FileReader("src/jdbc/connection.properties"));
			url = properties.getProperty("url");
			username = properties.getProperty("username");
			password = properties.getProperty("password");
			
			OracleDriver driver = new OracleDriver();
			
			DriverManager.registerDriver(driver);
		} 
		  catch (FileNotFoundException e) {}
		  catch (IOException e) {}
		  
		Connection conn = DriverManager.getConnection(url, username, password);
		return conn;
	}
	
	public static void main(String[] args){
		
		System.out.println("Testing connection...");
		
		try {
			Connection conn = JDBCUtility.getConnection();
			DatabaseMetaData meta = conn.getMetaData();
			System.out.println("DB Name: " + meta.getDatabaseProductName());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

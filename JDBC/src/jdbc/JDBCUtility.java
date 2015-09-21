//Tyron Allens
package jdbc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtility {

	
	//Used to get a Connection to the Database. Connection properties are specified in the
	//connection.properties file
	/**
	 * 
	 * @return
	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException{
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
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		Connection conn = DriverManager.getConnection(url, username, password);
		//System.out.println(conn);
		return conn;
	}
	
	//old way
	
}

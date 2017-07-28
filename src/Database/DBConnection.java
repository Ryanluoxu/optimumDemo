package Database;

import java.sql.Connection;
import java.sql.DriverManager;		// The basic service for managing a set of JDBC drivers
import java.sql.SQLException;

public class DBConnection {							// it's a singleton class
	
	private static Connection connection = null;
	
	public static Connection myConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");	// create object of Driver class
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			// passing url, userid and password to getConnection method
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return connection;
	}
}
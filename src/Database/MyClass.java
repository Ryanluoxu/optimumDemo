package Database;

import java.sql.Statement;	// The object used for executing a static SQL statement and returning the results it produces. 
import java.sql.Connection;
import java.sql.PreparedStatement;	// An object that is recording value from input for DB. 
import java.sql.ResultSet;			// A table of data representing a database result set, 
import java.sql.SQLException;

public class MyClass {				// this is a DAO class
	Connection con = null;
	Statement st = null;
	ResultSet rs = null;
	PreparedStatement ps = null;
	
	void getData() throws SQLException{									// Method 1: get values from DB
		
		con = DBConnection.myConnection();									// - get a connection
		Statement st = con.createStatement();								// - create a statement from this connection
		ResultSet rs = st.executeQuery("select * from employee");			// - execute a statement and put into a table(rs)
		while (rs.next()) 													// - print out the table
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		con.close();														// - close the connection
	}
	
	void insertData(Employee newEmployee) throws SQLException{			// Method 2: pass values to DB
		
		con = DBConnection.myConnection();									// - get a connection
		ps = con.prepareStatement("insert into employee values(?,?,?)");	// - prepare a statement from this connection
																			// - put values into this statement and to DB
		
		// 2-3 Receive new object from controller
		ps.setInt(1, newEmployee.getEmployeeID());		// 1: specifies the parameter position in the query
		ps.setString(2, newEmployee.getName());		
		ps.setString(3, newEmployee.getAddress());		// 2-4,5,6 get values from POJO and pass in DB.
		
		int i=ps.executeUpdate();
		System.out.println(i+" records inserted");
	}
	
	void updateData(Employee updatedEmployee) throws SQLException{
		con = DBConnection.myConnection();
		ps = con.prepareStatement("UPDATE employee SET empName = ?, address = ? WHERE empID = ?");
		
		ps.setInt(3, updatedEmployee.getEmployeeID());
		ps.setString(1, updatedEmployee.getName());
		ps.setString(2, updatedEmployee.getAddress());
		
		ps.executeUpdate();
		System.out.println("Employee " + updatedEmployee.getEmployeeID() + " was updated..");
		
	}
	
	void deleteData(Employee deletedEmployee) throws SQLException{
		con = DBConnection.myConnection();
		ps = con.prepareStatement("DELETE from employee WHERE empID = ?");
		
		ps.setInt(1, deletedEmployee.getEmployeeID());
		
		ps.executeUpdate();
		System.out.println("Employee " + deletedEmployee.getEmployeeID() + " was deleted..");

	}
}

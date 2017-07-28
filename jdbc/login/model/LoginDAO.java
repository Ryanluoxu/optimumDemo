package login.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import EmployeeApplication.DAO;
import connection.DBConnection;
import login.pojo.Employee;

public class LoginDAO {
	
	static Connection con = null;
	static Statement st = null;
	static ResultSet rs = null;
	PreparedStatement ps = null;

	public static boolean validate(Employee loginEmployee) throws Exception {

		// 1-6. get data from POJO for validate
		int idForValidate = loginEmployee.getId();
		String passwordForValidate = loginEmployee.getPassword();
		
		// encrypt password
		String encryptedPassword = DAO.encrypt(passwordForValidate, passwordForValidate);
	
		// 1-7. get data from DB through DBConnection
		Map<Integer, String> validateMap = LoginDAO.getData();
		
		// retrieve password based on ID and validate
		String rightPassword = validateMap.get(idForValidate);
		
		if (rightPassword == null) {
			System.err.println("ID is not found .. ");
			return false;
		} 
		else {
			if (encryptedPassword.equals(rightPassword)) {
				return true;
			} 
			return false;
		}
		
	}
	
	static Map getData() throws SQLException{
		
		// get data from DB through DBConnection
		con = DBConnection.myConnection();
		st = con.createStatement();
		rs = st.executeQuery("select * from employee");
		
		// store data into a map
		Map<Integer, String> validateMap = new HashMap<>();

		while (rs.next()) {
			validateMap.put(rs.getInt(1), rs.getString(3));
		}
		
		con.close();
		
		return validateMap;
	}

}

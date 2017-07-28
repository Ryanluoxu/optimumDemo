package EmployeeApplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import connection.DBConnection;
import login.pojo.Employee;

public class DAO {
	
	static Connection con = null;
	static Statement st = null;
	static ResultSet rs = null;
	static PreparedStatement ps = null;
	
	static void getData() throws SQLException{	// get data from DB through DBConnection
		
		con = DBConnection.myConnection();
		st = con.createStatement();
		rs = st.executeQuery("select * from products");
		
		DBTablePrinter.printResultSet(rs);
		
		con.close();
	}

	public static void addData(Product newProduct) throws SQLException {		// add data to DB
		
		con = DBConnection.myConnection();
		String sql = "insert into products (productCode,description,price,quantity,employeeID,editTime) "
				   + "values(?,?,?,?,?,now())";
		ps = con.prepareStatement(sql);
		
		ps.setString(1, newProduct.productCode);
		ps.setString(2, newProduct.productDesc);
		ps.setDouble(3, newProduct.price);
		ps.setInt(4, newProduct.quantity);
		ps.setInt(5, newProduct.employeeID);
		
		ps.executeUpdate();
		
		System.out.println(newProduct.productDesc + " is added successful ..");
		
		con.close();
		
	}

	public static void editData(Product editProduct) throws SQLException {

		con = DBConnection.myConnection();
		
		String sql = "UPDATE products SET productCode=?,description=?,price=?,quantity=?,employeeID=?,editTime=now()"
				   + "WHERE productID=?;";
		
		ps = con.prepareStatement(sql);
		
		ps.setString(1, editProduct.productCode);
		ps.setString(2, editProduct.productDesc);
		ps.setDouble(3, editProduct.price);
		ps.setInt(4, editProduct.quantity);
		ps.setInt(5, editProduct.employeeID);
		ps.setInt(6, editProduct.productID);

		ps.executeUpdate();
		
		System.out.println(editProduct.productID + " is updated successful ..");
		
		con.close();
		
	}

	public static void deleteData(Product deleteProduct) throws SQLException {
		
		con = DBConnection.myConnection();
		String sql = "DELETE FROM products WHERE productID=?;";
		ps = con.prepareStatement(sql);
		
		ps.setInt(1, deleteProduct.productID);

		ps.executeUpdate();
		
		System.out.println(deleteProduct.productID + " is deleted successful ..");
		
		con.close();
		
	}

	public static void ageCalculte(String dateOfBirth) throws SQLException {
		
		// pass data to DB
		con = DBConnection.myConnection();
		
		String sql = "INSERT INTO agecalculator values (?,curdate(),TIMESTAMPDIFF(year,?,curdate()));";
		ps = con.prepareStatement(sql);
		
		ps.setString(1, dateOfBirth);
		ps.setString(2, dateOfBirth);
		
		ps.executeUpdate();
		
		con.close();

		// get data from DB
		con = DBConnection.myConnection();
		st = con.createStatement();
		
		String sql2 = "SELECT age FROM agecalculator WHERE dateOfBirth = '" + dateOfBirth + "';";
				
		rs = st.executeQuery(sql2);
		
		rs.next();
		System.out.println("\nYour age is : " + rs.getInt(1));
			
		con.close();
	}

	public static void addEmployee(Employee newEmployee) throws Exception {
		
		// Encrypt password
		String encryptedPassword = encrypt(newEmployee.getPassword(), newEmployee.getPassword());

		con = DBConnection.myConnection();
		String sql = "insert into employee (Name,Password) "
				   + "values(?,?)";
		ps = con.prepareStatement(sql);
		
		ps.setString(1, newEmployee.getName());
		ps.setString(2, encryptedPassword);

		ps.executeUpdate();
		
		System.out.println(newEmployee.getName() + " is added successful ..");
		
		con.close();
		
		// get data from DB
		con = DBConnection.myConnection();
		st = con.createStatement();
		
		String sql2 = "SELECT ID FROM employee WHERE Name = '" + newEmployee.getName() + "';";
				
		rs = st.executeQuery(sql2);
		
		while (rs.next()) {
			System.out.println("\nYour ID is : " + rs.getInt(1));
		}
			
		con.close();
	}
	
	public static String encrypt(String strClearText,String strKey) throws Exception{
		String strData="";
		
		try {
			SecretKeySpec skeyspec=new SecretKeySpec(strKey.getBytes(),"Blowfish");
			Cipher cipher=Cipher.getInstance("Blowfish");
			cipher.init(Cipher.ENCRYPT_MODE, skeyspec);
			byte[] encrypted=cipher.doFinal(strClearText.getBytes());
			strData=new String(encrypted);
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return strData;
	}

}

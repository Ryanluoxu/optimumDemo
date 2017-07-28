package EmployeeApplication;

import java.sql.SQLException;

import login.pojo.Employee;

public class BusinessLogic {
	
	public static void logic() throws Exception{
		
		// 2. call EmployeeInput to get data
		// 3. pass back data to controller
		EmployeeInput makeChoiceInput = new EmployeeInput().makeChoice();
		
		switch (makeChoiceInput.choice) {
		case "1":
			showTable();
			break;
		case "2":
			addData();
			break;
		case "3":
			editData();
			break;
		case "4":
			deleteData();
			break;
		case "5":
			calculateAge();
			break;
		case "6":
			addEmployee();
			break;
		default:
			System.err.println("Invalid choice ..");
			break;
		}
		
	}

	private static void showTable() throws SQLException {
		System.out.println("\n--> Products Table : ");
		DAO.getData();
	}
	
	private static void addData() throws SQLException {
		System.out.println("\n--> New Products Details : ");
		
		// get input for new data of product
		EmployeeInput addDataInput = new EmployeeInput().addData();
		
		// create an object of Product
		Product newProduct = new Product(addDataInput.productCode, addDataInput.productDesc, 
										 addDataInput.price, addDataInput.quantity);
		
		// pass the object to DAO
		DAO.addData(newProduct);
	}
	
	private static void editData() throws SQLException {
		System.out.println("\n--> Edit Product : ");
		
		// get input for new data of product
		EmployeeInput edit = new EmployeeInput().editData();
		
		// create an object of Product
		Product editProduct = new Product(edit.productID, edit.productCode, 
										 edit.productDesc, edit.price, edit.quantity);
				
		// pass the object to DAO
		DAO.editData(editProduct);
	}
	
	private static void deleteData() throws SQLException {
		System.out.println("\n--> Delete Product : ");
		
		// get input for new data of product
		EmployeeInput delete = new EmployeeInput().deleteData();
		
		// create an object of Product
		Product deleteProduct = new Product(delete.productID);
				
		// pass the object to DAO
		DAO.deleteData(deleteProduct);
	}
	
	private static void calculateAge() throws SQLException {
		System.out.println("\n--> Calculate Age : ");
		
		// get input
		EmployeeInput ageCalculate = new EmployeeInput().ageCalculate();
				
		// pass the input to DAO
		String temp = ageCalculate.dateOfBirth;
		StringBuilder dateOfBirth = new StringBuilder();
		
		dateOfBirth.append(temp.substring(6, 10)).append("-").append(temp.substring(3, 5))
				   .append("-").append(temp.substring(0, 2));
		
		DAO.ageCalculte(dateOfBirth.toString());
		
	}
	
	private static void addEmployee() throws Exception {
		System.out.println("\n--> Add New Employee : ");
		
		// get input
		EmployeeInput newEmployeeInput = new EmployeeInput().newEmployee();
				
		// create an object of Product
		Employee newEmployee = new Employee(newEmployeeInput.newName, newEmployeeInput.newPassword);
				
		// pass the object to DAO
		DAO.addEmployee(newEmployee);
		
	}

}

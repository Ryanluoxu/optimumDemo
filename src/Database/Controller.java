package Database;

import java.sql.SQLException;
import java.util.Scanner;

public class Controller {
	public Scanner scanner = new Scanner(System.in);
	public MyClass myClass = new MyClass();					// MyClass is DAO class
	
	public void controlLogic(String choice) throws SQLException{
		switch (choice) {
		case "1":
			showTable();
			break;
		case "2":
			addEmployee();			// 2-1 Initialize
			break;		
		case "3":
			updateEmployee();
			break;
		case "4":
			deleteEmployee();
			break;
		default:
			break;
		}
	}

	public void showTable() throws SQLException{	// get data from DB through DAO
		System.out.println("===== Table =====");
		myClass.getData();
		System.out.println("=================");
	}
	
	public void addEmployee() throws SQLException{	// 2-2 create object of POJO, and set value to the object; 2-3
		
		System.out.println("Enter employee ID: ");
		int EmployeeID = scanner.nextInt();
		System.out.println("Enter employee name: ");
		String EmployeeName = scanner.next();
		System.out.println("Enter employee address: ");
		String EmployeeAddress = scanner.next();
		
		Employee newEmployee = new Employee(EmployeeID, EmployeeName, EmployeeAddress);	// 2-2 Create object and set
		
		myClass.insertData(newEmployee);;	// 2-3 Pass new object to DAO
	}
	
	public void updateEmployee() throws SQLException{
		
		System.out.println("Enter employee ID: ");
		int EmployeeID = scanner.nextInt();
		System.out.println("Enter employee name (update): ");
		String EmployeeName = scanner.next();
		System.out.println("Enter employee address (update): ");
		String EmployeeAddress = scanner.next();
		
		Employee updatedEmployee = new Employee(EmployeeID, EmployeeName, EmployeeAddress);
		
		myClass.updateData(updatedEmployee);
	}
	
	public void deleteEmployee() throws SQLException{
		
		System.out.println("Enter employee ID (delete): ");
		int EmployeeID = scanner.nextInt();
		
		Employee deletedEmployee = new Employee(EmployeeID);
		
		myClass.deleteData(deletedEmployee);
	}

}

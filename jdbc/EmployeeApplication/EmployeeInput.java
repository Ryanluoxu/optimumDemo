package EmployeeApplication;

import java.util.Scanner;

public class EmployeeInput {
	
	public Scanner sc = new Scanner(System.in);
	
	public EmployeeInput() {
		super();
	}

	// for employee make choice 
	String choice;
	
	EmployeeInput(String choice) {
		this.choice = choice;
	}
	
	public EmployeeInput makeChoice(){
		System.out.print("Enter your choice : ");
		choice = sc.next();	
		return new EmployeeInput(choice);
	}
	
	// for adding data
	String productCode;
	String productDesc;
	double price;
	int quantity;
	
	public EmployeeInput(String productCode, String productDesc, double price, int quantity) {
		this.productCode = productCode;
		this.productDesc = productDesc;
		this.price = price;
		this.quantity = quantity;
	}

	public EmployeeInput addData() {
		System.out.print("Enter product code : ");
		productCode = sc.nextLine();	
		System.out.print("Enter product description : ");
		productDesc = sc.nextLine();
		System.out.print("Enter product price : ");
		price = sc.nextDouble();
		System.out.print("Enter product quantity : ");
		quantity = sc.nextInt();
		
		return new EmployeeInput(productCode, productDesc, price, quantity);
	}
	
	// for editing data
	int productID;
	
	public EmployeeInput(String productCode, String productDesc, double price, int quantity, int productID) {
		this.productCode = productCode;
		this.productDesc = productDesc;
		this.price = price;
		this.quantity = quantity;
		this.productID = productID;
	}

	public EmployeeInput editData() {
		System.out.print("Enter ID of product to edit : ");
		productID = sc.nextInt();
		sc.nextLine();
		
		// check product ID existing
		
		
		System.out.println("");
		System.out.print("Enter product code : ");
		productCode = sc.nextLine();	
		System.out.print("Enter product description : ");
		productDesc = sc.nextLine();
		System.out.print("Enter product price : ");
		price = sc.nextDouble();
		System.out.print("Enter product quantity : ");
		quantity = sc.nextInt();
		
		return new EmployeeInput(productCode, productDesc, price, quantity, productID);
	}

	// for deleting data
	public EmployeeInput(int productID) {
		this.productID = productID;
	}
	
	public EmployeeInput deleteData() {
		System.out.print("Enter ID of product to delete : ");
		productID = sc.nextInt();
		
		return new EmployeeInput(productID);
	}

	// for calculating age
	String dateOfBirth;
	
	public EmployeeInput(String dateOfBirth, int EmployeeID) {
		this.dateOfBirth = dateOfBirth;
	}

	public EmployeeInput ageCalculate() {
		System.out.print("Enter your date of birth (dd/mm/yyyy) : ");
		dateOfBirth = sc.nextLine();
		
		return new EmployeeInput(dateOfBirth,MainApplication.EmployeeID);
	}

	// for adding new employee
	String newName;
	String newPassword;
	
	public EmployeeInput(String newName, String newPassword) {
		this.newName = newName;
		this.newPassword = newPassword;
	}

	public EmployeeInput newEmployee() {
		
		System.out.print("Enter New Employee Name : ");
		newName = sc.nextLine();
		System.out.print("Enter New Password : ");
		newPassword = sc.nextLine();
		
		return new EmployeeInput(newName, newPassword);
	}
	

	


	

}

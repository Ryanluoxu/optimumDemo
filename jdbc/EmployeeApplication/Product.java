package EmployeeApplication;

public class Product {
	
	int productID;
	String productCode;
	String productDesc;
	double price;
	int quantity;
	int employeeID;
	
	public Product(String productCode, String productDesc, double price, int quantity) {
		this.productCode = productCode;
		this.productDesc = productDesc;
		this.price = price;
		this.quantity = quantity;
		this.employeeID = MainApplication.EmployeeID;
	}
	
	public Product(int productID, String productCode, String productDesc, double price, int quantity) {
		this.productID = productID;
		this.productCode = productCode;
		this.productDesc = productDesc;
		this.price = price;
		this.quantity = quantity;
		this.employeeID = MainApplication.EmployeeID;
	}

	public Product(int productID) {
		this.productID = productID;
	}

	public String getProductCode() {
		return productCode;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	public int getEmployeeID() {
		return employeeID;
	}

}

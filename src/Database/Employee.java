package Database;

public class Employee {					// fields + constructor + setter & getter
	
	private int employeeID;
	private String name;
	private String address;
	
	public Employee(int employeeID, String name, String address) {
		this.employeeID = employeeID;
		this.name = name;
		this.address = address;
	}
	
	public Employee(int employeeID) {
		this.employeeID = employeeID;
	}

	public int getEmployeeID() {
		return employeeID;
	}
	
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
}

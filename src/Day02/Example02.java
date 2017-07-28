package Day02;


class Employee { // in one '.java' file, only one public class with 'main' function.
	
	String employeeName = "Ryan Luo";
	int employAge = 28;
	
	static int i = 0; // static data.
	
	void displayInformation(){ // non-static method
		
		System.out.println(employeeName);
		System.out.println(employAge);
		
	} // end of display information
	
} // end of class Employee


public class Example02 { // where class loader access.

	public static void main(String[] args) {
		
		Employee employee01 = new Employee(); // create an object for class 'Employee'
		employee01.displayInformation();
		
		System.out.println(Employee.i); // no need to create object for static data.
		
	} // end of main

} // end of Example02

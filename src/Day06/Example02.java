package Day06;

class Employee {
	String name;
	int age;
	double salary;
	
	public Employee() {	// Call constructor in other constructor, use 'super'
		
		this("Ramboo");	// Must be the first statement in constructor.
		System.out.println("I am default constructor.");
	
	}
	
	public Employee(String name) {
		System.out.println("Hello " + name);
		
		new Employee(25, 4500); // use 'new' means create an object which slows system
	}
	
	public Employee(int age, double salary) {
		System.out.println("Age: " + age + " . Salary: " + salary);
	}
}

public class Example02 {

	public static void main(String[] args) {
		
		// we don't need reference to call constructor.
		new Employee();
//		new Employee("Ramboo");
//		new Employee(25, 4500);		
		
	}

}

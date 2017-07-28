package Day11;

import java.util.Scanner;

class Person{
	private String name;
	private int age;
	
	// -- use setter and getter --
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	// -- use constructor and toString --
	
//	public Person(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//	
//	@Override
//	public String toString() {
//		return name + " " + age;
//	}
} // -- end of Person --

public class ArrayExample02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// Get number of data
		System.out.println("Enter number of data : ");
		int numberOfData = scanner.nextInt();
		
		// Create array of Person
		Person personArray[] = new Person[numberOfData];
		
		// Store data to the array
		for (int i = 0; i < numberOfData; i++) {
			System.out.println("Enter name for data #" + (i+1) + " : ");
			String tempName = scanner.next();
			System.out.println("Enter age for data #" + (i+1) + " : ");
			int tempAge = scanner.nextInt();
			
			// using setter to create object
			
			Person person = new Person(); // must create object first and store the data
			person.setName(tempName);
			person.setAge(tempAge);
			personArray[i] = person;
			
//			personArray[i] = new Person(tempName, tempAge); // Create object for each data using constructor
		}
		
		// Get data
		
		// use getter
		for (Person person : personArray) {
			System.out.println(person.getName() + " " + person.getAge());
		}
		
		// use toString
//		for (Person person : personArray) {
//			System.out.println(person);
//		}
		
	}

}

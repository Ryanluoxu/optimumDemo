package Day03;

import java.util.Scanner;

class UserInput2 {
	static void access() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name, name1, age and salary: ");
		String name = sc.nextLine(); 	// scanner will stop reading when "enter"
		String name1 = sc.next(); 		// scanner will stop reading when "space"
		int age = sc.nextInt();
		float salary = sc.nextFloat();
		
		System.out.println("You have entered: " + name + " " + name1 + " " + age + " " + salary);
	}
}

public class Example06 {

	public static void main(String[] args) {
		UserInput2.access();
	}

}


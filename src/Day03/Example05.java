package Day03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class UserInput {
	void accept() throws IOException {
		BufferedReader ref = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a character: ");
		char c = (char) ref.read(); 	// check exception here; just take first letter
		System.out.println("You have entered: " + c);
		ref.readLine(); 	// clear the left

		System.out.println("Enter a character: ");
		String c1 = ref.readLine(); 	// 
		System.out.println("You have entered: " + c1);
		
		System.out.println("Enter your name: ");
		String name = ref.readLine(); 	// readLine doesn't need casting
		System.out.println("Your name : " + name);
		
		System.out.println("Your age: ");
		int age = ref.read();	// will bring in a logic problem
		System.out.println("Your age is " + age);
		
		System.out.println("Your age again: ");
		Integer age1 = Integer.parseInt(ref.readLine());	// solve the logic problem
		System.out.println("Your age is " + age1);
		
		System.out.println("Your salary: ");
		Double salary = Double.parseDouble(ref.readLine());	// solve the logic problem
		System.out.println("Your salary is " + salary);
		
	}
}

public class Example05 {

	public static void main(String[] args) throws IOException {
		
		UserInput ref = new UserInput();
		ref.accept();
		// method called has exception, it has to includes exception in main
	}

}

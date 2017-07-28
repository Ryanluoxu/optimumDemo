package Day04;

import java.util.Scanner;

class Data {
	static void showData() {
		System.out.println("Hello.");
	}
} // end of Data

class Logic {
	void checkCondition(String password){
		if (password.equals("admin123")) {
			Data.showData();
		} else {
			System.err.println("Wrong password.");
		}
	}
} // end of Logic

class Access {
	Logic ref = null;
	void userInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your password: ");
		ref = new Logic();
		ref.checkCondition(sc.next());
	}
} // end of Access

public class DoWhileExample {
	public static void main(String[] args) {
		String choice = "no";
		Scanner sc = new Scanner(System.in);
		
		do {
			Access ref = new Access();
			ref.userInput();
			System.out.println("Wish to continue:");
			choice = sc.next();
		} while (!choice.equals("no"));
	}

}

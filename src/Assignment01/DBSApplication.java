package Assignment01;

import java.util.Scanner;
			
public class DBSApplication {
	
	static boolean isOver = false;
	static String choice = "no";
	static boolean madeChoice = false;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
			
		printWelcome();
				
		do {
			UserInput userInput = new UserInput();
			userInput.userInput();
			
			if (!isOver) {
				wishToContinue();
			}

		} while (!choice.equals("no"));
		
		printEnd();
	}
	
	public static void wishToContinue(){
		do {
			System.out.print("Wish to Continue (yes/no) : ");
			String input = sc.next();
			if (InputCheck.isYesOrNo(input)) {
				choice = input;
				madeChoice = true;
			} else {
				System.err.println("\nOnly yes or no is acceptable.\n");
			}

		} while (madeChoice == false);
	}
	
	public static void printWelcome(){
		System.out.println("Welcome to DBS Bank");
		System.out.println("===================");
	}
	
	public static void printEnd(){
		System.out.println("\n***** END ******");
	}
		
}



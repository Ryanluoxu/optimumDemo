package Database;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);
	public static String choice;
	public static boolean isContinue = true;
	
	public static void main(String[] args) throws SQLException {

		while (isContinue) {
			showMenu();
			makeChoice();
			
			Controller myController = new Controller();
			myController.controlLogic(choice);
			
			continueOrNot();
		}
	}
	
	public static void showMenu(){
		System.out.println("1. Show table");
		System.out.println("2. Add employee");
		System.out.println("3. Update existing employee");
		System.out.println("4. Delete existing employee");
	}
	
	public static void makeChoice(){
		System.out.print("Enter your choice : ");
		choice = scanner.next();
	}
	
	public static void continueOrNot(){
		System.out.print("Continue? (1 for continue): ");
		String temp = scanner.next();
		if (!temp.equals("1")) {
			isContinue = false;
		} 
	}
}

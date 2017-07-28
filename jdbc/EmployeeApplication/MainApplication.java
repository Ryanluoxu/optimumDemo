package EmployeeApplication;

import java.util.Scanner;

import login.application.EmployeeLoginApplication;

public class MainApplication {

	public static boolean isLoginSuccessfull;
	public static int EmployeeID;
	public static boolean isContinue = true;
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
		
		welcome();
		
		EmployeeLoginApplication.employeeLogin();
		
		if (isLoginSuccessfull) {
			
			while (isContinue) {
				
				showMenu();
				
				// 1 go to controller
				BusinessLogic.logic();
				
				isContinue();
			}
			
		}
		
		seeYou();
		
	}

	private static void seeYou() {
		System.out.println("\n- Thank you. End -");		
	}

	public static void welcome(){
		System.out.println("- Welcome -");
	}
	
	public static void showMenu(){
		System.out.println("\n- Menu -");
		System.out.println("1. Show Product Table");
		System.out.println("2. Add Product");
		System.out.println("3. Edit Product");
		System.out.println("4. Delete Product");
		System.out.println("5. Calculate Age");
		System.out.println("6. Add New Employee");

	}

	private static void isContinue() {
		System.out.print("\nPress '2' to exit, other key to continue : ");
		String temp = sc.next();
		if (temp.equals("2")) {
			isContinue = false;
		}
	}

}

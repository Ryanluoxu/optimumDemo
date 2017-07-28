package login.model;

import java.util.Scanner;

import EmployeeApplication.MainApplication;

public class UserInput {
	
	public static Scanner sc = new Scanner(System.in);
	
	int inputID;
	String inputPassword;
	
	public UserInput(int inputID, String inputPassword) {
		this.inputID = inputID;
		this.inputPassword = inputPassword;
	}
	public int getInputID() {
		return inputID;
	}
	public String getInputPassword() {
		return inputPassword;
	}

	public static UserInput userInput(){
		
		try {
			System.out.print("Enter ID : ");
			int id = sc.nextInt();
			MainApplication.EmployeeID = id;
			
			System.out.print("Enter password : ");
			String password = sc.next();
			
			UserInput userInput = new UserInput(id, password);
			
			return userInput;
			
		} catch (Exception e) {
			UserInput userInput = new UserInput(0, null);
			return userInput;
		}
		
		
	}

}

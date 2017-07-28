package Assignment01;

import java.util.Scanner;

public class UserInput{
	
	void userInput(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter ID and Password : ");
		String userID = sc.next();
		String userPwd = sc.next();
		
		LoginAuthentication.validateUser(userID, userPwd);
		
	}
}
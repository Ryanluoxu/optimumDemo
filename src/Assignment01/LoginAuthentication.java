package Assignment01;

public class LoginAuthentication{
	static void validateUser(String userID, String userPwd){
		
		if (userID.equals("ryan") && userPwd.equals("111")) {
			System.out.println("\nWelcome " + userID + "!");
			DBS theUser = new DBS();
			theUser.machine();
			
		} else {
			System.out.println();
			System.err.println("Sorry, Unauthorized customer.\n");
		}
	}
}
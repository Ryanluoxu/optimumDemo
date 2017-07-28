package Day02;

class Facebook {
	int userID;
	String password;
	
	void access (int ID, String password) {		
		userID = ID;
		this.password = password; // 'this.' is used when names of variable are same.	
	}
	
	void display () {
		System.out.println(userID + " " + password);
	}
	
	void showError () {
		System.err.println("You are not an authorized user.");
	}
	
	void logic(){
		if(userID == 1001 && password.equals("admin")) { // '==' only for primitive data type.
			display();
		} else {
			showError();
		}
	}
}

public class Example03 {
	
	public static void main(String[] args) {
		Facebook user1 = new Facebook();
		user1.access(1001, "aadmin");
		user1.logic();
	}
}

package Day02;

class User {
	void showUser1(int number){
		System.out.println(number);
	}
	
	String showUser2(){
		return "user2";
	}
	
	String showUser3(){
		return 1234 + " " + "user3";
	}
	
	int showUser4(int userID){
		return userID;				// in return type, 'println' is not a good practice.
	} 
	
	double showUser5(float salary){
		return salary;
	}
	
	String showUser6(int age, String name, float salary){
		return age + " " + name + " " + salary;
	}
	
}

public class Example04 {
	
	public static void main(String[] args) {
		User theUser = new User();
		theUser.showUser1(100);
		System.out.println(theUser.showUser4(200));
	}

}

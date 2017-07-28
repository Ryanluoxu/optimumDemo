package Assignment01;

public class InputCheck {
	
	static boolean isPositiveNumber(double number){
		if (number > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	static boolean isYesOrNo(String input){
		String temp = input.toLowerCase();
		if (temp.equals("yes")||temp.equals("no")) {
			return true;
		} else {
			return false;
		}
	}
	
	static boolean isOneTwoOrThree(String input){
		if (input.equals("1")||input.equals("2")||input.equals("3")) {
			return true;
		} else {
			return false;
		}
	}

}

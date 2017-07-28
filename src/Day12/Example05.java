package Day12;

class ValidateAge extends Exception{
	
	public static void validateUserAge(){
		
		int age = 16;
		
		if (age < 18) {
			
			try {
				throw new ValidateAge();
				
				// throw is a user defined exception
				// the purpose is for those exception we need to handle manually
				// once writing throw, we point to a memory location.
				
				// if writing throw inside class that must extends Exception 
				// so that we can point to a reference.
				
			} catch (ValidateAge e) { // handling exception
				System.out.println("Age cant be less than 18.");
			}
			
		} else {
			System.out.println("Welcome..");
		}
	}
}

public class Example05 {
	
	public static void main(String[] args) {
		ValidateAge.validateUserAge();
	}
}


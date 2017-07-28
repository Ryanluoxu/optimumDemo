package Day07;

// Parent only has parameterized constructor
// Child must call parent's constructor

class Laptop{
	
	String str = "old data";
	
	Laptop(String str) {
		System.out.println(str);
	}
}

class HP extends Laptop{

	HP(String str) {
		super(str);		// call parent class constructor
		System.out.println(str + " " + 1234);
	}
	
}

public class Ex08 {
	public static void main(String[] args) {
		
		new HP("new Data");
		
	}

}

package Day08;

// How to create an abstract class
abstract class Vehicle{	// Use 'abstract' as keyword to create class 
	
	// Abstract class can contain concrete method
	void display(){
		// Method with a body
	}
	
	// Main purpose of abstract class is to declare an abstract method
	abstract void gear();	// abstract method ends with ;, not method body
	
	abstract void shoBreak();
}

class Car extends Vehicle{	// class Car has to implement abstract method in parent class.

	@Override
	void gear() {
		
	}

	@Override
	void shoBreak() {
		
	}
	
}

public class AbstractClassEx01 {

	public static void main(String[] args) {
		
	}

}

package Day08;

// interface is a fully abstract class

// how to create an interface
interface Bank{ // use 'interface' keyword to create an interface
	
	// all the methods are by default 'public' and 'abstract'
	void showCustomer();
	
	// if you want to declare a variable, then it must be final
	// final means 'constant', you can't change the value
	int bankCode = 102030;
}

abstract class OtherCustomer implements Bank{  
	// No need to implement the methods of interface
}

class Customer implements Bank{

	// use 'implements' keyword to connect to interface
	// Normal class have to implement all the methods in interface
	
	@Override
	public void showCustomer() {
		
	} 
	
}

public class InterfaceEx01 {

	public static void main(String[] args) {

	}

}

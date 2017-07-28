package Day07;

class Car{
	
	Car() {
		System.out.println("Default constructor..");
	}
	
}

class Honda extends Car{ 
	
	// there is no concept called constructor override
	
	Honda() {
		System.out.println("Honda default constructor..");
	}
	
}

public class Ex07 {
	public static void main(String[] args) {
		
		new Honda();	// if parent has a default constructor, child will get it.
		
		// output: 	Default constructor..
		// 			Honda default constructor..
	}
}



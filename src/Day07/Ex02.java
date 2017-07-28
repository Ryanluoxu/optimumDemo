package Day07;

class Country{	// parent / super / base class
		
	void show1(){
		System.out.println("Country ==> show1");
	}
	
	static void show2(){
		System.out.println("Country ==> show2");
	}
}

class Singapore extends Country{	// child / sub / derived class
	void show1(){
		System.out.println("Singapore ==> show1");
	}
	
	static void show2(){
		System.out.println("Singapore ==> show2");
	}
}

public class Ex02 {

	public static void main(String[] args) {
		
		// create object of Singapore and refer to its parent class
		
		Country refCountry = new Singapore();	// upcasting
		Singapore ref = new Singapore(); // strong reference
		
		refCountry.show1();
		refCountry.show2(); // if parent has static method, child cannot override it.
		
	}

}

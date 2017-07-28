package Day02;

public class Example01 {
	
	int var1 = 20;			// non-static variable
	static int var2 = 30;	// static variable
	
	public static void main(String[] args) { // class loader needs to find "public static void main"
//		System.out.println(var1); // static can't access non-static data member. 
		System.out.println(var2);
		
		// create a object
		Example01 ref = new Example01(); // "new" is a keyword to create an object.
//		System.out.println(ref.var1);
		
		
		
	}
	
	

}

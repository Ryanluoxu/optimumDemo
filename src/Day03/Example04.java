package Day03;

public class Example04 {
	
	int var1 = 10;
	long var2 = var1; // implicit casting done by JVM
	
	long var3 = 200;
	int var4 = (int) var3; // explicit casting done by programmer
	
	// both implicit and explicit casting are only for primitive data type
	// up casting and down casting: for non-primitive data or [class].
	
	String str1 = "java";	// String is a sub class
	Object obj1 = str1;		// up casting done by JVM
	
	Object obj2 = "optimum";		// Object is a parent class
	String str2 = (String) obj2; 	// down casting done by programmer
	
	// Auto boxing and Un boxing
	
	int iVariable = 500;
	Integer iReference = iVariable;	// Auto boxing done by JVM
	
	Double dReference = 40.50;
	double dVariable = dReference; // Un boxing done by JVM
	
	
	// casting means conversion. Convert int to long, String to Object, int to Integer.... 
	
	public static void main(String[] args) {
		
	}

}

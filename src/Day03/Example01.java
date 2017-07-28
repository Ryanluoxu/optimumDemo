package Day03;

public class Example01 {

	public static void main(String[] args) {
		main("Hello.");
	}
	
	public static void main(String args) {
		main(100,"xyz");
	}
	
	public static String main(String args, int number) {
		return args + " " + number;
	}
	
	public static void main(int number, String str) {
		main("abc", 200);
	}
	
	// Not output. Since no "println"

}

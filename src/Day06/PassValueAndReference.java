package Day06;

public class PassValueAndReference {
	
	public static void main(String[] args) {
		
		// Pass by value
		int a = 10;
		int b = 20;
		System.out.println("Before swap, a = " + a + " , b = " + b);
		swap(a, b); // value of 10 and 20 are passed, not a and b themselves
		System.out.println("After swap, a = " + a + " , b = " + b);
		
	}
	
	public static void swap (int a, int b){
		int temp = a;
		a = b;
		b = temp;
//		System.out.println("Within swap, a = " + a + " , b = " + b);
	}

}

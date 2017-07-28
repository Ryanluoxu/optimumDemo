package Day12;

import java.util.Scanner;

// throw ( user defined exception )
// the main purpose is to point to some memory location

class DivideByZeroException extends ArithmeticException{
	static void myMethod(){
		System.out.println("Enter a divisor: ");
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		
		if (value == 0){
			try {
				throw new DivideByZeroException();
			} 
			// create a object. and point to the memory location.
			
			catch (DivideByZeroException e) {
				System.out.println("Divisor can't be 0");
			}
			// handle it if it's an Exception.
		}
		else {
			System.out.println(10/value);
		}
	}
}

public class Example04 {

	public static void main(String[] args) {
		DivideByZeroException.myMethod();
	}

}

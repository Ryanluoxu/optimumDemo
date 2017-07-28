package demo;

import java.io.PrintStream;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello. It is my first program.");
		
		
		PrintStream ps = System.out; // point to somewhere in memory
		
		ps.println("Hello!");
		

	}
	
	

}

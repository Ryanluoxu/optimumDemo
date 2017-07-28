package Test;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		String S = "ABC";
		
		System.out.println(S.charAt(0));
		System.out.println(S.charAt(1));
		
		String temp = new StringBuilder().append(S.charAt(0)).append(S.charAt(1)).toString();
		
		StringBuilder myName = new StringBuilder(S);
		myName.setCharAt(1, 'A');

		
		boolean t = false;
		System.out.println(t);
		

		try {
			make();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

//		
//		if (temp.equals("AB")) {
//			S.replace(S.charAt(j), 'A')
//		}
		
	}
	
	private String changeString(String S) {
	    return S + " World";
	}
	
	static void make() throws Exception{
		return;
		
	}

}



class Parent{
	String name;

	public Parent(String name) {
		this.name = name;
	}
	
}


class Child extends Parent {

	public Child(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
}

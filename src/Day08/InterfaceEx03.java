package Day08;

interface Country{
	int countryCode = 2020; // Final and static. So we can call it.
}

interface MyInterface1{
	void myMethod1();
}

interface MyInterface2{
	void myMethod2();
}

class MyClass implements MyInterface1{

	@Override
	public void myMethod1() {
		System.out.println("My method 1.");
	}
	
	// MyInterface2 refMyInterface2 = new MyInterface2();	// Not Possible

	MyInterface2 refMyInterface2 = new MyInterface2() {
		
		@Override
		public void myMethod2() {
			System.out.println("My method 2.");
		}
	};
}

public class InterfaceEx03 {
	public static void main(String[] args) {
		System.out.println(Country.countryCode);
		
		MyClass ref = new MyClass();
		ref.myMethod1();
		ref.refMyInterface2.myMethod2(); // use anonymous class to access other interface method
		
	}

}

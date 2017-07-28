package Day08;

abstract class A{
	abstract void showA();
}

interface B{
	void showB();
}

interface C extends B{ 	// interface can extends other interface
	
}

interface D{
	void showD();
}

class MyClass1 extends A implements C,D {	// multiple implements of interface

	@Override
	public void showB() {
		
	}

	@Override
	public void showD() {
		
	}

	@Override
	void showA() {
		
	}

}

public class InterfaceEx2 {

	public static void main(String[] args) {
	}

}

package Day06;

class A {	// A has B.
	private B refB;	// refB is a reference of class B.
	
	// we don't create object in other class.
	// if for "int ref", ref is variable. Class type is a reference.
//	A(B refB){	// use constructor 
//		this.refB = refB;	// assign to global variable
//	}
	// if we don't have constructor, when execute access(), 'no pointer exception'
	// constructor is solution 1.

	
	public void setRefB(B refB){ 		// set() is solution 2.
		this.refB = refB;
	}
	
	void access(){
		refB.show();
	}
}

class B {
	void show(){
		System.out.println("I am in show..");
	}
}

public class Example03 {

	public static void main(String[] args) {
		
		B refB = new B();
//		A refA = new A(refB);   // Not a good practice
		A refA = new A();
		
		refA.setRefB(refB);
		refA.access();
	}

}

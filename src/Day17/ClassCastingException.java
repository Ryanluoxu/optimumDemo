package Day17;

class A{					// A is parent
	void show(){}			
}

class B extends A{			// B is child
	void show(){}
}

public class ClassCastingException {
	public static void main(String[] args) {
		
		B refB = (B) new A();	// have to add (B) to cast
		
		refB.show();		// no compile error
							// but: ClassCastingException
		
	}
}

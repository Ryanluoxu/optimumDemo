package Day12;

class A{
	void showA(){}
}

public class Example03 {

	public static void main(String[] args) {
		
		try {
			A ref = null;
			ref.showA();	// This will get NullPointerException.
		} 
		
		catch (NullPointerException e) {	// subclass of Exception
			System.out.println("Null pointer.");
		}
		
		catch (Exception e) {	// superclass
		}
	}

}

package Day02;

class Admin {
	String name = "James";
	int i = 100;

	@Override
	public String toString() {
		return name;
	}	
	
}

public class Example06 {

	public static void main(String[] args) {
		
		Admin ref = new Admin();
		System.out.println(ref); // by defaul, 'ref' becomes 'ref.toString'.
		
	}
	
}

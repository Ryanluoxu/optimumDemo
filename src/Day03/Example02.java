package Day03;

class Mobile {
	public void feature (String brand) {
		feature("4g",350.50F);
		System.out.println(brand);
	}
	
	public void feature (String wifi, float price) {
		feature(20909093);
		System.out.println(wifi + " " + price);
	}
	
	public void feature (int mobilenumber) {
		System.out.println(mobilenumber);
	}
	
	private int number;
	

}

public class Example02 {

	public static void main(String[] args) {
		Mobile ref = new Mobile();
		ref.feature("Singtel");
	}

}

// 20909093
// 4g 350.5
// Singtel
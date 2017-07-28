package Day11;

interface Car{
	void showGrear();
}

class Honda implements Car{
	@Override
	public void showGrear() {
		System.out.println("Car --> Honda");
	}
}
class BMW implements Car{
	@Override
	public void showGrear() {
		System.out.println("Car --> BMW");
	}
}
class Mercedes implements Car{
	@Override
	public void showGrear() {
		System.out.println("Car --> Mercedes");
	}
}

public class ArrayExample03 {

	public static void main(String[] args) {
		
		// Array of interface
		Car myCars[] = new Car[3];
		
		myCars[0] = new Honda();
		myCars[1] = new BMW();
		myCars[2] = new Mercedes();
		
		// Show array
		for (Car car : myCars) {
			car.showGrear();
		}
	}

}

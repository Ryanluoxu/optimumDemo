package Day13;

class TemperatureException extends Exception {	
}
class TooColdException extends TemperatureException {
}
class TooHotException extends TemperatureException {
}
class UnusualTasteException extends Exception {	
}

class VirtualPerson{
	
	private static final int tooCold = 65;
	private static final int tooHot = 85;
	
	public static void drinkCoffee(CoffeeCup cup) throws TooColdException, TooHotException{
		
		int temperature = cup.getTemperature();
		
		if (temperature <= tooCold) {
			throw new TooColdException();
		} 
		else if (temperature >= tooHot) {
			throw new TooHotException();
		}
	}
}

class CoffeeCup{
	
	private int temperature = 75;

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	
}

class Virtualcafe{
	public static void serveCustormer(VirtualPerson person, CoffeeCup cup){
		
		try {
			person.drinkCoffee(cup);
			System.out.println("Coffee is just right..");
			
		} catch (TooColdException e) {
			System.out.println("Coffee is too cold..");
			
		} catch (TooHotException e) {
			System.out.println("Coffee is too cold..");
		}
	}
}

public class MyApplication {

	public static void main(String[] args) {
		
		int temperature = 0;
		
		if(args.length > 0){
			try {
				temperature = Integer.parseInt(args[0]);
				
			} catch (NumberFormatException e) {
				System.out.println("Must enter integer as firtst argument.");
				return;
			}
		}
		else {
			System.out.println("Must enter temperature as first argument.");
			return;
		}
		
		// create a new coffee cup and set the temperature of its coffee
		CoffeeCup cup = new CoffeeCup();
		cup.setTemperature(temperature);
		
		// create and serve a virtual customer.
		VirtualPerson cust = new VirtualPerson();
		Virtualcafe.serveCustormer(cust, cup);

	}

}

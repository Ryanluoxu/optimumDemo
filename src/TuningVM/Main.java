package TuningVM;

import java.util.ArrayList;

class Customer{													
	private String name;

	public Customer(String name) {								// Customer class with variable name
		this.name = name;
	}
}


public class Main {

	public static void main(String[] args) {

		ArrayList<Customer> customers = new ArrayList<>();		// create a list for customer called "customers"
		
		while (true) {
			Customer c = new Customer("Java");					// keep creating customer called "Java"
			customers.add(c);									// add into our list
			
			if(customers.size() >= 100) {						
				for (int i = 0; i < 10; i++) {					
					customers.remove(0);						// once record > 100, remove first 10 customers.
				}
			}
		}
		
	}

}

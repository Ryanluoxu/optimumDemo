package Day12;

class Customer{
	private String name;
	private double balance;
	
	public Customer(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}
	public double getBalance() {
		return balance;
	}
}

public class Exercise extends Exception {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer("abc", 1000);
		Customer customer2 = new Customer("xyz", 100);
		Customer customer3 = new Customer("jame", 300);

		Customer ref[]={customer1,customer2,customer3};
				
		for (int i = 0; i < ref.length; i++) {
			if (ref[i].getBalance() < 500) {
				
				// Throw =========================
				try {
					throw new Exercise();
				} 
				
				catch (Exercise e) {
					System.out.println("Balance of " + ref[i].getName() + " is less than 500.");
				}
				// ================================
								
				System.err.println("Balance of " + ref[i].getName() + " is less than 500.");
				
				
			} else {
				System.out.println("Balance of " + ref[i].getName() + "is OK.");
			}
		}

	}

}

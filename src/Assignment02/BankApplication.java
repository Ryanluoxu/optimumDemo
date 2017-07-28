package Assignment02;

public class BankApplication {

	public static void main(String[] args) {
			
		Address theAddress = new Address("Bedok");
		Customer theCustomer = new Customer(theAddress);
		Bank theBank = new Bank(theCustomer);

		System.out.println(theBank);
	}
}
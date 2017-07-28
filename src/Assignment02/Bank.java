package Assignment02;

public class Bank {
	private Customer theCustomer;

	public Bank(Customer theCustomer) {
		super();
		this.theCustomer = theCustomer;
	}
	
	@Override
	public String toString() {
		return theCustomer.toString();
	}

}

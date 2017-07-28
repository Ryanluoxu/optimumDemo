package Assignment02;

public class Customer {
	private Address theAddress;

	public Customer(Address theAddress) {
		super();
		this.theAddress = theAddress;
	}
	
	@Override
	public String toString() {
		return theAddress.toString();
	}
	
}

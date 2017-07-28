package Assignment02;

public class Address {
	private String theAddress;

	public Address(String theAddress) {
		super();
		this.theAddress = theAddress;
	}

	@Override
	public String toString() {
		return theAddress;
	}
}

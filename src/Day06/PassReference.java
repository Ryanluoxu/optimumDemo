package Day06;

import java.awt.print.Printable;

public class PassReference {

	public static void main(String[] args) {
		FlightDetails originalData = new FlightDetails("U.A.", "31A");
		System.out.println("Orignial data: " + originalData);
		
		changeSeatNumber(originalData);
		System.out.println("After change seat: " + originalData);

		changeFlightDetails(originalData);
		System.out.println("After change flight: " + originalData);

	}
	
	public static void changeSeatNumber(FlightDetails copyOfReference){
		copyOfReference.changeSeatNumber("42B");	// Pass reference, 
	}
	
	public static void changeFlightDetails(FlightDetails copyOfReference2){
		copyOfReference2.changeSeatNumber("52A");
		System.out.println(copyOfReference2);
		copyOfReference2 = new FlightDetails("Virgin", "8D");
		System.out.println(copyOfReference2);
	}

}

class FlightDetails{
	private String name;
	private String seatNumber;
	
	public FlightDetails(String name, String seatNumber) {
		this.name = name;
		this.seatNumber = seatNumber;
	}
	
	public void changeSeatNumber(String seatNumber){
		this.seatNumber = seatNumber;
	}
	
	@Override
	public String toString() {
		return "Flight details: name = " + name + " , seat number = " + seatNumber;
	}
	
}

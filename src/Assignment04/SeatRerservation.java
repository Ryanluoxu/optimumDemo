package Assignment04;

public class SeatRerservation {

	public static void main(String[] args) {

		Reservation reserve = new Reservation();					
		Customer customer1 = new Customer(reserve, 2, "Teo");			// Create threads
		Customer customer2 = new Customer(reserve, 3, "Agnes");
		Customer customer3 = new Customer(reserve, 4, "Danny");
		Customer customer4 = new Customer(reserve, 5, "Charles");
		Customer customer5 = new Customer(reserve, 1, "Paul");
		Customer customer6 = new Customer(reserve, 2, "Hannah");
		
		customer1.start();					// Start the thread
		customer2.start();					
		customer3.start();
		customer4.start();
		customer5.start();
		customer6.start();
	}
}

class Reservation{														// executive class.
																		// includes available seat number
	static int numberOfSeatAvailable = 7;								// sync method 'reserveSeat' 
	
	synchronized void reserveSeat(int numberOfSeatRequested){			// 'synchronized' key word makes threads which starts at the
																		// same time but invoke one by one.
		
		System.out.println(Thread.currentThread().getName() + " enter and close the door.");
		System.out.println("Number of available seats : " + numberOfSeatAvailable + " .");
		System.out.println("Number of seats requested : " + numberOfSeatRequested + " .");
		
		if (numberOfSeatAvailable >= numberOfSeatRequested) {

			System.out.println(numberOfSeatRequested + " seats are reserved for " + Thread.currentThread().getName());
			numberOfSeatAvailable -= numberOfSeatRequested;
			
		} else {
			System.out.println("Not enough seats for your request.");
			
		}
		
		System.out.println(Thread.currentThread().getName() + " open the door and leave.");
		System.out.println("--------------------------------");
	}
}

class Customer extends Thread{
	
	Reservation reserve;
	int numberOfSeatRequested;

	public Customer(Reservation reserve, int numberOfSeatRequested, String name) {
		super.setName(name);
		this.reserve = reserve;
		this.numberOfSeatRequested = numberOfSeatRequested;
	}

	@Override
	public void run(){
		reserve.reserveSeat(numberOfSeatRequested);
	}
	
}




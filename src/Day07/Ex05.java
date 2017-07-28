package Day07;

class Driver {
	
	Driver refDriver;
	Driver showDriver(Driver d){	// method returns to its class level
		refDriver = new Driver();
		return refDriver;
	}
}

class MySQL extends Driver {
	MySQL refMySQL;
	
	// covariant return type [ after Java 1.5 feature ]
	// return type can be changed in its class level

	@Override
	MySQL showDriver(Driver d) {
		// TODO Auto-generated method stub
		MySQL refMySQL = new MySQL();
		return refMySQL;
	} 
	
}

public class Ex05 {

	public static void main(String[] args) {
	}

}

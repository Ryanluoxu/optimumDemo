package Day08;

abstract class Oracle{
	abstract void myDriverOracle();
}

abstract class MicroSoft{
	abstract void myDriverMicroSoft();
}

class OracleDriver extends Oracle{

	@Override
	void myDriverOracle() {
		
	}
}

class Driver extends MicroSoft{

	@Override
	void myDriverMicroSoft() {
		
	}
	
	// how to implement myDriverOracle() from Oracle..

//	// use 'private' to create an inner class so that we can implement that method
//	private class OracleDriver extends Oracle{
//
//		@Override
//		void myDriverOracle() {
//
//		}
//	}
//	
//	// use a method to call method since it's private
//	public void showOracleDriver(){
//		OracleDriver ref = new OracleDriver();
//	}
	
	// Solution 2
	Oracle oRef = new Oracle() {	// Anonymous inner class
		
		@Override
		void myDriverOracle() {
			
		}
	};
	
	Oracle oRef2 = new Oracle() {
		
		@Override
		void myDriverOracle() {
			
		}
	};
	
}

public class AbstractClassEx3 {

	public static void main(String[] args) {
		
		Driver ref = new Driver();
		ref.oRef.myDriverOracle();
		
	}

}

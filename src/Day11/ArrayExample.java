package Day11;

class UserData{
	void showData(Object ref[]){
		for (Object object : ref) {
			System.out.println(object);
		}
	}
} // -- end of UserData --

public class ArrayExample {

	public static void main(String[] args) {
		
		UserData ref = new UserData();
		
		int iVariable[] = {3,5,7,9};
		String refString[] = {"data1","data2","data3"};
		
		ref.showData(refString);
		
		// for int, change to Integer for Object
		Integer iInteger[] = {3,5,7,9};
		ref.showData(iInteger);
		
		// Here use UserData to replace of for each loop
		
		
		
//		for (String temp : refString) { // get all the records from refString.
//			System.out.println(temp);
//		}
//		
//		for (int temp : iVariable) { // get all the records from iVariable.
//			System.out.println(temp);
//		}
		
		
	}

}

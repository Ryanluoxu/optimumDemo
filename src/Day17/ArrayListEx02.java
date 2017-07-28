package Day17;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx02 {
	
	public static void main(String[] args) {
		
		List myList = new ArrayList<>();
		
		myList.add("Java");
		myList.add("Java");			// Array list allows duplicated data
		myList.add(null);
		myList.add(123);
		myList.add(null);
		myList.add("Java");
		myList.add(null);
		
		System.out.println(myList);
		
		// output: [Java, Java, null, 123, null, Java, null]
		
	}

}

package CollectionFramework;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		
		// Set mySet = new HashSet();
		Set mySet = new TreeSet();		// for sorted order
		
		mySet.add("x123");
		mySet.add("a224");
		mySet.add("b777");
		mySet.add("g312");
		mySet.add("b777");		// no duplicate elements added
		
		System.out.println(mySet);	// [a224, b777, g312, x123]

	}

}

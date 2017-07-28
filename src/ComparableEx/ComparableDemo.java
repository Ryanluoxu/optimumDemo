package ComparableEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

	public static void main(String[] args) {
		
		List myList = new ArrayList();
		
		myList.add(new Book("english", 5));
		myList.add(new Book("math", 2));
		myList.add(new Book("history", 7));
		myList.add(new Book("computer", 10));
		
		System.out.println("Unordered: " + myList);

		Collections.sort(myList);					// just compare
		System.out.println("ordered: " + myList);

	}

}

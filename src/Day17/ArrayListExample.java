package Day17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		// ArrayList myList = new ArrayList();
		List myList = new ArrayList<>(); 	
		
		// create an object of child and refer to its parent called 'up casting'
		// List<Object> myList = new ArrayList<Object>();	here is a generic concept
		
		myList.add(123);					
		myList.add("java");
		myList.add(12.54);					
		
		Person person = new Person();
		person.setName("Melvin");
		myList.add(person);
		
		System.out.println(myList);		// [123, java, 12.54, Melvin]
										// means inside have toString method

		// use iterator to show all the elements
		Iterator iterator = myList.iterator();
		
		while (iterator.hasNext()) {
			
			Object element = iterator.next();
			System.out.println(element);
			
		}
		
	}

}

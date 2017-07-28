package SortData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// use Comparator interface to sort data
// Comparator interface is known as "custom sorting order"

public class SortDataApplication {
	
	public static void main(String[] args) {
		
		List myList = new ArrayList();
		myList.add(new Person("james",45));
		myList.add(new Person("anderson",20));
		myList.add(new Person("boon",30));
		myList.add(new Person("kathy",10));
		
		// comparator interface 1st way
		Collections.sort(myList, new SortByName());		// here need to create SortByName class
		
		// Collection is interface
		// Collections is class
		
		// get data
		System.out.println("-------");
		for (Object temp : myList) {
			System.out.println(temp);
		}
		
		// Comparator interface 2nd way
		Collections.sort(myList, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getAge() - p2.getAge();
			}
		});
		
		// get data
		System.out.println("-------");
		for (Object temp : myList) {
			System.out.println(temp);
		}
		
	}

}

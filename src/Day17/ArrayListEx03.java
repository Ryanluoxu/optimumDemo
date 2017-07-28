package Day17;

import java.util.ArrayList;
import java.util.List;

class Employee{
	String name;
	
	// for No Duplicate
	// 1. Generate hashCode() and equals()..
	// allows those items we going to compare into SCP..
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	// End for No Duplicate

	public Employee(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}

public class ArrayListEx03 {

	public static void main(String[] args) {
		
		List myList = new ArrayList<>();
		
		myList.add(new Employee("james"));
		myList.add(new Employee("jasper"));
		myList.add(new Employee("james"));	
		
		// remove duplicate data
		for (int i = 0; i < myList.size(); i++) {
			for (int j = i+1; j < myList.size(); j++) {
				if (myList.get(i).equals(myList.get(j))) {
					myList.remove(j);
					j--;			// when remove one item, next item move forward
				}
			}
		}
		System.out.println(myList);
	}
}



package CollectionFramework;

import java.util.Vector;

// ArrayList is non-synchronized, so multiple threads can work at the same time
// Vector is synchronized.(thread-safe)

public class VectorDemo {

	public static void main(String[] args) {
		
		// ArrayList myList = new ArrayList();
		Vector myVector = new Vector<>();
		
		myVector.add("tv");
		myVector.add("book");
		myVector.add("pen");
		myVector.add("laptop");
		
		myVector.add(2, "car");		// push other elements down
		
		for (int i = 0; i < myVector.size(); i++) {
			System.out.println(i + ". " + myVector.get(i));
		}

	}

}

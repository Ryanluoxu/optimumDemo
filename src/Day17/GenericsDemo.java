package Day17;

// create a generic interface
// List interface in collection framework
interface Bank<T>{			// here Singapore is considered as Type<T>: Bank<T>.
	void bankInfo(T ref);	// ref is local variable of Singapore Type
}

// create a generic class
// ArrayList is an implemented class of List Interface
class DBS<T> implements Bank<T>{	// IBanking is again Type<T>

	@Override
	public void bankInfo(T ref) {	// act as an add(Object ref) method
		System.out.println(ref);
	}	
}

// Finish creating the template
// Just use it after giving a proper data type

public class GenericsDemo {

	public static void main(String[] args) {
		
		Integer integer = 12345;					// no primitive type here
		DBS<Integer> ref1 = new DBS<Integer>();
		ref1.bankInfo(integer);
		
		String string = "Java";
		DBS<String> ref2 = new DBS<String>();
		ref2.bankInfo(string);
		
		Double doubleNum = 20.45;
		DBS<Double> ref3 = new DBS<Double>();
		ref3.bankInfo(doubleNum);
		
		Person person = new Person();
		person.setName("Ryan");
		DBS<Person> ref4 = new DBS<Person>();
		ref4.bankInfo(person);
		
		// we don't use generics, we implements generics
		// Generics doesn't support primitive type.
		// Benefit: to avoid casting error. to avoid class cast Exception.
	}
}

package Day09;

class Car{
	String name;
	
	public Car(String name) {
		this.name = name;
	}
}

public class StringEx02 {

	public static void main(String[] args) {
		
		Car c1 = new Car("java");	// hashCode: 366712642
		Car c2 = new Car("java");	// hashCode: 1829164700
		
		System.out.println(c1 == c2);	// false
		System.out.println(c1.equals(c2));	// false

		// If we want to make true for 'c1.equals(c2)'
		// we need to "generate hashCode() and equals().." for class.
		// But "c1 == c2" is always false.
		
		
		Person p1 = new Person("java"); // 366712642 before generate
		Person p2 = new Person("java"); // 1829164700 before generate
		
		// After we "generate hashCode() and equals().."
		// both hashCode become "31"
		
		System.out.println(p1.equals(p2));
		// True.
		
		// So "==" check memory location
		// ".equals" check hashCode();
	}

}


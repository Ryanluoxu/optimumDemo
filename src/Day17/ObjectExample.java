package Day17;

class Person{
	String name;
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {			// convert object to a string
		return name;
	}
}

class MyClass{
	public void myMethod(Object object){	// as a generic parameter
		System.out.println(object);
	}
}

public class ObjectExample {

	public static void main(String[] args) {

		MyClass myClass = new MyClass();
		myClass.myMethod(123);
		myClass.myMethod("java");
		myClass.myMethod(12.50);
		myClass.myMethod(true);
		
		Person person = new Person();
		person.setName("Wang");
		
		myClass.myMethod(person);	// pass an object to generic method
		
		// we have to pass a parameter type

	}
}

package Day07;

class Grandfather{
	void showGrandfather(){
		System.out.println("Grandfather is hard working.");
	}
}

class Father extends Grandfather{
	void showFather(){
		System.out.println("Father is honest.");
	}
}

class MyClass extends Father{
	void showMe(){
		showFather();
		showGrandfather();
	}
}

public class Ex01 {
	
	public static void main(String[] args) {
		MyClass ref = new MyClass();
		ref.showMe();
	}

}


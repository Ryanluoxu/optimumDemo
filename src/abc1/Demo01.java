package abc1;

public class Demo01 {
	
	public void show1(){
		// show1() can be access from within the class, outside the class,
		// within the package, outside the package
	}
	
	void show2(){
		// show2() can be access from within the class, outside the class,
		// within the package only
	}

	protected void show3(){
		// show3() can be access from within the class, outside the class,
		// within the package, outside the package***
		// *** condition apply
		
		// we must extends Demo01 so that we can call show3() !!!
		// must be inheritance.
	}
	
	private void show4(){
		// show4() can be access from within the class only
		
	}
	
	void access1(){
		show1();
		show2();
		show3();
		show4();
		// all the method can be accessed.
	}
}



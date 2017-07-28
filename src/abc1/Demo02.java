package abc1;

public class Demo02 {
	
	Demo01 ref = new Demo01();
	
	void access1(){
		ref.show1();
		ref.show2();
		ref.show3();
		
//		ref.show4();
		// only show4() cannot be accessed
	}
	
}

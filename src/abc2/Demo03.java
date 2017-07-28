package abc2;

import abc1.Demo01;

public class Demo03 extends Demo01 {
	
//	Demo01 ref = new Demo01();
	
	void access1(){
		
		show1();
		show3();
		
//		ref.show2();
//		ref.show4();
		// show2() and show4() cannot be accessed
	}

}

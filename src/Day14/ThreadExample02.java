package Day14;

class MyThreadClass1 extends Thread{
	@Override
	public void run(){
		System.out.println("Thread is running from MyThreadClass..");
	}
}

public class ThreadExample02 {

	public static void main(String[] args) {

		Runnable r1 = new Runnable() {	// Anonymous class.
			
			@Override
			public void run() {
				System.out.println("Thread is running from Runnable..");
			}
		};
		
		// by passing reference of Runnable interface to Thread class..
		Thread t1 = new Thread(r1);
		t1.start();	// Output: Thread is running from Runnable..
		
		// create object and pass as a parameter to thread class..
		Thread t2 = new Thread(new MyThreadClass1());
		t2.start();	// Output: Thread is running from MyThreadClass..


	}

}

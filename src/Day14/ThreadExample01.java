package Day14;

class MyThreadClass extends Thread{	// Thread is class implements Runnable
	@Override
	public void run(){
		System.out.println("thread is running..");
	}
}

public class ThreadExample01 {

	public static void main(String[] args) {

		MyThreadClass myNewThread = new MyThreadClass();
		Thread t1 = new Thread(myNewThread);
		
		t1.start();		// thread initialization. 
//		t1.start();		// java.lang.IllegalThreadStateException
		
		// Can use start() twice ?
		// No. But we can create more threads to share the same location
		// So that we can run concurrently.
		
		Thread t2 = new Thread(myNewThread);
		Thread t3 = new Thread(myNewThread);
		// All t1-3 are pointing to same memory
		
		t2.start();
		t3.start();
		
	}

}

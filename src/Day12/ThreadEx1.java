package Day12;

class RunnableObject implements Runnable{
	
	@Override
	public void run() {
		System.out.println("I am running..");
	}
}

public class ThreadEx1 {

	public static void main(String[] args) {
		
		RunnableObject obj1 = new RunnableObject();
		// so we have obj1 which is runnable.
		
		Thread thread1 = new Thread(obj1);
		// create thread1 where obj1 can run.
		
		thread1.start();
	}
}

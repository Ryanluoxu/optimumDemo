package DesignPattern;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProducerConsumerPattern {

	public static void main(String[] args) {

		// create shared object
		BlockingQueue sharedQueue = new LinkedBlockingQueue<>();
		
		// create producer and consumer thread
		Thread producerThread = new Thread(new Producer(sharedQueue));
		Thread consumerThread = new Thread(new Consumer(sharedQueue));
		
		// start producer and consumer thread
		producerThread.start();
		consumerThread.start();
		
	}

}

class Producer implements Runnable{
	
	private final BlockingQueue sharedQueue;

	public Producer(BlockingQueue sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println("produce " + i + " product..");
				sharedQueue.put(i);
			} catch (InterruptedException e) {
				Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, e);
			}
		}
	}
}

class Consumer implements Runnable{
	
	private final BlockingQueue sharedQueue;

	public Consumer(BlockingQueue sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				System.out.println("consume " + sharedQueue.take());
			} catch (InterruptedException e) {
				Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, e);
			}
		}
		
			
		
	}
	
}

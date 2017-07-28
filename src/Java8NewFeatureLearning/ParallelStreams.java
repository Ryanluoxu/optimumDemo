package Java8NewFeatureLearning;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class ParallelStreams {
	
	public static void main(String[] args) {
		
		int max = 1000000;		
		List<String> myList = new ArrayList<>(max);	// create "myList" with max record of 1,000,000.
		
		for (int i = 0; i < max; i++) {
			
			UUID uuid = UUID.randomUUID();	// create a "uuid" randomly.
			
			myList.add(uuid.toString());	// add this "uuid" into "myList"
			
		}
		
		// Measure the time for sorting this collection
		
//		// 1. single stream  
//		
//		long t0 = System.nanoTime();					
//		
//		myList.stream().sorted().count();		// to consume some time using single stream
//				 
//		long t1 = System.nanoTime();
//		
//		long timeConsumed = t1 - t0;						// get consuming time, but it is in nanosecond.
//		
//		long timeInMilliSecond = TimeUnit.NANOSECONDS.toMillis(timeConsumed);	// change to millisecond.
//		
//		System.out.println(timeInMilliSecond + " ms");		// output:	647 ms
		
		// 2. parallel stream  
		
		long t0 = System.nanoTime();					
		
		myList.parallelStream().sorted().count();		// to consume some time using parallel stream
				 
		long t1 = System.nanoTime();
		
		long timeConsumed = t1 - t0;						// get consuming time, but it is in nanosecond.
		
		long timeInMilliSecond = TimeUnit.NANOSECONDS.toMillis(timeConsumed);	// change to millisecond.
		
		System.out.println(timeInMilliSecond + " ms");		// output:	381 ms
		
		
	}
	
	
	
	

}

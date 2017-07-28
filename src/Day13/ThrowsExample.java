package Day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GetData{
	
	static void getUserData() throws IOException{	// Check Exception: SQLException, FileNotFoundException..
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// "in" is a reference 
		// BufferedReader: a class to store data in form of an object
		// System is a pump to get "in" water
		
		System.out.println("Enter name: ");
		String name = reader.readLine();
	}
}

public class ThrowsExample {

	public static void main(String[] args) throws IOException {
		
		GetData.getUserData();	// try to avoid throw exception
								// use try-catch
		
		// throw is there for check exception
		// sometimes compiler will force us to use exception which is check exception
		// Those exception which is not forced by complier, is uncheck exception
	}

}

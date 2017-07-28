package File;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		// we have two locations: 
		// local disk -> absolute path
		// server distributer -> relative path
		
		try {
			
			// open the file that is the first command line parameter
			FileInputStream fs = new FileInputStream("C:\\Users\\Ryan.luo\\Downloads\\sample.txt"); // -> absolute path
			
//			FileInputStre.am fs = new FileInputStream("sample.txt");		// -> relative path
			
			// get the object of DataInputStream
			
			DataInputStream in = new DataInputStream(fs);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			String str;
			
			// read file line by line
			while ((str=br.readLine()) != null) {	// print the content on the console
				System.out.println(str);
			}
			
			// close the input stream
			in.close();
			
		} catch (Exception e) {
			System.out.println("File not found..");
		}
	}
}

package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {

	public static void main(String[] args) {

		SerializationDemo e = null;
		
		try {
			FileInputStream fileIn = new FileInputStream("MyFile.txt");
			ObjectInputStream objIn = new ObjectInputStream(fileIn);
			
			e = (SerializationDemo) objIn.readObject();			// down casting
			
			objIn.close();
			fileIn.close();
		} 
		catch(IOException i){
			i.printStackTrace();
			return;
		}
		
		catch (ClassNotFoundException c) {
			System.out.println("Serialization class not found.");
			c.printStackTrace();
			return;
		}
		
		System.out.println("Name: " + e.name);
		System.out.println("City: " + e.city);
		System.out.println("Mobile: " + e.mobile);
		System.out.println("Age: " + e.age);
	}
}

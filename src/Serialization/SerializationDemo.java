package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// to serialize an object means to convert its state to a byte stream
// so that the byte stream can be reverted back into a copy of the object
// Serialization is a process of converting an object into a sequence of bytes
// which can be persisted to a disk or database or can be sent through streams

// the reverse process of creating object from sequence of bytes is called deSerialization.

public class SerializationDemo implements Serializable {	// also known as Marker Interface

	String name, city;
	int mobile; 		// transient or static for not to persist (save)
	int age;
	
	public static void main(String[] args) {	// create a file called "MyFile.txt" with Serializtion
		
		SerializationDemo e = new SerializationDemo();
		e.name = "Let Li";
		e.city = "Beijing";
		e.mobile = 98746523;
		e.age = 45;
		
		try {
			FileOutputStream fileOut = new FileOutputStream("MyFile.txt");
			ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
			
			objOut.writeObject(e);
			objOut.close();
			fileOut.close();
			
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
}

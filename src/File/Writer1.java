package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Writer1 {

	public static void main(String[] args) {
		try {	
			// look for a file, if not found, create it.
			boolean newFile = false;
			
			File f = new File("abc.doc");	// look for a file
			System.out.println(f.exists());	// false (once create in line17, become true)
						
			newFile = f.createNewFile();	
			System.out.println(newFile);	// true (once create in line17, become false)
			
			System.out.println(f.exists());	// true; path:project - property - resource - location
			
			// write the file
			FileWriter fw = new FileWriter("abc.doc");
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("this is file writer");
			//bw.flush();
			bw.newLine();
			bw.write("java");
			bw.newLine();
			bw.write("2017-06-06");
			bw.close();
			
			FileReader fr = new FileReader("abc.doc");		// read the file
			BufferedReader br = new BufferedReader(fr);		// store the contents
			
			String s = null;
			while ((s=br.readLine())!=null) {
				System.out.println(s);						// print out
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

package Day12;

public class DeveloperCode {
	
	public static void myLogic(){
		
		try {	// try is for writing your logic
			System.out.println(10/0);
			
		} 
		// no statement in between try and catch
		
		catch (Exception e) {	// catch is handling the exception
			System.out.println("number can't devide by 0.");
		}
		
		finally {
			System.out.println("closing files..");
			System.out.println("closing sockets..");
			System.out.println("closing divers..");

		}
		
		// Main purpose is to prevent our data or save our data
		// without closing data, close the file
		
		// after using try and catch, the test pass.
	}

}
// Programmer or developer write this code

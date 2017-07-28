package Day04;

public class CommandLineArgumentExample {

	public static void main(String[] ryan) {
		
		// run as - run configuration, check main and set argument
		
		String temp[] = ryan;
		for (int i = 0; i < ryan.length; i++) {
			System.out.println(temp[i]);
		}
		
		System.out.println("\n*** Switch ***");
		
		for (int i = 0; i < ryan.length; i++) {
			
			System.out.println("Array index #" + i + " : ");
			
			switch (temp[i].toLowerCase().charAt(0)) {
			case 'j':
				System.out.println("Japan");
				break;
			case 'u':
				System.out.println("U.S.");
				break;
			case 's':
				System.out.println("Singapore");
				break;

			default:
				System.err.println("The country is not in our list.");
				break;
			}
		}	
	}
}


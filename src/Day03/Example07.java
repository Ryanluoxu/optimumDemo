package Day03;

import java.util.Scanner;

public class Example07 {
	public static void main(String[] args) {
		int row;
		int opt;
		String str;
		
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of row: ");
			row = sc.nextInt();
			System.out.println("What do you want to print: (1 for *; 2 for number) ");
			opt = sc.nextInt();
			
			switch (opt) {
			case 1:
				for (int i = 1; i < (row+1); i++) {
					for (int j = 1; j < (i+1); j++) {
						System.out.print("* ");
					}
					System.out.println();
				}
				break;
				
			case 2:
				for (int i = 1; i < (row+1); i++) {
					for (int j = 1; j < (i+1); j++) {
						System.out.print(j + " ");
					}
					System.out.println();
				}
				break;

			default:
				System.err.println("Only 1 or 2 is acceptable.");
				break;
			}
			
			System.out.println("press y to continue: ");
			str = sc.next().toLowerCase();
			
		} while (str.equals("y"));	
	}

}

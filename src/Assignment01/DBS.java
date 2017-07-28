package Assignment01;

import java.util.Scanner;

public class DBS {
	
	double balance = 500;
	Scanner sc = new Scanner(System.in);
	
	void machine(){
		String choice = "no";
		boolean madeChoice = false;
		boolean madeChoice1 = false;
		
		do {
			printMenu();
			
			do {
				System.out.print("\nEnter your choice ( 1, 2 or 3) : ");
				
				if (!sc.hasNextInt()) {
					System.out.println();
					System.err.println("Only 1 , 2 or 3 is acceptable.");
					sc.next();
				} else {
					madeChoice1 = true;
				}
			} while (madeChoice1 == false);
			
			int option = sc.nextInt();
			
			switch (option) {
			case 1:
				checkBalance();
				break;
			case 2:
				deposit();
				break;
			case 3:
				withdraw();
				break;
			default:
				System.err.println("Only 1, 2 or 3 is acceptable.");
				break;
			}
			
			do {
				madeChoice = false;
				System.out.print("\n   Wish to Continue (yes or no) : ");
				String temp = sc.next().toLowerCase();
				if (temp.equals("no")||temp.equals("yes")) {
					choice = temp;
					madeChoice = true;
				} else {
					System.out.println();
					System.err.print("   Only yes/no is acceptable.\n");
				}

			} while (madeChoice == false);
			
			if (choice.equals("no")) {
				System.out.println("\nThank you ! Take your card !");
				DBSApplication.isOver = true;
				DBSApplication.choice = "no";
			}
			
		} while (!choice.equals("no"));
		
	}
	
	void checkBalance(){
		System.out.println("\n   Available Balance : " + balance);
	}
	
	void deposit(){
		
		boolean enterNumber = false;
		
		do {
			System.out.print("\n   Enter Deposit Amount : ");
			
			if (!sc.hasNextDouble()) {
				System.err.println("\nOnly positive number is acceptable.");
				sc.next();
			} else {
				double depositAmount = sc.nextDouble();
				if (depositAmount <= 0) {
					System.err.println("\nOnly positive number is acceptable.");
				} else {
					balance += depositAmount;
					enterNumber = true;
				}
			}
			
		} while (enterNumber == false);
		
		System.out.println("\n   Successfull done...");
		checkBalance();
	}
	
	void withdraw(){
		
		boolean enterNumber = false;
		
		do {
			System.out.print("\n   Enter Withdraw Amount : ");
			
			if (!sc.hasNextDouble()) {  // check scanner type !!!
				System.err.println("\nOnly positive number is acceptable.");
				sc.next();
			} else {
				double withdrawAmount = sc.nextDouble();
				if (withdrawAmount <= 0) {
					System.err.println("\nOnly positive number is acceptable.");
				} else {
					if (withdrawAmount > balance) {
						System.err.println("\n      Sorry Insufficient Amount.");
					} else {
						balance -= withdrawAmount;
						System.out.println("\n   Successfull done...");
						checkBalance();
					}
					enterNumber = true;
				}
			}
			
		} while (enterNumber == false);
		
	}
	
	void printMenu(){

		System.out.println("\n   ****************");
		System.out.println("   1. Check Balance");
		System.out.println("   2. Deposit");
		System.out.println("   3. Withdraw");
		System.out.println("   ****************");
	}

}

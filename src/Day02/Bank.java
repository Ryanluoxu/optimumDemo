package Day02;

import java.util.Scanner;

public class Bank {
	// rule 1: variables must be private
	private String bankName;
	private int bankCode;
	
	// rule 2: create setter and getter methods
	public String getBankName() {
		return bankName;
	}
	public int getBankCode() {
		return bankCode;
	}
	
	public void setBank() { 	// change setter to scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter bank name and code: ");
		this.bankName = sc.nextLine();
		this.bankCode = sc.nextInt();
	}
	
}

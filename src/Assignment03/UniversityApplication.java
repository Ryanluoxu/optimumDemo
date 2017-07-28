package Assignment03;

import java.util.Scanner;

public class UniversityApplication {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please choose the university from NUS, NTU and SMU: ");
		
		University yourUni = ChooseLogic.chooseLogic(scanner.next().toUpperCase());
		
		yourUni.showUniversity();
		
	}

}

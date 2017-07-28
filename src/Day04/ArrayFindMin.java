package Day04;

import java.util.Scanner;

class StudentAge{
	
	void setAge(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int studentNumber = sc.nextInt();
		int age[] = new int [(studentNumber-1)];
		for (int i = 0; i < studentNumber; i++) {
			System.out.println("Enter the age of student #" + (i+1) + " :");
			age[i]=sc.nextInt();
		}
	}
}

public class ArrayFindMin {

	public static void main(String[] args) {
		StudentAge ref = new StudentAge();
		ref.setAge();
		System.out.println(ref);
	}

}

package Day06;

class Student{
	private String studentName;
	
	// Solution 1:
//	public Student(String studentName) {
//		this.studentName = studentName;
//	}
	
	// Solution 2:
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	@Override
	public String toString() {	// Convert object to string format
		return studentName + " " + 12345;	// returns in the form of object
	}
	
}

public class Example04 {

	public static void main(String[] args) {
//		Student theStudent = new Student("James");	// Solution 1
		
		// Solution 2
		Student theStudent = new Student();
		theStudent.setStudentName("Jamessss");
		
		System.out.println(theStudent); 	// Print reference of class
	}

}


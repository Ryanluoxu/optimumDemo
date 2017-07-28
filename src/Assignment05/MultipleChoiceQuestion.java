package Assignment05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Question {
	private String question;

	public Question(String question) {
		this.question = question;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
}

class RightAnswer {
	private String rightAnswer;

	public RightAnswer(String rightAnswer) {
		this.rightAnswer = rightAnswer;
	}

	public String getRightAnswer() {
		return rightAnswer;
	}

	public void setRightAnswer(String rightAnswer) {
		this.rightAnswer = rightAnswer;
	}
}

public class MultipleChoiceQuestion {
	
	public static Scanner scanner = new Scanner(System.in);
	public static Character yourChoice;
	public static Map<Character, String> checkingMap = new HashMap<>();
	public static int score = 0;

	public static void main(String[] args) {
		
		// set questions:
		Question q1 = new Question("1. What is the range of short data type in Java?") ;
		Question q2 = new Question("2. What is the range of byte data type in Java?") ;
		Question q3 = new Question("3. Which data type value is returned by all transcendental math functions?") ;
		Question q4 = new Question("4. An expression involving byte, int, and literal numbers is promoted to which of these?") ;
		Question q5 = new Question("5. Which of these literals can be contained in float data type variable?") ;
		
		// set right answers for Q1-Q5
		RightAnswer rAnswer1 = new RightAnswer("-32768 to 32767");
		RightAnswer rAnswer2 = new RightAnswer("-128 to 127");
		RightAnswer rAnswer3 = new RightAnswer("double");
		RightAnswer rAnswer4 = new RightAnswer("int");
		RightAnswer rAnswer5 = new RightAnswer("-3.4e+038");

		// set all answers for Q1-Q5:
		List answers1 = new ArrayList<>();
		answers1.add("-32768 to 32767");
		answers1.add("-128 to 127");
		answers1.add("-2147483648 to 2147483647");
		answers1.add("None of the mentioned");
		
		List answers2 = new ArrayList<>();
		answers2.add("-128 to 127");
		answers2.add("-32768 to 32767");
		answers2.add("-2147483648 to 2147483647");
		answers2.add("None of the mentioned");
		
		List answers3 = new ArrayList<>();
		answers3.add("double");
		answers3.add("float");
		answers3.add("int");
		answers3.add("long");
		
		List answers4 = new ArrayList<>();
		answers4.add("int");
		answers4.add("long");
		answers4.add("byte");
		answers4.add("float");
		
		List answers5 = new ArrayList<>();
		answers5.add("-3.4e+038");
		answers5.add("-1.7e+308");
		answers5.add("+1.7e+308");
		answers5.add("-3.4e+050");
				
		// start test 
		startTest(q1, answers1, rAnswer1);
		startTest(q2, answers2, rAnswer2);
		startTest(q3, answers3, rAnswer3);
		startTest(q4, answers4, rAnswer4);
		startTest(q5, answers5, rAnswer5);
		
		// show results
		System.out.println("Your score is : " + score);
		System.out.println("--- End of Test ---");
	}
	
	public static void showQuestion(Question q, List answers){
		
		// show question
		System.out.println(q.getQuestion());
		
		// show answers randomly
		List tempAnswers = answers;
		int randomNumber;
		int numberOfChoice = 4;
		char option = 'A';
		
		for (int i = 0; i < 4; i++) {
			randomNumber = (int)(Math.random()*numberOfChoice);
			System.out.println("   " + option + ". " + tempAnswers.get(randomNumber));
			
			// create temperate map for checking
			checkingMap.put(option, (String) tempAnswers.get(randomNumber));
			
			tempAnswers.remove(randomNumber);
			numberOfChoice--;
			option++;
		}
	}	// end of showQuestion()
	
	public static void startTest(Question q, List answers, RightAnswer rAnswer){
		
		showQuestion(q, answers);
		
		// get answer from user
		System.out.print("Enter your choice : ");
		
		try {
			yourChoice = scanner.next().toUpperCase().charAt(0);
			
			// check answer
			String yourAnswer = checkingMap.get(yourChoice);
			
			if (yourAnswer.equals(rAnswer.getRightAnswer())) {
				System.out.println("You are right !");
				score += 2;
			} else {
				System.out.println("Wrong. Right answer : " + rAnswer.getRightAnswer());
			}
			
		} catch (Exception e) {
			System.err.println("Invalid input..");
		}
		
		System.out.println("----------------------------- \n");
	}
}

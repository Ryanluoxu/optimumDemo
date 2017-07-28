package Test;
										// make choice

public class T2 {									// View class
	public static void main(String[] args) {
		Logic theLogic = new Logic();
		theLogic.logic();
	}
}

class Logic{										// Controller class
	public void logic(){				
		Input theInput = new Input();					// -1 create object of POJO class and Input class
		Choice choice = new Choice();					
		
		theInput.makeChoice(choice);					// -2 pass POJO object to Input object for making choice
		
		System.out.println(choice.getChoice());
	}
}

class Input{										// Input class
	public static void makeChoice(Choice choice){
		choice.setChoice("2");
	}
}

class Choice{										// POJO class
	private String choice;

	public String getChoice() {
		return choice;
	}
	public void setChoice(String choice) {
		this.choice = choice;
	}
}



package Assignment03;

public class ChooseLogic {
	
	public static University chooseLogic(String choice){
		switch (choice) {
		case "NUS":
			return new NUSUni();
		
		case "NTU":
			return new NTUUni();
			
		case "SMU":
			return new SMUUni();

		default:
			return new NoData();
		}
	}

}

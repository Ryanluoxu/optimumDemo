package Java8NewFeatureLearning;

interface Formula{
	double calculate(int a);
	
	default double sqrt(int a){
		return Math.sqrt(a);
	}
	// Java 8 new feature.
}
// Formula: abstract method: calculate
// 			default method:	square root

public class ExtensionMethods {

	public static void main(String[] args) {
		
		Formula formula = new Formula() {
			
			@Override
			public double calculate(int a) {
				return sqrt(a*100);
			}
		};
		
		formula.calculate(100);
		formula.sqrt(16);
	}

}

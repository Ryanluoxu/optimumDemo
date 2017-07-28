package JavaNewFeatures;

interface MathOperation {
	int operation (int a, int b);
}

public class LambdaExample {
	public static void main(String[] args) {
			
		// must be a functional interface
		MathOperation addition = (a,b) -> a+b;
		
		LambdaExample lambda = new LambdaExample();
		System.out.println(lambda.operate(10, 2, addition) );
	}
	
	int operate (int a, int b, MathOperation mathOperation){
		return mathOperation.operation(a,b);
	}
}



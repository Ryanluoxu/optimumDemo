package Test;

public class Solution {
	
	public String solution(String S){

		return "0";
	}
	
	
	
	public StringBuilder rule1(String S){
		
		StringBuilder newS = new StringBuilder(S);

		aa:
		for (int i = 0; i < S.length(); i++) {
			for (int j = i+1; j < S.length(); j++) {
				
				String temp = new StringBuilder().append(S.charAt(i)).append(S.charAt(j)).toString();
				
				if (temp.equals("AB")) {
					newS.setCharAt(j, 'A');
					break aa;
				}
			}
		}
		
		return newS;
	}
}



























// --- Task 1 ---
//int result = 0;
//
//for (int i = 0; i < A.length; i++) {	// i for P
//	for (int j = i+1; j < A.length; j++) {	// j for Q
//		int temp = A[i] + A[j];
//		if (temp%2 == 0) {
//			result++;
//		}
//	}
//}
//
//return result;


//--- Task 2 ---
//int result = 1000000;
//
//for (int i = 0; i < A.length; i++) {	// i for P
//	for (int j = i+1; j < A.length; j++) {	// j for Q
//		
//		int temp = A[i] - A[j];
//		int tempResult;
//		
//		if (temp >= 0) {
//			tempResult = temp;
//		} else {
//			tempResult = temp*(-1);
//		}
//		
//		if (tempResult < result) {
//			result = tempResult;
//		}
//	}
//}
//
//return result;
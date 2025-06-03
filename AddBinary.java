package InterviewProblems;

import java.math.BigInteger;

public class AddBinary {
	
	public static void main(String[] args) {
		
		String a = "11";
		String b= "1";
		System.out.println(addBinary(a,b));
	}

	private static String addBinary(String a, String b) {
		
		/*int num1 = Integer.parseInt(b,2);
		int num2 = Integer.parseInt(b,2);
		int sum = num1+num2;
		String binarysum = Integer.toBinaryString(sum);
		return binarysum;*/
		BigInteger num1 = new BigInteger(a,2);
		BigInteger num2 = new BigInteger(b,2);
		
		BigInteger sum = num1.add(num2);
		return sum.toString(2);
		
				
	}

}

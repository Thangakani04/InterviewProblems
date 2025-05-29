package InterviewProblems;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		armstrong(153);
	}

	public static void armstrong(int num) {
		
		int digit=0;
		double  sum=0;
		int temp = num;
		while(temp >0) {
			digit = num %10;
			sum =sum + Math.pow(digit, 3);
			num = num/10;
			
		}
		
	}

}

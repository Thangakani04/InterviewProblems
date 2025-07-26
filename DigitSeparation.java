package InterviewProblems;

public class DigitSeparation {
	
	public static void main(String[] args) {
		int number =1234;
		int i=100;
		
		while(number>0) {
			int digit =number %10;
			for(int j =i;j>0;j--) {
			System.out.println(digit * j);
			}
			number = number/10;
		}
		
	}

}

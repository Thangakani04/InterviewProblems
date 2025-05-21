package InterviewProblems;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int num =10;
		
		int divisor = 0;
		
		for(int i=1;i<=num;i++) {
			if(num % i==0) {
				divisor++;
			}
		}
		if(divisor ==2) {
			System.out.println("Its prime");
		}
		else {
			System.out.println("Its not prime");
		}
	}

}

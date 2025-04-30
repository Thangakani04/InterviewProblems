package InterviewProblems;

public class Javaproblems {
	
	public static void main(String[] args) 
	{	
		
		fibonnaciSeries();
		armStrongNumber();
			
	}

	public static void armStrongNumber() {
		
		int num =153;
		double sum=0;
		int temp=num;
		while(temp>0) {
			int digit = num %10;
		sum= sum+ Math.pow(digit,3);
		temp =temp/10;
		}
		
		if(sum == num) {
			System.out.println("Its an Armstrong number");
		}
		else {
			System.out.println("Its not an Armstrong number");
		}
		
	}

	public static void fibonnaciSeries() {
		int num =10;
		int n=0;
		int n1=1;
		for(int i=0;i<num;i++) {
			int next = n+n1;
			System.out.print(next + " ");
			n=n1;
			n1=next;
		}
		
		System.out.println();
		
	}
}
			
		
		
	


	



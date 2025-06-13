package InterviewProblems;

public class FibonnaciSeries {
	
	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int sum=0;
		for(int i=2; i<=7;i++) {
			sum = a+b;
			a=b;
			b=sum;
		}
		System.out.println(sum);
	}

}

package InterviewProblems;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		reversenumber(5437);
		
	}

	 static void reversenumber(int n) {
		int rev =0;
		while(n>0) {
			
			int rem = n%10;
			rev = (rev * 10) + rem;
			n =n/10;
					
		}
		System.out.println(rev);
		
	}

}

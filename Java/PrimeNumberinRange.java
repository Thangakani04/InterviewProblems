package InterviewProblems;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberinRange {
	
	public static void main(String[] args) {
		List<Integer> output = new ArrayList<Integer>();
		
		for(int i=2;i<=50;i++) {
			if(isPrime(i)) {
				output.add(i);
			}
		}
		
		System.out.println(output);
	}

	public static boolean isPrime(int n) {
		int divisor =0;
		for(int i=1;i<=n;i++) {
			if(n%i == 0) {
				divisor++;
			}
		}
		if(divisor ==2) {
			return true;
		}
		return false;
	}

}

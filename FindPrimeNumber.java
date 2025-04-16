package InterviewProblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindPrimeNumber {
	
	public static void main(String[] args) {
		FindPrimeNumber prime = new FindPrimeNumber();
		prime.primeNumber();
	}

	public void primeNumber() {
		
		List<Integer> numbers = Arrays.asList(2,3,4,5,6,7,8,9,10);
		List<Integer> prnum = numbers.stream().filter(this::isPrime).collect(Collectors.toList());
		System.out.println(prnum);
		
	}
	public boolean isPrime(int n) {
		
		if(n<=1) {
			return false;
		}
		
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		return true;
		
	}

}

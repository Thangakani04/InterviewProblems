package InterviewProblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumbersStream {
	
	public static void main(String[] args) {
		
		PrimeNumbersStream obj = new PrimeNumbersStream();
		obj.primenumbers();
		
	}
	private void primenumbers() {
		List<Integer> input = Arrays.asList(3,4,5,2,6,7,8,9,34,23);
		List<Integer> result = input.stream().filter(num -> this.isPrime(num)).collect(Collectors.toList());
		System.out.println(result);
	}
	
	public boolean isPrime(int n) {
		int divisor =0;
		for(int i=1;i<=n;i++) {
			if(n% i==0) {
				divisor ++;
			}
		}
		if(divisor == 2) {
			return true;
		}
		return false;
	}

}

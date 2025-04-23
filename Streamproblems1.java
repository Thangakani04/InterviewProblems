package InterviewProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streamproblems1 {
	
	public static void main(String[] args) {
		groupElementsByFrequency();
		partitionEvenOdd();
		Streamproblems1 prime = new Streamproblems1();
		prime.primenumbers();
	}

	private  void primenumbers() {
		
		List<Integer> list = Arrays.asList(2,4,5,6,1,7,8,9);
		List<Integer> primeNumbers = list.stream().filter(this::isPrime).collect(Collectors.toList());
		System.out.println("Prime numbers :" + primeNumbers);
		
	}
	
	public boolean isPrime(int n) {
		
		if(n<=1) {
			return false;
		}
		
		for(int i=2; i< Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
		
	}

	public static void partitionEvenOdd() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		Map<Boolean, List<Integer>> output = list.stream().collect(Collectors.partitioningBy( n-> n%2==0));
		System.out.println("Prtition even and odd :" + output);
		
		
	}

	public static void groupElementsByFrequency() {
		
		List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
		Map<String, Long> frequency = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		Map<Long, List<String>> groupFrequency = frequency
												.entrySet().stream()
												.collect(Collectors.groupingBy(Map.Entry::getValue,Collectors.mapping(Map.Entry::getKey, Collectors.toList())));
		System.out.println("Group elements by Frequency : "+groupFrequency);
												
		
		
	}

}

package InterviewProblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamHandsons {
	
	public static void main(String[] args) {
		groupbyLen();		
		findMinMaxinList();
		sumofNumbers();
		sumofevenNumbers();
		sumofoddNumbers();
	}

	public static void sumofoddNumbers() {
		List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25);
		int sum = numbers.stream().filter(num -> num%2 !=0).mapToInt(Integer::intValue).sum();
		System.out.println("Sum of odd numbers " + sum);
		
	}

	public static void sumofevenNumbers() {
		List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25);
		int sum = numbers.stream().filter(num-> num %2 ==0).mapToInt(Integer::intValue).sum();
		System.out.println("Sum of even numbers " + sum);
	}

	public static void sumofNumbers() {
		List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25);
		int sum = numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum of all numbers " +sum);
		
	}

	public static void findMinMaxinList() {
		List<Integer> numbers = Arrays.asList(10, 25, 3, 99, 56);
		Optional<Integer> n= numbers.stream().max( (num1,num2)-> {
			return num1.compareTo(num2);
		});
		Optional<Integer> n1= numbers.stream().min( (num1,num2)-> {
			return num1.compareTo(num2);
		});
		
	System.out.println("Max :" + n.get());
	System.out.println("Min : " + n1.get());
		
	}

	public static void groupbyLen() {
		List<String> input = Arrays.asList("hi", "hello", "hey", "world");
		Map<Integer, List<String>> result = input.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(result);		
	}

}

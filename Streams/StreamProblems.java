package InterviewProblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamProblems {
	public static void main(String[] args) {
		couuntoccurenceString();
		duplicateelementsList();
		sortinglistBylength();
		convertListofStringToUppercase();
		findMinandMax();
		sumAverageofList();
		removeduplicatesfromList();
		frequencyofEachWordSentence();
	}
	
	
	public static void frequencyofEachWordSentence() {
		String sentence = "this is a test this is only a test";
		Map<String, Long> result = Arrays.stream(sentence.split(" "))
				.collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
		System.out.println("Frequency of each words in s String"+ result);
		
	}


	public static void removeduplicatesfromList() {
		List<String> items = Arrays.asList("apple", "banana", "apple", "orange");
		
		List<String> results = items.stream().distinct().collect(Collectors.toList());
		System.out.println("After removing duplicates : " + results);
						
	}


	public static void sumAverageofList() {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
		int sum = nums.stream().mapToInt(Integer::intValue).sum();
		System.out.println("sum of list : " + sum);
		double avg = nums.stream().mapToDouble(Integer::intValue).average().orElse(0.0);
		System.out.println("Average of list : " + avg);
		
	}


	public static void findMinandMax() {
		List<Integer> nums = Arrays.asList(10, 20, 30, 5, 15);
		int max = nums.stream().max(Integer::compareTo).orElseThrow();
		int min = nums.stream().min(Integer::compareTo).orElseThrow();
		
		System.out.println("Min using method reference :" + min);
		System.out.println("Max using method reference :" + max);
		
		Optional<Integer> min1 = nums.stream().min( (num1,num2) -> {
			return num1.compareTo(num2);
		});
		
		Optional<Integer> max1 =  nums.stream().max((num1,num2) -> {
			return num1.compareTo(num2);
		});
		
		System.out.println("Min : " + min1.get());
		System.out.println("Max : " + max1.get());
		
	}


	public static void convertListofStringToUppercase() {
		List<String> words = Arrays.asList("java" ,"springboot" ,"microservices");
		List<String> result = words.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
		
		List<String> result1 = words.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("List with Uppercase :" + result);
		System.out.println("List with Uppercase using method reference :" + result1);
		
	}


	public static void sortinglistBylength() {
		List<String> strings = Arrays.asList("apple" ,"banana" , "pear" ,"kiwi");
		List<String> sortedList = strings.stream().sorted(Comparator.comparing(String::length))
				.collect(Collectors.toList());
		System.out.println("Sorted List by Length : " + sortedList);
		
	}


	public static void duplicateelementsList() {
		
		List<Integer> numbers = Arrays.asList(3,2,4,3,2,1,5,6,7,6,8,9);
		Set<Integer> duplicates = numbers.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.filter(e -> e.getValue() >1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toSet());
		
		System.out.println("Duplicates elements are : " + duplicates);
		
	}


	public static void couuntoccurenceString() {
		String str = "interview";
		Map<Character, Long> result = str.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
		System.out.println("Count of each occurrence in a string : " + result);
	}

}

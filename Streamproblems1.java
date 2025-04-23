package InterviewProblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streamproblems1 {
	
	public static void main(String[] args) {
		groupElementsByFrequency();
		partitionEvenOdd();
		Streamproblems1 prime = new Streamproblems1();
		prime.primenumbers();
		sortByVowelCount();
		FlattenNestedList();
		groupAnagrams();
		JoinStrings();
		SumofNumbers();
		RemoveEmptyStrings();
		RemoveNulls();
		
	}

	public static void RemoveNulls() {
		List<String> list = Arrays.asList("java", null, "python", null, "c++");
		List<String> notNullList = list.stream().filter(Objects::nonNull).collect(Collectors.toList());
		System.out.println("Non null list " + notNullList);		
	}

	public static void RemoveEmptyStrings() {
		 List<String> list = Arrays.asList("java", "", "python", "", "c++");
		 List<String> nonEmpty = list.stream().filter(s-> !s.isEmpty()).collect(Collectors.toList());
		 System.out.println("Non empty list " + nonEmpty);
		
	}

	public static void SumofNumbers() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		int sum = numbers.stream().mapToInt(n-> n.intValue()).sum();
		int sum1 = numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum of numbers : " + sum);
		System.out.println("Sum of numbers : " + sum1);
		
	}

	public static void JoinStrings() {
		List<String> list = Arrays.asList("apple", "banana", "orange");
		String joined = String.join(",", list);
		System.out.println("String after joined with comma : " + joined);
		
	}

	public static void groupAnagrams() {
		
		List<String> words = Arrays.asList("listen", "silent", "enlist", "rat", "tar", "art", "hello");
		Map<String, List<String>> output = words.stream().collect(Collectors.groupingBy(word -> {
			char[] chars = word.toCharArray();
			Arrays.sort(chars);
			return new String(chars);
		}));
		System.out.println(output);		
	}

	public static void FlattenNestedList() {
		List<List<Integer>> nestedList = Arrays.asList(Arrays.asList(1,2),
				Arrays.asList(3,4),
				Arrays.asList(5,6));
		List<Integer> output = nestedList.stream().flatMap(n-> n.stream()).collect(Collectors.toList());
		List<Integer> output1 = nestedList.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println("Flatten nested list:" + output);
		System.out.println("Flatten nested list:" + output1);
		
		
	}

	public static void sortByVowelCount() {
		List<String> list = Arrays.asList("banana", "apple", "pear", "kiwi");
		List<String> sorted = list.stream().sorted(Comparator.comparingLong(s-> s.chars()
				.filter(c-> "aeiouAEIOU".indexOf(c) !=-1).count()))
				.collect(Collectors.toList());
		

		System.out.println("Sorted strings by vowels count" + sorted);
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

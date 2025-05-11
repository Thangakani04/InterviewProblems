package InterviewProblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee {
	String name;
	long id;
	String dept;
	Employee(String name, long id, String dept){
		this.name = name;
		this.id = id;
		this.dept = dept;
	}
	
}

public class HandsonProblems {
	
	
	
	//Find the second highest number in a list of integers.
	public static void main(String[] args) {
		
		secongHighestNumber(); 			//1
		ReturnStringwithAandLength();	//2
		groupEmployeesByDepartment();	//3
		duplicateNumbers();				//4
		groupwordByFrequency();			//5
		groupwordsByFrequency();		//6
		sortListofStrings();			//7
		sortListofStrLenAlphebetical();	//8
		
		
	}

	public static void sortListofStrLenAlphebetical() {
		//Sort a list of strings by their length and then alphabetically.
		List<String> names = Arrays.asList("Kani" ,"Alex", "Anu" ,"Swetha" ,"Nivedha" ,"Thangakani");
		List<String> sortedList = names.stream().sorted((s1,s2) -> {
			int len = Integer.compare(s1.length(), s2.length());
			if( len == 0) {
				return s1.compareTo(s2);
			}
			return len;
		}).collect(Collectors.toList());
		System.out.println("Sorted list of strings by their length and then alphabetically :"+ sortedList);
		
	}

	public static void sortListofStrings() {
		//Sort a list of strings by their length
		List<String> names = Arrays.asList("Kani" ,"Alex", "Anu" ,"Swetha" ,"Nivedha" ,"Thangakani");
		List<String> sortedList = names.stream().sorted((s1,s2) -> Integer.compare(s1.length(), s2.length()))
				.collect(Collectors.toList());
		System.out.println("Sorted list of strings by their length :"+ sortedList);
				
		
	}

	public static void groupwordsByFrequency() {
		//Given a list of words, count the frequency of each character in all the words combined.
		
		List<String> words =Arrays.asList("apple" ,"banana" ,"grape");
		String combinedString = String.join("", words);
		Map<Character,Long> output = combinedString.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(output);
		
	}

	public static void groupwordByFrequency() {
		// Given a word, count the frequency of each character in the word.
		String name = "Thangakani";
		//char[] arr = name.toCharArray();
		Map<Character,Long> output = name.chars()
				.mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("The frequency of each character in the word : " + output);
		
	}

	public static void duplicateNumbers() {
		//Find the duplicate elements in a list of integers.
		List<Integer> numbers = Arrays.asList(1,2,4,4,5,2,7,8,9,5);
		Set<Integer> duplicateNumbers = numbers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.filter(e -> e.getValue() > 1)
				.map(Map.Entry::getKey).collect(Collectors.toSet());
		System.out.println("Duplicates numbers are :" + duplicateNumbers);
		
	}

	private static void groupEmployeesByDepartment() {
		//Given a list of employees, group them by department and count how many employees are in each department.
		List<Employee> empObj = Arrays.asList(new Employee("Kani", 1, "Development"),
				new Employee("Nivi", 2, "Cloud"),
				new Employee("Moni", 3, "Testing"),
				new Employee("Alex", 5, "Cloud"),
				new Employee("Swetha", 6, "Development")
				);
		Map<String, Long> hs = empObj.stream().map(emp -> emp.dept).collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
		System.out.println("List of employees, group them by department and count : " + hs);
		
		Map<String, Long> hs1 = empObj.stream().collect(Collectors.groupingBy(emp -> emp.dept , Collectors.counting()));
		System.out.println("List of employees, group them by department and count hs1 : " + hs1);
			
		
		
	}

	public static void ReturnStringwithAandLength() {
		//Given a list of strings, return a list of strings that start with "A" and are of length 3.
		List<String> words = Arrays.asList("Anu", "Anju" ,"Ani" ,"Kani" ,"Ammu");
		List<String> output = words.stream().filter(str -> str.startsWith("A") && str.length() == 3).collect(Collectors.toList());
		System.out.println("List of strings that start with A and are of length 3 : " + output);
		
		//If case sensitive
		List<String> output1 = words.stream().filter(str -> str.toUpperCase().startsWith("A") && str.length() == 3).collect(Collectors.toList());
		System.out.println("List of strings that start with A and are of length 3 with case sensitive : " + output1);
		
	}

	public static void secongHighestNumber() {
		List<Integer> numbers = Arrays.asList(2,4,6,1,7,8,8);
		Optional<Integer> secondMax = numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println("The second highest number :" + secondMax.get());
		
	}

}

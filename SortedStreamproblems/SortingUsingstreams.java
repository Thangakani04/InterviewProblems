package InterviewProblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class SortingUsingstreams {
	
	public static void main(String[] args) {
		
		sortlistofempbySalary();
		sortIntegersInAscendingorder();
		sortIntegersInDescendingorder();
		sortListofStringsAlphabetically();
		sortStringsByLength();
		
	}
	
	public static void sortStringsByLength() {
		List<String> words = Arrays.asList("a", "abc", "ab");
		List<String> sortedString = words.stream()
				.sorted(
						Comparator.comparingInt(String::length).thenComparing((s1,s2) -> s1.compareTo(s2))
						)
				.collect(Collectors.toList());
						
		
		System.out.println(sortedString);
		
	}

	public static void sortListofStringsAlphabetically() {
		
		List<String> words = Arrays.asList("banana", "apple", "cherry");
		List<String> sortedString = words.stream()
				.sorted().collect(Collectors.toList());
		System.out.println("Sorted strings : " + sortedString);
		
	}

	public static void sortIntegersInAscendingorder() {
		List<Integer> numbers = Arrays.asList(4, 2, 9, 1, 5);
		List<Integer> sortedList = numbers.stream().map(n-> n).sorted()
				.collect(Collectors.toList());
		System.out.println(" Ascending order" +sortedList);
		
	}
	
	public static void sortIntegersInDescendingorder() {
		List<Integer> numbers = Arrays.asList(4, 2, 9, 1, 5);
		List<Integer> sortedList = numbers.stream().map(n-> n).sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(" Descending order" + sortedList);
		
	}

	public static void sortlistofempbySalary() {
		List<Employee8> employees = Arrays.asList(
			    new Employee8("Alice", 3000),
			    new Employee8("Bob", 5000),
			    new Employee8("Charlie", 4000)
			);
		List<Employee8> result = employees.stream()
				.sorted(Comparator.comparingInt(Employee8::getSalary).reversed())
				.collect(Collectors.toList());
		
		for(Employee8 emp : result) {
			System.out.println( emp.getName() + " - " + emp.getSalary());
		}
		
	}


}

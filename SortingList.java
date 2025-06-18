package InterviewProblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingList {

	public static void main(String[] args) {
		
			List<String> words = Arrays.asList("a", "abc", "ab");
			List<String> sortedString = words.stream()
					.sorted(
							Comparator.comparingInt(String::length).thenComparing((s1,s2) -> s1.compareTo(s2))
							)
					.collect(Collectors.toList());
							
			
			System.out.println(sortedString);
			
		
	}
}

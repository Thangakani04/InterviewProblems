package InterviewProblems;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicatesinStream {
	
	public static void main(String[] args) {
		
		findDuplicates();
	}

	public static void findDuplicates() {
		
		List<Integer> list =Arrays.asList(1,2,2,3,3,1,4,5,6,6);
		
		List<Integer> result = list.stream()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet()
				.stream()
				.filter(e -> e.getValue() == 1)
				.map(e -> e.getKey())
				.collect(Collectors.toList());
		System.out.println(result);
		
	}

}

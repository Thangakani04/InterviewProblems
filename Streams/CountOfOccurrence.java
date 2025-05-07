package InterviewProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfOccurrence {
	
	public static void main(String[] args) {
		
		nonDuplicate();
	}

	public static void nonDuplicate() {
		
		List<Integer> numbers = Arrays.asList(1,1,1,2,3,3,3,7,8,4,2,3,2,4,7,3,4,5,3,8);
		Map<Integer,Long> res= numbers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(res);
	}

}

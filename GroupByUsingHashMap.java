package InterviewProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupByUsingHashMap {
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("apple" ,"banana" ,"apple" , "orange" ,"apple" ,"banana");
		
		HashMap<String, Integer> result = new HashMap<String, Integer>();
		
		for(String s: words) {
		result.put(s, result.getOrDefault(s, 0)+1);
		}
		
		System.out.println(result);
	}

}

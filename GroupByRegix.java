package InterviewProblems;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByRegix {
	
	public static void main(String[] args) {
		 String input = "I am a developer! &^544 I want to become a developer...";
		 Map<String,Long> output = Arrays.stream(input.replaceAll("[^a-zA-Z ]", "")
				 .toLowerCase()
				 .split("\\s+"))
				 .collect(Collectors.groupingBy(word ->word,() -> new LinkedHashMap<String, Long>(), Collectors.counting()));
		 System.out.println(output);
		 
		 Map<String, Long> wordCount = Arrays.stream(
	                input.replaceAll("[^a-zA-Z ]", "")  // Remove special characters
	                     .toLowerCase()               // Make lowercase to group properly
	                     .split("\\s+"))              // Split by space(s)
	            .collect(Collectors.groupingBy(word -> word, LinkedHashMap::new, Collectors.counting()));
		 
		 System.out.println(wordCount);
		 
		 Map<String, Long> output1 = Arrays.stream(
					input.replaceAll("[^a-zA-Z ]", "")  // keep spaces!
					.toLowerCase()
					.split("\\s+"))
		.collect(Collectors.groupingBy(word -> word, LinkedHashMap::new, Collectors.counting()));
		 System.out.println(output1);
	}

}

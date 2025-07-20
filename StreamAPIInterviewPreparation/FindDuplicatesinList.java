package InterviewProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicatesinList {
	
	public static void main(String[] args) {
		List<Integer> input = Arrays.asList(1,1,2,3,4,0,5,5,7,8,8,8,9,9,9,9,6,10);
		
		List<Integer> output = input.stream()
				.collect(Collectors.groupingBy(Function.identity() , Collectors.counting()))
				.entrySet()
				.stream()
				.filter(ent -> ent.getValue()>1)
				.map(ent -> ent.getKey())
				.collect(Collectors.toList());
		
		System.out.println(output);
		
		String name = "Thangakani";
		Map<Character,Long> output1 = name.chars()
				.mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
		System.out.println(output1);
		
		List<String> words = Arrays.asList("apple","banana","grape","apple","banana","banana");
		String combinedWords = String.join("", words);
		
		Map<Character,Long> wordsOutput = combinedWords.chars()
				.mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
		
		System.out.println(wordsOutput);
				
	}

}

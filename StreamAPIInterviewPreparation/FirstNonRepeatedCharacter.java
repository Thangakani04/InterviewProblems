package InterviewProblems;

import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
	
	public static void main(String[] args) {
		
		String input = "stress";
		Optional<Character> output= input.chars()
				.mapToObj(cc -> (char)cc)
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new , Collectors.counting()))
				.entrySet()
				.stream()
				.filter(ent -> ent.getValue() ==1)
				.map(ent -> ent.getKey())
				.findFirst();
		
		System.out.println(output.get());
	}

}

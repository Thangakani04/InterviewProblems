package InterviewProblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsJult23 {
	
	public static void main(String[] args) {
		
		mostrepeatedElementsinArray();
		duplicateElementsinListwithCount();
		firstRepeatedCharinString();
	}

	private static void firstRepeatedCharinString() {
		String str = "Thhangakani";
		Optional<Character> ch = str.chars()
				.mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(Function.identity(),() -> new LinkedHashMap<>(),Collectors.counting()))
				.entrySet()
				.stream()
				.filter(ent -> ent.getValue()>1)
				.map(ent -> ent.getKey())
				.findAny();
		
		System.out.println(ch.get());
		
	}

	private static void duplicateElementsinListwithCount() {
		List<Integer> numbers = Arrays.asList(1,2,3,4,4,4,4,5,5,5,5,5,6,6,7,7,7);
		Map<Integer,Long> duplicates = numbers.stream()
				.collect(Collectors.groupingBy(Function.identity() ,Collectors.counting()))
				.entrySet()
				.stream()
				.filter(ent -> ent.getValue() >1)
				.collect(Collectors.toMap(ent ->ent.getKey(), ent -> ent.getValue()));
		
		System.out.println(duplicates);
		
	}

	private static void mostrepeatedElementsinArray() {
		
		Integer[] numbers = {1,2,3,4,4,4,4,5,5,5,5,5,6,6,7,7,7};
		List<Integer> numResult = Arrays.stream(numbers)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet()
				.stream()
				.filter(ent -> ent.getValue() >1)
				.map(ent -> ent.getKey())
				.collect(Collectors.toList());
		System.out.println(numResult);
		
		Optional<Integer> numResult1 = Arrays.stream(numbers)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet()
				.stream()
				.max(Comparator.comparingLong(ent -> ent.getValue()))
				.map(ent -> ent.getKey());
				
		
		System.out.println(numResult1.get());
		
		Optional<Integer> numResult2 = Arrays.stream(numbers)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet()
				.stream()
				.filter(ent -> ent.getValue() >1)
				.map(ent -> ent.getKey())
				.findFirst();
		System.out.println(numResult2.get());
				
		
	}

}

package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByMethod {
	
public static void groupElementsByFrequency() {
		
		List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
		Map<String, Long> frequency = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		Map<Long, List<String>> groupFrequency = frequency
												.entrySet().stream()
												.collect(Collectors.groupingBy(Map.Entry::getValue,Collectors.mapping(Map.Entry::getKey, Collectors.toList())));
		System.out.println("Group elements by Frequency : "+groupFrequency);												
	}

}

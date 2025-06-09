package ConsumerFunctionalInterface;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedList {
	
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple" ,"Banana" ,"Mango","Orange");
		List<String> sorted = fruits.stream().sorted((s1,s2) -> s1.compareTo(s2)).collect(Collectors.toList());

		System.out.println(sorted);
	}

}

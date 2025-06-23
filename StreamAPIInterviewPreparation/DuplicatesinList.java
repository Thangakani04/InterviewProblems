package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicatesinList {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 1, 6,7,8,9,10);
		
		Optional<Integer> result = numbers.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.filter(e -> e.getValue() == 1)
				.map(ent -> ent.getKey())
				.skip(4)
				.findFirst();
		
		System.out.println(result.get());
		
		Optional<Integer> result1 = numbers
				.stream()
				.distinct()
				.sorted((n1,n2) -> n1.compareTo(n2))
				.skip(4)
				.findFirst();
		
		System.out.println(result1.get());
	}

}

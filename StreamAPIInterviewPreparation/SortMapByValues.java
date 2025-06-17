package InterviewProblems;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValues {
	
	public static void main(String[] args) {
		Map<String, Integer> scoreMap = new HashMap<>();
		scoreMap.put("Alice", 85);
		scoreMap.put("Bob", 95);
		scoreMap.put("Charlie", 75);
		
		Map<String, Integer> result = scoreMap.entrySet().stream()
				.sorted(Comparator.comparingInt(ent -> ent.getValue()))
				.collect(Collectors.toMap(Map.Entry::getKey, ent -> ent.getValue(), (e1,e2) -> e1, () -> new LinkedHashMap()));
		
		System.out.println(result);
				
	}

}

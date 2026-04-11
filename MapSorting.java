package InterviewProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapSorting {
	
	public static void main(String[] args) {
		
		
		//treeMap
		Map<String,Integer> map = new HashMap<>();
		map.put("Banana", 8);
		map.put("Orange", 3);
		map.put("Mango", 4);
		
		Map<String, Integer> sortedMap = new TreeMap<>(map);
		System.out.println(sortedMap);
		
		//sort map by values, using List+ Comparator
		
		List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
		Collections.sort(list, (a,b) -> a.getValue().compareTo(b.getValue()));
		for(Map.Entry<String,Integer> ll : list) {
			System.out.println(ll.getKey() + " " + ll.getValue());
		}
		
		//sort map by keys, using List+ Comparator
		List<Map.Entry<String,Integer>> list1 = new ArrayList<>(map.entrySet());
		Collections.sort(list, (a,b) -> a.getKey().compareTo(b.getKey()));
		for(Map.Entry<String,Integer> ll : list) {
			System.out.println(ll.getKey() + " " + ll.getValue());
		}
	}

}

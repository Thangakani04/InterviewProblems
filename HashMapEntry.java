package InterviewProblems;

import java.util.HashMap;
import java.util.Map;

public class HashMapEntry {
	
	public static void main(String[] args) {
		
		Map<String, Integer> people = new HashMap<String, Integer>();
		people.put("Kani", 25);
		people.put("Ajay", 26);
		people.put("Nivi", 24);
		people.put("Babisha", 27);
		people.put("Kayal", 30);
		
		for(Map.Entry<String, Integer> entry : people.entrySet()) {
			System.out.println(entry.getKey() + " is" + " " +  entry.getValue() + " years old");
		}
		
	}

}

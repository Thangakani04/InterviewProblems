package InterviewProblems;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
	
	public static void main(String[] args) {
		
		characterCount();
	}

	public static void characterCount() {
		
		String str = "interview";
		Map<Character, Integer> map =  new HashMap<Character, Integer>();
		
		for(char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		System.out.println(map);
		
		
	}

}

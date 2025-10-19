package Leetcodeproblems;

import java.util.ArrayList;
import java.util.List;

public class LongestSubStringWORepeatingCharacters {
	
	public static void main(String[] args) {
		String str = "pwwkew";
	System.out.println(solution(str));
	}

	private static int solution(String str) {
		
		int start =0;
		int end =0;
		List<Character> list = new ArrayList<Character>();
		int max_len=0;
		while(end<str.length()) {
			
			if(!list.contains(str.charAt(end))) {
				list.add(str.charAt(end));
				end++;
				max_len = Math.max(max_len, list.size());
				
			}
			else {
				list.remove(Character.valueOf(str.charAt(end)));
				start++;
				
			}
		}
		return max_len;
		
		
	}

}

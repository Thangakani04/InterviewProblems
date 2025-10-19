package Leetcodeproblems;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
	
	public static void main(String[] args) {
		String str="abcdckkkkkkkknhyujmb";
		System.out.println(sol(str));
	}
	
	static int solution(String str) {
		int start=0;
		int end=0;
		int max =0;
		HashSet<Character> set = new HashSet<Character>();
		while(end<str.length()) {
			if(!set.contains(str.charAt(end))) {
				set.add(str.charAt(end));
				end++;
				int max1 = set.size();
				max = Math.max(max, max1);
			}
			else {
				set.remove(Character.valueOf(str.charAt(end)));
				start++;
				//set = new HashSet<Character>();
				
			}
			
		}
		return max;
	}
	
	static int sol(String str) {
		int max=0;
		int max1=0;
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0,j=0;i<str.length();i++) {
			while(set.contains(str.charAt(i))) {
				set.remove(str.charAt(j));
				j++;
			}
			set.add(str.charAt(i));
			max = Math.max(max, set.size());
		}
		return max;
	}
	
	static int solution1(String str) {
		 int max = 0;
	        int max1 = 0;
	        HashSet<Character> set = new HashSet<Character>();
	        for (int i=0, j=0 ; i< str.length();i++) {
	        	char c = str.charAt(i);
	        	while(set.contains(c)) {
	        		set.remove(str.charAt(j));
	        		j++;
	        	}
	        	set.add(c);
	        	max1= set.size();
	        	max = Math.max(max, max1);
	        }
			return max;
	}

}

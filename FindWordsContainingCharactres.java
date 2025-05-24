package Leetcodeproblems;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharactres {
	
	public static void main(String[] args) {
		String[]  words = {"abc","bcd","aaaa","cbc"};
		char x = 'a';
		System.out.println(containCharacter(words,x));
	}
	
	public static List<Integer> containCharacter(String[] arr, char x){
		
		List<Integer> result = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			String s= arr[i];
			for(char c : s.toCharArray()) {
				if(c == x) {
					result.add(i);
					break;
				}
			}
		}
		return result;
	}

}

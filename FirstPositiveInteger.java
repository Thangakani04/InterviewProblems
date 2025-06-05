package InterviewProblems;

import java.util.HashSet;

public class FirstPositiveInteger {
	
	public static void main(String[] args) {
		
		int[] input = {3,4,-1,1};
		
		System.out.println(firstpositivenumber(input));
		
	}

	private static int firstpositivenumber(int[] input) {
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i=0;i<input.length;i++) {
			if(input[i] > 0) {
				hs.add(input[i]);
			}
		}
		
		for(int i=1;i<=input.length;i++) {
			if(!hs.contains(input[i])) {
				return i;
			}
		}
		return -1;
		
	}

}

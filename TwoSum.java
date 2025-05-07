package InterviewProblems;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
	
	public static void main(String[] args) {
		
		int[] arr = {2,3,4,5,8};
		int target =7;
		System.out.println(Arrays.toString(twosum(arr,target)));
	}

	public static int[] twosum(int[] arr, int target) {
		
		HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
		int num = target -arr[i];
		
		if(hs.containsKey(num)) {
			return new int[] {hs.get(num),i};
		}
		hs.put(arr[i], i);
		
		}
		return new int[] {-1,-1};
	}

}

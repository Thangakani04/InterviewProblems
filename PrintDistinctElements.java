package InterviewProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PrintDistinctElements {
	
	public static void main(String[] args) {
		
		HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
		int[] arr = {4,3,2,1,2,3,5};
		
		for(int i=0;i<arr.length;i++) {
			hs.put(arr[i], hs.getOrDefault(arr[i], 0)+1);
		}
		
		//System.out.println(hs);
		ArrayList<Integer> al = new ArrayList<Integer>();
		for( int n :hs.keySet()) {
			if(hs.get(n) == 1) {
				//System.out.print(n + " ");
				al.add(n);
			}
		}
		int[] resultArr= al.stream().mapToInt( n -> n).toArray();
		System.out.println(Arrays.toString(resultArr));
		
	}

}

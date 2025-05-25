package InterviewProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PrintDuplicateElements {
	
	public static void main(String[] args) {
		int [] arr = {4,3,2,2,1,3,7,7,7,9,9,10};
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					list.add(arr[i]);
					break;
				}
			}
			
			
		}
		int[] result = new int[list.size()];
		for(int i=0;i<list.size();i++) {
			result[i] = list.get(i);
		}
		for(int n: result) {
		System.out.println(n);
		}
		
		
	}

}

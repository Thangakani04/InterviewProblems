package InterviewProblems;

import java.util.ArrayList;
import java.util.List;

public class DuplicateElementsArr {
	
	public static void main(String[] args) {
		//Find duplicate elements in array
		
		int [] arr = {1,2,1,3,4,3,5,6,7,3};
		List<Integer> result = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j] && !result.contains(arr[i])) {
					result.add(arr[i]);
					break;
				}
			}
		}
		
		int[] resArr = new int[result.size()];
		for(int i=0;i<result.size();i++) {
			resArr[i] = result.get(i);
		}
		
		for(int n : resArr) {
			System.out.println(n + " ");
		}
		
	}

}

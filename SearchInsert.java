package Leetcodeproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchInsert {
	
	public static void main(String[] args) {
		int[]arr = {1,3,5,6};
		int target =2;
		System.out.println(Search(arr,target));
	}
	
	public static int Search(int[] arr,int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		return notfound(arr,target);
	}

	public static int notfound(int[] arr, int target) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(target);
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);			
		}
		
		Collections.sort(list);
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i) == target) {
				return i;
			}
		}
		return -1;
		
	}

}

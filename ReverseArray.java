package InterviewProblems;

import java.util.Arrays;

public class ReverseArray {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int[] output = reverseArray(arr);
		System.out.println(Arrays.toString(output));
	}

	private static int[] reverseArray(int[] arr) {
		
		int start = 0; int end = arr.length-1;
		while(start < end) {
			int temp = arr[start];
			arr[start] =arr[end];
			arr[end] =temp;
			start++;
			end--;
		}
		return arr;
	}

}

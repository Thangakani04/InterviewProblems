package InterviewProblems;

import java.util.Arrays;

public class RotateArray1 {
	
	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,6,7};
		int k=4;
		System.out.println(Arrays.toString(rotateArr(arr,k)));
	}

	public static int[] rotateArr(int[] arr, int k) {
		
		int n= arr.length;
		reversearray(arr,0,n-k-1);
		reversearray(arr,n-k,n-1);
		reversearray(arr,0,n-1);
		return arr;
		
	}

	public static void reversearray(int[] arr, int start, int end) {
		
		while(start<=end) {
			int temp =arr[start];
			arr[start] =arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
	}
	
	

}
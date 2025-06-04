package InterviewProblems;

import java.util.Arrays;

public class PlusOne {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,4};
		System.out.println(Arrays.toString(plusOne(arr)));
	}

	public static int[] plusOne(int[] arr) {
		
		int n= arr.length;
		for(int i=n-1;i>=0;i--) {
			if(arr[i] < 9) {
				arr[i]++;
				return arr;
			}
			else {
				arr[i]=0;
			}
		}
		
		int[] newArray = new int[n+1];
		newArray[0] = 1;
		return newArray;
		
		
		
		
	}

}

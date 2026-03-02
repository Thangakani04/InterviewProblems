package InterviewProblems;

import java.util.Arrays;

public class MoveZeroesRight {
	
	public static void main(String[] args) {
		
		Integer[]  arr = {2,4,0,6,8,0,0,2,3};
		moveZeroesRight(arr);
	}

	private static void moveZeroesRight(Integer[] arr) {
		int p1=0;
		int p2=arr.length-1;
		while(p1<=p2) {
		if(arr[p1] ==0) {
			int temp = arr[p1];
			arr[p1] =arr[p2];
			arr[p2] = temp;
			p1++;
			p2--;
		}
		else {
			p1++;
		}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}

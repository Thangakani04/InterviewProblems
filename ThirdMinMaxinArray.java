package InterviewProblems;

public class ThirdMinMaxinArray {
	
	public static void main(String[] args) {
		int[] arr = {1,4,5,6,78,9,10};
		int max = Integer.MIN_VALUE;
		int second_max = Integer.MIN_VALUE;
		int third_max = Integer.MIN_VALUE;
		
		for( int n : arr) {
			if(n>max) {				
				third_max = second_max;
				second_max = max;
				max =n;
			}
			else if(n>second_max && n!=max) {
				
				third_max = second_max;
				second_max = n;
			}
			else if(n>third_max && n!=max && n!=second_max) {
				third_max =n;
			}
		}
		System.out.println(third_max);
		int min= Integer.MAX_VALUE;
		int second_min = Integer.MAX_VALUE;
		int third_min = Integer.MAX_VALUE;
		
		for(int n: arr) {
			if(n<min) {
				third_min = second_min;
				second_min = min;
				min = n;
			}
			else if(n<second_min && n!=min ) {
				third_min = second_min;
				second_min =n;
			}
			else if(n<third_min && n!=min && n!= second_min) {
				third_min = n;
			}
		}
		System.out.println(third_min);
	}

}

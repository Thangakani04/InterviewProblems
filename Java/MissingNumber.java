package InterviewProblems;

public class MissingNumber {
	
	public static void main(String[] args) {
		
		System.out.println("Missing number is : " + missingNumber());
	}

	public static int missingNumber() {
		
		 int[] arr = {1,2, 4, 5, 6,7,8,9};
		 int n= arr.length;
		 int totalSum =0;
		 int actualsum=0;
		 int  m= arr[n-1];
		 
		 for(int i= arr[0];i<= m;i++) {
			 totalSum = totalSum + i;
		 }
		 
		 System.out.println(" Total Sum : " + totalSum);
		 		 
		 for(int num : arr) {
			 actualsum = actualsum + num;
		 }
		 System.out.println( " Actual Sum : " + actualsum);
		 
		 return totalSum - actualsum;
		
		
	}

}

package InterviewProblems;

public class MaximumConsecutive1s {
	
	public static void main(String[] args) {
		
		
	int[] nums = {1,1,0,1,1,1};
	System.out.println(max(nums));
	
	
	}

	public static int max(int[] nums) {
		int count=0;
		int max =0;
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i] == 1) {
				count ++;
				max = Math.max(count, max);
			}
			else {
				count =0;
			}
		}
		return max;
	}

}

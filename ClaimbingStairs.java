package Leetcodeproblems;

public class ClaimbingStairs {
	
	public static void main(String[] args) {
		int n=5;
		
		System.out.println(claimbStairs(n));
	}

	public static int claimbStairs(int n) {
		
		if(n<=3) {
			return n;
		}
		int a=3;
		int b=2;
		if(n>3) {
			
			for(int i=0;i<n-3;i++) {
				
				a=a+b;
				b=a-b;
			}
		}
		return a;
	}

}

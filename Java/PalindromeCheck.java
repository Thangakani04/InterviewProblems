package InterviewProblems;

public class PalindromeCheck {
	
	public static void main(String[] args) {
		
		String str = "A man, a plan, a canal: Panama";
		boolean ans = isPalindrome(str);
		System.out.println(ans);
	}

	private static boolean isPalindrome(String str) {
		
		String str1 = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
		int left=0;
		int right = str1.length()-1;
	
		while(left<right) {
			if(str1.charAt(left) != str1.charAt(right)) {
				return false;
			}
				left++;
				right--;
		
		}
		return true;
	}

}

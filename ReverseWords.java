package InterviewProblems;

public class ReverseWords {
	
	public static void main(String[] args) {
		String str = "Java is fun";
		System.out.println(reversewords(str));
	}

	public static String reversewords(String str) {
		StringBuffer strb = new StringBuffer();
		String[] words = str.split(" ");
		int len = words.length-1;
		for(int i=len; i>=0;i--) {
			strb.append(words[i]).append(" ");
		}
		return strb.toString().trim();
	}
}

package InterviewPreparation;

public class ValidParenthesis {
	
	public static void main(String[] args) {
		
		String s = "()[]{}";
		boolean ans = validParenthesis(s);
		System.out.println(ans);
	}

	private static boolean validParenthesis(String s) {
		
			while(s.contains("()") || s.contains("{}") || s.contains("[]")) {
				s= s.replace("()", "");
				s=s.replace("[]", "");
				s=s.replace("{}", "");
			}
		
		return s.isEmpty();
	}

}

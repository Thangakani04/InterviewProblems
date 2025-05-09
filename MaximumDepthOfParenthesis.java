package InterviewProblems;

public class MaximumDepthOfParenthesis {
	
	public static void main(String[] args) {
		System.out.println(maxdepth("(((A)))"));
	}
	
	public static int maxdepth(String str) {
		int max=0; 
		int openBr=0;
		for(char c:str.toCharArray()) {
			if(c == '(') {
				openBr++;
			}
			else if(c == ')') {
				openBr--;
			}
			max = Math.max(max, openBr);
		}
		return max;
	}

}

package InterviewPreparation;

import java.util.Stack;

public class ValidParenthesisStackMethod {
	
	public static void main(String[] args) {
		
		String str = "({[]})";
		
		//valid -> ({[]})
		//invalid -> ([{]})
		
		boolean ans = validParenthesis(str);
		
		System.out.println(ans);
		
	}

	private static boolean validParenthesis(String str) {
     Stack<Character> stack = new Stack<>();
		
		for(char c :str.toCharArray()) {
			
			if(c == '(' || c=='{' || c=='[') {
				stack.push(c);
			}
			else {
				if(stack.isEmpty()) {
					return false;
				}
				
				char top = stack.pop();
				if ((c ==')' && top !='(')||
					(c=='}' && top != '{')||
					(c==']' && top !='[')) {
					return false;
				}
			}
		}
		return stack.isEmpty();
		
	}

}

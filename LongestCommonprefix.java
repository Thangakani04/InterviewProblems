package InterviewProblems;

import java.util.Arrays;
import java.util.List;

public class LongestCommonprefix {
	
	public static void main(String[] args) {
		commonprefix();
	}
	
	public static void commonprefix() {
		List<String> words =Arrays.asList("flower" ,"flow" ,"floaght");
		String result = words.stream().reduce((s1, s2) -> {
			int len = Math.min(s1.length(), s2.length());
			int i=0;
			while(i < len && s1.charAt(i) == s2.charAt(i)) {
				i++;
			}
			return s1.substring(0, i);
		}
		).orElse("");
		System.out.println(result);
			
			
		}
	}



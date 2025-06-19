package InterviewProblems;

public class RemovingWhiteSpace {

	public static void main(String[] args) {
		
		String str = " Java SpringBoot Microservices Program";
		
		System.out.println("Before removing the whitespaces : " + str);
		
		str = str.replaceAll("\\s","");  //  '\\s' ->  means whitespace - "" -> empty
		
		System.out.println("After removing the whitespaces : " + str);

	}

}

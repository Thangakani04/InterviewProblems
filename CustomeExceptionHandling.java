package InterviewProblems;

class AgeValidationException extends Exception{
	
	public AgeValidationException(String message) {
		super(message);
	}
	
}

public class CustomeExceptionHandling {
	
	public static void main(String[] args) {
		try {
			validateAge(17);
		}
		catch(AgeValidationException e) {
			System.out.println("Age validation exception caught - " + e.getMessage());
		}
		
	}
	
	public static void validateAge(int age) throws AgeValidationException{
		if(age<18) {
			throw new AgeValidationException("Age must be greater than 18");
		}
		else {
			System.out.println("valid age");
		}
	}

}

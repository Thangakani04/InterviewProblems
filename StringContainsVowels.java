package Swapping;

public class StringContainsVowels {
	
	public static void main(String[] args) {
		
		String str = "Kani";
		boolean result = containVowels(str);
		
		System.out.println(result);
	}

	public static boolean containVowels(String str) {
		return str.toLowerCase().matches(".*[aeiou]*.");
	}

}

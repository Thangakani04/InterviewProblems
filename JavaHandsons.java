package InterviewProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class JavaHandsons {
	
	public static void main(String[] args) {
		String str1= "cat";
		String str2= "tac";
		boolean flag = isAnagram(str1,str2);
		System.out.println(flag);
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.println("print :" + it.next());
		}
		
		primeNumber();
		System.out.println(containsDuplicate());
		
		
	}

	public static boolean containsDuplicate() {
		
		int[] nums = {1,2,3,4};
		
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int num : nums) {
			if(hs.contains(num)) {
				return true;
			}
			hs.add(num);
		}
		return false;
		
	}

	public static void primeNumber() {
		int num = 3;
		int count=0;
		for(int i=1;i<=Math.sqrt(num);i++) {
			if(num % i==0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println("prime number");
		}
		else {
			System.out.println("not prime number");
		}
		
	}

	public static boolean isAnagram(String str1, String str2) {
		
		int[] charCounts = new int [26];
		for(int i=0;i<str1.length();i++) {
			charCounts[str1.charAt(i) - 'a']++;
			charCounts[str2.charAt(i) - 'a']--;
			
		}
		
		for(int c : charCounts) {
			if(c != 0) {
				return false;
			}
		}
		
		return true;
	}

}

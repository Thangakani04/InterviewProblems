package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FilterProcessEvenNumber {
	
	public static void main(String[] args) {
		
		//List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);
		
		List<Integer> list = Arrays.asList(3 ,4 ,2 ,7 ,10 ,6);
		
		List<Integer> result = list.stream()
				.filter(n -> n%2 ==0)
				.map(n-> n*n)
				.sorted(Comparator.reverseOrder())
				.toList();
		
		System.out.println(result);
	}

}

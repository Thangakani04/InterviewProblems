package JavaCollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HahMapDemo {
//HashMap internal works
	public static void main(String[] args) {
		
		Map<String,Integer> hs = new HashMap<String,Integer>();
		
		hs.put("Kani", 25);
		hs.put("Nivi", 24);
		hs.put("Kayal", 34);
		hs.put("Loga", 28);
		
		for(String key : hs.keySet()) {
			System.out.print("Key = " + key+ ",");  //print means it will be printed in same line
			System.out.print("hashcode = " + Math.abs(key.hashCode()) + ",");
			System.out.print("index = " + Math.abs(key.hashCode()) % 15);
			System.out.println();  //to move to next line
		}
		
		System.out.println(hs.get("Kani"));
	}
}

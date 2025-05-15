package InterviewProblems;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Concurrentmodification {
	
	public static void main(String[] args) {
		//ArrayList<Integer> list = new ArrayList<Integer>();
		
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			Integer value = it.next();
			System.out.println("List value " + value);
			if(value.equals(20)) {
				//list.remove(value); //changing the size of the list
				it.remove(); //to avoid concurrent modification
				//iterator remove method doesnt support for copyonwritearraylist collection
			}
			
			System.out.println("After removing ");
			
			Iterator<Integer> afterModification = list.iterator();
			while(afterModification.hasNext()) {
				Integer val = afterModification.next();
				System.out.println("List value : " + val);
			}
		}
	}

}

package InterviewProblems;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		
		//Priority queue (C) ,LinkedList (C)
		//Insertion order preserved
		//Duplicates allowed
		//Queue allows only homogeneous data
		
		PriorityQueue q = new PriorityQueue();
		
		//q.add("A");
		//q.add("B");
		//q.add("C");
		//q.add("D");
		//q.offer(4);
		//q.offer(5);
		//q.offer(3);
		
		System.out.println(q);
		//get head element element() , peek()
		System.out.println(q.element());  //element() returns exception if the queue is empty
		//System.out.println(q.peek());   //peek() returns null if the queue is empty

	}

}

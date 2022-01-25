package program.java.collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueEx {
	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<>();
		
		queue.add("India");
		queue.add("Bermuda");
		queue.add("USA");
		queue.add("Chile");
		queue.add("Denmark");
		queue.add("Atlanta");
		
		System.out.println("Priority queue elements are : " + queue);
		System.out.println("head using element() : " + queue.element());
		System.out.println("head using peek() : " + queue.peek());
		System.out.println("Iterating the queue elements : ");
		
		Iterator iter = queue.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("Priority queue elements are : " + queue);
		queue.remove();
		System.out.println("head using peek() again: " + queue.peek());
		queue.poll();
		System.out.println("Priority queue elements after removing two elements are : " + queue);
		
		Iterator itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}

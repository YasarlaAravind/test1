package program.java.ds;

import java.util.ArrayList;
import java.util.List;

public class DequeProgram {
	private List<Integer> deque=new ArrayList<Integer>();
	public void insertfront(int item) {
		System.out.println("adding at front: "+item);
		deque.add(0,item);
		System.out.println(deque);
	}
	
	public void insertrear(int item) {
		System.out.println("adding at rear: "+item);
		deque.add(item);
		System.out.println(deque);
	}
	
	public void removefront() {
		if(deque.isEmpty()) {
			System.out.println("remove from front: ");
			System.out.println(deque);
			}
		int rem=deque.remove(0);
		System.out.println("remove from fromr: "+rem);
		System.out.println(deque);
	}
	
	public void removerear() {
		if(deque.isEmpty()) {
			System.out.println("Deque underflow");
			return;
		}
		int rem=deque.remove(deque.size()-1);
		System.out.println("remove from rear: "+rem);
		System.out.println(deque);
	}
	
	public int peakfront() {
		int item=deque.get(0);
		System.out.println("element at first: "+item);
		return item;
	}
	
	public int peakrear() {
		int item=deque.get(deque.size()-1);
		System.out.println("element at rear: "+item);
		return item;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DequeProgram d=new DequeProgram();
		d.insertfront(34);
		d.insertrear(45);
		d.removefront();
		d.removefront();
		d.insertfront(21);
		d.insertfront(98);
		d.insertrear(5);
		d.insertfront(43);
		d.removerear();

	}

}

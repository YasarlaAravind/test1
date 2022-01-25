package program.java.collections;

import java.util.*;

public class set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();  
		lhs.add("d");  
		lhs.add("c");  
		lhs.add("Ravi");  
		lhs.add("45");
		lhs.add("true");
		
		TreeSet<String> ts=new TreeSet<String>();  
		ts.add("India");  
		ts.add("America");  
		ts.add("Australia");  
		ts.add("New Zealand");
		ts.add("England");
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("Apple");  
		hs.add("Banana");  
		hs.add("Watermelon");  
		hs.add("Mango");
		hs.add("Kiwi");
		
		System.out.println("LinkedHashset is "+lhs);
		System.out.println("Size of LinkedHashset is "+lhs.size());
		System.out.println("Remove the LinkedHashset element "+lhs.remove("c"));
		System.out.println("Is LinkedHashset empty "+lhs.isEmpty());
		System.out.println("Is LinkedHashSet contains this 'd' element "+lhs.contains("d"));
		System.out.println("LinkedHashset is "+lhs);
		System.out.println("***************************************************");
		
		System.out.println("TreeSet is "+ts);
		System.out.println("Size of TreeSet is "+ts.size());
		System.out.println("Remove the TreeSet element "+ts.remove("Australia"));
		System.out.println("Is TreeSet empty "+ts.isEmpty());
		System.out.println("Is TreeSet contains this 'd' element "+ts.contains("d"));
		System.out.println("TreeSet is "+ts);
		System.out.println("***************************************************");
		
		System.out.println("HashSet is "+hs);
		System.out.println("Size of HashSet is "+hs.size());
		System.out.println("Remove the HashSet element "+hs.remove("Mango"));
		System.out.println("Is HashSet empty "+hs.isEmpty());
		System.out.println("Is HashSet contains this 'Kiwi' element "+hs.contains("Kiwi"));
		System.out.println("HashSet is "+hs);
		

	}

}

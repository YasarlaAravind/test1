package program.java.collections;
import java.util.*;

public class LinkedHashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> h = new LinkedHashMap<Integer,String> ();

		h.put(1,new String("Samsung"));
		h.put(2,new String("HCL"));
		h.put(3,new String("UX"));
		h.put(4,new String("Wipro"));
		h.put(5,new String("Cisco"));

		System.out.println("Contents of LinkedHAshMAp: "+ h);
		System.out.println("Values of map after iterating over it: ");

		for(Integer key:h.keySet()) {
			System.out.println(key +" \t" +h.get(key));
		}

		System.out.println("The size is " + h.size());
		System.out.println("Is Map Empty : " + h.isEmpty());
		System.out.println("Is Map contains 4 as a key : " + h.containsKey(4));
		System.out.println("Is Map contains Cisco as a value : " + h.containsValue("Cisco"));
		System.out.println("Removing with key=3 : " + h.remove(3));
		System.out.println("Contents of LinkedHAshMAp: "+ h);

		h.clear();

		System.out.println("Contents of LinkedHAshMAp after clearing Map is: "+ h);


	}

}

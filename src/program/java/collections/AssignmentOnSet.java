//create 2 objects of the set interface 
//- LinkedHasSet (L1 & L2)
//- TreeSet
//1) create two objects of LinkedHashSet and add the number from user console in random order (1 to 8)
//L1  - 1st object will be generic ( add two int, two float ,two char, one boolean)
//L2  - 2nd object will be be Integer type only and add the number from user console in random order (1 to 8)
//2) Create one object of treeset and add the any 6 programming languages in random order
//   - remove two languages
//   - add three more after removal
//   - Check if " Java" is part of your treeset or not
//   - remove all the elements from the treeset and display it

package program.java.collections;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class AssignmentOnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Object> l1;
		LinkedHashSet<Integer> l2; 
		l1 = new LinkedHashSet<Object>();
		l2 = new LinkedHashSet<Integer>();
		l1.add("8");
		l1.add("5");
		l1.add("4.6");
		l1.add("7.62");
		l1.add("true");
		System.out.println(l1);
		
		Scanner sc = new Scanner(System.in);
		for(int i=1; i<=8; i++) {
		l2.add(sc.nextInt());
		}
		System.out.println(l2);
		
		TreeSet<String> ts=new TreeSet<String>();  
		ts.add("C");  
		ts.add("C++");  
		ts.add("Java");  
		ts.add("Python");
		ts.add("XML");
		ts.add("HTML");
		System.out.println(ts);
		ts.remove("C");
		ts.remove("C++");
		ts.add("CSS");  
		ts.add("Kotlin");  
		ts.add("Php");
		System.out.println(ts);
		System.out.println("Is TreeSet contains this 'Java' element "+ts.contains("Java"));
		ts.clear();
		System.out.println(ts);
		
		sc.close();

	}

}

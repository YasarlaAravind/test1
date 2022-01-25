package program.java.ds;

import java.util.Scanner;
import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 5 intgers: ");

		for(int i=0;i<5;i++)
		{
		int n = sc.nextInt();
		s.push(n);
		}

		System.out.println("Elements have been entered...Head is: "+ s.peek());

		s.pop();
		s.pop();
		System.out.println("2 Elements have been removed");

		System.out.println("Now the head is: "+ s.peek());

		System.out.println("Is 3 present: "+ s.search(3));;
		System.out.println("Is 5 present: "+ s.search(5));;
		
		sc.close();

	}

}

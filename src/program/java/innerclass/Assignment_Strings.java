package program.java.innerclass;

import java.util.Scanner;

public class Assignment_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    String s = sc.next();
	    String A = s.toLowerCase();
	    int len = A.length();
	    boolean check = true;
	    if(len<=50) {
		    for (int i = 0; i < len/2; i++) {
		    	if (A.charAt(i) != A.charAt(len-1-i)) {
		    		check = false;
		    	}
		    }
		    System.out.println(check ? "Yes" : "No");
		}
	    else {
	    	System.out.println("String should not be more than 50 letters");
	    }
	    sc.close();
	}

}

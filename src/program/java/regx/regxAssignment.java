//Assignment 1: (Pattern Matching):
//(1) validate the given email id (that should have pattern with @ and .com    
//    (a)  firstname@gmail.com
//    (b)  virendra@gmail.com
//    (c)  test123prepare@co.edu.com
//(2) validate the phone number with country code +91 pattern matching
//(3) password that should have - first letter caps  / contain 3 digits / contains any number of alphabets
//    also  with 10 length

package program.java.regx;

import java.util.regex.Pattern;

public class regxAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("^(.+)@(.+).com$", "firstname@gmail.com"));
		System.out.println(Pattern.matches("^(.+)@(.+).com$", "virendra@gmail.com"));
		System.out.println(Pattern.matches("^(.+)@(.+).com$", "test123prepare@co.edu.com"));
		
		System.out.println(Pattern.matches("[+]91[0-9]{10}", "+911234567890"));
		System.out.println (Pattern.matches("[A-Z][0-9]{3}[a-zA-Z]{10}", "A123abhishekJA"));

	}

}

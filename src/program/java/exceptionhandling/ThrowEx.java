package program.java.exceptionhandling;

import java.util.Scanner;

public class ThrowEx {
	
	static int add(int num1, int num2) throws ArithmeticException {
		if (num1 > 900) {
			throw new ArithmeticException("Num1 is greater than 900 and hence exception is thrown");
		} else {
			System.out.println("Both parameters are correct");
		}
		return num1+num2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number 1: ");
		int num1 = scanner.nextInt();
		
		System.out.println("Enter number 2: ");
		int num2 = scanner.nextInt();
		
		try {
			result = add(num1, num2);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.getMessage());
		}
		System.out.println("Result is : "+result);
		scanner.close();

	}

}

package program.java.innerclass;

import java.util.Scanner;

class MyCalculator {
	public long power(int n, int p) throws Exception {
		if(n<0 || p<0)
			throw new Exception("n or p should not be negative");
		else if(n==0 && p==0)
			throw new Exception("n and p should not be zero");
		else
			return (long) Math.pow(n, p);
	}
}

public class Assignment_Exception {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MyCalculator obj = new MyCalculator();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		try {
		System.out.println(obj.power(n, p));
		}
		catch (Exception e) {
			System.out.println(e);
		}
		sc.close();

	}

}

package program.java.exceptionhandling;

import java.io.IOException;

public class ThrowsEx {
	
	void m() throws IOException{
		throw new IOException("device error");
	}
	
	void n() throws IOException{
		m();
	}
	
	void p() {
		try {
			n();
		}
	catch(Exception e) {
		System.out.println("exception handled");
		System.out.println(e.getMessage());
		System.out.println(e.getStackTrace());
		System.out.println(e.getClass());
		}
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsEx ob = new ThrowsEx();
		ob.p();
		System.out.println("normal flow....");

	}

}

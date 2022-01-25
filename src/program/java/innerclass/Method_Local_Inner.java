package program.java.innerclass;

class Outer {
	
	private int age = 90;
	
	void dis() {
		System.out.println("Inside dis method");
	}
	
	void outerMethod() {
		System.out.println("Inside outerMethod");
		
		//Inner class is local to outerMethod()
		class Inner {
			void innerMethod() {
				dis();
				System.out.println("Inside innerMethod: "+ age);
			}	
		}
		Inner y = new Inner();      //object creation of the local innerClass
		y.innerMethod();        //calling inner class method
	}
	
	public void f() { }
}

public class Method_Local_Inner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer x = new Outer();
		x.outerMethod();        //calling outer class method

	}

}

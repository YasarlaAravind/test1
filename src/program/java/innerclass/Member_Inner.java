package program.java.innerclass;

public class Member_Inner {
	
	private int data = 30;
	
	void display() {
		System.out.println("I am inside the outer class method");
	}
	
	class Inner{
		private int data =20;
		
		void msg() {
			System.out.println("Data is "+ data);
		}
		
		//calling duplicate method of the outer class
		void display() {
			Member_Inner.this.display();
			System.out.println("I am inside the inner class method");
		}//inner class accessing the outside private variable
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member_Inner obj = new Member_Inner();      //creating object of outer class
		Member_Inner.Inner in = obj.new Inner();       //creating object of inner class
		in.msg();
		in.display();

	}

}
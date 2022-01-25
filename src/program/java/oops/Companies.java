package program.java.oops;

abstract class MNC {
	
	MNC() {
		System.out.println("Inside MNC Constructor");
	}
	
	abstract void A();
	abstract void B();
	
	public void C() {
		System.out.println("Inside the normal method of MNC class");
	}
	
}

abstract class Infosys extends MNC {
	
	abstract void A();
	
	public void B() {
		System.out.println("Impletation of B method");
	}
	
}


class Hellow extends Infosys {
	
	public void A() {
		System.out.println("Impletation of A method in Hellow class");
	}
	
	public void D() {
		System.out.println("This is method of Hellow Class");
	}
	
}


public class Companies extends Hellow {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Infosys ob = new Hellow();
		Hellow ob1 = new Hellow();
		ob.C();
		ob.A();
		ob.B();
		ob1.D();
		
	}

}

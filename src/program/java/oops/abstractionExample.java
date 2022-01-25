package program.java.oops;

abstract class Bike {
	Bike() {
		System.out.println("bike is created");
	}
	abstract void run1();
	void changeGear() {
		System.out.println("gear changed");
	}
}  
 
abstract class Honda extends Bike {
	
	Honda(){
		System.out.println("Honda is created");
	}
	
	abstract void run();
	
	abstract void run1();
}

class Hello extends Honda {
	
	void run() {
		System.out.println("running safely..");
	}
	
	void run1() {
		System.out.println("running safely..");
	}
}

public class abstractionExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
			  Honda obj = new Hello();  
			  obj.run();
			  obj.run1();
			  obj.changeGear();  
	}  
			  
}

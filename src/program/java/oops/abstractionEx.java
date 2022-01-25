package program.java.oops;

abstract class AbstractDemo {
	
	private String name = "abc";
	
	AbstractDemo() {
		System.out.println("Inside the abstract class");
	}
	
	public void myMethod() {
		System.out.println("Hello, " + name);
	}
	
	abstract public void anotherMethod();
}

public class abstractionEx extends AbstractDemo {
	
	abstractionEx(){
		super();
		System.out.println("Inside the chil class");
	}
	
	public void anotherMethod() {
		System.out.println("Abstarction method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractDemo ob = new abstractionEx();
		ob.anotherMethod();
		ob.myMethod();

	}


}

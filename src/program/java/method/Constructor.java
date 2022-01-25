package program.java.method;

public class Constructor {
	
	int id;
	String name;
	
	public Constructor() {           //default constructor
		id = 10;
		name = "hello";
		System.out.println("I am in default constructor");
	}
	
	void Display() {           //default modifier
		System.out.println(id+" "+name);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor ob;                //Instance Variables
		ob= new Constructor();
		ob.Display();

	}

}

package program.java.method;

public class ParameterConstructor {
	
	int id;
	String name;
	int age = 10;
	
	public ParameterConstructor(int i, String n) {
		id = i;
		name = n;
	}
	
	public ParameterConstructor(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}
	
	void Display() {           
		System.out.println(id+" "+name+" "+age);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterConstructor ob= new ParameterConstructor(20, "Aryan");
		ParameterConstructor ob1= new ParameterConstructor(21, "Kala", 15);
		ob.Display();
		ob1.Display();

	}

}

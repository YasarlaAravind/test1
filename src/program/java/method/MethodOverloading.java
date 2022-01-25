package program.java.method;

public class MethodOverloading {
	
	public void area (long r) {
		System.out.println("The area of circle:"+ (3.14*r*r));
	}
	
	public void area (int a, int b){
		System.out.println("The area of Triangle:"+ (0.5*a*b));
	}
	
	public void area (float a, int b){
		System.out.println("Printing values:"+ a +" "+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading ob= new MethodOverloading();
		ob.area(10.0f, 12);
		ob.area(5);
		ob.area(1,2);

	}

}

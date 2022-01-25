package cisco.assign.method;

public class Shape {
	
	int length, breadth, side;
	float radius;
	
	public Shape() {
		System.out.println("I am in default constructor");
	}
	
	public Shape(float r) {
		radius = r;
	}
	
	public Shape(int l, int b) {
		length = l;
		breadth = b;
	}
	
	public Shape(int s) {
		side = s;
	}
	
	void areaOfCircle() {
		System.out.println("Area of Circle: "+ (3.14*radius*radius));
	}
	
	void areaOfRect() {
		System.out.println("Area of Rectangle: "+ (length*breadth));
	}
	
	void areaOfSquare() {
		System.out.println("Area of Square: "+ (side*side));
	}
	
	void area(int p, int q) {
		System.out.println("Area of Rhombus: " +(p*q)/2);
	}
	
	void area (float b, float h) {
		System.out.println("Area of Triangle: " +(b*h)/2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape ob = new Shape();
		Shape ob1 = new Shape(5f);
		Shape ob2 = new Shape(5,5);
		Shape ob3 = new Shape(5);
		ob1.areaOfCircle();
		ob2.areaOfRect();
		ob3.areaOfSquare();
		ob.area(4, 5);
		ob.area(4f, 5f);
		
		

	}

}

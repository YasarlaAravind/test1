package cisco.assign.method;

public class Area {
	
	public int add(int a, int b) {
		int c = a+b;
		return c;
	}
	
	public float add(int r) {
		float c = (float) 3.14*r*r;
		return c;
	}
	
	public int add(float l, int b) {
//		int w = (int) l;
		float a = l*b;
		int c = (int) a;
		return c;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area ob = new Area();
		System.out.println("Addition of two no.: "+ ob.add(5, 5));
		System.out.println("Area of Circle:" +ob.add(8));
		System.out.println("Area of Triangle:" +ob.add(4.5f,7));

	}

}

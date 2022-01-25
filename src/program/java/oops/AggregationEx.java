package program.java.oops;

class Operation {
	int square(int n) {
		return n*n;
	}
}

public class AggregationEx {
	Operation op;
	double pi = 3.14;
	
	double area(int radius) {
		op=new Operation();
		int rsquare=op.square(radius);
		return pi*rsquare;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AggregationEx ob = new AggregationEx();
		double result = ob.area(5);
		System.out.println(result);

	}

}

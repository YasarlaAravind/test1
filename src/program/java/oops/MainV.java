package program.java.oops;

public class MainV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle ob;
		ob = new TwoWheeler();
		ob.run();
		ob.stop();
		ob.display();
		System.out.println("*************************************");
		ob = new ThreeWheeler();
		ob.run();
		ob.stop();
		ob.display();
		System.out.println("*************************************");
		ob = new FourWheeler();
		ob.run();
		ob.stop();
		ob.display();
		System.out.println("*************************************");
		ob = new EightWheeler();
		ob.run();
		ob.stop();
		ob.display();

	}

}

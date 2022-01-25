package program.java.oops;

public class Vehicle {
	
	public int speed = 5;
	public long distance = 10;
	
	public Vehicle(){
		System.out.println("Inside default Constructor");
	}
	
	public Vehicle(int a){
		System.out.println("Inside default Constructor");
	}
	
	public void run() {
		System.out.println("Vehicle is runing at " +speed+ " km/h");
	}
	
	public void stop() {
		System.out.println("Vehicle is stopped after " +distance+ " km");
	}
	
	public void fuel(int a) {
		System.out.println("Vehicle has " +a+ " litre fuel.");
	}
	
	public void fuel(float a,String b) {
		System.out.println("Vehicle has " +a+ " litre fuel and fuel type is " +b);
	}
	
	public void fuel(char a,int b) {
		System.out.println("Vehicle has " +b+ " litre fuel and fuel type is "+a);
	}

	public void display() {
		// TODO Auto-generated method stub
		
	}
	
	

}

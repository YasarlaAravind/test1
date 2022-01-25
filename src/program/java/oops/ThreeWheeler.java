package program.java.oops;

public class ThreeWheeler extends Vehicle{
	public int speed = 30;
	public long distance = 35;
	public int nos_of_tyre = 3;
	
	public ThreeWheeler(){
		System.out.println("Inside Three Wheeler Dafault Constructor");
	}
	
	public void run() {
		System.out.println("ThreeWheeler is runing at " +speed+ " km/h");
	}
	
	public void stop() {
		System.out.println("ThreeWheeler is stopped after " +distance+ " km");
	}
	
	public void display() {
		System.out.println("Speed of Vehicle: "+ super.speed);
		System.out.println("Distance covered by Vehicle: "+ super.distance);
		System.out.println("Speed of Vehicle: "+ speed);
		System.out.println("Distance covered by Vehicle: "+ distance);
		System.out.println("No. of Tyre: "+ nos_of_tyre);
	}

}

package program.java.oops;

public class EightWheeler extends Vehicle{
	public int speed = 20;
	public long distance = 25;
	public int nos_of_tyre = 8;
	
	public EightWheeler(){
		System.out.println("Inside Two Wheeler Dafault Constructor");
	}
	
	public void run() {
		System.out.println("EightWheeler is runing at " +speed+ " km/h");
	}
	
	public void stop() {
		System.out.println("EightWheeler is stopped after " +distance+ " km");
	}
	
	public void display() {
		System.out.println("Speed of Vehicle: "+ super.speed);
		System.out.println("Distance covered by Vehicle: "+ super.distance);
		System.out.println("Speed of Vehicle: "+ speed);
		System.out.println("Distance covered by Vehicle: "+ distance);
		System.out.println("No. of Tyre: "+ nos_of_tyre);
	}

}

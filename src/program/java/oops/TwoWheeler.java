package program.java.oops;

public class TwoWheeler extends Vehicle{
	public int speed = 20;
	public long distance = 25;
	public int nos_of_tyre = 2;
	
	public TwoWheeler(){
		System.out.println("Inside Two Wheeler Dafault Constructor");
	}
	
	public void run() {
		super.run();
		System.out.println("TwoWheeler is runing at " +speed+ " km/h");
	}
	
	public void stop() {
		super.stop();
		System.out.println("TwoWheeler is stopped after " +distance+ " km");
	}
	
	public void display() {
		System.out.println("Speed of Vehicle: "+ super.speed);
		System.out.println("Distance covered by Vehicle: "+ super.distance);
		System.out.println("Speed of Vehicle: "+ speed);
		System.out.println("Distance covered by Vehicle: "+ distance);
		System.out.println("No. of Tyre: "+ nos_of_tyre);
	}

}

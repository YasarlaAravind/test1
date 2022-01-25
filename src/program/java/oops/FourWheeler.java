package program.java.oops;

public class FourWheeler extends Vehicle{
	public int speed = 40;
	public long distance = 45;
	public int nos_of_tyre = 4;
	
	public FourWheeler(){
		System.out.println("Inside Two Wheeler Dafault Constructor");
	}
	
	public void run() {
		System.out.println("FourWheeler is runing at " +speed+ " km/h");
	}
	
	public void stop() {
		System.out.println("FourWheeler is stopped after " +distance+ " km");
	}
	
	public void display() {
		System.out.println("Speed of Vehicle: "+ super.speed);
		System.out.println("Distance covered by Vehicle: "+ super.distance);
		System.out.println("Speed of Vehicle: "+ speed);
		System.out.println("Distance covered by Vehicle: "+ distance);
		System.out.println("No. of Tyre: "+ nos_of_tyre);
	}

}

package program.java.thread;

class Line {
	synchronized public void getLine() {
		for(int i=0;i<3;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(400);
			}
			catch(Exception e) {
				System.out.println(e);
			}		
		}
	}		
}
	
	
class Train extends Thread {
	Line line;
	Train(Line line) {
		this.line=line;
	}
	public void run() {
		line.getLine();
	}
	
}


public class SynchronizedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Line obj=new Line();

		Train train1=new Train(obj);
		Train train2=new Train(obj);

		train1.setName("Train1");
		train2.setName("train2");

		train2.start();
		train1.start();
	}

}

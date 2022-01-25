package program.java.thread;

class Hello implements Runnable {
	public void run() {
		for(int i=1;i<5;i++) {
			try {
				Thread.sleep(2000);
				System.out.println(i);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}

		}
	}
}

public class SleepThreadRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello h1=new Hello();
		Thread t=new Thread(h1);
		t.start();

	}

}

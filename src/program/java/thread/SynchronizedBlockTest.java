package program.java.thread;

class Table {

	void printTable(int n)	{
		System.out.println("I am from run method from printable class");

		synchronized(this){
			for(int i=1; i<5; i++){
				System.out.println(n*i);
				try {
					Thread.sleep(400);
				}
				catch(Exception em) {
					System.out.println(em);}
			}
		}
	}
}


class MyThread1 extends Thread {

	Table t;
	MyThread1(Table t) {
		this.t=t;
	}
	public void run() {
		System.out.println("Into Mythread1");
		t.printTable(5);
	}
}

class MyThread2 extends Thread {

	Table t;
	MyThread2(Table t) {
		this.t=t;
	}
	public void run() {
		System.out.println("Into Mythread1");
		t.printTable(10);
	}
}


public class SynchronizedBlockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table obj = new Table();

		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);

		t1.start();
		t2.start();

	}

}

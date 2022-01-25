package program.java.innerclass;

class Demo {
	void show() {
		System.out.println("I am in show method of super class");
	}
}

public class Anonymous_Inner {
	// An anonymous class with Demo as base class
	static Demo d = new Demo() {
		void show() {
			super.show();
			System.out.println("I am in FlavorlDemo class");
		}
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		d.show();
	}

}

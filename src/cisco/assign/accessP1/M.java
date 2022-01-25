package cisco.assign.accessP1;

public class M {
	
	private int age = 45;
	long distance = 4500L;
	protected float pi = 3.14f;
	
	protected void methodM() {
		System.out.println("Value of private int age : "+age);
		System.out.println("Value of default long distance : "+distance);
		System.out.println("Value of protected float pi : "+pi);
	}
	
	public void methodMpu() {
		System.out.println("Value of private int age : "+age);
		System.out.println("Value of default long distance : "+distance);
		System.out.println("Value of protected float pi : "+pi);
	}

	
//		void am() {
//			private int age = 10;
//			long distance = 100L;
//			protected float pi = 1.2f;
//		}
//		
////		public void bm() {
////			private int age = 10;
////			long distance = 100L;
////			protected float pi = 1.2f;
////		}
////		
////		protected void cm() {
////			private int age = 10;
////			long distance = 100L;
////			protected float pi = 1.2f;
////		}
////		
////		private void dm() {
////			private int age = 10;
////			long distance = 100L;
////			protected float pi = 1.2f;
////		}
		
}
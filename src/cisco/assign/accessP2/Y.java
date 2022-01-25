package cisco.assign.accessP2;

import cisco.assign.accessP1.M;
import cisco.assign.accessP1.N;

public class Y extends N{
	
	public static void main(String[] args) {
		
//		new M().methodM();
//		new N().methodN();
		Y ob = new Y();
		new M().methodMpu();
		ob.methodN();
		new X().methodX();
		
	}
}
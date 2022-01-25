package program.java.oops;

public class Encapsulate {
	
	private int age;
	private String deptnm;
	private int deptno;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDeptnm() {
		return deptnm;
	}

	public void setDeptnm(String deptnm) {
		this.deptnm = deptnm;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulate op = new Encapsulate();
		op.setAge(18);
		op.setDeptnm("CSE");
		op.setDeptno(1234);
		
		System.out.println("Age : " + op.getAge() + "\nDept. Name : " + op.getDeptnm() + "\nDept. No.: " +op.getDeptno());

	}

}

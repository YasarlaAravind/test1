package cisco.assign.method; 

public class ClassRoom {
	
	public int age,marks1 = 0,marks2,marks3;
	public String name;
	public char gender,section;
	
	public ClassRoom(String n, int a, char g, char s, int m2, int m3) {
		name = n;
		age = a;
		gender = g;
		section = s;
		marks2 = m2;
		marks3 = m3;
	}
	
	public ClassRoom(String n, int a, char g, char s, int m1, int m2, int m3) {
		name = n;
		age = a;
		gender = g;
		section = s;
		marks1 = m1;
		marks2 = m2;
		marks3 = m3;
	}
	
	void Display() {
		int total;
		float percent;
		total = marks1+marks2+marks3;
		percent = (float) (total*100)/150;
		System.out.println("Name: " +name+ "\tAge: " +age+ "\tGender: " +gender+ "\tSection: " +section+
				            "\tTotal: " +total+ "\tPercentage: " +String.format("%.2f",percent));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassRoom s1 = new ClassRoom("Jarry", 15, 'M', 'A', 45, 42, 40);
		ClassRoom s2 = new ClassRoom("Mary", 17, 'F', 'B', 50, 41);
		ClassRoom s3 = new ClassRoom("Tom", 16, 'M', 'C', 45, 48);
		ClassRoom s4 = new ClassRoom("Cruise", 16, 'F', 'D', 46, 41, 43);
		s1.Display();
		s2.Display();
		s3.Display();
		s4.Display();

	}

}

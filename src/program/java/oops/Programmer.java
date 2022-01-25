package program.java.oops;

class Employee{
	
	 float salary=40000;
	 int bonus = 5600;
	 
	 public void show() {
		 System.out.println("Inside parent class");
	 }
	 
	 public void display() {
		 System.out.println("We are inside display method of child class");
	 }
}

public class Programmer extends Employee{
	
	int bonus=10000;
	
	public void show() {
		System.out.println("Bonus of employee is: "+ super.bonus);
		System.out.println("Inside child class");
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer p=new Programmer();  
		System.out.println("Programmer salary is: "+p.salary);  
		System.out.println("Bonus of Programmer is: "+p.bonus);
		p.show();
		p.display();
	}

}
//You need to check the salary of the person and based on that need to return the output from the program.
//if salary < 2000  then return custom exception message as "you need to work hard"
//if salary is between 2100 and 5000 then return custom exception message as "your salary is somehow good"
//if salary is between 5100 and 9000 then return custom exception message as "salary is very good"
//Design the custom exception class in this


package program.java.exceptionhandling;

public class AssignmentofException {
	
	static void SalaryCheck(int sal) throws MyException {
		
		if(sal < 2000) {
			throw new MyException("you need to work hard");
		}
		else if(2100 < sal && sal < 5000) {
			throw new MyException("your salary is somehow good");
		}
		else if(5100 <sal && sal < 9000) {
			throw new MyException("salary is very good");
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			SalaryCheck(8000);
		}
		catch(Exception m) {
			System.out.println("Exception occured: "+m.getMessage());
		}
		
		System.out.println("rest of the code");
	}

}


class MyException extends Exception {
	
	MyException(String s) {
		super(s);
	}

}

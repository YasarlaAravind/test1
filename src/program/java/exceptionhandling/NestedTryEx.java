package program.java.exceptionhandling;

public class NestedTryEx {
	
	public static void checkException() {
		try {
            int res=3/0;
            System.out.println(res);
        }
        
        finally {
            System.out.println("Finally inside method");
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        try {
		            checkException();    //calling method
		        }
		        
		        catch(ArrayIndexOutOfBoundsException e) {
		            System.out.println("ArrayIndexOutOfBoundsException");
		        }
		        
		        finally {
		            System.out.println("Finally outside method");
		        }
		    
		}

}

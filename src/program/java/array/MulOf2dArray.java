package program.java.array;

import java.util.Scanner;

public class MulOf2dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m, n, p, q, a, b, c,sum = 0;
		
		Scanner in = new Scanner(System.in);
	    System.out.println("Enter the number of rows and columns of first matrix: ");
	    m = in.nextInt();
	    n = in.nextInt();
	    int first[][] = new int[m][n];
	    
	    System.out.println("Enter elements of first matrix: ");
	    for (a = 0; a < m; a++)
	    	for (b = 0; b < n; b++)
	    		first[a][b] = in.nextInt();
	    
	    System.out.println("Enter the number of rows and columns of second matrix: ");
	    p = in.nextInt();
	    q = in.nextInt();
	    if (n != p)
	    	System.out.println("Can't multiply.");
	    else
	    {
	    	int second[][] = new int[p][q];
	        int third[][] = new int[m][q];
	        
	        System.out.println("Enter elements of second matrix: ");
	        for (a = 0; a < p; a++)
	        	for (b = 0; b < q; b++)
	        		second[a][b] = in.nextInt();
	        
	        for (a = 0; a < m; a++)
	        {
	        	for (b = 0; b < q; b++)
	            {
	        		for (c = 0; c < p; c++)
	                {
	                   sum = sum + first[a][c]*second[c][b];
	                }
	  
	                third[a][b] = sum;
	                sum = 0;
	             }
	          }
		
	          System.out.println("Product of the matrices: ");
	          for (a = 0; a < m; a++)
	          {
	        	  for (b = 0; b < q; b++)
	        		  System.out.print(third[a][b]+"\t");
	        	  
	        	  System.out.print("\n");
	          }
	       }
	    
	}

}

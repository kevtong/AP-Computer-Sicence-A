package Recursion;


public class Fabonacci  {
	public static void main( String[] args)
	{
           int result = fab(10);
            System.out.println(result);
        
    }
	
	 public static int fab(int n) {
	     if(n <= 1) {              // the simplest case, base case
	         return n;
	     } else {
	         return fab(n-1) + fab(n - 2); // here's the recursive invocation
	     }
     }
       
}
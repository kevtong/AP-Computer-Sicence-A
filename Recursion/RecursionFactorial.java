package Recursion;


public class RecursionFactorial  {
	public static void main( String[] args)
	{
           int result = compute(4);
            System.out.println(result);
        
    }
	
	 public static int compute(int n) {
	     if(n == 1) {              // the simplest case, base case
	         return 1;
	     } else {
	         return n * compute(n - 1); // here's the recursive invocation
	     }
     }
       
}
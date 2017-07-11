package Recursion;


public class Factorial  {
	public static void main( String[] args)
	{
        int result = 1;
        int n = 4;
        while (n > 0) {
        	result = result * n;
            n--;
        }
        System.out.println(result);
        
    }
}
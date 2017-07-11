package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
  


public class RecursionReverseString
{
	public static void main( String[] args) throws IOException
	{
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Type a string to reverse:");
		String str = buffer.readLine();
	    printReverse(str);
	       
	 }
	
	public static void printReverse(String str) {
       if(!str.equals("")) {
    	   System.out.print(str.substring(str.length() - 1));
           printReverse(str.substring(0, str.length() - 1));
       }
   }
}

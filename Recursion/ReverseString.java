package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
  


public class ReverseString
{
	public static void main( String[] args) throws IOException
	{
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Type a string to reverse:");
		String str = buffer.readLine();
		int index = str.length() - 1;
        while(index >= 0) {
    	   System.out.println(str.substring(index, index + 1));
           index--;
        }
	       
	 }
}

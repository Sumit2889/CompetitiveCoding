/* package codechef; // don't place package name! */

import java.util.Scanner;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try{
	        Scanner sc = new Scanner(System.in);
		
		    String input = sc.nextLine();
		    String[] input_array = input.split(" ");
		
		    int transact = Integer.parseInt(input_array[0]);
		    Double initial = Double.parseDouble(input_array[1]);
		    double remaining = 0;
		
		    if (transact % 5 == 0 && transact > 0 && initial >= transact + 0.50) {
		    	remaining = initial - transact - 0.50;
		    	System.out.printf("%.2f", remaining);	
	    	}
	    	else
		      System.out.printf("%.2f", initial);
		  sc.close();
	        
	    }
	    catch(Exception e){
			return;
		}
	   
	}
}

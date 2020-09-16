package fileio;

/*
 * Multiple catch clauses
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException; //required for catch using FileNotFoundException
import java.util.InputMismatchException;

public class DataReader1c
{
	public static void main(String [] args)
	   {
		try		//TEST FOR FILE NOT FOUND AND INPUT MISMATCH (note first input item an int rather than String)
	      {
	    	//create a scanner object that reads data from a text file
	    	  Scanner fScanner = new Scanner(new File("TextFiles/PersonDataFile_1.txt"));
	    	  
		      while(fScanner.hasNextLine())
		      {
		         //String firstName = fScanner.next(); //working code
		    	 int firstName = fScanner.nextInt();
		         
		         String lastName = fScanner.next();
		         
		         int id = fScanner.nextInt();
		         
		         System.out.println(firstName + " " + lastName + " " + id);
		         
		      }
	      }
	      catch(FileNotFoundException f)
	      {
	    	  System.out.println("In FileNotFoundException catch, exception message = " + f);
	      }
		  catch(InputMismatchException i)
		  {
	    	  System.out.println("In InpitMismatchException catch, exception message = " + i);
	      }   
	   }
}
/*CONSOLE: attempt to read a string as an int, line 24

In InputMismatchException catch, exception message = java.util.InputMismatchException

*/
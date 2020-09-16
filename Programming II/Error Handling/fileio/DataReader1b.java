package fileio;

/*
 * Method main no longer throws IOException
 * exception written into body of main
 */

import java.util.Scanner;
import java.io.File;
//import java.io.IOException;

public class DataReader1b
{
	public static void main(String [] args) 
	   {	      
	      try
	      {
	    	//create a scanner object that reads data from a text file
	    	  Scanner fScanner = new Scanner(new File("TextFiless/PersonDataFile_1.txt"));
	    	  
		      while(fScanner.hasNextLine())
		      {
		         String firstName = fScanner.next();
		         
		         String lastName = fScanner.next();
		         
		         int id = fScanner.nextInt();
		         
		         System.out.println(firstName + " " + lastName + " " + id);
		         
		      }
	      }
	      catch(Exception e)
	      {
	    	  System.out.println("In catch, exception message = " + e);
	      }
	   }
}
/* CONSOLE, using error in file name, "TextFiless"
 
 In catch, exception message = java.io.FileNotFoundException: TextFiless/PersonDataFile_1.txt (No such file or directory)


*/

/*
 * Method main throws IOException
 */
package fileio;

import java.util.Scanner;
import java.io.File;
import java.io.IOException; //required to use throws IOException

public class DataReader1a
{
	public static void main(String [] args) throws IOException
	   {
	      //create a scanner object that reads data from a text file
	      Scanner fScanner = new Scanner(new File("TextFiles/PersonDataFile_1.txt"));
	      	      
	      while(fScanner.hasNextLine())
	      {
	         String firstName = fScanner.next();
	         
	         String lastName = fScanner.next();
	         
	         int id = fScanner.nextInt();
	         
	         System.out.println(firstName + " " + lastName + " " + id);
	         
	      }
	   
	   }
}

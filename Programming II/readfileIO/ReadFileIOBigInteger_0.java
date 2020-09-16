import java.math.BigInteger;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;

import java.util.Scanner;

public class ReadFileIOBigInteger_0
{
   public static void main(String [] args)
   {
      //variable declarations

           
      
      //program logic (within a try/catch block)
      try
      {
         Scanner fScanner = new Scanner(new File("bidata1.txt"));
         while(fScanner.hasNextLine())
         {
           int i = fScanner.nextInt();
           int j = fScanner.nextInt();
           int sum = i+j;
           System.out.println("The sum is: " + sum); 
        }
             //create a scanner object that reads data from a file
         
         
             //read data fil
  
      }
      
      catch(FileNotFoundException fnf)
      {
         System.out.println("In FileNotFoundException, the message was: "+ fnf);
      }
      
      catch(InputMismatchException ime)
      {
         System.out.println("In InputMismatchException, the message was: "+ ime);
      }
      
      
    }
}
import java.math.BigInteger;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;

import java.util.Scanner;

public class ReadFileIOBigInteger_1
{
   public static void main(String [] args)
   {
      //variable declarations
      int input = 0;
           
      
      //program logic (within a try/catch block)
      try
      {
         Scanner fScanner = new Scanner(new File("bidata3.txt"));
         while(fScanner.hasNextLine())
         {
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
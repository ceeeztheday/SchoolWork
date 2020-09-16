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
      BigInteger bi1;
      BigInteger bi2;
      BigInteger biSum;
           
      
      //program logic (within a try/catch block)
      try
      {
         Scanner fScanner = new Scanner(new File("bidata2.txt"));
         while(fScanner.hasNextLine())
         {
           bi1 = new BigInteger(fScanner.next());
           bi2 = new BigInteger(fScanner.next());
           biSum = bi1.add(bi2);
           System.out.println("The sum is "+biSum);
           
         
         }
               
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
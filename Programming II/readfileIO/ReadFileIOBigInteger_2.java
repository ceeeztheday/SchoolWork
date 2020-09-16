import java.math.BigInteger;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException; ///sums uneven data

import java.util.Scanner;

public class ReadFileIOBigInteger_2
{
   public static void main(String [] args)
   {
      //variable declarations
      BigInteger bi1 = new BigInteger("0");
      BigInteger biSum = new BigInteger("0");
           
      
      //program logic (within a try/catch block)
      try
      {
         Scanner fScanner = new Scanner(new File("bidata3.txt"));
         while(fScanner.hasNextLine())
         {
           String [] values = fScanner.nextLine().split(" ");
         
           for(String s : values)
           {
               biSum = biSum.add(new BigInteger(s));
           }
           
           System.out.println(biSum);
           biSum = bi1; //zero out        
         
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
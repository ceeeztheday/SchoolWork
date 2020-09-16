import java.util.*;
import java.io.*;
import java.math.*;

public class Divisibleby10
{
   public static void main (String[]args)
   {
      BigInteger biNum = new BigInteger("0");
      BigInteger biMod = new BigInteger("0");
      int count = 0;
      
      try
      {
          Scanner fScanner = new Scanner(new File("number.txt"));

         while(fScanner.hasNextLine())
         {
            biNum = new BigInteger(fScanner.nextLine());
            biMod = biNum.mod(new BigInteger("10"));
            
            if(biMod.equals(new BigInteger("0")))
            {
              System.out.println(biNum.divide(new BigInteger("10"))); 
              count++; 
            }
            else
            {
               System.out.println("Not divisible by 10");
            }
         }
         System.out.println("Count: "+count);
      }
      
      catch(FileNotFoundException fnf)
      {
         System.out.println("File Not Found.");
      } 
   }
}
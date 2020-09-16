import java.util.*;
import java.io.*;

public class CountTypes
{
   public static void main(String [] args)
   {
      Scanner input = new Scanner(System.in);
      
      try
      {
         System.out.println("Enter file name (including extension): ");
         String fileName = input.nextLine();
         Scanner fScanner = new Scanner(new File(fileName) );       
         int strings = 0;
         int integers = 0;
         int doubles = 0;
         
         while(fScanner.hasNextLine() )
         {
             String str = fScanner.next();
             
             if(str.matches("[0-9]*") )
               integers++;
             else if(str.matches("[0-9]*[.][0-9]*") )
               doubles++;
             else
               strings++;
         }
         System.out.println("Number of string: " + strings + "\n"+
                           "Number of integers: " + integers + "\n" +
                            "Number of doubles: " + doubles);
      
      }
      catch(FileNotFoundException fnf)
      {
         System.out.println("No File Found");
      }
      
      
   }
}

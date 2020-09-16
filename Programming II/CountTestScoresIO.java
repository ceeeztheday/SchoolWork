import java.io.*;//getting into file
import java.util.Scanner;//read from file
import java.util.InputMismatchException;

public class CountTestScoresIO
{
   public static void main(String [] args)
   {
      int aCount = 0;
      int bCount = 0;
      int cCount = 0;
      
      try
      {
         Scanner fScanner  = new Scanner(new File("data_sample_1.txt"));
         
         while(fScanner.hasNextLine())//is there data to read?
         {
            String letterGrade = fScanner.next();
            {
               if(letterGrade.charAt(0) == 'A')
                  aCount++;
               else if(letterGrade.charAt(0) == 'B')
                  bCount++;
               else if(letterGrade.charAt(0) == 'C')
                  cCount++;
               else
                  throw new InputMismatchException(); 
            }
         }
         if(aCount > bCount && aCount > cCount)
            System.out.println("The grade that appeats the most is A, and it appears " + aCount + " times.");
         else if(bCount > aCount && bCount > cCount)
            System.out.println("The grade that appeats the most is B, and it appears " + bCount + " times.");
         else
            System.out.println("The grade that appeats the most is C, and it appears " + cCount + " times.");
      }
      catch(FileNotFoundException fnf)
      {
         System.out.println("File not found with message: " + fnf);
      }
      catch(IllegalArgumentException iae)
      {
         System.out.println("File not found with message: " + iae);
      }

   }
}
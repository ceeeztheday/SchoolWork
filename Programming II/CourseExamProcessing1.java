import java.util.Scanner;
import java.io.File;
import java.io.*;
import java.math.*;
import java.util.InputMismatchException;

public class CourseExamProcessing1
{
   public static void main(String [] args)
   {
      String fName = "num1.txt";
      int sum = 0;
      int num = 0;
      int count = 0;
      
      try//about finding the file
      {
         Scanner fScanner = new Scanner(new File(fName));//reading from a file
         
         while(fScanner.hasNext())
         {
            String s = fScanner.next();
            count++;
            //sum = sum + Integer.valueOf(s); Wrapper class for coverting string to int; 2 options
            sum = sum + Integer.parseInt(s);
            //sum = sum + fscanner.nextInt(); this line works if you know the data are ints
         }
      }
      catch(FileNotFoundException fnf)
      {
         System.out.println("Please check your filename: " + fnf);
      }
      catch(InputMismatchException ime)
      {
         System.out.println("Please check your data types: " + ime);
      }
   }
}
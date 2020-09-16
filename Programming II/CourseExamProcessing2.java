import java.util.Scanner;
import java.io.File;
import java.io.*;
import java.math.*;
import java.util.InputMismatchException;

public class CourseExamProcessing2
{
   public static void main(String [] args)
   {
      String fName = "num1.txt";
      int count = 0;
      BigInteger bInt1;//pointer
      BigInteger bIntSum;//pointer
      
            
      try//about finding the file
      {
         Scanner fScanner = new Scanner(new File(fName));//reading from a file
         bIntSum = new BigInteger("0"); // same as int sum = 0;
         
         while(fScanner.hasNext())
         {
            bInt1 = new BigInteger(fScanner.next());
            System.out.println("bInt1: " + bInt1); //this is a test
            
            bIntSum = bIntSum.add(bInt1);
            System.out.println("bIntSum: " + bIntSum); //this is a test
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
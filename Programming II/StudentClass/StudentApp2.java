import java.io.*;//part4
//import java.util.Scanner;
import java.util.*;

public class StudentApp2
{
   public static void main(String [] args)
   {
      Student [] s = new Student [3];
      Scanner fScanner;
      String fName, lName;
      int ssn;
      double gpa;
      int i = 0;
      
      try
      {
         fScanner = new Scanner(new File("students1.txt"));
         
         while(fScanner.hasNextLine())
         {
            s[i++] = new Student(fScanner.next(), fScanner.next(), fScanner.nextInt(), fScanner.nextDouble());
         }
      }
      catch(FileNotFoundException fnf)
      {
         System.out.println("Please check your file name. \n" + fnf);
      }
      catch(InputMismatchException ime)
      {
         System.out.println("Attempt to load invalid data. \n" + ime);
      }  
      
      for(i = s.length - 1; i >= 0; i--)
         System.out.println(s[i] + "\n");
   }
}
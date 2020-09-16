import java.util.*;
import java.io.*;


public class SortedIntegerFile
{
   public static void main(String[]args)
   {
  
     try
     {
         Scanner fScanner = new Scanner(new File("integers6.txt"));
         
         int a = fScanner.nextInt();
         int b = fScanner.nextInt();
         
         while(fScanner.hasNext())
         {
            if(a < 0 || b < 0)
               throw new InputMismatchException();
               
            if(a > b)
               throw new Exception("File Not Sorted\n" + a + " occurs before " + b);
               
            a=b;
            b= fScanner.nextInt();
         }
         System.out.println("File is sorted");
       }
     
      catch(FileNotFoundException fnfe)
		{
			System.out.println("File Not Found");
		}
		catch(InputMismatchException ime)
		{
			System.out.println("File contains values other than positive integers.");
		}
		catch(Exception unsorted)
		{
			System.out.println(unsorted.getMessage());
		}
 
   }
}
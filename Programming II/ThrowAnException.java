//import java.util.Exception;
import java.util.InputMismatchException;

public class ThrowAnException
{
   //This file throws and catches an exception
   //To catch the exception, the try-catch structure must be used
   public static void main(String [] args)
   {
      int x = 3;
      
      try
      {
         if(x != 2)
         {
            throw new InputMismatchException("value must be 2");
         }
      }
      catch(InputMismatchException e)
      {
         System.out.println("Error: " + e);
      } 
      System.out.println("\nOutput following try-catch block" +
                         "\nnote that an Error message is displayed on the screen, but" +
                         "\nthe program does not crash, " +
                         "\nrather it continues to run");
   }
}
/*PROGRAM OUTPUT

Error: java.util.InputMismatchException: value must be 2

Output following try-catch block
note that an Error message is displayed on the screen, but
the program does not crash, 
rather it continues to run

*/
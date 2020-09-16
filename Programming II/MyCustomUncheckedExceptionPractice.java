//import java.lang.Exception; //import not required
import java.util.InputMismatchException;

public class MyCustomUncheckedExceptionPractice
{
   public static void main(String [] args)
   {
      int x = 2;
     
      try
      {
         if(x == 3)
            System.out.println(x);
         else
            //EXAMPLE 1 throw new MyUncheckedException();
           //example 2 throw new IllegalArgumentException();
         //else
            //EXAMPLE 3 throw new MyUncheckedException("Something went wrong");
      }
      catch(MyUncheckedException e)
      {
         System.out.println("In MyUncheckedException block: " + e);
      }
      catch(IllegalArgumentException iae)
      {
         System.out.println("Please enter a number the next time; " + iae);
      }
      catch(InputMismatchException ime)
      {
         System.out.println("Next time please enter the appropriate data type; " + ime);
      }
      finally
      {
         System.out.println("in finally block");
      }
         
      System.out.println("End");

   }
}

/*
PROGRAM OUTPUT FOR EXAMPLE 1
In MyUncheckedException block: MyUncheckedException: An Unchecked Exception has occurred

PROGRAM OUTPUT FOR EXAMPLE 2
Please enter a number the next time; java.lang.IllegalArgumentException

PROGRAM OUTPUT FOR EXAMPLE 3
In MyUncheckedException block: MyUncheckedException: Something went wrong
*/
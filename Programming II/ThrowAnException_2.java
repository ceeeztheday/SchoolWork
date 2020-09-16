import java.util.InputMismatchException;

public class ThrowAnException_2
{
   //This file throws an exception, but does not catch the exception
   public static void main(String [] args)
   {
      int x = 3;
      
      if(x != 2)
      {
         throw new InputMismatchException("value must be 2");
      }
       
      System.out.println("\nNote that you never see this text." +
                         "\nIn this example the error message was displayed," +
                         "\nand then the program terminated.");     
      

   }
}
/*PROGRAM OUTPUT


 ----jGRASP exec: java ThrowAnException_2
Exception in thread "main" java.util.InputMismatchException: value must be 2
	at ThrowAnException_2.main(ThrowAnException_2.java:12)

 ----jGRASP wedge: exit code for process is 1.
 ----jGRASP: operation complete.


*/
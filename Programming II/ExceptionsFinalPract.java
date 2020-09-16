import java.util.*;
import java.io.*;
public class ExceptionsFinalPract
{
   public static void main(String[]args)
   {
      Scanner input = new Scanner(System.in);
      int userInput = 0;
      
      System.out.println("Please enter an int: ");
      
      userInput = input.nextInt();
      
      if(userInput == 0)
      {
         throw new NullPointerException("reference variable must point at an object");
      }  
      
      if(userInput < 0)
      {
         throw new IllegalStateException("cannot use a negative value");
      }
      
       if(userInput > 10)
      {
         throw new IllegalArgumentException("cannot use zero");
      }
      
       if(userInput == 999)
      {
         throw new ArrayIndexOutOfBoundsException("must stay within the array bounds");
      }
      
      if(userInput == 3000)
      {
         throw new UnsupportedOperationException("hmm, not yet implemented.");
      }
      
      else
      {
         System.out.println(userInput);
      }



      
      
   }
}
import java.util.Scanner;
public class Exceptions1
{
   public static void main(String[]args)
   {
      Scanner kbd = new Scanner(System.in);
      int x = 25;
      int q = 0;
      int d = 0;
      int count = 0;
      
      //Prompt user for 3 valid divisors and display the result for each.
     //Display the message cannot divide by zero.

      
      while( count != 3)
      {   
         System.out.println("Enter valid divisors: ");
         d = kbd.nextInt();
      
         count++;
          
         try
         {
            q = x / d;  
         }
   
         catch(Exception e)
         {
            System.out.println("Invalid divisor");
            System.out.println("e = " + e);
            count--;
         }
      
         finally
         {
            System.out.println("Reminder: cannot divide by zero");
         }
      
         System.out.println("q = " + q);
      } 
    }
}
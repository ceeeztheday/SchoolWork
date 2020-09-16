import java.util.Scanner;
public class Exceptions2
{
   public static void main(String[]args)
   {
      Scanner kbd = new Scanner(System.in);
      int [] a = new int[3];
      int i = 0;
      
      System.out.println("User, please enter the index for the value you wish to see: ");
      i = kbd.nextInt();
      
      try
      {
         System.out.println(a[i]);
      }
      
      catch(Exception e)
      {
         System.out.println("e = " + e);
         System.out.println("Enter an index below " + a.length);
      } 
   }
}
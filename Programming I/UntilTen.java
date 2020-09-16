import java.util.*;
public class UntilTen
{
   public static void main(String[]args)
   {
      Scanner input = new Scanner(System.in);
      int n = 0;
      int max = 0;
      int min = 10;
      
      while(n!=10)
      {
         System.out.println("Enter an integer:");
         n = input.nextInt();
         
         if(max<n)
         max=n;
         
         if(min>n)
         min=n;
      }
      
      System.out.println("min: "+min);
      System.out.println("max: "+max);
      
   
   
   
   }



}
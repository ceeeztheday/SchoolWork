import java.util.Scanner;
public class SecondNumberSmaller
{
   public static void main(String[]args)
   {
      int n = 0 ;
      int prev =0 ;
      boolean smaller = false;
      int count = 0;
      Scanner input = new Scanner(System.in);
      
      while(smaller == false)
      {
         prev = n;
         System.out.println("Enter an Integer: ");
         n=input.nextInt();
         count++;
          
         
         
         if(prev>n)
         smaller = true;
      }
      
      System.out.println("You entered " + count+ " integers.");
      System.out.println("The last one entered was " +n+" and the one "+ 
                           "before that was "+prev+".");
         
      
  
   }
}
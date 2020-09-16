import java.util.*;
public class EXam
{

   public static void main(String[]args)
   {
      int prev1 = 0;
      int prev2 = 0;
      int n = 0;
      boolean three = false;
      
      Scanner input = new Scanner(System.in);
      
      while(three == false)
      {
         System.out.println("Enter an int:");
         n= input.nextInt();
         
         if(n==prev1&&n==prev2)
            three=true;
         else if(n==prev1)
            prev2=n;
          else
            prev1=n;
      }
      
      
      System.out.println("You");
            
            
         
        }    
      
      }

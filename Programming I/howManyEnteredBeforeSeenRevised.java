import java.util.*;
public class howManyEnteredBeforeSeenRevised
{
   public static void main (String [] args)
   {
      //variable declaration
      int number1 = 25;
      int number2 = 17;
      
      HowManyEnteredBeforeSeen(number1, number2);
   }
   
   
   public static void HowManyEnteredBeforeSeen(int a, int b)
   {
      Scanner input = new Scanner(System.in);
      int guess1  = 0;
      int guess2 = 0;
      int count = 0;
      boolean foundA = false;
      boolean foundB = false;
      int n = 0;
   
      while(foundA == false || foundB == false)
      {
         System.out.println(" Enter an integer: ");
         n = input.nextInt();
         count++;
         
         if(n == a)
         {   
             foundA = true;
            
            System.out.println(" Enter an integer: ");
            n = input.nextInt();
            count++;
  
            if (n == b)
            {  
             foundB = true;
            }
            else if (n == a)
            {
               foundA = true;
            }
         
        
          
     }
     System.out.println("You entered " + count + " integers before guessing " + a + " and " + b);
   }
 }
 }
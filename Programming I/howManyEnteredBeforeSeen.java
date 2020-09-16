import java.util.*;
public class howManyEnteredBeforeSeen
{
   public static void main (String [] args)
   {
      //variable declaration
      int number1 = 17;
      int number2 = 25;
      
      HowManyEnteredBeforeSeen(number1, number2);
   }
   
   
   public static void HowManyEnteredBeforeSeen(int a, int b)
   {
      Scanner input = new Scanner(System.in);
      int guess  = 0;
      int count = 0;
      boolean foundA = false;
      boolean foundB = false;
   
      while(foundA == false || foundB == false)
      {
         System.out.println(" Enter an integer: ");
         guess = input.nextInt();
         count++;
   
         if(guess == a)
            foundA = true;
         if(guess == b)
            foundB = true; 
       }
       System.out.println("You entered " + count + " integers before guessing " + a + " and " + b);
   }
 }
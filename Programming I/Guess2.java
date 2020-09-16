import java.util.Scanner;
public class Guess2
{
   public static void main(String[]args)
   {
      Scanner input = new Scanner(System.in);
      int count = 0;
      int guess = 0;
      int a = 1; //change to any number to test
      int b = 10;// change to any number to test
               
      while(guess!=a && guess!=a)//place to change
      {
         count++;  
         System.out.println("Please enter your guess from 1 - 10: ");
         guess = input.nextInt();
         
         count++;  
         System.out.println("Please enter your guess from 1 - 10: ");
         guess = input.nextInt();
         
      }
      
      System.out.println("Congrats, you entered "+count+" values before guessing correct.");
   }
}

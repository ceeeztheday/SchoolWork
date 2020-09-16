import java.util.Scanner;

public class Program1 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      // Variables
      int n;
      int sum;

      // User Prompt
      System.out.println("Enter a number between 1 and 100, inclusive: ");
      n = input.nextInt();
      sum = n * (n + 1) / 2;

      // Program logic
      System.out.println("The sum of the numbers between 1 and " + n + " is: " + sum);
   }
}
/*
 * Enter a number between 1 and 100, inclusive: 5 The sum of the numbers between
 * 1 and 5 is: 15
 * 
 * Enter a number between 1 and 100, inclusive: 10 The sum of the numbers
 * between 1 and 10 is: 55
 * 
 * Enter a number between 1 and 100, inclusive: 28 The sum of the numbers
 * between 1 and 28 is: 406
 * 
 * Enter a number between 1 and 100, inclusive: 39 The sum of the numbers
 * between 1 and 39 is: 780
 */
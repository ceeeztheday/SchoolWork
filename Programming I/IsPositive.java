import java.util.Scanner;

public class IsPositive {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      // var
      int number;

      // Prompt
      System.out.println("Please enter a positive or negative integer: ");
      number = input.nextInt();

      // logic
      if (number >= 0)
         System.out.println("The value " + number + " is positive.");
      else
         System.out.println("The value " + number + " is not positive.");
   }
}
/*
 * Please enter a positive or negative integer: 7 The value 7 is positive.
 * Please enter a positive or negative integer: -33 The value -33 is not
 * positive. Please enter a positive or negative integer: 0 The value 0 is
 * positive.
 * 
 * Please enter a positive or negative integer: -45 The value -45 is not
 * positive. Please enter a positive or negative integer: 50 The value 50 is
 * positive. INITIAL QUESTIONS Q1. int number
 * 
 * Q2. Prompt user to enter a positive or negative integer Store data into
 * variable number Perform an if statement (number>=0) Display an output based
 * on if statement
 * 
 * Q3. The program will perform an if statement to determine if the integer
 * enter by the user is positive or negative. Based on the out come of the if
 * statement the program will display one of two display outputs.
 * 
 * Q4. I am going to make a user prompt to enter an integer. I will then create
 * an if statement to determine if the user enter either a positive or negative
 * number. I will then make 2 display out puts and based on the users input
 * number one of the two outputs will display.
 */

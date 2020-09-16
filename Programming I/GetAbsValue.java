import java.util.Scanner;

public class GetAbsValue {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      // variables
      int number;

      // prompt
      System.out.println("Please enter a negative or positive integer: ");
      number = input.nextInt();

      // logic and display
      if (number >= 0)
         System.out.println("The absolute value of " + number + " is: " + number);
      else
         System.out.println("The absolute value of " + number + " is: " + -number);
   }
}
/*
 * Please enter a negative or positive integer: -10 The absolute value of -10
 * is: 10 Please enter a negative or positive integer: 10 The absolute value of
 * 10 is: 10 Please enter a negative or positive integer: -21 The absolute value
 * of -21 is: 21 Please enter a negative or positive integer: 0 The absolute
 * value of 0 is: 0 INITIAL QUESTIONS Q1. int number
 * 
 * Q2. Prompt user to enter a positive or negative integer Store data into
 * variable number Perform an if statement (number>=0) Display an output based
 * on if statement
 * 
 * Q3. The program will perform an if statement to determine if the integer
 * enter by the user is positive or negative. Based on the out come the program
 * will display one of two display outputs.
 * 
 * Q4. I am going to make a user prompt to enter an integer. I will then create
 * an if statement to determine if the user enter either a positive or negative
 * number. I will then make 2 display out puts and based on the users input
 * number one of the two outputs will display.
 */
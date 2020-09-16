import java.util.Scanner;

public class IsInRangeTwo {
   public static void main(String[] args) {
      // var
      int num1;
      int num2;
      int testValue;
      Scanner input = new Scanner(System.in);

      // prompt
      System.out.println("Please enter two values representing a range.");
      System.out.println("The values do not need to be in order.");
      System.out.println("Please enter the first value: ");
      num1 = input.nextInt();
      System.out.println("Please enter the second value: ");
      num2 = input.nextInt();
      System.out.println("Please enter the value to be tested: ");
      testValue = input.nextInt();

      // logic and display
      if (num1 <= testValue && testValue <= num2)
         System.out.println(testValue + " is in range.");

      else if (num1 >= testValue && testValue >= num2)
         System.out.println(testValue + " is in range.");

      else if (num2 >= testValue && testValue >= num1)
         System.out.println(testValue + " is in range.");

      else if (num2 <= testValue && testValue <= num1)
         System.out.println(testValue + " is in range.");

      else
         System.out.println(testValue + " is not in range.");
   }
}
/*
 * Please enter two values representing a range. The values do not need to be in
 * order. Please enter the first value: 3 Please enter the second value: 12
 * Please enter the value to be tested: 7 7 is in range. Please enter two values
 * representing a range. The values do not need to be in order. Please enter the
 * first value: 12 Please enter the second value: 3 Please enter the value to be
 * tested: 6 6 is in range. Please enter two values representing a range. The
 * values do not need to be in order. Please enter the first value: 1 Please
 * enter the second value: 12 Please enter the value to be tested: 33 33 is not
 * in range. Please enter two values representing a range. The values do not
 * need to be in order. Please enter the first value: 100 Please enter the
 * second value: 3 Please enter the value to be tested: 25 25 is in range.
 * INITISL QUESTIONS Q1. int num1 int num2 int testValue
 * 
 * Q2. Prompt user to enter 2 values that represent a range Prompt user to enter
 * a value to be tested Store user inputs into variables Perform if statments
 * Display output statements based on if statements
 * 
 * Q3. The program will perform if statements to determine if the integers enter
 * by the user are within the range entered by the user. Based on the out come
 * of the if statements the program will display one of two display outputs.
 * 
 * Q4. I am going to make a user prompt to enter 2 integers which will represent
 * a range. I will then make another user prompt to enter an integer which will
 * be tested. I will then create if statements to determine if the test value
 * integer entered by the user is within the range values entered by the user.
 * Based on the if statments either one of two outputs will be displayed.
 */
import java.util.Scanner;

public class IsItARectangle {
   public static void main(String[] args) {
      // var
      int s1;
      int s2;
      int s3;
      int s4;
      Scanner input = new Scanner(System.in);

      // user prompt
      System.out.println("Please enter four integers: ");
      s1 = input.nextInt();
      s2 = input.nextInt();
      s3 = input.nextInt();
      s4 = input.nextInt();

      // logic
      if (s1 == s2 && s2 == s3) // test for square first
         System.out.println("The four sides do not represent those of a rectangle.");
      else if (s3 == s4 && s4 == s1)// test for square
         System.out.println("The four sides do not represent those of a rectangle.");
      else if (s1 == s2 && s3 == s4)
         System.out.println("The four sides represent those of a rectangle.");
      else if (s1 == s3 && s2 == s4)
         System.out.println("The four sides represent those of a rectangle.");
      else if (s1 == s4 && s3 == s2)
         System.out.println("The four sides represent those of a rectangle.");
      else
         System.out.println("The four sides do not represent those of a rectangle.");
   }
}
/*
 * Please enter four integers: 34 34 96 96 The four sides represent those of a
 * rectangle. Please enter four integers: 34 34 34 34 The four sides do not
 * represent those of a rectangle. Please enter four integers: 34 44 63 71 The
 * four sides do not represent those of a rectangle. Please enter four integers:
 * 1 2 3 4 The four sides do not represent those of a rectangle.
 * 
 * Please enter four integers: 100 200 100 200 The four sides represent those of
 * a rectangle. INITIAL QUESTIONS Q1. int s1, s2, s3, s4
 * 
 * Q2. Prompt user for 4 integers Store data into variables Perform if
 * statements to test for a square Perform if statemenst to test for a rectangle
 * Display output based on if statments
 * 
 * Q3. The program will perform if statements to determine if the four integers
 * enter by the user can be the sides of a rectangle. Based on the out come of
 * the if statements the program will display one of two display outputs.
 * 
 * Q4. I am going to make a user prompt to enter a four integers, which are
 * going to represent the 4 corners of a shape. I will then create an if
 * statement to determine if the user entered numbers that will represent a
 * square, thw if statments will then go on to determind if the sides entered by
 * the user will represent a recangle. Based on the if statment one of two
 * outputs will be displayed.
 */

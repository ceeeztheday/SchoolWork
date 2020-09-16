import java.util.Scanner;

public class MeasurementInInches {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      // Variables
      int totalInches;
      int yards;
      int feet;
      int remaining;

      // Prompt user to enter total inches
      System.out.println("Please enter the total number of inches: ");
      totalInches = input.nextInt();
      remaining = totalInches;
      yards = remaining / 36;
      remaining = remaining % 36;
      feet = remaining / 12;
      remaining = remaining % 12;

      // Display
      System.out.println("In total of " + totalInches + " inches, there is/are " + yards + " yard(s), " + feet
            + " foot/feet, and " + remaining + " remaining inch(es).");
   }
}
/*
 * Please enter the total number of inches: 85 In total of 85 inches, there
 * is/are 2 yard(s), 1 foot/feet, and 1 remaining inch(es). Please enter the
 * total number of inches: 98 In total of 98 inches, there is/are 2 yard(s), 2
 * foot/feet, and 2 remaining inch(es). Please enter the total number of inches:
 * 67 In total of 67 inches, there is/are 1 yard(s), 2 foot/feet, and 7
 * remaining inch(es). Please enter the total number of inches: 23 In total of
 * 23 inches, there is/are 0 yard(s), 1 foot/feet, and 11 remaining inch(es).
 */
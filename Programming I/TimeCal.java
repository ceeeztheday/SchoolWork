import java.util.Scanner;

public class TimeCal {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      // Variables
      int totalSeconds;
      int days;
      int hours;
      int min;
      int remainingSeconds;

      // User prompt
      System.out.println("Enter the total number of seconds: ");
      totalSeconds = input.nextInt();

      remainingSeconds = totalSeconds;

      days = remainingSeconds / 86400;
      remainingSeconds = remainingSeconds % 86400;

      hours = remainingSeconds / 3600;
      remainingSeconds = remainingSeconds % 3600;

      min = remainingSeconds / 60;
      remainingSeconds = remainingSeconds % 60;

      // Display
      System.out.println("In " + totalSeconds + " there is/are " + days + " day(s), " + hours + " hour(s) " + min
            + " minute(s), and " + remainingSeconds + " second(s).");
   }
}
/*
 * Enter the total number of seconds: 86459 In 86459 there is/are 1 day(s), 0
 * hour(s) 0 minute(s), and 59 second(s). Enter the total number of seconds: 69
 * In 69 there is/are 0 day(s), 0 hour(s) 1 minute(s), and 9 second(s).
 * 
 * Enter the total number of seconds: 3659 In 3659 there is/are 0 day(s), 1
 * hour(s) 0 minute(s), and 59 second(s). Enter the total number of seconds:
 * 2345 In 2345 there is/are 0 day(s), 0 hour(s) 39 minute(s), and 5 second(s).
 */
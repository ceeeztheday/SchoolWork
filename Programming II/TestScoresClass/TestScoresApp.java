import java.util.Scanner;
import java.text.NumberFormat;

public class TestScoresApp {
   public static void main(String[] args) {
      Scanner kbd = new Scanner(System.in);
      int count = 0, num = 0, sum = 0, countP = 0, countD = 0;
      boolean isPresent = false;
      double avgScore = 0.0;

      while (isPresent == false) {
         System.out.print("Enter score(type 999 to end): ");
         num = kbd.nextInt();

         if (num != 999) {
            if (num >= 0 && num <= 100) {
               count++;
               sum += num;
            }
            if (num >= 70 && num <= 100)
               countP++;
            if (num >= 0 && num <= 69)
               countD++;
         } else
            isPresent = true;

      }

      avgScore = sum / count;

      String message = "\nNumber of valid scores entered: " + count + "\nScore total: " + sum
            + "\nNumber of passing scores: " + countP + "\nNumber of non-passing scores: " + countD
            + "\nScore Average: " + avgScore;

      System.out.println(message);

   }
}
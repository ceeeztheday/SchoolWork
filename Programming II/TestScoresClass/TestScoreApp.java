import java.util.Scanner;
import java.text.NumberFormat;

public class TestScoreApp {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num = 0;
      int score = -1;
      int passVals = 0;
      int failVals = 0;
      int total = 0;
      double average = 0.0;

      while (num != 999) {
         System.out.println("Enter score(type 999 to end):");
         num = sc.nextInt();
         score++;
         if (num >= 70 && num != 999)
            passVals++;

         if (num < 70 && num != 999)
            failVals++;

         if (num != 999)
            total = total + num;

      }
      average = total / score;

      String message = "Number of valid scores entered: " + score + "\n" + "Score total: " + total + "\n"
            + "number of passing scores: " + passVals + "\n" + "number of non-passing scores: " + failVals + "\n"
            + "average: " + average;

      System.out.println(message);
   }

}
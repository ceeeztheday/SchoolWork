import java.util.*;
import java.io.*;

public class ExamScoresInt {
   public static void main(String[] args) {
      // var
      int count = 0;
      int sum = 0;
      int ave = 0;
      int a = 0;

      try {
         Scanner fScanner = new Scanner(new File("scores.txt"));

         while (fScanner.hasNextLine()) {
            a = fScanner.nextInt();
            sum = sum + a;
            count++;
            System.out.print(a + " ");

         }

         ave = sum / count;

         System.out.println();
         System.out.println("The sum is: " + sum);
         System.out.println("The average is: " + ave);

      }

      catch (FileNotFoundException fnfe) {
         System.out.println("File Not Found");
      }

      catch (InputMismatchException ime) {
         System.out.println("Input Mismatch Expection");
      }

   }

}
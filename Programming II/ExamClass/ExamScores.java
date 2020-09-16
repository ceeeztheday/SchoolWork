import java.math.*;
import java.io.*;
import java.util.*;

public class ExamScores {
   public static void main(String[] args) {
      // variable declarations
      BigInteger biSum = new BigInteger("0");
      BigInteger biAverage = new BigInteger("0");
      BigInteger biCount = new BigInteger("0");
      BigInteger biOne = new BigInteger("1");

      // program logic (within a try/catch block)
      try {
         Scanner fScanner = new Scanner(new File("scores.txt"));
         while (fScanner.hasNextLine()) {
            String[] values = fScanner.nextLine().split(" ");

            for (String s : values) {
               biSum = biSum.add(new BigInteger(s));
               System.out.print(s + " ");
               biCount = biCount.add(biOne);
            }

            biAverage = biSum.divide(biCount);
         }

         System.out.println();
         System.out.println("The sum is " + biSum);
         System.out.println("The average is " + biAverage);

      }

      catch (FileNotFoundException fnf) {
         System.out.println("In FileNotFoundException, the message was: " + fnf);
      }

      catch (InputMismatchException ime) {
         System.out.println("In InputMismatchException, the message was: " + ime);
      }

   }
}
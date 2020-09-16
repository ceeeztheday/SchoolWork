import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ReadCountries {
   public static void main(String[] args) throws IOException {
      String fileName = null;
      Scanner input = new Scanner(System.in);

      System.out.println("Please enter a file name: ");
      fileName = input.next();

      try {
         java.io.File file = new java.io.File(fileName);

         Scanner inputFile = new Scanner(file);

         inputFile.useDelimiter("\\Z");

         String strCountries = inputFile.next();

         String[] arrCountries = strCountries.split("\n");

         for (String s : arrCountries) {
            System.out.println(s);
         }
      } catch (FileNotFoundException e) {
         System.out.println("Error: " + e);
      }

      catch (InputMismatchException i) {
         System.out.println("Error: " + i);
      }
   }
}
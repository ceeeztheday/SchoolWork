import java.util.Scanner;

public class VerticalOutputDisplay {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      // Variable
      int year;
      int a;
      int b;
      int c;
      int d;

      // User prompt
      System.out.println("Please enter a four-digit integer: ");
      year = input.nextInt();

      // Logic
      a = year / 1000;
      year = year % 1000;

      b = year / 100;
      year = year % 100;

      c = year / 10;
      year = year % 10;

      d = year / 1;
      year = year % 1;

      // Display
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
      System.out.println(d);
   }
}
/*
 * Please enter a four-digit integer: 1998 1 9 9 8 Please enter a four-digit
 * integer: 1993 1 9 9 3 Please enter a four-digit integer: 9854 9 8 5 4 Please
 * enter a four-digit integer: 7643 7 6 4 3
 */
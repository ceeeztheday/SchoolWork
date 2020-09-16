import java.util.Scanner;

public class SeveralLoop_2 {
   public static void main(String[] args) {
      // var
      int n;
      int i;
      int sum;
      Scanner input = new Scanner(System.in);

      // Prompt
      System.out.println("Please enter an integer greater than zero: ");
      n = input.nextInt();
      System.out.println("You entered the value: " + n);

      // loops
      for (i = 1; i <= n; i++)// 1-n
      {
         System.out.println(i);
      }
      for (i = n; i >= 1; i--)// n-1
      {
         System.out.println(i);
      }
      for (i = 1; i <= n; i++)// multiples of 3 1-n
      {
         if (i % 3 == 0)
            System.out.println(i);
      }
      for (i = 1; i <= n; i++)// multiples of 7 1-n
      {
         if (i % 7 == 0)
            System.out.println(i);
      }
      for (i = n; i >= 1; i--)// even n-1
      {
         if (i % 2 == 0)
            System.out.println(i);
      }
      for (i = 1; i <= n; i++)// sum of 1-n
      {
         sum = i * (i + 1) / 2;
         if (i == n)
            System.out.println("The sum of the numbers between 1 and 100 is: " + sum);
      }
   }
}
/*
 * Please enter an integer greater than zero: 30 You entered the value: 30 1 2 3
 * 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 30
 * 29 28 27 26 25 24 23 22 21 20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1
 * 3 6 9 12 15 18 21 24 27 30 7 14 21 28 30 28 26 24 22 20 18 16 14 12 10 8 6 4
 * 2 The sum of the numbers between 1 and 100 is: 465
 */

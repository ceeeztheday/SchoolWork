public class SeveralLoop {
   public static void main(String[] args) {
      int i;
      int sum;

      for (i = 1; i <= 10; i++)// 1-10
      {
         System.out.println(i);
      }
      for (i = 10; i >= 1; i--)// 10-1
      {
         System.out.println(i);
      }
      for (i = 1; i <= 25; i++)// multiples of 3 1-25
      {
         if (i % 3 == 0)
            System.out.println(i);
      }
      for (i = 1; i <= 100; i++)// multiples of 7 1-100
      {
         if (i % 7 == 0)
            System.out.println(i);
      }
      for (i = 100; i >= 1; i--)// even 100-1
      {
         if (i % 2 == 0)
            System.out.println(i);
      }
      for (i = 1; i <= 100; i++)// sum of 1-100
      {
         sum = i * (i + 1) / 2;
         if (i == 100)
            System.out.println("The sum of the numbers between 1 and 100 is: " + sum);
      }
   }
}
/*
 * 1 2 3 4 5 6 7 8 9 10 10 9 8 7 6 5 4 3 2 1 3 6 9 12 15 18 21 24 7 14 21 28 35
 * 42 49 56 63 70 77 84 91 98 100 98 96 94 92 90 88 86 84 82 80 78 76 74 72 70
 * 68 66 64 62 60 58 56 54 52 50 48 46 44 42 40 38 36 34 32 30 28 26 24 22 20 18
 * 16 14 12 10 8 6 4 2 The sum of the numbers between 1 and 100 is: 5050
 */

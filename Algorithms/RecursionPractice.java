import java.util.ArrayList;
import java.util.Arrays;

public class RecursionPractice
{
   public static void main(String[] args)
   {
      long nP = numPaths( 12, 12 );
      System.out.println( "Num paths = " + nP );
      
      int n = 9;
      System.out.println( "factorial(" + n + ") is " + factorial(n));
      
      n = 12;
      System.out.println( "fibonacci(" + n + ") is " + fibonacci(n));
      System.out.println( "Recursion count = " + fibCount );
      
      int st = 1;
      int end = 4;
      System.out.println( "Sum of the numbers from " + st + " to " + end + " is " + sum(st, end) ); 
      
      towersOfHanoi(3, 1,3,2 );
      String pal = "madam";
      if( isPalindrome(pal) ) 
      {
         System.out.println( pal + " is a palindrome!" );
      }
      else
      {
         System.out.println( pal + " is NOT a palindrome!" );
      }
      int[] a = {1,2,3,5,4,6,7,8};
      if( isSorted(a) )
      {
         System.out.println( Arrays.toString(a) + " is sorted!" );
      }
      else
      {
         System.out.println( Arrays.toString(a) + " is NOT sorted!" );
      }
      int[] a2 = {3,5,7,8,9,10,12,14};
      if( isSorted(a2) )
      {
         System.out.println( Arrays.toString(a2) + " is sorted!" );
      }
      else
      {
         System.out.println( Arrays.toString(a2) + " is NOT sorted!" );
      }
   }
   
   public static long factorial(int n)
   {
      if(n == 1) 
      {
         return 1;
      }
      if(n == 0)
      {
         return 1;
      }
      return n * factorial(n-1);
   }
   
   public static int fibCount = 0;
   public static long fibonacci(int n)
   {
      if(n <= 1)
      {
         return n;
      }
      fibCount++;
      return fibonacci(n-1) + fibonacci(n-2);
   }
   
   public static void towersOfHanoi(int n, int start, int aux, int end)
   {
      if(n == 0)
      {
         return;
      }
      towersOfHanoi(n-1, start, end, aux);
      System.out.println("Move from " + start + " to " + end);
      towersOfHanoi(n-1, aux, start, end);
   }
   
   /* sum all values between s and n inclusive */
   /*   assume s is less than or equal to n to start */
   public static int sum(int s, int n)
   {
      int c = 0;
      for(int i = s; i <= n; i++)
      {
         c = c + i;
      }
      return c;
   }
   /* this method is done, it simply calls the recursive method */
   public static boolean isSorted(int[] a)
   {
      return isSortedRec(a, 0, a.length-1);
   }
   /* assume low < high to begin */
   public static boolean isSortedRec( int[] a, int low, int high )
   {
      if(a[low] < a[high])
      {
         return true;
      }
      return false;
   }

   /* this next method is done, it simply calls the recursive method */
   public static boolean isPalindrome(String a)
   {
      //return isPalindromeRec(a, 0, a.length()-1);
      int n = a.length();
      for (int i = 0; i < (n/2); ++i) 
      {
         if (a.charAt(i) != a.charAt(n - i - 1)) 
         {
            return false;
         }
      }
      return true;
   }
   public static boolean isPalindromeRec( String a, int low, int high )
   {
      if(a.charAt(low) == a.charAt(high))
      {
         return true;
      }
      return false;
   }
   public static long numPaths(int r, int c)
   {
   
      if(r == 0 || c == 0)
      {
         return 1;
      }
      return numPaths(r - 1, c) + numPaths(r, c - 1);
   }
}
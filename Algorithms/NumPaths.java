public class NumPaths
{
   static long recCount = 0;
   static long [][] memo;
   static long [] memo1D;
   public static void main(String [] args)
   {
      int n = 25;
      memo1D = new long[n + 1];
      recCount = 0;
      long fib = fib(n);
      System.out.println("fibananci of " + n + " equals " + fib);
      System.out.println("Number of recursions called: " + recCount);
      int r = 100;
      int c = 100;
      memo = new long [r + 1][c + 1];
      long result = numPaths(r, c);
      
      System.out.println("Number of shortest paths from " + r + ", " + c + " are: " + result);
      System.out.println("Number of recursions called: " + recCount);
      
   }
   public static long numPaths(int r, int c)
   {
      recCount = recCount + 1;
      if(memo[r][c] > 0)
         return memo[r][c];
      if(r == 0 && c == 0)
      {
         return 0;
      }
      if(c == 0 || r == 0)
         return 1;
      long np = numPaths(r, c - 1) + numPaths (r -1, c);
      memo[r][c] = np;
      return numPaths(r, c - 1) + numPaths (r -1, c);
   }
   public static long fib(int n)
   {
      recCount = recCount + 1;
      if(memo1D [n] > 0)
         return memo1D[n];
      recCount = recCount + 1;
      if(n <= 1)
         return n;
      long result = fib(n - 1) + fib(n - 2);
      memo1D[n] = result;
      return result;
   }
}
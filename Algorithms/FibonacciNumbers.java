public class FibonacciNumbers
{
   static int[] fibArray;
   public static void main(String[] args)
   {
      int n = 45;
      
      long startTime = System.currentTimeMillis();
      System.out.println(fib(n));
      long estimatedTime = System.currentTimeMillis() - startTime;      
      System.out.println("Time cost: " + estimatedTime/ 1000.0 + "s. ");
      
      fibArray = new int[n];
      
      startTime = System.currentTimeMillis();
      System.out.println(fib(n));      
      estimatedTime = System.currentTimeMillis() - startTime;
      System.out.println("Time cost: " + estimatedTime/ 1000.0 + "s. ");
   }
   public static int fib(int n)
   {
      if(n <= 1)
      {
         return 1;
      }
      else
      {
         return fib(n - 1) + fib(n - 2);
      }
   }
   
   public static int fibDP(int n)
   {
      if(n <= 1)
      {
         return 1;
      }
      else
      {
         //check if fibArray[n-1] is calculated
         if(fibArray[n-1] == 0);
         {
            fibArray[n-1] = fibDP(n - 1);
         }
         
          //check if fibArray[n-2] is calculated
         if(fibArray[n-2] == 0);
         {
            fibArray[n-2] = fibDP(n - 2);
         }
         return fibArray[n-1] + fibArray[n-2];
      }
   }
}
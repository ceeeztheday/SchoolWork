import java.util.Arrays;

public class LargestSubArray
{
   static int start = 0;
   static int end = 0;
   
   public static void main(String [] args)
   {
      int [] a = new int [20];
      for(int i = 0; i < a.length; i++)
      {
         a[i] = a.length - (int)(Math.random()*a.length*2);
      }
      System.out.println(Arrays.toString(a));
      System.out.println("largeset sub array sum = " + lsa(a));
      System.out.println("largeset sub array sum = " + lsa(a));
      System.out.println("start = " + start + " end = " + end);
   }
   public static int lsa(int [] a)     //runtime is n^2
   {
      int maxSum = a[0];
      
      for(int i = 0; i < a.length; i++)
      {
         int sum = 0;
         for(int j = i; j < a.length; j++)
         {
            //calculate sum
            sum = sum + a[j];
            
            if(sum > maxSum)
            {
               maxSum = sum;
               start = i;
               end = j;
            }
         }
      }
      return maxSum;
   }
   public static int lsaRec(int[] a, int s, int e)
   {
      if(e < s)      //something is wrong
         return 0;
      if(s == e)
         return a[s];
      int mid = (s + e)/ 2;
      int valLeft = lsaRec(a, s, mid);
      int valRight = lsaRec(a, mid + 1, e);
      int valMid = 0;
      int sum = 0;
      int maxSumL = a[mid];
      
      for(int i = mid; i >= 0; i--)
      {
         sum = sum + a[i];
         if(sum > maxSumL)
            maxSumL = sum;
      }
      
      int maxSumR = a[mid + 1];
      sum = 0;
      
      for(int i = mid + 1; i <= e; i++)
      {
         sum = sum + a[i];
         if(sum > maxSumR)
            maxSumR = sum;
      }
      valMid = maxSumR + maxSumL;
      
      return Math.max(valMid, Math.max(valLeft, valRight));
   }
}
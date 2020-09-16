public class hw1Practice
{
   public static void main(String args[])
   {
      myfun1(8);
      //myfun(6);
      //System.out.println(myfun2(9));
      //System.out.println(7293);
      //int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9};
      
      //myfun4(A, 3);
      
   }
   
   
//    public static void myfun(int n)
//    {
//       for(int i = 1; i <= n/4; i++)
//       {
//          System.out.println("i = " + i);
//          for(int k = 1; k <= i; k++)
//          {
//             System.out.println(k);
//          }
//       }
//    }
   public static void myfun1(int n)
   {
      System.out.println("n = " + n);
      for(int k = 1; k <= n/2; k++)
      {
         System.out.println(k);
         for(int m = 1; m <= k; m++)
         {
            System.out.println(k + ", " + m);
         }
      }
   }
//    public static int myfun2(int n)
//    {
//       int p, k, t;
//       p = n;
//       k = 10;
//       int c = 0;
//       while( p >= 1)
//       {
//          k = k + p;
//          for(t = n; t >= 0; t = t - 3)
//          {
//             System.out.println(p + ", " + t);
//             k++;
//             c++;
//          }
//          p = p / 3;
//       }
//       System.out.println("the number of lines are " + c);
//       return k;
//    }

//    public static boolean myfun4(int[] A, int n)
//    {
//       int i, j;
//       for(i = 0; i < n; i++)
//       {
//          for(j = 1 + 1; j < n; j++)
//          {
//             if(A[i] == A[j])
//             {
//                return false;
//             }
//             else
//             {
//                return true;
//             }
//          }
//       }
//       return true;
//    }
}
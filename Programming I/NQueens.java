import java.util.Arrays;

public class NQueens
{
   static int[] B;
   
   public static void main(String [] args)
   {
      int numQueens = 5;
      B = new int [numQueens];
      bt(-1);
   }
   public static boolean promising(int q)
   {
      for(int i = 0; i < q; i++)
      {
         if(B[i] == B[q])
            return false;
         if(Math.abs(q - i) == Math.abs(B[q] - B[i]))
            return false;
      }
      return true;
   }
   public static boolean validSolution(int q)
   {
      if(q == B.length - 1)
         return true;
      else
         return false;
   }
   public static void bt(int curQueen)
   {
      if(!promising(curQueen))
      {
         return;
      }
      else
      {
         if(validSolution(curQueen))
         {
            System.out.println(Arrays.toString(B));
            return;
         }
         for(int c = 0; c < B.length; c++)
         {
            B[curQueen + 1] = c;
            bt(curQueen + 1);
         }
      }
   }
}
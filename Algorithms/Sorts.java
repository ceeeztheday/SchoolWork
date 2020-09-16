import java.util.Arrays;

public class Sorts
{
   public static void main(String [] args)
   {
      int s = 20;
      while(s <= 200)
      
      int [] A = new int [s];
      int [] B = new int [s];
      int [] C = new int [s];
      
      for(int i = 0; i < A.length; i++)
      {
         A[i] = (int)(Math.random()*s*2);
         B[i] = A[i];
      }
      C = mergeSort(C);
      System.out.println("Merge sort finished!");
      Size = + C.length
      //System.out.println(Arrays.toString(C));
      //System.out.println(Arrays.toString(A));
      bubbleSort(B);
      System.out.println("Bubble sort finished!");
      //System.out.println(Arrays.toString(B));
      s = s * 10;
   }
   public static void bubbleSort (int[] A)
   {
      for(int i = 0; i < A.length; i++)
      {
         for(int j = 1; j < A.length; j++)
         {
            if(A[j] < A[j - 1])
            {
               int t = A[j];
               A[j] = A[j - 1];
               A[j - 1] = t;
            }
         }
      }
   }
   public static int[] mergeSort(int[] A)
   {
      if(X.length <= 1)
         return X;
      
      int[] L = new int[X.length/2];
      int[] R = new int[X.length - L.length];
      for(int i = 0; i < X.length; i++)
      {
         if(i < L.length)
            L[i] = X[i];
         else
            R[i - L.length] = X[i];
      }
      L = mergeSort(L);
      R = mergeSort(R);
      X = merge(L,R);
      return X;
   }
   public static int[] merge(int[] A, int[] B)
   {
      int[] R = new int[A.length + B.length];
      
      int aInx = 0;
      int bIdx = 0;
      
      while(aIdx < A.length && bIdx < B.length)
      {
         if(A[aIdx] < B[bIdx])
         {
            R[rIdx] = A[aIdx];
            aIdx++;
            rIdx++;
         }
         else
         {
            R[rIdx] = B[bIdx];
            bIdx++;
            rIdx++;
         }
      }
      while(aIdx < A.length)
      {
         R[rIdx] = A[aIdx];
         aIdx++;
         rIdx++;
      }
      while(bIdx < B.length)
      {
         R[rIdx] = B[bIdx];
         bIdx++;
         rIdx++;
      }

   }
}
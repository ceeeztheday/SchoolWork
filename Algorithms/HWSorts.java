import java.util.Arrays;

public class HWSorts
{
   static int[] sizes = {20, 100, 500, 1000, 2000, 5000, 10000, 20000, 40000, 65000, 100000, 120000, 130000, 140000, 200000, 500000, 1000000};  
   
   public static void main(String[] args)
   {
      int sIdx = 0;
      long startTime;
      long endTime;
      double time;
      
      while( sIdx < sizes.length ) 
      {
         int[] A = new int[sizes[sIdx]];
         int[] B = new int[sizes[sIdx]];  
         int[] C = new int[sizes[sIdx]]; 
         int[] D = new int[sizes[sIdx]]; 
         int[] E = new int[sizes[sIdx]]; 
         
         for( int i=0; i<A.length; i++ ) 
         {
            A[i] = (int)(Math.random()*sizes[sIdx]*2);
            B[i] = A[i];
            C[i] = A[i];
            D[i] = A[i];
            E[i] = A[i];
         }
         //System.out.println( Arrays.toString(A) );
         System.out.println( "----------------\nSize = " + C.length);
         startTime = System.nanoTime();         
         C = mergeSort(C);         
         endTime = System.nanoTime();
         time = (endTime - startTime) / 1000000000.;
         System.out.println( "Merge sort finished - time = " + time  + " seconds.");
         System.out.println( "Starting bubble sort!" );
         //System.out.println( Arrays.toString(C) );
         startTime = System.nanoTime();
         bubbleSort(B);
         endTime = System.nanoTime();
         time = (endTime - startTime) / 1000000000.;
         System.out.println( "Bubble sort finished - time = " + time  + " seconds." );
         //System.out.println( Arrays.toString(B) );
         System.out.println( "Starting java's Array sort!" );
         //System.out.println( Arrays.toString(C) );
         startTime = System.nanoTime();
         D = javaSort(D);
         endTime = System.nanoTime();
         time = (endTime - startTime) / 1000000000.;
         System.out.println( "Java's Array sort finished - time = " + time  + " seconds." );
         System.out.println( "Starting QuickSort!" );
         //System.out.println( Arrays.toString(C) );
         startTime = System.nanoTime();
         E = quickSort(E);
         endTime = System.nanoTime();
         time = (endTime - startTime) / 1000000000.;
         System.out.println( "QuickSort finished - time = " + time  + " seconds." );
         sIdx = sIdx + 1;   
      }
   }  
   
   public static void bubbleSort(int[] A)
   {
      //write your BubbleSort method here
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
   public static int[] mergeSort(int[] X)
   {
      //mergeSort method - you need to return
      // a reference to the newly built array
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
   private static int[] merge(int[] A, int[] B)
   {
      //create an array of size A.len + B.len
      // blend the two arrays together into one
      //  sorted array and return
      int[] R = new int[A.length+B.length];
      
      int aIdx = 0;
      int bIdx = 0;
      int rIdx = 0;
      
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
      return R;
   }
   public static int[] javaSort(int[] X)
   {
      //use java's Array class to sort X
      return X;
   }
   public static int[] quickSort(int[] X)
   {
      //quicksort doesn't create a new array
      //  so we need additional params for our 
      //  recursive method
      return quickSort(X, 0, X.length-1);   
   }
   public static int[] quickSort(int[] X, int s, int e)
   {
      return X;
   }
}
public class hw2Practice
{
   public static void main(String[] args)
   {
      myFun();
   }
   public static void myFun()
   {
      int[] A = {27, 10, 12, 20, 25, 13, 15, 22};
      printArray(A, 0, 7);
      mystery(A, 0, 7);
   }
   public static void mystery(int[] A, int low, int high)
   {
      for(int s = 2; s <= high - low + 1; s = s * 2)
      {
         for(int i = low; i < high; i = i + s)
         {
            int h = i + s - 1;
            merge(A, i, h);
         }
         printArray(A, low, high);
      }
   }
   public static void printArray(int[] A, int low, int high)
   {
      for(int i = low; i <= high; i++)
      {
         System.out.print(A[i] + " ");
      }
      System.out.println();
   }
   // merge two halves into one sorted arra\y
   public static void merge(int[] numArray, int low, int high)
   {        
      int midIndex = (low + high) / 2;    // calculate the index of the element in the middle
      int n = high - low + 1;             // size of the region to be merged
      int[] tempArray = new int[n];       // merge both halves into a temporary array
        
      int i1 = low;                       // next element to consider in the first half
      int i2 = midIndex + 1;              // next element to consider in the second half
      int j = 0;                          // next open position in the temp array
        
        // as long as neither i1 nor i2 is past the end, move the smaller element into the temp array
      while (i1 <= midIndex && i2 <= high)
      {
         if (numArray[i1] < numArray[i2])
         {
            tempArray[j] = numArray[i1];
            i1++;
         }
         else
         {
            tempArray[j] = numArray[i2];
            i2++;
         }
            
         j++;
      }
        
        // Note that the body of only one of the two while loops below is executed.
        
        // copy any remaining elements of the first half
      while (i1 <= midIndex)
      {
         tempArray[j] = numArray[i1];
         i1++;
         j++;
      }
        
        // copy any remaining elements of the second half
      while (i2 <= high)
      {
         tempArray[j] = numArray[i2];
         i2++;
         j++;
      }
        
        // copy back from the temp array
      for (j = 0; j < n; j++)
         numArray[low + j] = tempArray[j];
   }
}
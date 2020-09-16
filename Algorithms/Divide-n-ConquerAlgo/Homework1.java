// The Homework1 class that contains three algorithm
public class Homework1 {
   // This method takes an integer and a two-dimensional integer array.
   // It returns true if all values are unique (no repeats), or false otherwise.
   public boolean unique(int[][] A) {
      for (int i = 0; i < A.length; i++) {
         for (int j = 0; j < A.length; j++) {
            for (int k = 0; k < A[0].length; k++) {
               for (int l = 0; l < A[0].length; l++) {
                  if (A[i][j] == A[k][l] && (i != k || j != l)) {
                     return false;
                  }
               }
            }
         }
      }
      return true;
   }

   // This method takes an array as well as two integers: low and high.
   // It returns true if the array is sorted in nondecreasing order between the
   // indices low and high, or false otherwise.
   public boolean isSorted(int[] A, int low, int high) {
      if (low >= high) {
         return true;
      } else if (A[low] > A[low + 1]) {
         return false;
      }
      return isSorted(A, low + 1, high);
   }

   // This method takes an array as well as two integers: low and high.
   // It returns the index of the minimum element in array A between indices low
   // and high.
   public int indexOfMin(int[] A, int low, int high) {
      if (low >= high) {
         return low;
      } else {
         int half = (low + high) / 2;

         int i = indexOfMin(A, low, half);
         int j = indexOfMin(A, half + 1, high);

         if (A[i] < A[j]) {
            return i;
         } else {
            return j;
         }
      }
   }
}

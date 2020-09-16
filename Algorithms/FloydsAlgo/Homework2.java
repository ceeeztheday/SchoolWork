// The Homework2 class that implements methods in P6 and P7
public class Homework2 {
   // The following three methods are for programming question P6
   // ===========================================================

   // card comparison
   public int compares(Card c1, Card c2) {
      // TODO: implement this method
      if (c1.getSuit() < c2.getSuit()) {
         return -1;
      } else if (c1.getSuit() > c2.getSuit()) {
         return 1;
      } else if (c1.getRank() < c2.getRank()) {
         return -1;
      } else if (c1.getRank() > c2.getRank()) {
         return 1;
      } else {
         return 0;
      }
      // return -1; // replace this statement with your own return
   }

   // This method takes as parameters a card array, the start index, as well as
   // the end index, and returns the index of the pivot. The method partitions
   // a subarray of cardArray indexed from startIndex to endIndex into two
   // sections, with all the elements less than the pivot in the left section
   // and all the elements greater than the pivot in the right section. You
   // will have to use the compares method to make the comparisons.
   public int partition(Card[] cardArray, int startIndex, int endIndex) {
      // TODO: implement this method
      Card ppoint = cardArray[startIndex];
      Card p = cardArray[startIndex];
      int c = startIndex;

      for (int i = startIndex + 1; i <= endIndex; i++) {
         if (compares(cardArray[i], p) == -1) {
            c++;
            Card j = cardArray[i];
            cardArray[i] = cardArray[c];
            cardArray[c] = j;
         }
      }
      ppoint = cardArray[c];
      Card k = cardArray[startIndex];
      cardArray[startIndex] = cardArray[c];
      cardArray[c] = k;

      return c;
      // return -1; // replace this statement with your own return
   }

   // recursive helper method for quickSort
   public void quickSortRec(Card[] cardArray, int startIndex, int endIndex) {
      if (endIndex > startIndex) {
         int pivotPoint;

         // partition the array
         pivotPoint = partition(cardArray, startIndex, endIndex);

         // sort the left subsection
         quickSortRec(cardArray, startIndex, pivotPoint - 1);

         // sort the right subsection
         quickSortRec(cardArray, pivotPoint + 1, endIndex);
      }
   }

   // quick sort
   public void quickSort(Card[] cardArray) {
      quickSortRec(cardArray, 0, cardArray.length - 1);
   }

   // The following method is for programming question P7
   // ===========================================================

   // This method finds the length of the shortest path from vertec src to vertex
   // dest.
   public int minCostRec(int src, int dest, int[][] W, int[][] P) {
      // TODO: implement this method
      int c = P[src][dest];
      if (c == 0) {
         return W[src][dest];
      } else {
         return minCostRec(src, c, W, P) + minCostRec(c, dest, W, P);
      }
      // return -1; // replace this statement with your own return
   }
}

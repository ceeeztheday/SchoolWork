// The SortingAlgs class that implements selection sort and merge sort
public class SortingAlgs {
   // card comparison
   public int compares(Card c1, Card c2) {
      // TODO: implement this method
      int cardOneRank = c1.getRank();
      int cardOneSuit = c1.getSuit();
      int cardTwoRank = c2.getRank();
      int cardTwoSuit = c2.getSuit();
      int result = 2;

      if (cardOneSuit == cardTwoSuit) {
         if (cardOneRank < cardTwoRank)
            return -1;
         else if (cardOneRank > cardTwoRank)
            return 1;
         else
            return 0;
      } else if (cardOneSuit < cardTwoSuit)
         return -1;
      else
         return 1;

      // return -1; // replace this statement with your own return
   }

   // selection sort
   public void selectionSort(Card[] cardArray) {
      // TODO: implement this method
      int last = cardArray.length - 1;

      for (int i = 0; i < last; i++) {
         int indMin = minIndex(cardArray, i, last);
         Card temp = cardArray[i];
         cardArray[i] = cardArray[indMin];
         cardArray[indMin] = temp;
      }
   }

   // find the index of the smallest element in the specified range
   public int minIndex(Card[] cardArray, int startIndex, int endIndex) {
      // TODO: implement this method
      int indMin = startIndex;
      int compare = 0;

      for (int i = startIndex + 1; i <= endIndex; i++) {
         compare = compares(cardArray[indMin], cardArray[i]);
         if (compare == 1)
            indMin = i;
      }

      return indMin; // replace this statement with your own return
   }

   // merge sort
   public void mergeSort(Card[] cardArray) {
      mergeSortRec(cardArray, 0, cardArray.length - 1);
   }

   // recursive helper recursive method for mergeSort
   public void mergeSortRec(Card[] cardArray, int startIndex, int endIndex) {
      if (startIndex < endIndex) {
         int midIndex = (startIndex + endIndex) / 2;
         mergeSortRec(cardArray, startIndex, midIndex);
         mergeSortRec(cardArray, midIndex + 1, endIndex);
         merge(cardArray, startIndex, endIndex);
      }
   }

   // merge two sorted halves into one sorted array
   public void merge(Card[] cardArray, int startIndex, int endIndex) {
      // TODO: implement this method
      int mid = (startIndex + endIndex) / 2;
      int n = endIndex - startIndex + 1;
      Card[] tempArray = new Card[n];
      int i1 = startIndex;
      int i2 = mid + 1;
      int j = 0;

      while (i1 <= mid && i2 <= endIndex) {
         if (compares(cardArray[i1], cardArray[i2]) == -1) {
            tempArray[j] = new Card(cardArray[i1].getSuit(), cardArray[i1].getRank());
            i1++;
         } else {
            tempArray[j] = new Card(cardArray[i2].getSuit(), cardArray[i2].getRank());
            i2++;
         }
         j++;
      }

      while (i1 <= mid) {
         tempArray[j] = new Card(cardArray[i1].getSuit(), cardArray[i1].getRank());
         i1++;
         j++;
      }

      while (i2 <= endIndex) {
         tempArray[j] = new Card(cardArray[i2].getSuit(), cardArray[i2].getRank());
         i2++;
         j++;
      }

      for (j = 0; j < n; j++) {
         cardArray[startIndex + j] = tempArray[j];
      }
   }
}

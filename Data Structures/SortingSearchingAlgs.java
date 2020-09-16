
// Sorting and searching algorithm implementations
import java.util.*;

public class SortingSearchingAlgs {
    public static void main(String[] args) {
        int[] myArray = { 10, 20, 5, 3, 17, 11, 25, 11, 12, 6, 11, 4, 14 };
        System.out.println("The original array is " + Arrays.toString(myArray));

        int[] testArray = myArray.clone();
        selectionSort(testArray);
        System.out.println("The array after Selection Sort is " + Arrays.toString(testArray));

        testArray = myArray.clone();
        mergeSort(testArray);
        System.out.println("The array after Merge Sort is " + Arrays.toString(testArray));

        testArray = myArray.clone();
        quickSort(testArray);
        System.out.println("The array after Quick Sort is " + Arrays.toString(testArray));
    }

    // find the index of the smallest element in the specified range
    public static int minIndex(int[] numArray, int first, int last) {
        int indMin = first;

        for (int i = first + 1; i <= last; i++)
            if (numArray[i] < numArray[indMin])
                indMin = i;

        return indMin;
    }

    // Selection sort
    public static void selectionSort(int[] numArray) {
        int last = numArray.length - 1;

        for (int i = 0; i < last; i++) {
            int indMin = minIndex(numArray, i, last);
            int temp = numArray[i];
            numArray[i] = numArray[indMin];
            numArray[indMin] = temp;
        }
    }

    // merge two sorted havles into one sorted array
    public static void merge(int[] numArray, int first, int last) {
        int mid = (first + last) / 2; // index of the middle element
        int n = last - first + 1; // size of the temp array
        int[] tempArray = new int[n];

        int i1 = first;
        int i2 = mid + 1;
        int j = 0;

        while (i1 <= mid && i2 <= last) {
            if (numArray[i1] < numArray[i2]) {
                tempArray[j] = numArray[i1];
                i1++;
            } else {
                tempArray[j] = numArray[i2];
                i2++;
            }

            j++;
        }

        // copy the remaining elements of the first half into the temp array
        while (i1 <= mid) {
            tempArray[j] = numArray[i1];
            i1++;
            j++;
        }

        // copy the remaining elements of the second half into the temp array
        while (i2 <= last) {
            tempArray[j] = numArray[i2];
            i2++;
            j++;
        }

        // copy back from the temp array
        for (j = 0; j < n; j++)
            numArray[first + j] = tempArray[j];
    }

    // recursive helper method for mergeSort
    public static void mergeSortRec(int[] numArray, int first, int last) {
        if (first < last) {
            int mid = (first + last) / 2;
            mergeSortRec(numArray, first, mid);
            mergeSortRec(numArray, mid + 1, last);
            merge(numArray, first, last);
        }
    }

    // merge sort
    public static void mergeSort(int[] numArray) {
        mergeSortRec(numArray, 0, numArray.length - 1);
    }

    // split an array into two sections
    public static int split(int[] numArray, int first, int last) {
        // set the first element as the pivot
        int pivot = first;
        first++;

        while (true) {
            // starting from the left of the array, find the first element
            // that is greater than the pivot
            while (first <= last && numArray[first] <= numArray[pivot])
                first++;

            // starting from the right of the array, find the first element
            // that is less than the pivot
            while (first <= last && numArray[last] > numArray[pivot])
                last--;

            // swap the two elements
            if (first < last) {
                int temp = numArray[first];
                numArray[first] = numArray[last];
                numArray[last] = temp;
            } else
                break;
        }

        // swap the pivot with the element at index last
        int temp = numArray[last];
        numArray[last] = numArray[pivot];
        numArray[pivot] = temp;

        return last;
    }

    // recursive helper method for quickSort
    public static void quickSortRec(int[] numArray, int first, int last) {
        if (first < last) {
            int pivot;

            pivot = split(numArray, first, last);
            quickSortRec(numArray, first, pivot - 1);
            quickSortRec(numArray, pivot + 1, last);
        }
    }

    // quick sort
    public static void quickSort(int[] numArray) {
        quickSortRec(numArray, 0, numArray.length - 1);
    }
}

// Solution to Practice 2
public class DivideConquer {
    public static void main(String[] args) {
        int[] A = { 10, 15, 8, 20, 16, 22, 20, 7, 8, 10, 8, 20, 8 };

        System.out.println(evenOccurrence(A, 0, A.length - 1, 7));
        System.out.println(evenOccurrence(A, 0, A.length - 1, 8));
        System.out.println(evenOccurrence(A, 0, A.length - 1, 10));
    }

    public static boolean evenOccurrence(int[] arr, int low, int high, int key) {
        if (low == high)
            return (arr[low] != key);
        else {
            int mid = (low + high) / 2;
            boolean isEvenLeft = evenOccurrence(arr, low, mid, key);
            boolean isEvenRight = evenOccurrence(arr, mid + 1, high, key);

            return !(isEvenLeft ^ isEvenRight);
        }
    }
}

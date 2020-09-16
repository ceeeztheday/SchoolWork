// The RecursiveMethods class that implements several recursive solutions
public class RecursiveMethods {
    // This method calls the largestRec method and returns the largest.
    public int largest(int[] arr) {
        // Do not make any changes to this method!
        return largestRec(arr, 0);
    }

    // This method takes an integer array as well as an integer (the starting index)
    // and returns the largest number in the array.
    public int largestRec(int[] arr, int pos)
    {
    
        // TODO: implement this method
        if(pos == arr.length - 1)
            return arr[pos];
        else
        {
            int largest = largestRec(arr, pos + 1);
            if(arr[pos] > largest)
               return arr[pos];
            else
               return largest;  
            /*if(pos < arr.length - 1) 
                return Math.max(arr[pos], largestRec(arr, pos + 1));*/
                  
       return -1; // replace this statement with your own return  
        
    }

    // This method calls the sumRec method and returns the sum of the array.
    public int sum(int[] arr) {
        // Do not make any changes to this method!
        return sumRec(arr, 0);
    }

    // This method takes an integer array as well as an integer (the starting index)
    // and returns the sum of the values in the array.
    public int sumRec(int[] arr, int pos) {
        // TODO: implement this method
        if (pos == arr.length - 1)
            return arr[pos];
        else
            return arr[pos] + sumRec(arr, pos + 1);

        // return -1; // replace this statement with your own return
    }

    // This method reads a string and returns the string in the reversed order.
    public String reverseStringRec(String s) {
        // TODO: implement this method
        if ((null == s) || (s.length() <= 1))
            return s;

        return reverseStringRec(s.substring(1)) + s.charAt(0);

        // return "dummy string"; // replace this statement with your own return
    }

    // Bonus Question
    // This method takes a reference to the head of a linked list.
    // It returns the reference to the head of the linked list in the reversed
    // order.
    public LNode reverseListRec(LNode head) {
        // TODO: implement this method
        if (head == null || head.getLink() == null) //
            return head;
        else {
            // gets second node
            LNode second = head.getLink();
            // set first next to be null
            head.setLink(null);
            LNode rest = reverseListRec(second);
            second.setLink(head);

            return rest; // replace this statement with your own return
        }
        /*
         * if(head == null) return null; else if(head.getLink() == null) return head;
         * else { LNode nextNode = head.getLink(); head.setLink(null); LNode rest =
         * reverseListRec(nextNode); nextNode.setLink(head); return rest; }
         */
    }
}
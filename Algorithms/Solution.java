import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        int [] arr1 = new int [n];

        for(int i = 0; i < n; i++){
            arr1[i] = kbd.nextInt();
        }
        int m = kbd.nextInt();
        int [] arr2 = new int [m];
        
        for(int i = 0; i < m; i++){
            arr2[i] = kbd.nextInt();
        }

      
      int[] R = new int[arr1.length + arr2.length];
      
      int aIdx = 0;
      int bIdx = 0;
      int rIdx = 0;
      
      while(aIdx < arr1.length && bIdx < arr2.length)
      {
         if(arr1[aIdx] < arr2[bIdx])
         {
            R[rIdx] = arr1[aIdx];
            aIdx++;
            rIdx++;
         }
         else
         {
            R[rIdx] = arr2[bIdx];
            bIdx++;
            rIdx++;
         }
      }
      while(aIdx < arr1.length)
      {
         R[rIdx] = arr1[aIdx];
         aIdx++;
         rIdx++;
      }
      while(bIdx < arr2.length)
      {
         R[rIdx] = arr2[bIdx];
         bIdx++;
         rIdx++;
      }
      
      for(int i = 0; i < R.length; i++)
         System.out.println(R[i] + " ");
    }
}
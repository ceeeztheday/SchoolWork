import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BinarySearchNumOfGuesses {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // your code goes here
        long low = in.nextInt();
        long high = in.nextInt();
        System.out.println(numberOfGuesses(low, high));
        
   
    }
    public static long numberOfGuesses(long low, long high){
        long mid = low + (high - low) /2;
            
        if(high <= low)
            return 1;
        else 
            {
            if((mid - low) <= (high - mid))
                return 1 + numberOfGuesses(low, (mid - 1));
            else
                return 1 + numberOfGuesses((mid + 1), high);
        }
    }
}


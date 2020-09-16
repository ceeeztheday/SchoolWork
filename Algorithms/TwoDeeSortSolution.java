import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoDeeSortSolution {

    public static void main(String[] args) {
        //it took me a long ass time just to understand how the input was coming in. Having whole arrays as a parameter has spoiled me apparently 
        Scanner in = new Scanner(System.in);        
        int arrL = in.nextInt();
        //created 2 arrays in order to separate the x from the y and make it easier to compare
        int[] arrX = new int[arrL];
        int[] arrY = new int[arrL];
        //initialized some variables to make it easier for when I was going to fill the array. 
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        
        //a while loop that goes through all the elements and sorts them into the arrays based on when they are input.
         while(i != (arrL * 2)){
            int narrL = in.nextInt();
             
            if(i % 2 == 0){
                arrX[i2] = narrL;
                i2++;
                i++;
            }else{
                arrY[i3] = narrL;
                i3++;
                i++;
            }
         }
        //I used a simple bubble sort in order to sort the one of the arrays, and when the swap happens, I sort both arrays since why not
        for(int m = 0; m < arrX.length; m++){
            for(int n = 1; n < arrX.length; n++){
                if(arrX[n] < arrX[n - 1]){
                    int tamp = arrX[n];
                    arrX[n] = arrX[n - 1];
                    arrX[n - 1] = tamp;
                    
                    int tamp2 = arrY[n];
                    arrY[n] = arrY[n - 1];
                    arrY[n - 1] = tamp2;
                    
                }
            }
        }
        //here is where I find the mid point, the first if is when you need to average two points when the number of elements is even. if the number of elements is odd, simply return the middle
        int mid = 0;
        int res = 0;
        if(arrX.length % 2 == 0){
            res = arrY[(arrX.length / 2) - 1] + arrY[(arrX.length / 2)];
            res = res / 2;
            System.out.println(res);
        }else{
            System.out.println(arrY[arrY.length / 2]);
        }
    //and that should do it
    }
}
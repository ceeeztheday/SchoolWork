import java.util.Scanner;
public class ArrayProblems
{
   public static void main(String[]args)
   {
   
      int [] arr = {34, 56, -3, 27, 19};
      int [] zoo = {345, 565, 2};
      int x = 27;
      int zzTop = 3;
      
      
      //logic
      System.out.println( isPresent(arr, x) );
      System.out.println( isPresent(zoo, zzTop) );
   }
   public static boolean isPresent(int [] a, int num)
   {  
      int i = 0;
      
      for(i=0; i<a.length; i++)
      {   
         if(a[i]== num)
            return(true);
      }
      return(false);   
   }
}

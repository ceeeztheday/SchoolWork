import java.util.*;
public class product2DArray
{
   public static void main (String[]args)
   {
      int [] [] a ={{1, 2, 3},
                    {4, 5, 6}};
                    
      int row = 0;
      int col = 0;
      int prod = 1;
      int sum = 0;
      int max = a[0][0];
      int first = -1;
      int x = 6;
      
      for(row=0; row<a.length; row++)
      {
         for(col=0; col<a[row].length; col++)
         {
                        
            prod = prod * a[row][col];
            sum = sum + a[row][col];
         }
      }
       
      System.out.println(sum);

      System.out.println(max);
      
      
                     
   
   
   
   }
}
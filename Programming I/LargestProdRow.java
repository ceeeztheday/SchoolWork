public class LargestProdRow
{
   public static void main(String [] args)
   {
      int [] [] arr ={ {300, 8, 17}, 
                     {40, 10, 10} };
    
      int row = 0;
      int col = 0;
      int sum = 0;
      int tempsum = 0;
      int largest = 0;
      
      for(row=0; row<arr.length; row++)                 
      { 
         for(col=0; col<arr[row].length; col++)
         { 
            sum = sum +arr[row][col];
         }
         if(sum>tempsum)
         {
            tempsum=sum;
            largest = row;
         }
         sum = 0;
      }
                  
      System.out.print(largest);
     
     
     
   }
}

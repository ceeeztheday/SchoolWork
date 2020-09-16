public class TwoDArrayAverage
{
   public static void main(String[]args)
   {
   
      int [] [] arr = { {14, 18, 9},
                        {12, 7, 11} };
      
                        
   System.out.println(avgOfAll(arr));
   System.out.println(largestAvg(arr));
                        
   }
   
   public static int avgOfAll(int [] [] a)
   {
      //returns average of all elements
      int row = 0;
      int col = 0;
      int sum = 0;
      int average = 0;
      int divisor = 0;

      
            
      //1. find sum of array
      for(row=0; row<a.length; row++)
      {
         for(col=0; col<a[row].length; col++)
         {
            sum = sum+a[row][col];
         }
      }
      
      //2. find total number of elements in the array
            //loop thru all rows
      for(row=0; row<a.length; row++)
      {
         divisor = divisor + a[row].length;
      }

      
      //3. find average
      average = sum/divisor;
      
      //4. return average
      return(average);
   }
   
   // largest row index
   public static int largestAvg(int [] [] a)
   {
      //returns index average of all rows
      int row = 0;
      int col = 0;

      int largest= 0;
      int indexrow = 0;
      int indexcol = 0;

            
      //2. find sum of array
      for(row=0; row<a.length; row++)
      {
         for(col=0; col<a[row].length; col++)
         {
            
            if(largest<a[row][col])
               largest=a[row][col];
               indexrow= row;
               indexcol= col;
         }
      }
      //4. return largest
      return(indexcol);
      
      
   }
}

      
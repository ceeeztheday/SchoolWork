public class fiverows5col
{
   public static void main (String [] args)
   {
      //var
      int [] a = {1, 2, 3, 4, 5};
      int row;
      int col;
     
      //logic
      for(row = 0; row < 5; row++)
      {
      
         for(col = 0; col < a.length; col++)
         {
            System.out.print(a[col]);
         }
         System.out.println();
      }
   }
}



public class TwoDimArray
{

   public static void main(String[]args)
   {
   
      int [] a0 = {12, 14, 16};
      int [] a1 = {22, 23, 24};
      int [] a2 = {33, 33, 35};
      
      int [] [] a = {{12, 14, 16},
                     {22, 23, 24},
                     {33, 33, 35}};  
      
      //System.out.println(a0[0]);
      //System.out.println(a1[2]);
      
      //System.out.println(a[2][0]);     //a[row][col]
      
      int row = 0;
      int col = 0;
      
      for(row=0; row<a.length; row++)
      {
         for(col=0; col<a.length; col++)
         {
            System.out.println(a[row][col]+"\t");
         }
         System.out.println();
      }
   }
}
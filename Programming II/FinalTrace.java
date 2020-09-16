public class FinalTrace
{
   public static void main(String [] args)
   {
      final int n=5;
      int [] [] A = new int [n][n];
      
      int i, j;
      
      for (i = 0; i<n; i++)
      {
         A[0][i]= 1;
         A[i][0]= 1;
      }
      
      for (i = 1; i<n; i++)
      {
         for (j = 1; j<n; j++)
         {
            A[i][j] = (A[i-1][j] + A[i][j-1] + A[i-1][j-1]) %10;
         }
      }
         
         for (i = 0; i<n; i++)
         {
            for (j = 0; j<n; j++)
            {
               System.out.print(A[i][j]+" ");
            }
         System.out.println();
         }
         


      
   
   }
}

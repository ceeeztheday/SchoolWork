public class matrixMultiplication
{
   public static void main(String[] args)
   {
      int n = 3;
      int[][] A = {{1, 2, 3},
                  {4, 5, 6},
                  {7, 8, 9}};
      int[][] B = {{10, 20, 30},
                  {40, 50, 60},
                  {70, 80, 90}};
                  
      int[][] c = new int[n][n];
      
      matrixMult(n, A, B, c);
      
      for(int i = 0; i < n;i++)
      {
         for(int j = 0; j < n; j++)
         {
            System.out.print(c[i][j] + " ");
         }
         System.out.println();
      }
   }
   public static void matrixMult(int n, int[][] A, int[][] B, int[][]c)
   {
      int count = 0;
      for(int i = 0; i < n; i++)
      {
         for(int j = 0; j < n; j++)
         {
            c[i][j] = 0;
            for(int k = 0; k < n; k++)
            {
               c[i][j] = c[i][j] + A[i][k] * B[k][j];
            }
         }  
      }
   }
}
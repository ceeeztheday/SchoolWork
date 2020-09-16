// The Homework3 class that implements the three methods in P6
public class Homework3 {
   // This method finds the connectivity for every pair of vertices in the graph,
   // which is represented
   // by W, a boolean adjacency matrix. You should not change the content of W.
   public void booleanFloyd(int n, boolean[][] W, boolean[][] D) {
      // TODO: implement this method
      for (int i = 1; i <= n; i++) {
         for (int j = 1; j <= n; j++) {
            D[i][j] = W[i][j];
         }
      }
      for (int k = 1; k <= n; k++) {
         for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
               boolean b = (D[i][k] && D[k][j]) || D[i][j];
               if ((i == j) || b) {
                  D[i][j] = true;
               }
            }
         }
      }
   }

   // The method takes an integer n and returns the number of ways to multiply n
   // chained matrices
   public int numOrders(int n) {
      int[] p = new int[n];
      p[0] = 1;
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < i; j++) {
            p[i] = p[i] + p[j] * p[i - j - 1];
         }
      }
      return p[n - 1];
   }

   // This method finds and returns the minimum element multiplications and build
   // the order matrix P
   public int minMulti(int n, int[] d, int[][] M, int[][] P) {
      // TODO: implement this method
      int i, j, c = n, s;
      for (i = 1; i <= n; i++) {
         M[i][i] = 0;
      }
      for (s = 2; s <= n; s++) {
         for (i = 1; i <= n - s + 1; i++) {
            j = i + s - 1;
            int min = 9999;
            M[i][j] = min;
            for (c = i; c <= j - 1; c++) {
               if ((M[i][c] + M[c + 1][j] + d[i - 1] * d[c] * d[j]) < min) {
                  min = (M[i][c] + M[c + 1][j] + d[i - 1] * d[c] * d[j]);
                  P[i][j] = c;
               }
            }
            M[i][j] = min;
         }
      }
      return M[1][n];
      // return -1; // replace this statement with your own return
   }

   // This method takes as parameters an int array P, two ints, as well as a
   // String and recursively updates the string so that it represents the order
   // of the optimal multiplications.
   // Do not make any changes to this method!
   public String buildOrder(int[][] P, int i, int j, String order) {
      if (i == j)
         return order + "A" + i;
      else {
         int k = P[i][j];
         String tmp = order + "(";
         tmp = buildOrder(P, i, k, tmp);
         tmp = buildOrder(P, k + 1, j, tmp);
         return tmp + ")";
      }
   }
}

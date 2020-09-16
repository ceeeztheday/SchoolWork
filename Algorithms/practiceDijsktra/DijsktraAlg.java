// Practice 5
public class DijsktraAlg {
   private static int inf = 99999;

   public static void main(String[] args) {
      int[][] W = { { 0, 0, 0, 0, 0, 0 }, { 0, 0, 7, 4, 6, 1 }, { 0, inf, 0, inf, inf, inf }, { 0, inf, 2, 0, 5, inf },
            { 0, inf, 3, inf, 0, inf }, { 0, inf, inf, inf, 1, 0 } };

      int n = 5;
      int[] touch = new int[n + 1];
      ;

      String F = dijkstra(n, W, touch);
      System.out.println("Edge set: {" + F.substring(0, F.length() - 2) + "}");

      // TODO: print the shortest paths from v1
      for (int i = 2; i <= n; i++) {
         System.out.print("v1 ->");
         printPath(i, touch);
         System.out.println();
      }
   }

   public static String dijkstra(int n, int[][] W, int[] touch) {
      int vnear = -1;
      int vStart, vEnd;
      int[] length = new int[n + 1];
      String F = ""; // edge set

      for (int i = 2; i <= n; i++) {
         touch[i] = 1;
         length[i] = W[1][i];
      }

      for (int j = 0; j < n - 1; j++) {
         int min = inf;

         for (int i = 2; i <= n; i++)
            if (length[i] >= 0 && length[i] < min) {
               min = length[i];
               vnear = i;
            }

         vStart = touch[vnear];
         vEnd = vnear;
         F += "(" + vStart + ", " + vEnd + "), ";

         for (int i = 2; i <= n; i++)
            if (length[vnear] + W[vnear][i] < length[i]) {
               length[i] = length[vnear] + W[vnear][i];
               touch[i] = vnear;
            }

         length[vnear] = -1;
      }

      return F;
   }

   public static void printPath(int d, int[] touch) {
      // TODO: implement this method
      if (touch[d] == 1) {
         System.out.print("v" + d + " ");
      } else {
         printPath(touch[d], touch);
         System.out.print("-> v" + d);
      }

   }
}

// The Homework4 class that implements the Prims algorithm
public class Homework4 {
   // instance variable
   public final int inf = 99999; // define infinity

   // This method implements the Prim's algorithm for the minimum spanning tree
   // problem. It take as parameters an int (# of vertices), an adjacency matrix
   // held in a two-dimensional int array, and an edge set F. The method returns
   // the "nearest" array.
   public int[] prim(int n, int[][] W, Edge[] F) {
      // TODO: implement this method
      int vnear = 0, min, i, j, edge;
      int[] nearest = new int[n + 1];
      int[] distance = new int[n + 1];

      for (i = 1; i <= n; i++) {
         nearest[i] = 1;
         distance[i] = W[i][1];
      }

      for (j = 1; j <= n - 1; j++) {
         min = 99999;

         for (i = 1; i <= n; i++) {
            if (distance[i] > 0 && distance[i] < min) {
               min = distance[i];
               vnear = i;
            }
         }

         distance[vnear] = -1;
         for (i = 1; i <= n; i++) {
            if (W[i][vnear] < distance[i]) {
               distance[i] = W[i][vnear];
               nearest[i] = vnear;
            }
         }
      }
      int eA = 0;
      for (i = 2; i < nearest.length; i++) {
         F[eA] = new Edge(nearest[i], i);
         eA++;
      }

      return nearest; // replace this statement with your own return
   }

   // This method takes as parameters an int (# of vertices), the "nearest"
   // array, and an adjacency matrix held in a two-dimensional int array. It
   // returns the total cost of the tree.
   public int costMST(int n, int[] nearest, int[][] W) {
      // TODO: implement this method
      int s = 0;

      for (int i = 2; i < nearest.length; i++) {
         s = s + W[nearest[i]][i];
      }

      return s; // replace this statement with your own return
   }

   // This method verifies the edge set.
   // Do not make any changes to this method!
   public boolean verifyEdgeSet(Edge[] yours, Edge[] solution) {
      int sizeY = yours.length;
      int sizeS = solution.length;
      int actualEdges = 0;

      // check for the actual number of edges
      for (int i = 0; i < sizeY; i++)
         if (yours[i] != null)
            actualEdges++;

      if (actualEdges != sizeS)
         return false;

      // verify the edges
      for (int i = 0; i < sizeS; i++) {
         Edge tmpS = solution[i];
         boolean found = false;

         // search for tmpS in your edge set
         for (int j = 0; j < sizeY; j++) {
            Edge tmpY = yours[j];
            if (tmpY != null && tmpS.equals(tmpY) == true) {
               found = true;
               break;
            }
         }

         // if the edge is not found, return false
         if (found == false)
            return false;
      }

      return true;
   }
}

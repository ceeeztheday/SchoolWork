
// Practice 7
import java.util.Arrays;

public class GraphColoring {
   // instance variables
   static int[] vcolor;
   static int n;
   static int m;
   static int[][] W;

   public static void main(String[] args) {

      n = 4;
      vcolor = new int[n + 1];
      int[][] G = { { 0, 0, 0, 0, 0 }, { 0, 1, 1, 1, 1 }, { 0, 1, 1, 1, 0 }, { 0, 1, 1, 1, 1 }, { 0, 1, 0, 1, 1 } };
      /*
       * n = 6; vcolor = new int[n + 1]; int[][] G = { {0, 0, 0, 0, 0, 0, 0}, {0, 0,
       * 1, 1, 0, 1, 1}, {0, 1, 0, 1, 1, 0, 1}, {0, 1, 1, 0, 1, 1, 0}, {0, 0, 1, 1, 0,
       * 1, 1}, {0, 1, 0, 1, 1, 0, 1}, {0, 1, 1, 0, 1, 1, 0} };
       */

      W = G;
      System.out.println("\nOutput produced by greedyColoring:");
      greedyColoring(W, vcolor, n);
   }

   public static void greedyColoring(int[][] W, int[] vcolor, int n) {
      // TODO: implement this method using the greedy coloring algorithm
      vcolor[1] = 1;

      for (int i = 2; i <= n; i++) {
         boolean[] usedColors = new boolean[n + 1];

         for (int j = 1; j < i; j++) {
            if (W[i][j] == 1 && vcolor[j] != 0) {
               usedColors[vcolor[j]] = true;
            }
         }
         for (int k = 1; k <= n; k++) {
            if (usedColors[k] == false) {
               vcolor[i] = k;
               break;
            }
         }
      }
      System.out.println("[" + Arrays.toString(vcolor).substring(4));

   }
}
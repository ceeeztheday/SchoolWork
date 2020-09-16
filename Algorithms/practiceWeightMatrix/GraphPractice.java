//Practice 4
public class GraphPractice {
    private static int inf = 99999;

    public static void main(String[] args) {

        // Comment out one of the following code snippets so that you only have
        // one n and G.
        int n = 7;
        int[][] G = { { 0, 0, 0, 0, 0, 0, 0, 0 }, // dummy row and dummy column
                { 0, 0, 15, inf, inf, 10, inf, inf }, { 0, inf, 0, 6, inf, inf, inf, inf },
                { 0, inf, inf, 0, inf, inf, inf, 17 }, { 0, inf, inf, inf, 0, inf, inf, inf },
                { 0, inf, inf, 25, inf, 0, inf, inf }, { 0, inf, inf, inf, inf, inf, 0, inf },
                { 0, inf, inf, inf, inf, inf, inf, 0 } };

        // int n = 8;
        // int[][] G = {
        // {0, 0, 0, 0, 0, 0, 0, 0, 0},
        // {0, 0, inf, inf, inf, 10, inf, 15, inf},
        // {0, inf, 0, inf, inf, inf, inf, inf, inf},
        // {0, inf, inf, 0, inf, inf, inf, 19, inf},
        // {0, inf, inf, inf, 0, inf, inf, 30, inf},
        // {0, inf, inf, inf, inf, 0, inf, 25, inf},
        // {0, inf, inf, inf, inf, inf, 0, inf, inf},
        // {0, 23, inf, 21, inf, inf, inf, 0, 6},
        // {0, inf, inf, inf, inf, inf, inf, inf, 0}
        // };

        printVE(n, G);

        // print the isolated vertex set
        String isolated = "";
        for (int v = 1; v <= n; v++)
            if (isIsolatedVertex(n, G, v))
                isolated += v + ", ";

        if (isolated.equals(""))
            System.out.println("Isolated = {}");
        else
            System.out.println("Isolated = {" + isolated.substring(0, isolated.length() - 2) + "}");
    }

    public static void printVE(int n, int[][] G) {
        // print the vertex set
        System.out.print("V = {");
        for (int i = 1; i <= n - 1; i++)
            System.out.print(i + ", ");
        System.out.println(n + "}");

        // print the edge set
        String edges = "E = {";
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= n; j++)
                if (G[i][j] != 0 && G[i][j] != inf)
                    edges += "(" + i + ", " + j + "), ";

        System.out.println(edges.substring(0, edges.length() - 2) + "}");
    }

    public static boolean isIsolatedVertex(int n, int[][] G, int v) {
        for (int i = 1; i <= n; i++)
            if ((v != i) && (G[v][i] != inf || G[i][v] != inf))
                return false;

        return true;
    }
}

// Test driver for the Homework4 class
public class TestHomework4 {
    public static void main(String[] args) {

        Homework4 myHW4 = new Homework4();
        int src = -1, dest = -1;
        int inf = myHW4.inf;
        int n;
        int[] nearest = null;
        int numPassedTests = 0;
        int numTotalTests = 0;
        String testResult;

        n = 5;
        Edge[] F = new Edge[n];
        int[][] W1 = { { 0, 0, 0, 0, 0, 0 }, { 0, 0, 1, 3, inf, inf }, { 0, 1, 0, 3, 6, inf }, { 0, 3, 3, 0, 4, 2 },
                { 0, inf, 6, 4, 0, 5 }, { 0, inf, inf, 2, 5, 0 } };
        Edge[] sol = new Edge[4];
        sol[0] = new Edge(1, 2);
        sol[1] = new Edge(1, 3);
        sol[2] = new Edge(3, 5);
        sol[3] = new Edge(3, 4);

        System.out.println("W1 = ");
        for (int i = 1; i < W1.length; i++) {
            for (int j = 1; j < W1[i].length; j++)
                if (W1[i][j] == inf)
                    System.out.format("%-6s", "∞");
                else
                    System.out.format("%-6d", W1[i][j]);

            System.out.println("\n");
        }

        // Test 1
        numTotalTests++;
        boolean bReturn = false;
        testResult = "[Failed]";
        String eMsg = "N/A";
        try {
            nearest = myHW4.prim(n, W1, F);
            bReturn = myHW4.verifyEdgeSet(F, sol);

            if (bReturn == true) {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e) {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        }

        System.out.println("Test " + numTotalTests + ": MST built for W1 - " + testResult);
        System.out.print(" Expected: ");
        printEdges(sol);
        if (eMsg.equals("N/A")) {
            System.out.print(" Yours: ");
            printEdges(F);
            System.out.println();
        } else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 2
        numTotalTests++;
        int iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try {
            iReturn = myHW4.costMST(n, nearest, W1);

            if (iReturn == 10) {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e) {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        }

        System.out.println("Test " + numTotalTests + ": Total cost of the MST of W1 - " + testResult);
        System.out.println(" Expected: 10");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        n = 5;
        F = new Edge[n];
        int[][] W2 = { { 0, 0, 0, 0, 0, 0 }, { 0, 0, 9, inf, inf, 3 }, { 0, 9, 0, 3, 2, inf }, { 0, inf, 3, 0, 4, inf },
                { 0, inf, 2, 4, 0, 3 }, { 0, 3, inf, inf, 3, 0 } };
        sol = new Edge[4];
        sol[0] = new Edge(1, 5);
        sol[1] = new Edge(4, 5);
        sol[2] = new Edge(2, 4);
        sol[3] = new Edge(2, 3);

        System.out.println("W2 = ");
        for (int i = 1; i < W2.length; i++) {
            for (int j = 1; j < W2[i].length; j++)
                if (W2[i][j] == inf)
                    System.out.format("%-6s", "∞");
                else
                    System.out.format("%-6d", W2[i][j]);

            System.out.println("\n");
        }

        // Test 3
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try {
            nearest = myHW4.prim(n, W2, F);
            bReturn = myHW4.verifyEdgeSet(F, sol);

            if (bReturn == true) {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e) {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        }

        System.out.println("Test " + numTotalTests + ": MST built for W2 - " + testResult);
        System.out.print(" Expected: ");
        printEdges(sol);
        if (eMsg.equals("N/A")) {
            System.out.print(" Yours: ");
            printEdges(F);
            System.out.println();
        } else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 4
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try {
            iReturn = myHW4.costMST(n, nearest, W2);

            if (iReturn == 11) {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e) {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        }

        System.out.println("Test " + numTotalTests + ": Total cost of the MST of W2 - " + testResult);
        System.out.println(" Expected: 11");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        System.out.println("Total test cases: " + numTotalTests + "\nCorrect: " + numPassedTests + "\nWrong: "
                + (numTotalTests - numPassedTests));
    }

    public static void printEdges(Edge[] edges) {
        System.out.print("F = {");
        for (int i = 0; i < edges.length - 1; i++)
            if (edges[i] != null)
                System.out.print(edges[i].toString() + ", ");

        if (edges[edges.length - 1] != null)
            System.out.print(edges[edges.length - 1].toString());

        System.out.println("}");
    }
}
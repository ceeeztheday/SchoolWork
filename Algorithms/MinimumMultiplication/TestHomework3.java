
// Test driver for the Homework3 class
import java.util.Arrays;

public class TestHomework3 {
    public static void main(String[] args) {

        Homework3 myHW3 = new Homework3();
        int[] d = null;
        int[][] P;
        boolean[][] W, yourD, correctD;
        int n = 0;
        final int inf = 99999;
        int numPassedTests = 0;
        int numTotalTests = 0;
        String testResult;

        // Test 1
        numTotalTests++;
        boolean bReturn = false;
        testResult = "[Failed]";
        String eMsg = "N/A";

        // set n
        n = 5;

        // set matrix W
        boolean[][] testW1 = { { false, false, false, false, false, false }, { false, true, true, false, true, true },
                { false, true, true, true, true, false }, { false, false, false, true, true, false },
                { false, false, false, true, true, true }, { false, true, false, false, false, true }, };

        W = testW1;

        // allocate the memory for matrix D
        yourD = new boolean[n + 1][n + 1];

        // expected answer
        boolean[][] testD1 = { { false, false, false, false, false, false }, { false, true, true, true, true, true },
                { false, true, true, true, true, true }, { false, true, true, true, true, true },
                { false, true, true, true, true, true }, { false, true, true, true, true, true }, };

        correctD = testD1;

        try {
            myHW3.booleanFloyd(n, W, yourD);
            bReturn = compareMatrices(correctD, yourD);

            if (bReturn == true) {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e) {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        } catch (StackOverflowError e) {
            eMsg = "Stack Overflow error occurred.";
        }

        System.out.println("Test " + numTotalTests + ": booleanFloyd - " + testResult);
        printMatrix(W, 'W');
        System.out.println(" Expected: ");
        printMatrix(correctD, 'D');
        if (eMsg.equals("N/A")) {
            System.out.println(" Yours: ");
            printMatrix(yourD, 'D');
        } else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 2
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";

        // set n
        n = 7;

        // set matrix W
        boolean[][] testW2 = { { false, false, false, false, false, false, false, false },
                { false, true, true, false, false, true, false, false },
                { false, false, true, true, false, false, false, false },
                { false, false, false, true, false, false, false, true },
                { false, false, false, false, true, false, false, false },
                { false, false, false, true, false, true, false, false },
                { false, false, false, false, false, false, true, false },
                { false, false, false, false, false, false, false, true }, };

        W = testW2;

        // allocate the memory for matrix D
        yourD = new boolean[n + 1][n + 1];

        // expected answer
        boolean[][] testD2 = { { false, false, false, false, false, false, false, false },
                { false, true, true, true, false, true, false, true },
                { false, false, true, true, false, false, false, true },
                { false, false, false, true, false, false, false, true },
                { false, false, false, false, true, false, false, false },
                { false, false, false, true, false, true, false, true },
                { false, false, false, false, false, false, true, false },
                { false, false, false, false, false, false, false, true }, };

        correctD = testD2;

        try {
            myHW3.booleanFloyd(n, W, yourD);
            bReturn = compareMatrices(correctD, yourD);

            if (bReturn == true) {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e) {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        } catch (StackOverflowError e) {
            eMsg = "Stack Overflow error occurred.";
        }

        System.out.println("Test " + numTotalTests + ": booleanFloyd - " + testResult);
        printMatrix(W, 'W');
        System.out.println(" Expected: ");
        printMatrix(correctD, 'D');
        if (eMsg.equals("N/A")) {
            System.out.println(" Yours: ");
            printMatrix(yourD, 'D');
        } else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 3
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";

        // set n
        n = 6;

        // set matrix W
        boolean[][] testW3 = { { false, false, false, false, false, false, false },
                { false, true, false, false, false, false, false }, { false, false, true, true, true, false, false },
                { false, true, false, true, true, false, false }, { false, false, true, true, true, true, false },
                { false, false, true, false, false, true, false }, { false, false, false, false, false, true, true } };

        W = testW3;

        // allocate the memory for matrix D
        yourD = new boolean[n + 1][n + 1];

        // expected answer
        boolean[][] testD3 = { { false, false, false, false, false, false, false },
                { false, true, false, false, false, false, false }, { false, true, true, true, true, true, false },
                { false, true, true, true, true, true, false }, { false, true, true, true, true, true, false },
                { false, true, true, true, true, true, false }, { false, true, true, true, true, true, true } };

        correctD = testD3;

        try {
            myHW3.booleanFloyd(n, W, yourD);
            bReturn = compareMatrices(correctD, yourD);

            if (bReturn == true) {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e) {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        } catch (StackOverflowError e) {
            eMsg = "Stack Overflow error occurred.";
        }

        System.out.println("Test " + numTotalTests + ": booleanFloyd - " + testResult);
        printMatrix(W, 'W');
        System.out.println(" Expected: ");
        printMatrix(correctD, 'D');
        if (eMsg.equals("N/A")) {
            System.out.println(" Yours: ");
            printMatrix(yourD, 'D');
        } else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 4
        numTotalTests++;
        int iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try {
            n = 2; // number of matrices

            iReturn = myHW3.numOrders(n);

            if (iReturn == 1) {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e) {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        } catch (StackOverflowError e) {
            eMsg = "Stack Overflow error occurred.";
        }

        System.out.println("Test " + numTotalTests + ": numOrders(" + n + ") - " + testResult);
        System.out.println(" Expected: 1");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 5
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try {
            n = 4; // number of matrices

            iReturn = myHW3.numOrders(n);

            if (iReturn == 5) {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e) {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        } catch (StackOverflowError e) {
            eMsg = "Stack Overflow error occurred.";
        }

        System.out.println("Test " + numTotalTests + ": numOrders(" + n + ") - " + testResult);
        System.out.println(" Expected: 5");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 6
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try {
            n = 8; // number of matrices

            iReturn = myHW3.numOrders(n);

            if (iReturn == 429) {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e) {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        } catch (StackOverflowError e) {
            eMsg = "Stack Overflow error occurred.";
        }

        System.out.println("Test " + numTotalTests + ": numOrders(" + n + ") - " + testResult);
        System.out.println(" Expected: 429");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 7
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try {
            n = 10; // number of matrices

            iReturn = myHW3.numOrders(n);

            if (iReturn == 4862) {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e) {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        } catch (StackOverflowError e) {
            eMsg = "Stack Overflow error occurred.";
        }

        System.out.println("Test " + numTotalTests + ": numOrders(" + n + ") - " + testResult);
        System.out.println(" Expected: 4862");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 8
        numTotalTests++;
        iReturn = -1;
        String sReturn = "";
        testResult = "[Failed]";
        eMsg = "N/A";
        try {
            n = 6; // number of matrices
            int[] tmp = { 5, 2, 3, 4, 6, 7, 8 }; // matrix dimensions, starting from d_0 and ending at d_n
            d = tmp;
            int[][] M = new int[n + 1][n + 1];
            P = new int[n + 1][n + 1];

            // populate the first row and firt column with zeros
            for (int m = 0; m <= n; m++)
                M[0][m] = M[m][0] = P[0][m] = P[m][0] = 0;

            iReturn = myHW3.minMulti(n, d, M, P);
            sReturn = myHW3.buildOrder(P, 1, n, sReturn);
            sReturn = sReturn.substring(1, sReturn.length() - 1); // remove the first and the last parenthesis

            if (iReturn == 348 && sReturn.equals("A1((((A2A3)A4)A5)A6)")) {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e) {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        } catch (StackOverflowError e) {
            eMsg = "Stack Overflow error occurred.";
        }

        System.out.println(
                "Test " + numTotalTests + ": d = " + Arrays.toString(d) + ", buildOrder(1, " + n + ") - " + testResult);
        System.out.println(" Expected: min # multiplications = 348 and order is A1((((A2A3)A4)A5)A6)");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: min # multiplications = " + iReturn + " and order is " + sReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 9
        numTotalTests++;
        iReturn = -1;
        sReturn = "";
        testResult = "[Failed]";
        eMsg = "N/A";
        try {
            n = 6; // number of matrices
            int[] tmp = { 1, 2, 3, 4, 5, 6, 7 }; // matrix dimensions, starting from d_0 and ending at d_n
            d = tmp;
            int[][] M = new int[n + 1][n + 1];
            P = new int[n + 1][n + 1];

            // populate the first row and firt column with zeros
            for (int m = 0; m <= n; m++)
                M[0][m] = M[m][0] = P[0][m] = P[m][0] = 0;

            iReturn = myHW3.minMulti(n, d, M, P);
            sReturn = myHW3.buildOrder(P, 1, n, sReturn);
            sReturn = sReturn.substring(1, sReturn.length() - 1); // remove the first and the last parenthesis

            if (iReturn == 110 && sReturn.equals("((((A1A2)A3)A4)A5)A6")) {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e) {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        } catch (StackOverflowError e) {
            eMsg = "Stack Overflow error occurred.";
        }

        System.out.println(
                "Test " + numTotalTests + ": d = " + Arrays.toString(d) + ", buildOrder(1, " + n + ") - " + testResult);
        System.out.println(" Expected: min # multiplications = 110 and order is ((((A1A2)A3)A4)A5)A6");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: min # multiplications = " + iReturn + " and order is " + sReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 10
        numTotalTests++;
        iReturn = -1;
        sReturn = "";
        testResult = "[Failed]";
        eMsg = "N/A";
        try {
            n = 8; // number of matrices
            int[] tmp = { 9, 8, 7, 6, 5, 4, 3, 2, 1 }; // matrix dimensions, starting from d_0 and ending at d_n
            d = tmp;
            int[][] M = new int[n + 1][n + 1];
            P = new int[n + 1][n + 1];

            // populate the first row and firt column with zeros
            for (int m = 0; m <= n; m++)
                M[0][m] = M[m][0] = P[0][m] = P[m][0] = 0;

            iReturn = myHW3.minMulti(n, d, M, P);
            sReturn = myHW3.buildOrder(P, 1, n, sReturn);
            sReturn = sReturn.substring(1, sReturn.length() - 1); // remove the first and the last parenthesis

            if (iReturn == 238 && sReturn.equals("A1(A2(A3(A4(A5(A6(A7A8))))))")) {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e) {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        } catch (StackOverflowError e) {
            eMsg = "Stack Overflow error occurred.";
        }

        System.out.println(
                "Test " + numTotalTests + ": d = " + Arrays.toString(d) + ", buildOrder(1, " + n + ") - " + testResult);
        System.out.println(" Expected: min # multiplications = 238 and order is A1(A2(A3(A4(A5(A6(A7A8))))))");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: min # multiplications = " + iReturn + " and order is " + sReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        System.out.println("Total test cases: " + numTotalTests + "\nCorrect: " + numPassedTests + "\nWrong: "
                + (numTotalTests - numPassedTests));
    }

    public static void printMatrix(boolean[][] matrix, char C) {
        System.out.println(" " + C + " = ");
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++)
                if (matrix[i][j] == true)
                    System.out.format("%6s", "T");
                else
                    System.out.format("%6s", "F");

            System.out.println();
        }

        System.out.println();
    }

    public static boolean compareMatrices(boolean[][] correct, boolean[][] yours) {
        for (int i = 0; i < correct.length; i++)
            for (int j = 0; j < correct[i].length; j++)
                if (correct[i][j] != yours[i][j])
                    return false;

        return true;
    }
}
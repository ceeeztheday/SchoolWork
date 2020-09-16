
// Test driver for the Homework2 class
import java.io.*;
import java.util.Arrays;

public class TestHomework2 {
    public static void main(String[] args) {
        System.out.println("================ Problem 6 ================");
        TestP6();
        System.out.println("================ End of Problem 6 ================\n\n");

        System.out.print("Press any key to test Problem 7...");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("================ Problem 7 ================");
        TestP7();
        System.out.println("================ End of Problem 7 ================");
    }

    public static void TestP6() {
        Homework2 myHW2 = new Homework2();

        try {
            // read the decks from file
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Decks.dat"));
            Deck[] myDeck = new Deck[5];
            myDeck = (Deck[]) in.readObject();

            for (int i = 0; i < 5; i++) {
                Card[] myCards = myDeck[i].getPartialDeck(myDeck[i].getnumCards());
                String before = Arrays.toString(myCards);

                System.out.println("Test " + (i + 1) + ":");
                System.out.println("The cards before sorting are\n" + before);
                System.out.println("------------------------------------");

                myHW2.quickSort(myCards);
                String after = Arrays.toString(myCards);

                System.out.println("The cards after Quick Sort are\n" + after);
                if (after.equals(myDeck[i].getSortedDeck()))
                    System.out.println("Your Quick Sort works correctly.");
                else
                    System.out.println("Something is wrong with your Quick Sort.");

                System.out.println("====================================\n");
            }

        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        } catch (StackOverflowError e) {
            System.out.println("Stack Overflow error occurred.");
        }
    }

    public static void TestP7() {
        Homework2 myHW2 = new Homework2();
        int[] d = null;
        int src = -1, dest = -1;
        final int inf = 99999;
        int numPassedTests = 0;
        int numTotalTests = 0;
        String testResult;

        // declare and print out matrices W and P
        int[][] W = { { 0, 0, 0, 0, 0, 0 }, { 0, 0, 1, inf, 1, 5 }, { 0, 9, 0, 3, 2, inf }, { 0, inf, inf, 0, 4, inf },
                { 0, inf, inf, 2, 0, 3 }, { 0, 3, inf, inf, inf, 0 } };

        int[][] P = { { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 4, 0, 4 }, { 0, 5, 0, 0, 0, 4 }, { 0, 5, 5, 0, 0, 4 },
                { 0, 5, 5, 0, 0, 0 }, { 0, 0, 1, 4, 1, 0 } };

        System.out.println(
                "The following tests are based on the adjacent matrix W and shortest path matrix P shown below:");
        System.out.println("W = ");
        for (int i = 1; i < W.length; i++) {
            for (int j = 1; j < W[i].length; j++)
                if (W[i][j] == inf)
                    System.out.format("%-6s", "∞");
                else
                    System.out.format("%-6d", W[i][j]);

            System.out.println();
        }

        System.out.println("\nP = ");
        for (int i = 1; i < P.length; i++) {
            for (int j = 1; j < P[i].length; j++)
                System.out.format("%-6d", P[i][j]);

            System.out.println();
        }

        System.out.println();

        // Test 1
        numTotalTests++;
        int iReturn = -1;
        testResult = "[Failed]";
        String eMsg = "N/A";
        try {
            src = 1;
            dest = 2;

            iReturn = myHW2.minCostRec(src, dest, W, P);

            if (iReturn == 1) {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e) {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        } catch (StackOverflowError e) {
            eMsg = "Stack Overflow error occurred.";
        }

        System.out.println(
                "Test " + numTotalTests + ": minCostRec(src = " + src + ", dest = " + dest + ") - " + testResult);
        System.out.println(" Expected: 1");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 2
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try {
            src = 2;
            dest = 1;

            iReturn = myHW2.minCostRec(src, dest, W, P);

            if (iReturn == 8) {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e) {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        } catch (StackOverflowError e) {
            eMsg = "Stack Overflow error occurred.";
        }

        System.out.println(
                "Test " + numTotalTests + ": minCostRec(src = " + src + ", dest = " + dest + ") - " + testResult);
        System.out.println(" Expected: 8");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 3
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try {
            src = 3;
            dest = 2;

            iReturn = myHW2.minCostRec(src, dest, W, P);

            if (iReturn == 11) {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e) {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        } catch (StackOverflowError e) {
            eMsg = "Stack Overflow error occurred.";
        }

        System.out.println(
                "Test " + numTotalTests + ": minCostRec(src = " + src + ", dest = " + dest + ") - " + testResult);
        System.out.println(" Expected: 11");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 4
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try {
            src = 5;
            dest = 3;

            iReturn = myHW2.minCostRec(src, dest, W, P);

            if (iReturn == 6) {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e) {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        } catch (StackOverflowError e) {
            eMsg = "Stack Overflow error occurred.";
        }

        System.out.println(
                "Test " + numTotalTests + ": minCostRec(src = " + src + ", dest = " + dest + ") - " + testResult);
        System.out.println(" Expected: 6");
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
            src = 5;
            dest = 4;

            iReturn = myHW2.minCostRec(src, dest, W, P);

            if (iReturn == 4) {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e) {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        } catch (StackOverflowError e) {
            eMsg = "Stack Overflow error occurred.";
        }

        System.out.println(
                "Test " + numTotalTests + ": minCostRec(src = " + src + ", dest = " + dest + ") - " + testResult);
        System.out.println(" Expected: 4");
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
            src = 3;
            dest = 3;

            iReturn = myHW2.minCostRec(src, dest, W, P);

            if (iReturn == 0) {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e) {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        } catch (StackOverflowError e) {
            eMsg = "Stack Overflow error occurred.";
        }

        System.out.println(
                "Test " + numTotalTests + ": minCostRec(src = " + src + ", dest = " + dest + ") - " + testResult);
        System.out.println(" Expected: 0");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        System.out.println("Total test cases: " + numTotalTests + "\nCorrect: " + numPassedTests + "\nWrong: "
                + (numTotalTests - numPassedTests));
    }
}

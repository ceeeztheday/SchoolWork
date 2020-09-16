
// Test driver for the Homework1 class
import java.util.Arrays;

public class TestHomework1 {
    public static void main(String[] args) {
        Homework1 myHW1 = new Homework1();
        int[][] myArray1 = null;
        int[] myArray2 = null;
        int n = 0, low = 0, high = 0;
        int numPassedTests = 0;
        int numTotalTests = 0;
        String testResult;

        // Test 1
        numTotalTests++;
        boolean bReturn = false;
        testResult = "[Failed]";
        String eMsg = "N/A";
        try {
            int[][] testArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

            myArray1 = testArray;

            bReturn = myHW1.unique(myArray1);

            if (bReturn == true) {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e) {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        }

        System.out.print("Test " + numTotalTests + ": unique - " + testResult + "\n" + buildArrayString(myArray1));
        System.out.println(" --------------\n Expected: true");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 2
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try {
            int[][] testArray = { { 1, 2, 3 }, { 4, 5, 1 }, { 7, 8, 9 } };

            myArray1 = testArray;

            bReturn = myHW1.unique(myArray1);

            if (bReturn == false) {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e) {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        }

        System.out.print("Test " + numTotalTests + ": unique - " + testResult + "\n" + buildArrayString(myArray1));
        System.out.println(" --------------\n Expected: false");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 3
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try {
            int[][] testArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 3, 8, 9 } };

            myArray1 = testArray;

            bReturn = myHW1.unique(myArray1);

            if (bReturn == false) {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e) {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        }

        System.out.print("Test " + numTotalTests + ": unique - " + testResult + "\n" + buildArrayString(myArray1));
        System.out.println(" --------------\n Expected: false");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 4
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try {
            int[][] testArray = { { 10, 21, 32, 73 }, { 65, 101, 6, 18 }, { 81, 53, 91, 73 }, { 11, 22, 33, 44 } };

            myArray1 = testArray;

            bReturn = myHW1.unique(myArray1);

            if (bReturn == false) {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e) {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        }

        System.out.print("Test " + numTotalTests + ": unique - " + testResult + "\n" + buildArrayString(myArray1));
        System.out.println(" --------------\n Expected: false");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 5
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try {
            int[][] testArray = { { 10, 21, 32, 73 }, { 65, 101, 6, 18 }, { 81, 53, 91, 61 }, { 11, 22, 33, 44 } };

            myArray1 = testArray;

            bReturn = myHW1.unique(myArray1);

            if (bReturn == true) {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e) {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        }

        System.out.print("Test " + numTotalTests + ": unique - " + testResult + "\n" + buildArrayString(myArray1));
        System.out.println(" --------------\n Expected: true");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 6
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try {
            int[][] testArray = { { 10, 21, 32, 73, 93, 14, 21 }, { 25, 13, 16, 11, 92, 17, 60 },
                    { 81, 53, 91, 73, 32, 87, 65 }, { 11, 22, 33, 44, 55, 66, 77 }, { 83, 42, 59, 62, 30, 45, 48 },
                    { 19, 20, 21, 22, 23, 24, 25 }, { 12, 99, 88, 77, 66, 45, 55 }, };

            myArray1 = testArray;

            bReturn = myHW1.unique(myArray1);

            if (bReturn == false) {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e) {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        }

        System.out.print("Test " + numTotalTests + ": unique - " + testResult + "\n" + buildArrayString(myArray1));
        System.out.println(" --------------\n Expected: false");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 7
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try {
            int[][] testArray = { { 10, 13, 17, 73, 93, 18, 28 }, { 29, 31, 16, 35, 92, 15, 60 },
                    { 81, 53, 91, 72, 32, 87, 65 }, { 11, 22, 33, 44, 55, 66, 77 }, { 83, 42, 59, 62, 30, 45, 48 },
                    { 19, 20, 21, 27, 23, 24, 25 }, { 61, 51, 54, 74, 98, 90, 69 }, };

            myArray1 = testArray;

            bReturn = myHW1.unique(myArray1);

            if (bReturn == true) {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e) {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        }

        System.out.print("Test " + numTotalTests + ": unique - " + testResult + "\n" + buildArrayString(myArray1));
        System.out.println(" --------------\n Expected: true");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 8
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try {
            low = 0;
            high = 6;
            int[] testArray = { 1, 2, 3, 4, 5, 6, 7 };

            myArray2 = testArray;

            bReturn = myHW1.isSorted(myArray2, low, high);

            if (bReturn == true) {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e) {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        }

        System.out.println("Test " + numTotalTests + ": isSorted - " + testResult + "\n " + Arrays.toString(myArray2)
                + " low = " + low + ", high = " + high);
        System.out.println(" --------------\n Expected: true");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 9
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try {
            low = 0;
            high = 6;
            int[] testArray = { 1, 2, 3, 4, 4, 6, 7 };

            myArray2 = testArray;

            bReturn = myHW1.isSorted(myArray2, low, high);

            if (bReturn == true) {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e) {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        }

        System.out.println("Test " + numTotalTests + ": isSorted - " + testResult + "\n " + Arrays.toString(myArray2)
                + " low = " + low + ", high = " + high);
        System.out.println(" --------------\n Expected: true");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 10
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try {
            low = 0;
            high = 2;
            int[] testArray = { 3, 2, 1, 4, 5, 6, 7 };

            myArray2 = testArray;

            bReturn = myHW1.isSorted(myArray2, low, high);

            if (bReturn == false) {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e) {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        }

        System.out.println("Test " + numTotalTests + ": isSorted - " + testResult + "\n " + Arrays.toString(myArray2)
                + " low = " + low + ", high = " + high);
        System.out.println(" --------------\n Expected: false");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 11
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try {
            low = 1;
            high = 4;
            int[] testArray = { 3, 1, 4, 2, 5, 6, 7 };

            myArray2 = testArray;

            bReturn = myHW1.isSorted(myArray2, low, high);

            if (bReturn == false) {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e) {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        }

        System.out.println("Test " + numTotalTests + ": isSorted - " + testResult + "\n " + Arrays.toString(myArray2)
                + " low = " + low + ", high = " + high);
        System.out.println(" --------------\n Expected: false");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 12
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try {
            low = 3;
            high = 3;
            int[] testArray = { 3, 2, 1, 4, 5, 6, 7 };

            myArray2 = testArray;

            bReturn = myHW1.isSorted(myArray2, low, high);

            if (bReturn == true) {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e) {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        }

        System.out.println("Test " + numTotalTests + ": isSorted - " + testResult + "\n " + Arrays.toString(myArray2)
                + " low = " + low + ", high = " + high);
        System.out.println(" --------------\n Expected: true");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 13
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try {
            low = 0;
            high = 0;
            int[] testArray = { 3, 2, 1, 4, 5, 6, 7 };

            myArray2 = testArray;

            bReturn = myHW1.isSorted(myArray2, low, high);

            if (bReturn == true) {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e) {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        }

        System.out.println("Test " + numTotalTests + ": isSorted - " + testResult + "\n " + Arrays.toString(myArray2)
                + " low = " + low + ", high = " + high);
        System.out.println(" --------------\n Expected: true");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 14
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try {
            low = 3;
            high = 6;
            int[] testArray = { 3, 2, 1, 4, 5, 6, 7 };

            myArray2 = testArray;

            bReturn = myHW1.isSorted(myArray2, low, high);

            if (bReturn == true) {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e) {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        }

        System.out.println("Test " + numTotalTests + ": isSorted - " + testResult + "\n " + Arrays.toString(myArray2)
                + " low = " + low + ", high = " + high);
        System.out.println(" --------------\n Expected: true");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 15
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try {
            low = 4;
            high = 7;
            int[] testArray = { 3, 2, 1, 4, 5, 16, 7, 13 };

            myArray2 = testArray;

            bReturn = myHW1.isSorted(myArray2, low, high);

            if (bReturn == false) {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e) {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        }

        System.out.println("Test " + numTotalTests + ": isSorted - " + testResult + "\n " + Arrays.toString(myArray2)
                + " low = " + low + ", high = " + high);
        System.out.println(" --------------\n Expected: false");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 16
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try {
            low = 3;
            high = 6;
            int[] testArray = { 3, 2, 1, 4, 5, 6, 17, 13 };

            myArray2 = testArray;

            bReturn = myHW1.isSorted(myArray2, low, high);

            if (bReturn == true) {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e) {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        }

        System.out.println("Test " + numTotalTests + ": isSorted - " + testResult + "\n " + Arrays.toString(myArray2)
                + " low = " + low + ", high = " + high);
        System.out.println(" --------------\n Expected: true");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 17
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try {
            low = 7;
            high = 7;
            int[] testArray = { 3, 2, 1, 4, 5, 6, 17, 13 };

            myArray2 = testArray;

            bReturn = myHW1.isSorted(myArray2, low, high);

            if (bReturn == true) {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e) {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        }

        System.out.println("Test " + numTotalTests + ": isSorted - " + testResult + "\n " + Arrays.toString(myArray2)
                + " low = " + low + ", high = " + high);
        System.out.println(" --------------\n Expected: true");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // declare and print out the array
        int[] myArray = { 10, 15, 20, 8, 32, 6, 11, 3, 19, 22, 17 };

        System.out.println("Tests 18 to 22 are based on the following array:");
        System.out.println(Arrays.toString(myArray) + "\n");

        // Test 18
        numTotalTests++;
        int iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try {
            low = 0;
            high = 10;

            iReturn = myHW1.indexOfMin(myArray, low, high);

            if (iReturn == 7) {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e) {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        } catch (StackOverflowError e) {
            eMsg = "Stack Overflow error occurred.";
        }

        System.out.println(
                "Test " + numTotalTests + ": indexOfMin(low = " + low + ", high = " + high + ") - " + testResult);
        System.out.println(" Expected: 7");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 19
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try {
            low = 1;
            high = 4;

            iReturn = myHW1.indexOfMin(myArray, low, high);

            if (iReturn == 3) {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e) {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        } catch (StackOverflowError e) {
            eMsg = "Stack Overflow error occurred.";
        }

        System.out.println(
                "Test " + numTotalTests + ": indexOfMin(low = " + low + ", high = " + high + ") - " + testResult);
        System.out.println(" Expected: 3");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 20
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try {
            low = 7;
            high = 10;

            iReturn = myHW1.indexOfMin(myArray, low, high);

            if (iReturn == 7) {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e) {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        } catch (StackOverflowError e) {
            eMsg = "Stack Overflow error occurred.";
        }

        System.out.println(
                "Test " + numTotalTests + ": indexOfMin(low = " + low + ", high = " + high + ") - " + testResult);
        System.out.println(" Expected: 7");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 21
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try {
            low = 5;
            high = 6;

            iReturn = myHW1.indexOfMin(myArray, low, high);

            if (iReturn == 5) {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e) {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        } catch (StackOverflowError e) {
            eMsg = "Stack Overflow error occurred.";
        }

        System.out.println(
                "Test " + numTotalTests + ": indexOfMin(low = " + low + ", high = " + high + ") - " + testResult);
        System.out.println(" Expected: 5");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 22
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try {
            low = 10;
            high = 10;

            iReturn = myHW1.indexOfMin(myArray, low, high);

            if (iReturn == 10) {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e) {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        } catch (StackOverflowError e) {
            eMsg = "Stack Overflow error occurred.";
        }

        System.out.println(
                "Test " + numTotalTests + ": indexOfMin(low = " + low + ", high = " + high + ") - " + testResult);
        System.out.println(" Expected: 10");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        System.out.println("Total test cases: " + numTotalTests + "\nCorrect: " + numPassedTests + "\nWrong: "
                + (numTotalTests - numPassedTests));
    }

    public static String buildArrayString(int[][] numArray) {
        String arrString = "";

        for (int i = 0; i < numArray.length; i++) {
            for (int j = 0; j < numArray[i].length; j++)
                arrString += " " + numArray[i][j];

            arrString += "\n";
        }

        return arrString;
    }
}

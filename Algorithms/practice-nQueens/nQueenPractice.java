// Practice 6
public class nQueenPractice {
    public static void main(String[] args) {
        int n = 4;
        char[][] B = { { ' ', ' ', ' ', ' ', ' ' }, { ' ', ' ', 'Q', ' ', ' ' }, { ' ', ' ', ' ', ' ', 'Q' },
                { ' ', 'Q', ' ', ' ', ' ' }, { ' ', ' ', ' ', 'Q', ' ' } };

        // n = 5;
        // B =
        // {
        // {' ', ' ', ' ', ' ', ' ', ' '},
        // {' ', 'Q', ' ', ' ', ' ', ' '},
        // {' ', ' ', 'Q', ' ', ' ', ' '},
        // {' ', ' ', ' ', ' ', 'Q', ' '},
        // {' ', ' ', ' ', ' ', ' ', 'Q'},
        // {' ', ' ', ' ', 'Q', ' ', ' '}
        // };
        //
        // n = 5;
        // B =
        // {
        // {' ', ' ', ' ', ' ', ' ', ' '},
        // {' ', 'Q', ' ', ' ', ' ', ' '},
        // {' ', ' ', ' ', ' ', ' ', 'Q'},
        // {' ', ' ', ' ', ' ', 'Q', ' '},
        // {' ', ' ', 'Q', ' ', ' ', ' '},
        // {' ', ' ', ' ', 'Q', ' ', ' '}
        // };

        if (validNQueens(n, B))
            System.out.println("This is a valid solution.");
        else
            System.out.println("This is not a valid solution.");
    }

    public static boolean validNQueens(int n, char[][] B) {
        // TODO: implement this method

        int[] col = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (B[i][j] == 'Q') {
                    if (col[i] == 0) {
                        col[i] = j;
                    } else {
                        return false;
                    }

                }
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                if (col[i] == col[j] || Math.abs(col[i] - col[j]) == i - j) {
                    return false;
                }
            }
        }
        return true; // replace this statement with your own return
    }
}

public class Gameboard{

   //a single data member which is a private reference variable for a two dimension array of type char
   private char[][] board; 
   
   //a constructor that receives two arguments (rows/columns)
   Gameboard(int rowsCount, int columnsCount){
   
      board = new char[rowsCount][columnsCount];
      clearBoard();
   }    
   //a constructor that receives a single argument that can be used for game boards that are of size n by n.
   Gameboard(int n){
      board = new char[n][n];
      clearBoard();
   }    
   
   //  a method clearBoard() that sets all character '_'
   public void clearBoard() {
   // Loop through rows
      for (int i = 0; i < board.length; i++) {
      // Loop through columns
         for (int j = 0; j < board[0].length; j++) {    
            board[i][j] = ' ';
         }
      }
   }
   
   //a method printBoard( ) that prints the board in its current state;
   public void printBoard() {
      int num=1;
      for (int i = 0; i < board.length; i++) {
         for (int j = 0; j < board[0].length; j++) {
         
            if(board[i][j]=='X' || board[i][j]=='O' )
               System.out.print(board[i][j]);
            else
               System.out.print(3*i+j+1);
           
            System.out.print( " | ");
               
         }
         System.out.println();
         System.out.println("----------");
      }
   }
   
   // a set method named setCharacter(char player’s character , row , cloumn)
   // this method will validate user inputs, if true store the character parameter at the given positions.
   
   public boolean setCharacter(char playerCharacter,int input)
   {
   // Make sure that row and column are in bounds of the board.
      if ((input >= 1) && (input <= 9)) {
         if(input==1)
            board[0][0] = playerCharacter;
         if(input==2)
            board[0][1] = playerCharacter;               
         if(input==3)
            board[0][2] = playerCharacter;               
         if(input==4)
            board[1][0] = playerCharacter;
         if(input==5)
            board[1][1] = playerCharacter;
         if(input==6)
            board[1][2] = playerCharacter;
         if(input==7)
            board[2][0] = playerCharacter;
         if(input==8)
            board[2][1] = playerCharacter;
         if(input==9)
            board[2][2] = playerCharacter;
               
         return true;  
      }
      return false;
   
   }
  
   
    // Loop through all cells of the board and if one is found to be empty (contains char ' ') then return false.
    // Otherwise the board is full.
   public boolean isBoardFull() {
      boolean isFull = true;
      for (int i = 0; i < board.length; i++) {
         for (int j = 0; j < board[0].length; j++) {
            if (board[i][j] == ' ') {
               isFull = false;
            }
         }
      }
      return isFull;
   }
   
   
   public boolean checkForWinner(){
   
   //returns true is a player plays three characters in a row, otherwise the method
   //returns false;
   
      return (checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin());
   
   }
   // Check to see if all three values are the same (and not empty) indicating a win.
   private boolean checkRowCol(char c1, char c2, char c3) {
      return ((c1 != ' ') && (c1 == c2) && (c2 == c3));
   }
    // Check the two diagonals to see if either is a win. Return true if either wins.
   private boolean checkDiagonalsForWin() {
      return ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true) || 
              (checkRowCol(board[0][2], board[1][1], board[2][0]) == true));
   }
   
   // Loop through columns and see if any are winners.
   private boolean checkColumnsForWin() {
      for (int i = 0; i < board[0].length; i++) {
         if (checkRowCol(board[0][i], board[1][i], board[2][i]) == true) {
            return true;
         }
      }
      return false;
   }
// Loop through rows and see if any are winners.
   private boolean checkRowsForWin() {
      for (int i = 0; i < board.length; i++) {
         if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true) {
            return true;
         }
      }
      return false;
   }
   
}
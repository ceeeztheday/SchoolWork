public class Gameboard_v2
{
   //data members
   char [][] board;
   
   /**************************GAMEBOARD OPTION TYPES ********************/
   //constructors
   //shows n by n gameboard with underscore as default initial character
   public Gameboard_v2(int n)
   {
      board = new char[n][n];
      
      for(int i = 0; i < board.length; i++)
         for(int j = 0; j < board[i].length; j++)
            board[i][j] = '_';
            //System.out.println(i);
           
   }  
   //constructor to display initial character other than the default underscore
   public Gameboard_v2(int n, String c)
   {
      board = new char[n][n];
      char displayChar = '_';
      
      if(c.charAt(0) == '1')
         displayChar = '1';
      
      for(int i = 0; i < board.length; i++)
      {
         for(int j = 0; j < board[i].length; j++)
         {
            board[i][j] = displayChar;
            displayChar++;
         }
         System.out.println();
      }
           
   } 
   //sets new Gameboard to show underscore as default empty space character
   public Gameboard_v2(int row, int col)
   {
      board = new char[row][col];
      
      for(int i = 0; i < board.length; i++)
         for(int j = 0; j < board[i].length; j++)
            board[i][j] = '_'; 
   }
   /*************************AUXILIARY METHODS****************************/
   //get and set methods
   public void setC(char player, int row, int col)
   {
      //set player character to position board[row][col]
      board[row][col] = player;
   }
   public char getC(int row, int col)
   {
      //return the character at position board[row][col]
      return(board[row][col]);
   }
   
   //display the current board object and data
   public void showBoard()
   {
      System.out.println(); //leave space above board
      for(int row = 0; row < board.length; row++)
      {
         for(int col = 0; col < board[row].length; col++)
            System.out.print(board[row][col] + " | ");
            
         System.out.println();
      }
   }
   //clear data from the current board object and set data to default underscore
   public void clearBoard() 
   {
      for(int i = 0; i < board.length; i++)
         for(int j = 0; j < board[i].length; j++)
            board[i][j] = '_';
   }
   //display board object's current data
   public void printBoard()
   {
      for(int row = 0; row < board.length; row++)
      {
         for(int col = 0; col < board[row].length; col++)
            System.out.print(board[row][col] + " | ");
            
         System.out.println();
      }
   }
   //does the position store either an underscore or a number from 1 to 9, inclusive
   //    this test is geared toward a tic-tac-toe game
   //    consider moving this method to the tic-tac-toe class
   public boolean isAvailable(int row, int col) 
   {
      if(board[row][col] == '_' || board[row][col] >= (char)48 && board[row][col] <= (char)57 ) return(true);
      return(false);
   }
   /********************************END GAMEBOARD CLASS****************************/
}
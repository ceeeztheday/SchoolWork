public class Gameboard
{
   private char [] [] board;
      
   public Gameboard(int row, int col)
   {
      board = new char [row][col];
      clearBoard();
   
   }
   
   public Gameboard(int n)
   {
      board =new char [n][n];
      clearBoard();
   }
   
   public void setCharacter(char player,int row, int col)
   {
      board[row][col] = player;
   }
   
   public int getCharacter(int row,int col)
   {
      return(board[row][col]);
   }
   
   public void clearBoard()
   {
      for (int i = 0; i < board.length; i++) 
      {
         for (int j = 0; j < board[0].length; j++) 
         {    
            board[i][j] = ' ';
         }
      }
   }
 
   public void printBoard() 
   {
      int num=1;
      for (int i = 0; i < board.length; i++) 
      {
         for (int j = 0; j < board[0].length; j++) 
         {
            if(board[i][j]=='X' || board[i][j]=='O')
            {
               System.out.print(board[i][j]);
            }
            else
            {
               System.out.print(3*i+j+1);
            }
            System.out.print( " | "); 
        } 
            System.out.println();
            System.out.println("---------");
      
   
      }
   }
   
   
   public boolean setCharacter(char character,int input)
   {
      if (input >= 1 && input <= 9) 
      {
         if(input==1)
            board[0][0] = character;
         if(input==2)
            board[0][1] = character;               
         if(input==3)
            board[0][2] = character;               
         if(input==4)
            board[1][0] = character;
         if(input==5)
            board[1][1] = character;
         if(input==6)
            board[1][2] = character;
         if(input==7)
            board[2][0] = character;
         if(input==8)
            board[2][1] = character;
         if(input==9)
            board[2][2] = character;
               
         return true;  
      }
      return false;
   }
   
   public boolean isBoardFull() 
   {
      boolean isFull = true;
      for (int i = 0; i < board.length; i++) 
      {
         for (int j = 0; j < board[0].length; j++) 
         {
            if (board[i][j] == ' ') 
            {
               isFull = false;
            }
         }
      }
      return isFull;
   }
   
   public boolean checkForWinner()
   {
      return (checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin());
   
   }
   
   private boolean checkRowCol(char c1, char c2, char c3) 
   {
      return ((c1 != ' ') && (c1 == c2) && (c2 == c3));
   }
    
   private boolean checkDiagonalsForWin() 
   {
      return ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true) || 
              (checkRowCol(board[0][2], board[1][1], board[2][0]) == true));
   }
   
   
   private boolean checkColumnsForWin() 
   {
      for (int i = 0; i < board[0].length; i++) 
      {
         if (checkRowCol(board[0][i], board[1][i], board[2][i]) == true) 
         {
            return true;
         }
      }
      return false;
   }

   private boolean checkRowsForWin() 
   {
      for (int i = 0; i < board.length; i++) 
      {
         if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true) 
         {
            return true;
         }
      }
      return false;
   }

 }


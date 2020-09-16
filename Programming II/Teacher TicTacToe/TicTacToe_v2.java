import java.util.Scanner;

public class TicTacToe_v2
{
   //data members
   private int count; //increments each time a player plays
   private boolean continueGame; //terminate when board is full or continue to a second game
   private Gameboard_v2 gb;  //reference to a Gameboard object
   private int winX;   //number of times player 1 has won a game
   private int winY;   //number of times player 2 has won a game
   private int draw;   //number of times a game ended in a draw
   private static Scanner kbd = new Scanner(System.in);
   private int row;
   private int col;
   
   //constructors
   public TicTacToe_v2()
   {
      gb = new Gameboard_v2(3, "1"); //specifies new display character
      count = 0;
      continueGame = true;
      winX = 0;
      winY = 0;
      draw = 0;
   }
   /**********************************TAKE A TURN *************************/
   //Play X
   public void turn1()
   {
      if(count == 0) //display board before first play
         this.showBoard();

      System.out.println("Please enter the position for your play: ");
      char position = kbd.nextLine().charAt(0);
      char [][] rowCol = getCharPosition(position);
      row = rowCol[0][0];
      col = rowCol[0][1];

      while(gb.isAvailable(row, col) == false)
      {
         System.out.println("That position is already taken");
         gb.printBoard();

         System.out.println("Please enter the position for your play: ");
         position = kbd.nextLine().charAt(0);
      }
      gb.setC('X', row, col);
      gb.printBoard();
      continueGame = !isWinnerX();
      count++;
   }
   //Play O
   public void turn2()
   {
      System.out.println("Please enter the position for your play: ");
      char position = kbd.nextLine().charAt(0);
      char [][] rowCol = getCharPosition(position);
      row = rowCol[0][0];
      col = rowCol[0][1];

      while(gb.isAvailable(row, col) == false)
      {
         System.out.println("\nThat position is already taken");
         gb.printBoard();

         System.out.println("\nPlease enter the position for your play: ");
         position = kbd.nextLine().charAt(0);
      }
      gb.setC('Y', row, col);
      gb.printBoard();
      continueGame = !isWinnerY();
      count++;
   }
   /*****************************IS THERE A WINNER?**************************************/
   //test if X player created a win
   public boolean isWinnerX()
   {
      if(gb.getC(0, 0) == 'X' && gb.getC(0, 1) == 'X' && gb.getC(0, 2) == 'X') {winX++; return(true);}
      else if(gb.getC(1, 0) == 'X' && gb.getC(1, 1) == 'X' && gb.getC(1, 2) == 'X') {winX++; return(true);}
      else if(gb.getC(2, 0) == 'X' && gb.getC(2, 1) == 'X' && gb.getC(2, 2) == 'X') {winX++; return(true);}
      
      else if(gb.getC(0, 0) == 'X' && gb.getC(1, 0) == 'X' && gb.getC(2, 0) == 'X') {winX++; return(true);}
      else if(gb.getC(0, 1) == 'X' && gb.getC(1, 1) == 'X' && gb.getC(2, 1) == 'X') {winX++; return(true);}
      else if(gb.getC(0, 2) == 'X' && gb.getC(1, 2) == 'X' && gb.getC(2, 2) == 'X') {winX++; return(true);}
      
      else if(gb.getC(0, 0) == 'X' && gb.getC(1, 1) == 'X' && gb.getC(2, 2) == 'X') {winX++; return(true);}
      else if(gb.getC(0, 2) == 'X' && gb.getC(1, 1) == 'X' && gb.getC(2, 0) == 'X') {winX++; return(true);}
      
      return(false);
   }
   //test if Y player created a win
   public boolean isWinnerY()
   {
      if(gb.getC(0, 0) == 'Y' && gb.getC(0, 1) == 'Y' && gb.getC(0, 2) == 'Y') {winY++; return(true);}
      else if(gb.getC(1, 0) == 'Y' && gb.getC(1, 1) == 'Y' && gb.getC(1, 2) == 'Y') {winY++; return(true);}
      else if(gb.getC(2, 0) == 'Y' && gb.getC(2, 1) == 'Y' && gb.getC(2, 2) == 'Y') {winY++; return(true);}
      
      else if(gb.getC(0, 0) == 'Y' && gb.getC(1, 0) == 'Y' && gb.getC(2, 0) == 'Y') {winY++; return(true);}
      else if(gb.getC(0, 1) == 'Y' && gb.getC(1, 1) == 'Y' && gb.getC(2, 1) == 'Y') {winY++; return(true);}
      else if(gb.getC(0, 2) == 'Y' && gb.getC(1, 2) == 'Y' && gb.getC(2, 2) == 'Y') {winY++; return(true);}
      
      else if(gb.getC(0, 0) == 'Y' && gb.getC(1, 1) == 'Y' && gb.getC(2, 2) == 'Y') {winY++; return(true);}
      else if(gb.getC(0, 2) == 'Y' && gb.getC(1, 1) == 'Y' && gb.getC(2, 0) == 'Y') {winY++; return(true);}
      
      return(false);
   }
   /****************************AUXILIARY METHODS ********************************/
   //auxiliary methods
   public void showBoard()
   {
      gb.printBoard();
   }
   //Identify array indices for each visible UI 
   //    character representing a user choice
   public char[][] getCharPosition(char c)
   {
      char [][] position = new char[1][2]; //one row, two columns
      int row = 0;
      int col = 1;
      
      //identify first row
      if(c == '1') { position[0][row] = 0; position[0][col] = 0; }
      else if(c == '2') { position[0][row] = 0; position[0][col] = 1; }
      else if(c == '3') { position[0][row] = 0; position[0][col] = 2; }
      //identify second row
      else if(c == '4') { position[0][row] = 1; position[0][col] = 0; }
      else if(c == '5') { position[0][row] = 1; position[0][col] = 1; }
      else if(c == '6') { position[0][row] = 1; position[0][col] = 2; }
      //identify third row
      else if(c == '7') { position[0][row] = 2; position[0][col] = 0; }
      else if(c == '8') { position[0][row] = 2; position[0][col] = 1; }
      else { position[0][row] = 2; position[0][col] = 2; };
      
      return(position);
   }
   //return the current number of plays
   public int getCount()
   {
      return(this.count);
   }
   //return the number wins for player X
   public int getWinXCount()
   {
      return(this.winX);
   }
   //return the number of wins for player Y
   public int getWinYCount()
   {
      return(this.winY);
   }
   //return the number of times neither player won
   public int getDrawCount()
   {
      return(this.draw);
   }
   //reset values for a new game
   //    via creating a new game object
   public void newGame()
   {
      gb = new Gameboard_v2(3, "1");
      continueGame = true;
      count  = 0; 
   }
   //return value to assit in terminating when board 
   //    is full or to allow user to continue to a second game
   public boolean getContinueGame()
   {
      return(this.continueGame);
   }
   /****************************************END OF CLASS****************************/
}
import java.util.Scanner;
public class TicTacToe {

   Scanner kbd = new Scanner(System.in);
   
   //data members
   
   //count, of type boolean to increment each time a play is made;
   int countOfMoves=0;   
   
   //continueGame,of type boolean to allow the game to terminate (e.g. the board is full) or
   //continue on to a second game after one game has been played;
   boolean continueGame;
      
   //a Gameboard reference variable;
   private Gameboard gameboard;

//three additional count variables, e.g. win1, win2, draw to store the number of times
//player1 has won a game, player2 has won a game and how many draws in which neither
//player has won a game.

   int win1Count,win2Count,drawsCount;
   
 // current Player   
   int currentPlayer=1; //player1
   
   //a single constructor, that takes no arguments and uses the Gameboard reference variable to create
   //a Gameboard object of the appropriate size;
   
   TicTacToe()
   {
      gameboard= new Gameboard(3,3);
      gameboard.printBoard();
   }
   
   //methods
   
   public void resetBoard(){
      currentPlayer=1; //player1
      gameboard= new Gameboard(3,3);
      gameboard.printBoard();
   }
   
   //checkForTurn, checks to see if it is player1’s turn or player2’s turn
   public void checkForTurn()
   {
      if(currentPlayer==1)
         turn1();
      else
         turn2();
      gameboard.printBoard();
   }
   public void turn1( )
   {
    //prompts player1 to choose the row and column for the next play;
      System.out.println(" Player 1, it is your turn. Enter position:");
      System.out.println("Please enter a position?");
      int input = kbd.nextInt();
         
      //call the Gameboard method setXorO ( ) to place player1’s character onto the Gameboard
      gameboard.setCharacter('X',input);
      
      //increments the count representing the total number of plays so far;
      countOfMoves++;
         
      //checks to see if the board is now full.
      if(gameboard.isBoardFull())
      {
      //sets the continueGame data member to false
         continueGame=false;
         
      //increments the data member draw;
         drawsCount++;
      }
      else
      {
         if(gameboard.checkForWinner())
         {
         //sets the continueGame data member to false
            continueGame=false;
         
         //increments the data member win1;
            win1Count++;
         }
         else
         {
         // set the next player
            currentPlayer=2;
         }
      }
   
   }
   
   public void turn2( )
   {
   //prompts player2 to choose the row and column for the next play;
      System.out.println(" Player 2, it is your turn. Enter position:");
      System.out.println("Please enter a postition?");
      int input = kbd.nextInt();
      
      //call the Gameboard method setXorO ( ) to place player1’s character onto the Gameboard
      gameboard.setCharacter('O',input);
      
      //increments the count representing the total number of plays so far;
      countOfMoves++;
         
      //checks to see if the board is now full.
      if(gameboard.isBoardFull())
      {
      //sets the continueGame data member to false
         continueGame=false;
         
      //increments the data member draw;
         drawsCount++;
      }
      else
      {
         if(gameboard.checkForWinner())
         {
         //sets the continueGame data member to false
            continueGame=false;
         
         //increments the data member win1;
            win2Count++;
         }
         else{
         // set the next player
            currentPlayer=1;
         }
      }
   
   }
   
   
   //a set method to set the value of the data member count;
   public void setCount(int n)
   {
      countOfMoves=n;
   }
   
   public void play( )
   {
    //calls the Gameboard clearBoard( ) method, sets continueGame to true and as
    //long as continueGame is true, calls the method checkForTurn( );
   
      gameboard.clearBoard( );
      continueGame=true;
      while(continueGame)
         checkForTurn( );
   }
   

   
   public void displayScore()
   {
   //The method displays the number of wins each player has achieved and the number of draws that have occurred.
      System.out.println("Player 1: "+ win1Count);
      System.out.println("Player 2: "+ win2Count);
      System.out.println("Draw: "+ drawsCount);
   
   }
}
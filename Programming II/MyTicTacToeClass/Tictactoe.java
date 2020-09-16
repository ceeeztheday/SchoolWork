import java.util.Scanner;
public class Tictactoe 
{
   Scanner kbd = new Scanner(System.in);
   int count=0;
   boolean continueGame;
   int win1=0;
   int win2=0;
   int draw=0;
   private Gameboard gameboard;
   int player=1;
   
   Tictactoe()
   {
      gameboard = new Gameboard(3,3);
      gameboard.printBoard();
   }
   
   
   
   public void resetBoard()
   {
      player=1; 
      gameboard= new Gameboard(3,3);
      gameboard.printBoard();
   }
   
   public void checkTurn()
   {
      if(player==1)
         turn1();
      else
         turn2();
      gameboard.printBoard();
   }

   public void turn1()
   {
      System.out.println("Player 1, it is your turn. Please enter a position:");
      int input = kbd.nextInt();
         
      gameboard.setCharacter('X',input);
      
      count++;
        
      if(gameboard.isBoardFull())
      {
         continueGame=false;
         draw++;
      }
      else
      {
         if(gameboard.checkForWinner())
         {
            continueGame=false;
            win1++;
         }
         else
         {
            player=2;
         }
      }
   }
   
   public void turn2( )
   {
      System.out.println(" Player 2, it is your turn. Please enter a position:");
      int input = kbd.nextInt();
      
      gameboard.setCharacter('O',input);
      
      count++;
         
      if(gameboard.isBoardFull())
      {
         continueGame=false;
         draw++;
      }
      else
      {
         if(gameboard.checkForWinner())
         {
            continueGame=false;
            win2++;
         }
         else
         {
            player=1;
         }
      }
   }
   
   public void setCount(int n)
   {
      count=n;
   }
   
   public void play()
   {
      gameboard.clearBoard();
      continueGame=true;
      while(continueGame)
      checkTurn();
   }
   
   public void displayScore()
   {
      System.out.println("Player 1: "+ win1);
      System.out.println("Player 2: "+ win2);
      System.out.println("Draw: "+ draw);
   
   } 
}
